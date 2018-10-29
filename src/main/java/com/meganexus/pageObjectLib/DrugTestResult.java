package com.meganexus.pageObjectLib;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DrugTestResult extends NeoTR_Page {

	String addDrugFutureDate=DateFormatter.changeDateFormat(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAddFuture", "./DateOfTest"));
	String addValidDrugDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd", "./DateOfTest"));
	String invalidDrugDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_InvalidAdd", "./DateOfTest"));
	String editValidDrugDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_valid_Edit", "./DateOfTest"));
	String editInvalidDrugDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_Invalid_Edit", "./DateOfTest"));

	@FindBy(xpath = "//h2[@class='page-title']")
	public WebElementFacade hdr_DrugResult;
	@FindBy(xpath = "(//a[contains(.,'Drug Test')])[2]")
	public WebElementFacade lnk_DrugResult;
	@FindBy(xpath = "//a[@id='filter']")
	public WebElementFacade lnk_filter;
	@FindBy(xpath = "//button[@id='drugTest_addButton']")
	public WebElementFacade btn_addDrugResult;
	@FindBy(xpath = "//button[@id='drugTest_view0']")
	public WebElementFacade btn_viewDrugResult;
	@FindBy(xpath = "//button[@id='drugTest_edit0']")
	public WebElementFacade btn_editDrugResult;
	@FindBy(xpath = "//button[@id='drugTest_delete0']")
	public WebElementFacade btn_deleteDrugResult;
	@FindBy(xpath = "//button[contains(.,'Back')]")
	public WebElementFacade btn_backDrugResult;
	@FindBy(xpath = ".//*[@id='myModal']/div/div/div[3]/button[2]") 
	WebElementFacade txt_popup;
	@FindBy(xpath = "//button[contains(text(),'Ok')]") 
	WebElementFacade btn_ok;
	@FindBy(xpath = "//select[@id='drugTestList_itemsPerPage']") 
	WebElementFacade page_index;
	@FindBy(xpath = "//option[@value='50']") 
	WebElementFacade select_index;
   

	public void clickAddDrugResultBtn() {
		btn_addDrugResult.click();
		waitABit(1000);
	}

	public void expandDrugResultTab() {
		waitABit(3000);
		lnk_DrugResult.click();
		waitABit(3000);
	}

	@FindBy(xpath = "//h2[contains(.,'VIEW Referral')]")
	public WebElementFacade txt_viewReferral;

	public void clickDrugResultViewBtn() {

		if (btn_viewDrugResult.isCurrentlyVisible()) {
			btn_viewDrugResult.click();
			waitABit(1000);
		} else {
			System.out.println("Drug Test Result is not available on ui");
		}

	}

	public void clickDeleteDrugResultBtn() {
		//expandDrugResultTab();
		waitABit(3000);
		if (btn_deleteDrugResult.isCurrentlyVisible()) {
			btn_deleteDrugResult.click();
			waitABit(1000);
			btn_ok.click();
			waitABit(1000);
			page_index.click();
			select_index.click();
		} else
			System.out.println("Drug Test Result is not available on ui");
	}

	@SuppressWarnings("deprecation")
	public void verifyDeleteReferral() {
		Assert.assertTrue("Drug Test Result is not deleted", btn_deleteDrugResult.isCurrentlyVisible());
	}

	public void clickEditDrugResultBtn() {

		waitABit(3000);
		btn_editDrugResult.click();
		waitABit(3000);
	}

	public void clickBackDrugResultBtn() {

		btn_editDrugResult.click();
		waitABit(1000);
	}
	public void verifyReferralTabHeader() {
		if (hdr_DrugResult.isCurrentlyVisible()) {
			System.out.println("Back button on screen is working as expected");
		}
		else { 
			System.out.println("Back button on screen is not working as expected"); 
		}

	}
	public void clickOnSaveBtn() {
		waitABit(2000);
		if (btn_Save.isCurrentlyVisible()) {
			btn_Save.click();
			waitABit(3000);

		} else
			System.out.println("Drug Test Reult Save button is not available");
		waitABit(2000);

	}
	public void clickOnSubmitBtn() {
		waitABit(2000);
		if (btn_Submit.isCurrentlyVisible()) {
			btn_Submit.click();
			waitABit(3000);

		} else
			System.out.println("Drug Test Reult Submit button is not available");
		waitABit(2000);

	}

	// Verify Column name on List of view Drug Test Result screen

	@FindBy(xpath ="//span[contains(.,'Tested By')]")
	private WebElementFacade col_drugResultTestedBy;

	@FindBy(xpath = "//span[contains(.,'Date Of Test')]")
	private WebElementFacade col_drugResultDate;

	@SuppressWarnings("deprecation")
	public void validateDrugTestList() {
		//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		verifyBreadCrumbs("Service User Summary Event Details Referral View Referral");
		try{
			//clicking on the Drug Test Result collapsible to view Drug Test Result table
			System.out.println(waitFor(lnk_DrugResult));
			if (!btn_addDrugResult.isCurrentlyVisible()) {
				waitFor(lnk_DrugResult);
				lnk_DrugResult.click();
				waitABit(1000);
			}

			//verifying the Drug Test Result table now
			System.out.println(col_drugResultTestedBy.getText().trim());
			System.out.println(col_drugResultDate.getText().trim());


			if (col_drugResultTestedBy.isCurrentlyVisible())
				Assert.assertTrue("Table header for Tested By does not match", col_drugResultTestedBy.getText().trim().equals("TESTED BY"));
			if (col_drugResultDate.isCurrentlyVisible()) 
				Assert.assertTrue("Table header for Drug Date does not match", col_drugResultDate.getText().trim().equals("DATE OF TEST"));
		}catch (ElementNotFoundException e){
			e.printStackTrace();
		}catch (Exception e ){
			e.printStackTrace();	
		}
	}

	//Add Page Labels Locators

	@FindBy(xpath = "//h2[text()='Add Drug Test']")
	private WebElementFacade hdr_addDrugTest;
	@FindBy(xpath = "//h2[contains(.,'Edit Drug Test')]")
	private WebElementFacade hdr_editDrugTest;
	@FindBy(xpath ="(//a[contains(.,'Drug Test')])[2]")
	private WebElementFacade lnk_DrugTest;
	@FindBy(xpath = "//label[@for='dateOfTest']")
	private WebElementFacade lbl_drugResultDate;
	@FindBy(xpath = "//label[@for='testedBy']")
	private WebElementFacade lbl_drugResultTestedBy;
	@FindBy(xpath = "//label[@for='offenderComplianceYesNoId']")
	private WebElementFacade lbl_DrugResultOffenderComplience;

	@FindBy(xpath = "//label[@for='note']")
	private WebElementFacade lbl_Notes;
	@FindBy(xpath = ".//*[@id='cancelButton']")
	private WebElementFacade btn_cancel;

	private WebElementFacade btn_Save;
	@FindBy(xpath = "//button[@id='saveButton']")
	private WebElementFacade btn_Submit;

	@FindBy(xpath = "//a[@id='drug(s) to be tested for']")
	private WebElementFacade lbl_drugTobeTestedFor;
	@FindBy(xpath = "//th[contains(.,'Drug')]")
	private WebElementFacade lbl_drugType;
	@FindBy(xpath = "//th[contains(.,'Admitted ?')]")
	private WebElementFacade lbl_drugAdmittedUse;
	@FindBy(xpath = "//th[contains(.,'Result')]")
	private WebElementFacade lbl_drugTestResult;
	@FindBy(xpath = "//th[contains(.,'Agreed ?')]")
	private WebElementFacade lbl_drugAgreed;
	//Add Page Field value Locators

	@FindBy(xpath ="//input[@id='dateOfTest']")
	private WebElementFacade val_drugResultDate;

	@FindBy(xpath = "//input[@id='testedBy']")
	private WebElementFacade val_drugResultTestedBy;

	@FindBy(xpath = "//select[@id='offenderComplianceYesNoId']")
	private WebElementFacade ddl_drugResultOffenderComlience;

	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade val_drugResultNotes;

	@FindBy(xpath = "(//select[@id='admittedUseYesNoId'])[1]")
	private WebElementFacade ddl_admitted;

	@FindBy(xpath = "(//select[@id='testResultId'])[1]")
	private WebElementFacade ddl_result;

	@FindBy(xpath = "(//select[@id='agreedYesNoId'])[1]")
	private WebElementFacade ddl_agreed;


	public void addDrugTestResultValidDetails() {
		if (hdr_addDrugTest.isCurrentlyVisible()) {
			verifyBreadCrumbs("Service User Summary Event Details Referral View Referral Add Drug Test");
			try {
				waitABit(2000);
				val_drugResultDate.sendKeys(addValidDrugDate);
				val_drugResultTestedBy.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd", "./TestedBy"));
				ddl_drugResultOffenderComlience.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd", "./OffenderCompliance"));
				val_drugResultNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd", "./Notes"));	
				ddl_admitted.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd","./AdmittedUse"));
				ddl_result.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd","./TestResult"));
				ddl_agreed.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd","./Agreed"));
			}catch (ElementNotFoundException e){
				e.printStackTrace();
			}catch (Exception e ){
				e.printStackTrace();	
			}	
		}else
			System.out.println("Add Drug test page is not available for Drug test");
	}

	public void addDrugTestResultFutureDate() {
		if (hdr_addDrugTest.isCurrentlyVisible()) {
			try {
				waitABit(2000);
				val_drugResultDate.sendKeys(addDrugFutureDate);
				val_drugResultTestedBy.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAddFuture", "./TestedBy"));
				val_drugResultNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAddFuture", "./Notes"));		
			}catch (ElementNotFoundException e){
				e.printStackTrace();
			}catch (Exception e ){
				e.printStackTrace();	
			}	
		}else
			System.out.println("Add Drug test page is not available for Drug test");	
	}
	@SuppressWarnings("deprecation")
	public void addeditDrugTestPageLabelVerification(){
		try {
			waitABit(4000);
			Assert.assertTrue("Date of Type label is not available ", hdr_editDrugTest.getText().trim().equals("EDIT DRUG TEST"));
			//hdr_addDrugTest.getText();
			Assert.assertTrue("Date of Test label is not available ", lbl_drugResultDate.getText().trim().equals("DATE OF TEST *"));
			Assert.assertTrue("Tested By Date label is not available ", lbl_drugResultTestedBy.getText().trim().equals("TESTED BY *"));
			Assert.assertTrue("Offender Compliance  label is not available ", lbl_DrugResultOffenderComplience.getText().trim().equals("SU COMPLIED"));	
			Assert.assertTrue("Note label is not available ", lbl_Notes.getText().trim().equals("NOTES"));
			Assert.assertTrue("Drug(s) To be tested for label is not available ", lbl_drugTobeTestedFor.getText().trim().equals("DRUG(S) TO BE TESTED FOR"));
			Assert.assertTrue("DRUG  label is not available ", lbl_drugType.getText().trim().equals("DRUG"));
			Assert.assertTrue("ADMITTED label is not available ", lbl_drugAdmittedUse.getText().trim().equals("ADMITTED ?"));
			Assert.assertTrue("TEST RESULT label is not available ", lbl_drugTestResult.getText().trim().equals("RESULT"));
			Assert.assertTrue("AGREED label is not available ", lbl_drugAgreed.getText().trim().equals("AGREED ?"));
		}catch (ElementNotFoundException e){
			e.printStackTrace();
		}catch (Exception e )	{
			e.printStackTrace();	
		}
	}

	//Negative Scenario for error message validation on Add page

	//Error Message Locators

	@FindBy(xpath = "//label[@for='dateOfTest']/following-sibling::control-messages//div[@class='error-msg']")
	private WebElementFacade errmsg_drugTestDate;
	@FindBy(xpath = "//label[@for='testedBy']/following-sibling::control-messages//div[@class='error-msg']")
	private WebElementFacade errmsg_testedBy;
	@FindBy(xpath = "//label[@for='offenderComplianceYesNoId']/following-sibling::control-messages//div[@class='error-msg']")
	private WebElementFacade errmsg_offenderComplience;

	public void addDrugTestResultInvalidDetails() {

		//Leave all fields blank 

		btn_Submit.click();

	}

	@SuppressWarnings("deprecation")
	public void addDrugResultErrorMessageValidation(){
		try {
			waitABit(4000);
			val_drugResultDate.sendKeys(invalidDrugDate);
			Assert.assertTrue("Required Date of Test field is not selected", errmsg_drugTestDate.getText().equals("Invalid date format"));
			val_drugResultTestedBy.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_InvalidAdd", "./TestedBy"));
			Assert.assertTrue("Required Tested By is not entered", errmsg_testedBy.getText().equals("Maximum length exceeded"));	
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addDrugFutureDateWithSUCompled(){
		if (hdr_addDrugTest.isCurrentlyVisible()) {
			try {

				waitABit(4000);
				val_drugResultDate.clear();
				val_drugResultDate.sendKeys(addDrugFutureDate);
				val_drugResultTestedBy.clear();
				val_drugResultTestedBy.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAddFuture", "./TestedBy"));
				val_drugResultNotes.clear();
				val_drugResultNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAddFuture", "./Notes"));		
				ddl_drugResultOffenderComlience.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_validAdd", "./OffenderCompliance"));
				btn_Submit.click();
				waitABit(4000);
				Assert.assertTrue("SU Complince is accepted: Failed", errmsg_offenderComplience.getText().equals("You cannot enter compliance information for a future test date"));
			} catch (ElementNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	else
			System.out.println("Add button is not available for Drug test");
	}
	@SuppressWarnings("deprecation")
	public void navigateToHeader(){
		expandDrugResultTab();
		page_index.click();
		select_index.click();
		Assert.assertTrue("User is not navigate to Drug Test List", lnk_DrugTest.getText().equals("DRUG TEST"));
	}

	public void addDrugResultMandaotryfieldsValidation(){
		try {
			waitABit(4000);
			addDrugTestResultInvalidDetails();
			Assert.assertTrue("Required Date of Test field is not selected", errmsg_drugTestDate.getText().equals("Required field"));
			val_drugResultDate.sendKeys(addValidDrugDate);
			addDrugTestResultInvalidDetails();
			Assert.assertTrue("Required Tested By is not entered", errmsg_testedBy.getText().equals("Required field"));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Edit Drug Test Result for valid data

	@SuppressWarnings("deprecation")
	public void editDrugTestResultValidDetails() {
		if (hdr_editDrugTest.isCurrentlyVisible()) {
			verifyBreadCrumbs("Service User Summary Event Details Referral View Referral Edit Drug Test");
			try {

				ddl_drugResultOffenderComlience.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_valid_Edit", "./OffenderCompliance"));
				//val_drugResultNotes.clear();
				val_drugResultNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_valid_Edit", "./Notes"));	
				ddl_admitted.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_valid_Edit","./AdmittedUse"));
				ddl_result.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_valid_Edit","./TestResult"));
				ddl_agreed.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugsTest_valid_Edit","./Agreed"));
			} catch (ElementNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Edit Drug Test page is not available for Drug test");


	}
	public void verfiyDrugTestRecordDeleted() {
		
		if (!btn_deleteDrugResult.isCurrentlyVisible()) {
			System.out.println("Delete is working for Drug Test");
		} else
			System.out.println("Delete is not working for Drug Test");
	}
	public void cancelBtnFunctionality(){

		btn_cancel.click();
		waitABit(4000);
		btn_ok.click();
		waitABit(9000);	

	}

	//Label verification on View DrugResult

	@FindBy(xpath = ".//*[@id='label_dateOfTest']")
	public WebElementFacade lbl_viewDateOfTest;
	@FindBy(xpath = ".//*[@id='label_testedBy']")
	public WebElementFacade lbl_viewTestedBy;
	@FindBy(xpath = ".//*[@id='label_offenderComplianceYesNoId']")
	public WebElementFacade lbl_viewSuComplied;
	@FindBy(xpath = ".//*[@id='label_note']")
	public WebElementFacade lbl_viewDrugResultNote;
	@FindBy(xpath = "//div[contains(text(),'Drug(s) to be tested for')]")
	public WebElementFacade lbl_viewDrugToBeTestedFor;
	@FindBy(xpath = "//th[contains(text(),'Drug')]")
	public WebElementFacade lbl_viewDrugType;
	@FindBy(xpath = "//th[contains(text(),'Admitted?')]")
	public WebElementFacade lbl_viewAdmittedUse;
	@FindBy(xpath = "//th[contains(text(),'Result')]")
	public WebElementFacade lbl_viewTestResult;
	@FindBy(xpath = "//th[contains(text(),'Agreed?')]")
	public WebElementFacade lbl_viewAgreed;
	@FindBy(xpath = ".//*[@id='Drug Test']")
	public WebElementFacade txt_viewDrugResultTab;

	//Value verification on View DrugResult

	@FindBy(xpath = ".//*[@id='dateOfTest']")
	public WebElementFacade val_viewDateOfTest;
	@FindBy(xpath = ".//*[@id='testedBy']")
	public WebElementFacade val_viewTestedBy;
	@FindBy(xpath = ".//*[@id='offenderComplianceYesNoId']/tr-list-label")
	public WebElementFacade val_viewSuComplied;
	@FindBy(xpath = ".//*[@id='note']")
	public WebElementFacade val_viewDrugResultNote;


	@FindBy(xpath = "(//tr-list-label[@ng-reflect-table-id='244'])[2]")
	public WebElementFacade val_viewRow1Admitted;
	@FindBy(xpath = "(//tr-list-label[@ng-reflect-table-id='2543'])[1]")
	public WebElementFacade val_viewRow1Result;
	@FindBy(xpath = "(//tr-list-label[@ng-reflect-table-id='244'])[3]")
	public WebElementFacade val_viewRow1Agreed;
	/*	@FindBy(xpath = "(//tr-list-label[@ng-reflect-table-id='244'])[4]")
			public WebElementFacade val_viewRow2Admitted;
			@FindBy(xpath = "(//tr-list-label[@ng-reflect-table-id='2543'])[2]")
			public WebElementFacade val_viewRow2Result;
			@FindBy(xpath = "(//tr-list-label[@ng-reflect-table-id='244'])[5]")
			public WebElementFacade val_viewRow2Agreed;
	 */

	@SuppressWarnings("deprecation")
	public void validateViewDrugResultDetails() {
		waitABit(500);
		try{
			String dateOfTest =  DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugsTest", "./DrugResultDate"));
			String testedBy =  ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugsTest", "./TestedBy");
			String SuComplied = ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugsTest", "./OffenderCompliance");
			String testResult = ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugTestResult", "./TestResult");
			String notes = ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugsTest", "./Notes");
			String admittedUse = ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugTestResult", "./AdmittedUse");
			String agreed = ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugTestResult", "./Agreed");
			String drugType = ReadXMLData.getXMLData("inboundXML/AE.xml", "//DrugTestResult", "./DrugType");

			Assert.assertTrue("Date Of Test label is not available",
					lbl_viewDateOfTest.getText().trim().equals("DATE OF TEST"));
			Assert.assertTrue("Tested By label is not available",
					lbl_viewTestedBy.getText().trim().equals("TESTED BY"));
			Assert.assertTrue("Notes label is not available",
					lbl_viewDrugResultNote.getText().trim().equals("NOTES"));
			Assert.assertTrue("Su Complied label is not available",
					lbl_viewSuComplied.getText().trim().equals("SU COMPLIED"));
			Assert.assertTrue("Result label is not available",
					lbl_viewTestResult.getText().trim().equals("RESULT"));
			Assert.assertTrue("Drug(s) to be tested for label is not available",
					lbl_viewDrugToBeTestedFor.getText().trim().equals("DRUG(S) TO BE TESTED FOR"));
			Assert.assertTrue("Agreed label is not available",
					lbl_viewAgreed.getText().trim().equals("AGREED?"));
			Assert.assertTrue("Admitted label is not available",
					lbl_viewAdmittedUse.getText().trim().equals("ADMITTED?"));
			Assert.assertTrue("Drug Type label is not available",
					lbl_viewDrugType.getText().trim().equals("DRUG"));


			System.out.println(dateOfTest);
			System.out.println(testedBy);
			System.out.println(SuComplied);
			System.out.println(admittedUse);
			System.out.println(notes);
			System.out.println(agreed);
			System.out.println(testResult);


			Assert.assertTrue("Date Of Test value not matched",
					val_viewDateOfTest.getText().trim().equals(dateOfTest));
			Assert.assertTrue("Tested By value not matched",
					val_viewTestedBy.getText().trim().equals(testedBy));
			Assert.assertTrue("Su Complied value not matched", 
					val_viewSuComplied.getText().trim().equals(SuComplied));
			Assert.assertTrue("Notes value not matched", 
					val_viewDrugResultNote.getText().trim().equals(notes));

			Assert.assertTrue("Admitted value not matched", 
					val_viewRow1Admitted.getText().trim().equals(admittedUse));

			Assert.assertTrue("Result  value not matched",
					val_viewRow1Result.getText().trim().equals(testResult));
			Assert.assertTrue("Agreed value not matched",
					val_viewRow1Agreed.getText().trim().equals(agreed));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public WebElementFacade getUniqueElement() {

		return lnk_DrugTest;
	}

}

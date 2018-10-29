// @Author :Amardeep Patil Date : 05-April-2017


package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
@SuppressWarnings("deprecation")

public class LicenceConditionPage extends NeoTR_Page{
     
	ServiceUserPage serviceuser;
	EventPage eventpage;
	
	
	// Add license Condition
	
	
//	@FindBy(xpath = "//input[@id='actualStartDate']")
//	private WebElementFacade tbx_actualStartDate;
//	@FindBy(xpath = "//input[@id='actualEndDate']")
//	private WebElementFacade tbx_actualEndDate;
//	@FindBy(xpath = "//select[@id='terminationReasonId']")
//	private WebElementFacade ddl_terminationReason;
//	@FindBy(xpath = "//input[@id='sentenceDate']")
//	private WebElementFacade tbx_sentenceDate;
//	@FindBy(xpath = "//input[@id='expectedStartDate']")
//	private WebElementFacade tbx_expectedStartDate;
//	@FindBy(xpath = "//input[@id='expectedEndDate']")
//	private WebElementFacade tbx_expectedEndDate;
//	@FindBy(xpath = "//input[@id='attendanceCount']")
//	private WebElementFacade tbx_attendanceCount;
//	@FindBy(xpath = ".//select[@id='licCondTypeMainCategoryId']")
//	private WebElementFacade ddl_licCondTypeMainCategory;
//	@FindBy(xpath = ".//select[@id='licCondTypeSubCategoryId']")
//	private WebElementFacade ddl_licCondTypeSubCategory;
//	@FindBy(xpath = ".//input[@id='lcResponsibleTeam']")
//	private WebElementFacade tbx_lcResponsibleTeam;
//	@FindBy(xpath = ".//input[@id='lcResponsibleOfficer']")
//	private WebElementFacade tbx_lcResponsibleOfficer;
//	@FindBy(xpath = ".//select[@id='lcProviderId']")
//	private WebElementFacade ddl_lcProvider;
//	@FindBy(xpath = ".//input[@id='note']")
//	private WebElementFacade tbx_note;
//	@FindBy(xpath = "//button[text()='Save']")
//	private WebElementFacade btn_save;
//	@FindBy(xpath = "//button[@class='btn btn-default btn-white'][text()='Cancel']")
//	private WebElementFacade btn_Cancel;
	
	@FindBy(xpath = "//select[@id='licCondTypeMainCategoryId']")
	private WebElementFacade tbx_LCMainType;
	@FindBy(xpath = "//select[@id='licCondTypeSubCategoryId']")
	private WebElementFacade tbx_LCsubtype;
	@FindBy(xpath = "//input[@id='sentenceDate']")
	private WebElementFacade tbx_SentenceDate;
	@FindBy(xpath = "//input[@id='expectedStartDate']")
	private WebElementFacade tbx_ExpectedReleaseDate;
	@FindBy(xpath = "//input[@id='actualStartDate']")
	private WebElementFacade tbx_ActualReleaseDate;
	@FindBy(xpath = "//input[@id='expectedEndDate']")
	private WebElementFacade tbx_LicenceExpiryDate;
	@FindBy(xpath = "//textarea[@id='note']")
	private WebElementFacade tbx_Notes;
	@FindBy(xpath = "//button[@id='saveButton']")
	private WebElementFacade btn_save;
	
	
	
	public void addLicenseCondition() {
			
//		tbx_actualStartDate.sendKeys("02/11/1988");
//		tbx_actualEndDate.sendKeys("02/11/1988");
//		ddl_terminationReason.selectByIndex(10);
//		tbx_sentenceDate.sendKeys("02/11/2000");
//		tbx_expectedStartDate.sendKeys("03/01/2017");
//		tbx_expectedEndDate.sendKeys("");
//		tbx_attendanceCount.sendKeys("");
//		ddl_licCondTypeMainCategory.selectByIndex(0);
//		ddl_licCondTypeSubCategory.selectByVisibleText("Future Skills");
//		tbx_lcResponsibleTeam.sendKeys("Test team");
//		tbx_lcResponsibleOfficer.sendKeys("Test Officer");
//		ddl_lcProvider.selectByIndex(0);
//		tbx_note.sendKeys("Check Notes");

		btn_save.click();
		waitABit(1000);
		waitForCondition();
	}

	
	// view and filter xpath
   

	@FindBy(xpath = "//a[text()='filter']")
	public WebElementFacade lnk_filter;
	@FindBy(xpath = ".//select[@id='licCondTypeMainCategoryId']")
	private WebElementFacade ddl_licCondTypeMainCategoryFilter;
	@FindBy(xpath = "//input[@id='actualStartDate']")
	private WebElementFacade tbx_actualStartDateFilter;
	@FindBy(xpath = "//input[@id='actualEndDate']")
	private WebElementFacade tbx_actualEndDateFilter;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElementFacade btn_Search;
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElementFacade btn_Reset;
	
	// View Licence Conditions_new
	@FindBy(xpath = "//a[contains(.,'Licence Conditions')]")
	public WebElementFacade lnk_Licenceconditions; 
	@FindBy(xpath = "//th[@id='licCondTypeMainCategoryId']")
	public WebElementFacade tbl_lcmaintype;
	@FindBy(xpath = "//th[@id='licCondTypeSubCategoryId']")
	public WebElementFacade tbl_lcsubtype;
	@FindBy(xpath = "//th[@id='expectedStartDate']")
	public WebElementFacade tbl_ExpectedReleaseDate;
	@FindBy(xpath = "//th[@id='actualStartDate']")
	public WebElementFacade tbl_ActualdReleaseDate;
	@FindBy(xpath = "//th[@id='actualEndDate']")
	public WebElementFacade tbl_TerminationDate;
	
	public void clickOnLicenceconditions() {
		waitForPresenceOf("//a[contains(.,'Licence Conditions')]");
		lnk_Licenceconditions.click();
		waitABit(1000);
		if (lnk_Licenceconditions.isCurrentlyVisible()) {
			lnk_Licenceconditions.click();
			waitABit(1000);
		} else
			System.out.println("lnk_Licenceconditions link is not available for");
		
				
	}
	
	public void validateLicenceconditionsTable() {

		verifyBreadCrumbs("Licenceconditions");
		Assert.assertTrue("Header is not not matched for  Licence Condition Main Type",
				tbl_lcmaintype.getText().trim().equals("Flag"));
		Assert.assertTrue("Licence Condition Sub Type does not match",
				tbl_lcsubtype.getText().trim().equals("Licence Condition Sub Type"));
		Assert.assertTrue("Expected Release Date does not match", tbl_ExpectedReleaseDate.getText().trim().equals("Expected Release Date"));
		Assert.assertTrue("Actual Release Date does not match", tbl_ActualdReleaseDate.getText().trim().equals("Actual Release Date"));
		Assert.assertTrue("Termination Date does not match",
				tbl_TerminationDate.getText().trim().equals("Termination Date"));
		// System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml",
		// "//Provision", "./StartDate"));
		 
}
	
	
	//View license Conditions details
	
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[1]")
	public WebElementFacade btn_viewLicenceCondition;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[1]")
	public WebElementFacade tbx_viewActualStartDate;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[2]")
	public WebElementFacade tbx_viewActualEndDate;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[3]")
	public WebElementFacade tbx_viewTerminationReason;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[4]")
	public WebElementFacade tbx_viewSentenceDate;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[5]")
	public WebElementFacade tbx_viewExpectedStartDate;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[6]")
	public WebElementFacade tbx_viewExpectedEndDate;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[7]")
	public WebElementFacade tbx_viewAttendanceCount;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[8]")
	public WebElementFacade tbx_viewLCTypeMainCategory;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[9]")
	public WebElementFacade tbx_viewLCTypeSubCategory;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[10]")
	public WebElementFacade tbx_viewLCResponcibleTeam;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[11]")
	public WebElementFacade tbx_viewLCResponcibleOfficer;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[12]")
	public WebElementFacade tbx_viewProvider;
	
	@FindBy(xpath = "(//div[@class='detail-value'])[13]")
	public WebElementFacade tbx_viewNote;
	
	@FindBy(xpath = "//button[text()='Back']")
	public WebElementFacade btn_back;
	
	
	
	// Edit License Conditions
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[2]")
	public WebElementFacade btn_editLicenceCondition;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElementFacade btn_Update;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElementFacade btn_EditCancel;
	
//	public void updateLicenseCondition() {
//        
//		btn_editLicenceCondition.click();
//		tbx_actualStartDate.clear();
//		tbx_actualStartDate.sendKeys("02/12/1988");
//		tbx_actualEndDate.clear();
//		tbx_actualEndDate.sendKeys("02/12/1988");
//		ddl_terminationReason.clear();
//		ddl_terminationReason.selectByIndex(10);
//		tbx_sentenceDate.clear();
//		tbx_sentenceDate.sendKeys("02/11/2000");
//		tbx_expectedStartDate.clear();
//		tbx_expectedStartDate.sendKeys("03/01/2017");
//		tbx_expectedEndDate.clear();
//		tbx_expectedEndDate.sendKeys("");
//		tbx_attendanceCount.clear();
//		tbx_attendanceCount.sendKeys("");
//		ddl_licCondTypeMainCategory.clear();
//		ddl_licCondTypeMainCategory.selectByIndex(0);
//		tbx_actualStartDate.clear();
//		ddl_licCondTypeSubCategory.selectByVisibleText("Future Skills");
//		tbx_actualStartDate.clear();
//		tbx_lcResponsibleTeam.sendKeys("Test team");
//		tbx_actualStartDate.clear();
//		tbx_lcResponsibleOfficer.sendKeys("Test Officer");
//		tbx_actualStartDate.clear();
//		ddl_lcProvider.selectByIndex(0);
//		tbx_actualStartDate.clear();
//		tbx_note.sendKeys("Update Notes");
//		btn_save.click();
//		waitABit(1000);
//
//	}
	
	//Delete license condition
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[3]")
	public WebElementFacade btn_deleteLicenceCondition;
	
	public void deleteLicenseCondition(){
		
		if (btn_deleteLicenceCondition.isCurrentlyVisible()) {
			btn_deleteLicenceCondition.click();
			waitABit(1000);
		} else
			System.out.println("License Condition is not available on ui");
	}
	
	public void verifyDelteDisability(){
		Assert.assertTrue("license condition is not deleted", btn_deleteLicenceCondition.isCurrentlyVisible());
	}	
	
	public void licenseViewFieldVerification() {
		//Assert.assertTrue("View Licence Dondition text is not available", lnk_lcHeaderlink.getText().equals("LICENCE CONDITION"));
//		Assert.assertTrue("back btn is not available", btn_back.getText().equals("BACK"));
//		Assert.assertTrue("Actual Start Date not matched", tbx_actualStartDate.getText().trim().equals("02/12/1988"));
//		Assert.assertTrue("Actual End Date not matched", tbx_actualEndDate.getText().trim().equals("02/11/1988"));
//		Assert.assertTrue("Expected Start Date not matched", tbx_expectedStartDate.getText().trim().equals("03/01/2017"));
//		Assert.assertTrue("Notes not matched", tbx_note.getText().trim().equals("Check Notes"));
	}	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

}

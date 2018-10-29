package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class RegistrationPage extends NeoTR_Page {
	

	@FindBy(xpath = "//select[@id='registrationProviderId']")
	private WebElementFacade tbx_registeringOfficersProvider;
	@FindBy(xpath = "//[@id='registerTypeId']")
	private WebElementFacade ddl_registrationType;
	@FindBy(xpath = "//input[@id='registrationDate']")
	private WebElementFacade tbx_registrationDate;
	@FindBy(xpath="//input[@id='reviewPeriod']")
	private WebElementFacade tbx_ReviewPeriod;
	@FindBy(xpath="//input[@id='nextReviewDate']")
	private WebElementFacade tbx_NextReviewDate;
	@FindBy(xpath = "//select[@id='registeringTeam']")
	private WebElementFacade tbx_registeringOfficersTeam;
	@FindBy(xpath = "//select[@id='registeringOfficer']")
	private WebElementFacade tbx_registeringOfficer;
	@FindBy(xpath="//textarea[@id='registrationNote']")
	private WebElementFacade tbx_RegistrationNotes;
	@FindBy(xpath="//button[@id='registration_addButton']")
	private WebElementFacade btn_AddRegistration;
	@FindBy(xpath = "//h2[text()='VIEW Registration']")
	private WebElementFacade txt_viewRegistration;
	
	@FindBy(xpath = "//a[contains(.,'R')]")
	private WebElementFacade btn_R;
	@FindBy(xpath = "//a[contains(.,'Registrations')]")
	private WebElementFacade lnk_Registration;
	@FindBy(xpath = "//th[@id='registerFlagId']")
	private WebElementFacade list_Flag;
	@FindBy(xpath = "//th[@id='registerTypeId']")
	private WebElementFacade list_type;
	@FindBy(xpath = "//th[@id='registrationDate']']")
	private WebElementFacade list_date;
	@FindBy(xpath = "//th[@id='nextReviewDate']")
	private WebElementFacade list_nextreview;
	@FindBy(xpath = "//th[@id='deregistrationDate']")
	private WebElementFacade list_enddate;

	public void clickOnR() {
		waitForPresenceOf("//a[contains(.,'R')]");
		btn_R.click();
		waitABit(1000);
		if (btn_R.isCurrentlyVisible()) {
			btn_R.click();
			waitABit(1000);
		} else
			System.out.println("btn R is not available for Registration page");
	}
	
	public void clickOnRegisterationLink() {
		waitForPresenceOf("//a[contains(.,'Registrations')]");
		lnk_Registration.click();
		waitABit(1000);
		if (lnk_Registration.isCurrentlyVisible()) {
			lnk_Registration.click();
			waitABit(1000);
		} else
			System.out.println("lnk Registration is not available for Registration page");
	
	}
	
	public void validateRegistriationListingTable() {

		verifyBreadCrumbs("Registration");
		Assert.assertTrue("Header is not not matched for Flag",
				list_Flag.getText().trim().equals("Flag"));
		Assert.assertTrue("Type does not match",
				list_type.getText().trim().equals("Type"));
		Assert.assertTrue("date does not match", list_date.getText().trim().equals("Date"));
		Assert.assertTrue("Next Review does not match", list_nextreview.getText().trim().equals("Next Review"));
		Assert.assertTrue("End Date does not match",
				list_enddate.getText().trim().equals("End Date"));
		// System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml",
		// "//Provision", "./StartDate"));
		 
}
	
	public void ClickAddRegistrationbtn(){
		waitFor(btn_AddRegistration);
		btn_AddRegistration.click();
		waitABit(1000);
	}
	
	public void enterRegistrationDetails(){
		tbx_registeringOfficersProvider.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./RegisteringOfficersProvider"));
		waitABit(100);
		ddl_registrationType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./Register_Type"));
		waitABit(100);
		tbx_registrationDate.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./RegistrationDate"));
		waitABit(100);
		tbx_ReviewPeriod.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./ReviewPeriod"));
		waitABit(100);
		tbx_NextReviewDate.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./NextReviewDate"));
		waitABit(100);
		tbx_registeringOfficersTeam.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./RegisteringOfficersTeam"));
		waitABit(100);
		tbx_registeringOfficer.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./RegisteringOfficer"));
		waitABit(100);
		tbx_RegistrationNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml","//<Registration_ADD", "./Notes"));
		waitABit(100);
	}
	
		
	
	
	@FindBy(xpath = "//button[text()='Back']")
	   private WebElementFacade btn_back;
	
	
	public void editRegistrationDetails(){
		tbx_registrationDate.clear();
		waitABit(100);
		tbx_registrationDate.sendKeys("03/03/2015");
		waitABit(100);
		ddl_registrationType.selectByVisibleText("Very High RoSH");
		waitABit(100);
//		ddl_registrationProvider.selectByVisibleText("NPS South West and South Central");
//		waitABit(100);
//		tbx_registeringTeam.clear();
//		waitABit(100);
//		tbx_registeringTeam.sendKeys("Diary Team Edited");
//		waitABit(100);
		tbx_registeringOfficer.clear();
		waitABit(100);
		tbx_registeringOfficer.sendKeys("Officer Kent Edited");
		waitABit(100);
	}
	
	public void addRegistrationVerification() {
		Assert.assertTrue("view rate card intervention text is not available",
				txt_viewRegistration.getText().trim().equals("VIEW Registration"));
		Assert.assertTrue("back button is not available", btn_back.getText().trim().equals("BACK"));
	}
	
	public void editRegistrationVerification(){
		Assert.assertTrue("view rate card intervention text is not available",
				txt_viewRegistration.getText().trim().equals("VIEW Registration"));
		Assert.assertTrue("back button is not available", btn_back.getText().trim().equals("BACK"));
	}
	
	// For Registration Review Structure
	@FindBy(xpath = "//a[contains(text(),'Registration Review')]")
	private WebElementFacade lnk_registrationReview;
	
	@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'registrationreview')])[2]/button")
	private WebElementFacade btn_viewRegistrationReview;
	
	@FindBy(xpath = "//a[@ng-reflect-router-link='registrationreview,new']/button")
	private WebElementFacade btn_addRegistrationReview;
	
	@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'registrationreview')])[2]/parent::td/following-sibling::td[1]/a")
	private WebElementFacade btn_editRegistrationReview;
	
	@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'registrationreview')])[3]/parent::td/following-sibling::td//button")
	private WebElementFacade btn_deleteRegistrationReview;

	public void clickOnRegistrationReviewLnk() {
		waitForPresenceOf("//a[contains(text(),'Registration')]");
		lnk_registrationReview.click();
		waitABit(1000);
	}
	
	
	public void clickAddRegistrationReviewBtn(){
		waitForTextToAppear(lnk_registrationReview.getText(),20000);
		clickOnRegistrationReviewLnk();
		if (btn_addRegistrationReview.isCurrentlyVisible()) {
			btn_addRegistrationReview.click();
			waitABit(1000);
		} else
			System.out.println("add btn is not available for Registration Review.");
		
	}

	public void clickViewRegistrationReview(){
		waitForTextToAppear(lnk_registrationReview.getText(),20000);
		if (!btn_viewRegistrationReview.isCurrentlyVisible()) {
			waitABit(500);
			clickOnRegistrationReviewLnk();

			if (btn_viewRegistrationReview.isCurrentlyVisible()) {
				btn_viewRegistrationReview.click();
				waitABit(500);
			} else
				System.out.println("no record for registration review is available ... add registration review record first then click on view button");
		}
		
	}

	public void clickEditRegistrationReviewBtn() {
		waitForTextToAppear(lnk_registrationReview.getText(),20000);
		if (!btn_editRegistrationReview.isCurrentlyVisible()) {
			waitABit(500);
			clickOnRegistrationReviewLnk();

			if (btn_editRegistrationReview.isCurrentlyVisible()) {
				btn_editRegistrationReview.click();
				waitABit(500);
			} else
				System.out.println("no record for registration review is available ... add registration review record first then click on edit button");
		}
		
	}

	public void clickDeleteRegistrationReviewBtn() {
		waitForTextToAppear(lnk_registrationReview.getText(),20000);
		if (!btn_deleteRegistrationReview.isCurrentlyVisible()) {
			waitABit(500);
			clickOnRegistrationReviewLnk();

			if (btn_deleteRegistrationReview.isCurrentlyVisible()) {
				btn_deleteRegistrationReview.click();
				waitABit(500);
			} else
				System.out.println("no record for registration review is available ... add registration review record first then click on delete button");
		}
		
	}
	
	@Override
	public WebElementFacade getUniqueElement() {
		return tbx_registrationDate;
	}



}

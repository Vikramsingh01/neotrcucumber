package com.meganexus.pageObjectLib;

import org.openqa.selenium.ElementNotVisibleException;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
abstract public class NeoTR_Page extends PageObject {
	@FindBy(xpath = "//button[text()='Close']")
	public WebElementFacade btn_close;
	@FindBy(xpath = "//button[text()='Log Out']")
	private WebElementFacade btn_logOut;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	private WebElementFacade breadcrumb;

	public void clickOnLogoutBtn() {
		try {
			btn_logOut.click();
			waitABit(2000);
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}

	}

	public void getTextForLogout() {
		btn_logOut.getText();
		waitABit(500);
	}

	@FindBy(xpath = "//button[text()='Change Password']")
	private WebElementFacade btn_changePassword;

	public void clickOnChangePassword() {
		btn_changePassword.click();
		waitABit(2000);
	}

	public void getTextForChangePassword() {
		btn_changePassword.getText();
		waitABit(500);
	}

	@FindBy(xpath = "//img[@alt='interserve']")
	private WebElementFacade img_Interserve;
	@FindBy(xpath = "//button[@id='backButton']")
	private WebElementFacade btn_back;
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back1;

	public void clickBackBtn() {
		if(btn_back.isCurrentlyVisible()){
		btn_back.click();
		waitABit(6000);
		}else if(btn_back1.isCurrentlyVisible()){
			btn_back1.click();
			waitABit(6000);
		}else
			System.out.println("back btn is not available");
		
	}

	public String getTextForBackBtn() {
		return btn_back.getText().trim();
	}

	@FindBy(xpath = "//button[text()='SUBMIT']")
	private WebElementFacade btn_Submit;

	public void verifyBreadCrumbs(String expectedBreadCrumb) {
		System.out.println("Actual Breadcrumb :" + breadcrumb.getText());
		Assert.assertTrue("Breadcrumbs not matching", breadcrumb.getText().equals(expectedBreadCrumb));
	}

	public void clickSubmitBtn() {
		btn_Submit.click();
		waitABit(3000);
	}

	@FindBy(xpath = "//button[text()='CANCEL']")
	private WebElementFacade btn_cancel;
	
	//Cancel/Ok pup up on Edit page 
	@FindBy(xpath = ".//*[@id='myModalLabel']")
	private WebElementFacade popUpLbl_confirm;

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	private WebElementFacade popUpbtn_Ok;
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElementFacade popUpbtn_Cancel;
	
	public void clickCancelBtn() {
		btn_cancel.click();
		waitABit(3000);
		if(popUpLbl_confirm.isDisplayed())
		{
			popUpbtn_Ok.click();
		}
		else {
			System.out.println("pop-up is not displayed");
		}
	}
	

	// for Summary
	@FindBy(xpath = "//button[text()='Summary']")
	private WebElementFacade btn_Summary;

	public void clickOnSummary() {
		btn_Summary.click();
		waitABit(1000);
	}

	public void getTextForSummaryBtn() {
		btn_Summary.getText();
		waitABit(500);
	}

	// for profile
	@FindBy(xpath = "//button[@ng-reflect-router-link='profile']")
	private WebElementFacade btn_Profile;

	public void clickOnProfile() {
		btn_Profile.click();
		waitABit(1000);
	}

	public void getTextForHProfile() {
		btn_Profile.getText();
		waitABit(500);
	}

	// for contact information
	@FindBy(xpath = "//button[text()='Contact Information']")
	private WebElementFacade btn_contactInformation;

	public void clickOnContactInformationLink() {
		btn_contactInformation.click();
		waitABit(1000);
	}

	public void getTextForContactInformationLink() {
		btn_contactInformation.getText();
		waitABit(500);
	}

	// for Personal circumstances
	@FindBy(xpath = "//button[@ng-reflect-router-link='personalcircumstance']")
	private WebElementFacade btn_PersonalCircumstance;

	public void clickOnPersonalCircumstanceBtn() {
		btn_PersonalCircumstance.click();
		waitABit(1000);
	}

	public void getTextForPersonalCircumstanceBtn() {
		btn_PersonalCircumstance.getText();
		waitABit(500);
	}

	// for Plan
	@FindBy(xpath = "//button[text()='Plan']")
	private WebElementFacade btn_Plan;

	public void clickOnPlanBtn() {
		btn_Plan.click();
		waitABit(1000);
	}

	public void getTextForPlanBtn() {
		btn_PersonalCircumstance.getText();
		waitABit(500);
	}

	// for ProtectedCharacteristics
	@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'protected-characteristics')]")
	private WebElementFacade btn_ProtectedCharacteristics;

	public void clickOnProtectedCharacteristicsBtn() {
		btn_ProtectedCharacteristics.click();
		waitABit(1000);
	}

	public void getTextForProtectedCharacteristicsBtn() {
		btn_ProtectedCharacteristics.getText();
		waitABit(500);
	}

	// for Accessibility
	@FindBy(xpath = "//button[text()='Accessibility']")
	private WebElementFacade btn_Accessibilty;

	public void clickOnAccessibiltyLink() {
		btn_Accessibilty.click();
		waitABit(1000);
	}

	public void getTextForAccessibiltyLink() {
		btn_Accessibilty.getText();
		waitABit(500);
	}

	// for CaseManager
	@FindBy(xpath = "//button[text()='Case Manager']")
	private WebElementFacade btn_CaseManager;

	public void clickOnCaseManagerLink() {
		btn_CaseManager.click();
		waitABit(1000);
	}

	public void getTextForCaseManagerLink() {
		btn_CaseManager.getText();
		waitABit(500);
	}

	// for service user
	@FindBy(xpath = "//span[text()='Service Users']")
	private WebElementFacade lnk_serviceUser;

	public void getTextForServiceUser() {
		lnk_serviceUser.getText();
		waitABit(500);
	}

	// For delete confirmation OK
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElementFacade btn_DeleteConfirmOk;

	public void clickOnDeleteConfirmOkBtn() {
		btn_DeleteConfirmOk.click();
		waitABit(1000);
	}
	//Court work xpath for psc admin page-created by tapan
	@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'/admin-court-work')]")
	private WebElementFacade btn_courtWorkTabForPSC_AdminPage;
	public void courtWorkTabForPSC_AdminPage(){
		btn_courtWorkTabForPSC_AdminPage.click();
		waitABit(1000);
	}

	abstract public WebElementFacade getUniqueElement();

}

package com.meganexus.pageObjectLib;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Click;

@SuppressWarnings("deprecation")
public class ContactEditAddPage extends NeoTR_Page {

	ContactInformationPage contactinformationpage;

	@FindBy(xpath = "//h2[text()='Add Contact Information']")
	private WebElementFacade hdr_addContactInformation;

	@FindBy(xpath = "//h2[text()='Edit Contact Information']")
	private WebElementFacade hdr_editContactInformation;

	@FindBy(xpath = "//a[contains(text(),'CONTACT INFORMATION')]")
	private WebElementFacade lnk_contactInformationExpanded;

	@FindBy(xpath = "//label[contains(text(),'Telephone Number')]")
	private WebElementFacade lbl_telephoneNumber;

	@FindBy(xpath = "//input[@id='telephoneNumber']")
	private WebElementFacade tbx_telephoneNumber;

	@FindBy(xpath = "//label[contains(text(),'Mobile Number')]")
	private WebElementFacade lbl_mobileNumber;

	@FindBy(xpath = "//input[@id='mobileNumber']")
	private WebElementFacade tbx_mobileNumber;

	@FindBy(xpath = "//div[contains (text(),'Invalid Number')]")
	private WebElementFacade invalidNumber;

	@FindBy(xpath = "//label[contains(text(),'Email Address')]")
	private WebElementFacade lbl_emailAddress;

	@FindBy(xpath = "//input[@id='emailAddress']")
	private WebElementFacade tbx_emailAddress;

	@FindBy(xpath = "//label[contains(text(),'Allowed SMS')]")
	private WebElementFacade lbl_allowedSMS;

	@FindBy(xpath = "//input[@ng-reflect-value='1']")
	private WebElementFacade btn_Yes;

	@FindBy(xpath = "//input[@ng-reflect-value='2']")
	private WebElementFacade btn_No;

	@FindBy(xpath = "//div[text()='Invalid value']")
	private WebElementFacade msg_invalidValue;

	@FindBy(xpath = "//div[text()='Maximum length exceeded']")
	private WebElementFacade msg_maxLengthExceed;

	@FindBy(xpath = "//div[text()='Mobile Number is Mandatory.']")
	private WebElementFacade msg_mobileNoMandatory;

	public void enterFieldValueAddContactInformation() {

		tbx_telephoneNumber.sendKeys("9865478512");
		waitABit(100);
		tbx_mobileNumber.sendKeys("0765478512");
		waitABit(100);
		tbx_emailAddress.sendKeys("abc@meganexus.com");
		waitABit(100);
		btn_No.click();
		waitABit(100);

	}

	/*public void clickOnYes() {
		btn_Yes.click();
	}*/

	public void verifyLabelAndErrorMsgAddContactInformationPage() {
		verifyBreadCrumbs("Service User Summary Contact Information Add Contact Information");
		Assert.assertTrue("header is not not matched for Contact Information",
				hdr_addContactInformation.getText().trim().equals("ADD CONTACT INFORMATION"));
		Assert.assertTrue("contact information link does not matched",
				lnk_contactInformationExpanded.getText().trim().equals("CONTACT INFORMATION"));
		Assert.assertTrue("telephone number title does not match",
				lbl_telephoneNumber.getText().trim().equals("Telephone Number"));
		Assert.assertTrue("Mobile No. does not match", lbl_mobileNumber.getText().trim().equals("Mobile No."));
		Assert.assertTrue("SMS Allowed? does not match", lbl_allowedSMS.getText().trim().equals("SMS Allowed?"));
		Assert.assertTrue("Email Address does not match", lbl_emailAddress.getText().trim().equals("Email Address"));

		clickSubmitBtn();
		waitABit(100);
		Assert.assertTrue("Error messge not matched for telephone number",
				msg_invalidValue.getText().trim().equals("Invalid value"));
		Assert.assertTrue("Error messge not matched Mobile No.",
				msg_maxLengthExceed.getText().trim().equals("Maximum length exceeded"));
		Assert.assertTrue("Error messge mandatory Mobile No.",
				msg_mobileNoMandatory.getText().trim().equals("Mobile Number is Mandatory."));

	}

	public void selectYesRadioBtn() {
		btn_Yes.click();
	}

	public void verifyLabelsAndErrorMsgEditContactInformationPage() {
		if (hdr_editContactInformation.isCurrentlyVisible()) {
			verifyBreadCrumbs("Service User Summary Contact Information Edit Contact Information");
		}

		try {

			Assert.assertTrue("header is not not matched for Contact Information",
					hdr_editContactInformation.getText().trim().equals("EDIT CONTACT INFORMATION"));
			Assert.assertTrue("contact information link does not matched",
					lnk_contactInformationExpanded.getText().trim().equals("CONTACT INFORMATION"));
			Assert.assertTrue("telephone number title does not match",
					lbl_telephoneNumber.getText().trim().equals("Telephone Number"));
			Assert.assertTrue("Mobile No. does not match", lbl_mobileNumber.getText().trim().equals("Mobile No."));
			Assert.assertTrue("SMS Allowed? does not match", lbl_allowedSMS.getText().trim().equals("SMS Allowed?"));
			Assert.assertTrue("Email Address does not match",
					lbl_emailAddress.getText().trim().equals("Email Address"));
			tbx_telephoneNumber.clear();
			waitABit(100);
			tbx_mobileNumber.clear();
			waitABit(100);
			tbx_emailAddress.clear();
			waitABit(100);
			tbx_telephoneNumber.sendKeys("ab@#$$$");
			Assert.assertTrue("Error messge not matched for telephone number",
					msg_invalidValue.getText().trim().equals("Invalid value"));

			tbx_telephoneNumber.sendKeys("2525252525252525252525252525252552528");
			Assert.assertTrue("Error messge not matched for maximum length",
					msg_maxLengthExceed.getText().trim().equals("Maximum length exceeded"));

			tbx_mobileNumber.sendKeys("585258558");
			Assert.assertTrue("Error messge Invalid Number.",
					msg_mobileNoMandatory.getText().trim().equals("Invalid Number."));

			tbx_mobileNumber.clear();
			waitABit(100);

			btn_Yes.click();
			Assert.assertTrue("Error messge for Mobile Number is Mandatory.",
					msg_mobileNoMandatory.getText().trim().equals("Mobile Number is Mandatory."));

		} catch (ElementNotFoundException a) {
			a.printStackTrace();
			System.out.println("Element not found");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
/*
	public void updateInContactInformation() {
		tbx_telephoneNumber.clear();
		waitABit(500);
		tbx_mobileNumber.clear();
		waitABit(500);
		tbx_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./StartDate"));
		waitABit(500);
		tbx_mobileNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./EndDate"));
		waitABit(500);
		// ddl_AccessibilityProvision.selectByIndex(1);
		tbx_emailAddress.clear();
		waitABit(500);
		tbx_emailAddress.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./EndDate"));

		waitABit(500);
	}*/

	public void editContactInformation() {
		tbx_telephoneNumber.clear();
		waitABit(100);
		tbx_mobileNumber.clear();
		waitABit(100);
		tbx_emailAddress.clear();
		waitABit(100);
		tbx_telephoneNumber.sendKeys("9865478844");
		tbx_mobileNumber.sendKeys("0765470002");
		tbx_emailAddress.sendKeys("abcde@meganexus.com");
		clickSubmitBtn();
		waitABit(10000);

	}

	public void checkCancelBtn() {
		clickCancelBtn();
	}

	public void ContactViewFieldVerification() {

	}

	@Override
	public WebElementFacade getUniqueElement() {

		return lnk_contactInformationExpanded;
	} 

	public void enterValidValueForEditContactInformationPage() {
		tbx_telephoneNumber.sendKeys("5555555555555");
		tbx_mobileNumber.sendKeys("076345435345345");
		tbx_emailAddress.sendKeys("vikram@meganexus.com");
		btn_Yes.click();
		clickSubmitBtn();
		waitABit(10000);
		
	}
}

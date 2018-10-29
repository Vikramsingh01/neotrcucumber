package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DatabaseConnection;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class ContactInformationPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[text()='Contact Information']")
	private WebElementFacade hdr_contactinformation;
	@FindBy(xpath = "//a[contains(text(),'CONTACT INFORMATION')]")
	private WebElementFacade lnk_contactInformationExpanded;

	@FindBy(xpath = "//div[contains(@id,'label_telephoneNumber')]")
	private WebElementFacade lbl_TelephoneNumbertitle;

	@FindBy(xpath = "//p[contains(@id,'telephoneNumber')]")
	private WebElementFacade fValue_TelephoneNumber;

	@FindBy(xpath = "//div[contains(@id,'label_mobileNumber')]")
	private WebElementFacade lbl_mobileNumbertitle;

	@FindBy(xpath = "//p[contains(@id,'mobileNumber')]")
	private WebElementFacade fValue_mobileNumber;

	@FindBy(xpath = "//div[contains(@id,'label_allowSmsYesNoId')]")
	private WebElementFacade lbl_SmsAllowedTitle;
	@FindBy(xpath = "//div[@id='label_allowSmsYesNoId']/following-sibling::p")
	private WebElementFacade fValue_SmsAllowed;

	@FindBy(xpath = "//div[contains(@id,'emailAddress')]")
	private WebElementFacade lbl_Emailtitle;

	@FindBy(xpath = "//p[contains(@id,'emailAddress')]")
	private WebElementFacade fValue_viewEmail;

	@FindBy(xpath = "//a[@ng-reflect-router-link='contact,new']/button")
	private WebElementFacade btn_NewContact;
	@FindBy(xpath = "//button[@id='contactinformation_editButton']")
	private WebElementFacade btn_editContact;

	@FindBy(xpath = "//button[@id='contactinformation_addButton']")
	private WebElementFacade btn_addContact;

	@FindBy(xpath = "//button[@ng-reflect-router-link='network,new']")
	private WebElementFacade btn_AddNetwork;

	@FindBy(xpath = "//a[contains(text(),'Network')]")
	private WebElementFacade lnk_Network;

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'network')])[2]")
	private WebElementFacade btn_ViewNetwork;

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'network')])[3]")
	private WebElementFacade btn_EditNetwork;

	@FindBy(xpath = "//button[@ng-reflect-router-link='address,new']")
	private WebElementFacade btn_addAddress;

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'address,edit')])")
	private WebElementFacade btn_editAddress;

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'address')])[2]")
	private WebElementFacade btn_viewAddress;
	@FindBy(xpath = "//a[contains(text(),'ADDRESS')]")
	private WebElementFacade lnk_Address;

	// for contact structure
	public void addContactBtn() {
		if (btn_addContact.isCurrentlyVisible()) {
			btn_addContact.click();
			waitABit(200);
		}
	}

	public void editContactBtn() {
		if (btn_editContact.isCurrentlyVisible())
			try {

				btn_editContact.click();
				waitABit(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		 else
			System.out.println("button is locked or add btn is available");

	}

	public void verifyViewContactInformationPageWithInboundXML() {
		Assert.assertTrue("Header is not not matched for contact information",
				hdr_contactinformation.getText().trim().equals("CONTACT INFORMATION"));
		Assert.assertTrue("contact information link does not match",
				lnk_contactInformationExpanded.getText().trim().equals("CONTACT INFORMATION"));
		Assert.assertTrue("telephone number title does not match",
				lbl_TelephoneNumbertitle.getText().trim().equals("Telephone Number"));
		Assert.assertTrue("Mobile No. does not match", lbl_mobileNumbertitle.getText().trim().equals("Mobile No."));
		Assert.assertTrue("SMS Allowed? does not match", lbl_SmsAllowedTitle.getText().trim().equals("SMS Allowed?"));
		Assert.assertTrue("Email Address does not match", lbl_Emailtitle.getText().trim().equals("Email Address"));
		try {
			if (fValue_TelephoneNumber.getText().trim().length() != 0) {
				Assert.assertEquals("Telephone value does not match with Inbound XML",
						fValue_TelephoneNumber.getText().trim(),
						ReadXMLData.getXMLData("inbound/AO.xml", "//OffenderDetails", "./TelephoneNumber").trim());
			}
			if (fValue_mobileNumber.getText().trim().length() != 0) {
				Assert.assertEquals("Mobile no value does not match with Inbound XML",
						fValue_mobileNumber.getText().trim(),
						ReadXMLData.getXMLData("inbound/AO.xml", "//OffenderDetails", "./MobileNumber").trim());

			}
			if (fValue_SmsAllowed.getText().trim().length() != 0) {
				Assert.assertEquals("Allow sms value does not match with Inbound XML",
						fValue_SmsAllowed.getText().trim(),
						ReadXMLData.getXMLData("inbound/AO.xml", "//OffenderDetails", "./AllowSMS").trim());

			}
			if (fValue_viewEmail.getText().trim().length() != 0) {
				Assert.assertEquals("Email id value does not match with Inbound XML", fValue_viewEmail.getText().trim(),
						ReadXMLData.getXMLData("inbound/AO.xml", "//OffenderDetails", "./EmailAddress").trim());

			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	public void verifyInsertedContactInformationeWithOutboundXML() {
		Assert.assertTrue("INS xml should generate", ReadXMLData
				.getXMLData("outboundXML/OffenderDetails.xml", "//SPGMessageHeader", "./MessageType").equals("INS"));
		if (ReadXMLData.getXMLData("inbound/ADD_OffenderDetails.xml", "//OffenderDetails", "./TelephoneNumber").trim()
				.length() != 0) {
			Assert.assertEquals("Telephone value does not match with Inbound XML",
					fValue_TelephoneNumber.getText().trim(),
					ReadXMLData
							.getXMLData("outboundXML/ADD_OffenderDetails.xml", "//OffenderDetails", "./TelephoneNumber")
							.trim());
		}
		if (ReadXMLData.getXMLData("inbound/ADD_OffenderDetails.xml", "//OffenderDetails", "./MobileNumber").trim()
				.length() != 0) {
			Assert.assertEquals("Mobile no value does not match with Inbound XML", fValue_mobileNumber.getText().trim(),
					ReadXMLData.getXMLData("outboundXML/ADD_OffenderDetails.xml", "//OffenderDetails", "./MobileNumber")
							.trim());

		}
		if (ReadXMLData.getXMLData("outboundXML/ADD_OffenderDetails.xml", "//OffenderDetails", "./AllowSMS").trim()
				.length() != 0) {
			Assert.assertEquals("Allow sms value does not match with Inbound XML", fValue_SmsAllowed.getText().trim(),
					ReadXMLData.getXMLData("outboundXML/ADD_OffenderDetails.xml", "//OffenderDetails", "./AllowSMS")
							.trim());

		}
		if (ReadXMLData.getXMLData("inbound/ADD_OffenderDetails.xml", "//OffenderDetails", "./EmailAddress").trim()
				.length() != 0) {
			Assert.assertEquals("Email id value does not match with Inbound XML", fValue_viewEmail.getText().trim(),
					ReadXMLData.getXMLData("outboundXML/ADD_OffenderDetails.xml", "//OffenderDetails", "./EmailAddress")
							.trim());

		}

	}

	public void verifyUpdatedContactInformationValueWithOutboundXML() {
		Assert.assertTrue("INS xml should generate", ReadXMLData
				.getXMLData("outboundXML/OffenderDetails.xml", "//SPGMessageHeader", "./MessageType").equals("UPD"));
		if (ReadXMLData.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./TelephoneNumber")
				.trim().length() != 0) {
			Assert.assertEquals("Telephone value does not match with Inbound XML",
					fValue_TelephoneNumber.getText().trim(),
					ReadXMLData
							.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./TelephoneNumber")
							.trim());
		}
		if (ReadXMLData.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./MobileNumber").trim()
				.length() != 0) {
			Assert.assertEquals("Mobile no value does not match with Inbound XML", fValue_mobileNumber.getText().trim(),
					ReadXMLData.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./MobileNumber")
							.trim());

		}
		if (ReadXMLData.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./AllowSMS").trim()
				.length() != 0) {
			Assert.assertEquals("Allow sms value does not match with Inbound XML", fValue_SmsAllowed.getText().trim(),
					ReadXMLData.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./AllowSMS")
							.trim());

		}
		if (ReadXMLData.getXMLData("outboundXML/AO.xml", "//UPD_OffenderDetails", "./EmailAddress").trim()
				.length() != 0) {
			Assert.assertEquals("Email id value does not match with Inbound XML", fValue_viewEmail.getText().trim(),
					ReadXMLData.getXMLData("outboundXML/UPD_OffenderDetails.xml", "//OffenderDetails", "./EmailAddress")
							.trim());

		}

	}

	// for address structure

	public void addAddressBtn() {
		btn_addAddress.click();
		waitABit(200);
	}

	public void editAddressBtn() {
		btn_editAddress.click();
		waitABit(200);
	}

	public void viewAddressBtn() {
		btn_viewAddress.click();
		waitABit(200);
	}

	public void addNetworkBtn() {

		btn_AddNetwork.click();
		waitABit(1000);
	}

	public void viewNetwork() {

		btn_ViewNetwork.click();
		waitABit(1000);
	}

	public void AddNewContact() {
		btn_NewContact.click();
		waitABit(1000);
	}

	@FindBy(xpath = "//a[contains(text(),'Network')]")
	private WebElementFacade lnk_expand;

	public void clickOnExpandNetwork() {
		lnk_expand.click();
		waitABit(1000);

	}

	public void clickOnAddressExpandLnk() {
		lnk_Address.click();
		waitABit(500);

	}

	public void clickEditNetworkBtn() {
		btn_EditNetwork.click();
		waitABit(500);
	}

	// -----------Delete Address-----------------//

	@FindBy(xpath = "(//button[@id='address_delete'])[1]")
	private WebElementFacade btn_deleteAddress;

	public void clickDeleteAddressBtn() {
		btn_deleteAddress.click();
	}
	
	public void VerifyDBRecord() {
		 DatabaseConnection.executeSQLQuery("");
		
		}

	public void verfiyAddressRecordDeleted() {
		if (!btn_deleteAddress.isCurrentlyVisible()) {
			System.out.println("Delete is working for Address");
		} else
			System.out.println("Delete is not working for Address");
	}

	// -----------Delete Network-----------------//
	@FindBy(xpath = ".//*[@id='network_delete']")
	private WebElementFacade btn_deleteNetwork;

	public void clickDeleteNetworkBtn() {
		if (!btn_deleteNetwork.isCurrentlyVisible()) {
			lnk_expand.click();
			waitABit(3000);
			if (btn_deleteNetwork.isCurrentlyVisible()) {
				btn_deleteNetwork.click();
				waitABit(1000);
			} else
				System.out.println("Delete btn is not available");
		}
	}

	public void verfiyNetworkRecordDeleted() {
		if (!btn_deleteNetwork.isCurrentlyVisible()) {
			System.out.println("Delete is working for Network");
		} else
			System.out.println("Delete is not working for Network");
	}

	@Override
	public WebElementFacade getUniqueElement() {

		return hdr_contactinformation;
	}

	public void listDetailsAddressReview() {

	}

}

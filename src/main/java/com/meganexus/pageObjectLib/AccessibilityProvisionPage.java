package com.meganexus.pageObjectLib;

import org.junit.Assert;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccessibilityProvisionPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[text()='VIEW Accessibility Provision']")
	private WebElementFacade hdr_ViewAccessibilityProvision;
	@FindBy(xpath = "//h2[text()='Add Accessibility Provision']")
	private WebElementFacade hdr_AddAccessibilityProvision;
	@FindBy(xpath = "//h2[text()='Edit Accessibility Provision']")
	private WebElementFacade hdr_EditAccessibilityProvision;
	@FindBy(xpath = "//a[text()='Accessibility Provision']")
	private WebElementFacade lnk_AccessibilityProvision;
	@FindBy(xpath = "//div[text()='Start Date']")
	private WebElementFacade lbl_startDate;
	@FindBy(xpath = "//label[text()='Start Date']")
	private WebElementFacade lbl_startDateAEPage;
	@FindBy(xpath = "//div[text()='Start Date']/following::p")
	private WebElementFacade fValue_startDate;

	@FindBy(xpath = "//input[@ng-reflect-name='startDate']")
	private WebElementFacade tbx_startDate;

	@FindBy(xpath = "//div[text()='End Date']")
	private WebElementFacade lbl_endDate;
	@FindBy(xpath = "//label[contains(text(),'End Date')]")
	private WebElementFacade lbl_endDateAEPage;
	
	@FindBy(xpath = "//div[text()='End Date']/following::p")
	private WebElementFacade fValue_endDate;

	@FindBy(xpath = "//input[@ng-reflect-name='endDate']")
	private WebElementFacade tbx_endDate;

	@FindBy(xpath = "//div[contains(text(),'Accessibility Provision')]")
	private WebElementFacade lbl_AccessibilityProvision;
	@FindBy(xpath = "//label[contains(text(),'Accessibility Provision')]")
	private WebElementFacade lbl_AccessibilityProvisionAEPage;
	@FindBy(xpath = "(//div[contains(text(),'Accessibility Provision')]/following::p)[1]")
	private WebElementFacade fValue_AccessibilityProvision;
	@FindBy(xpath = "//select[@ng-reflect-name='adjustmentId']")
	private WebElementFacade ddl_AccessibilityProvision;
	@FindBy(xpath = "//div[contains(text(),'Note')]")
	private WebElementFacade lbl_Notes;
	@FindBy(xpath = "//label[contains(text(),'Notes')]")
	private WebElementFacade lbl_NotesAEPages;
	@FindBy(xpath = "//div[contains(text(),'Note')]/following::div")
	private WebElementFacade fValue_Notes;
	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade tbx_Notes;

	@FindBy(xpath = "(//div[@class='error-msg'])[1]")
	private WebElementFacade txt_errorMsgStartDate;
	@FindBy(xpath = "(//div[@class='error-msg'])[2]")
	private WebElementFacade txt_errorMsgAccesibilityProvision;

	public void verifyInboundViewAccessibilityPage() {

		verifyBreadCrumbs("Service User Summary Accessibility View Accessibility View Accessibility Provision");
		Assert.assertTrue("Header is not not matched for accessibility provision",
				hdr_ViewAccessibilityProvision.getText().trim().equals("VIEW ACCESSIBILITY PROVISION"));
		Assert.assertTrue("accessibility provision link does not match",
				lnk_AccessibilityProvision.getText().trim().equals("ACCESSIBILITY PROVISION"));
		Assert.assertTrue("Start date does not match", lbl_startDate.getText().trim().equals("Start Date"));
		Assert.assertTrue("End date does not match", lbl_endDate.getText().trim().equals("End Date"));
		Assert.assertTrue("Accessibility Provision does not match",
				lbl_AccessibilityProvision.getText().trim().equals("Accessibility Provision"));
		Assert.assertTrue("Notes does not match", lbl_Notes.getText().trim().equals("Notes"));
		// System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml",
		// "//Provision", "./StartDate"));
		 System.out.println(fValue_startDate.getText());

		Assert.assertTrue("Satrt date does not match with IB Xml and ui",
				fValue_startDate.getText().trim().equals(DateFormatter
						.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AO.xml", "//Provision", "./StartDate"))));
		System.out.println(fValue_AccessibilityProvision.getText());
		System.out.println(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DISABILITY PROVISION",
				ReadXMLData.getXMLData("inboundXML/AO.xml", "//Provision", "./Adjustment")));
		Assert.assertTrue("Accessibilty Provision does not match with IB Xml and ui",
				fValue_AccessibilityProvision.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DISABILITY PROVISION",
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//Provision", "./Adjustment"))));

		Assert.assertTrue("UI notes does not match with IB xml", fValue_Notes.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/AO.xml", "//Provision", "./Notes")));

	}

	public void backBtnNaviVerification() {
		clickBackBtn();
		verifyBreadCrumbs("Service User Summary Accessibility View Accessibility");
	}

	// insert record for add accessibility provision
	public void enterAddFieldValueAccessibilityProvision() {
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_ADD", "./StartDate"));
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_ADD", "./EndDate"));
		ddl_AccessibilityProvision
				.selectByIndex(1);
		tbx_Notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_ADD", "./Notes"));

	}

	public void verifyLabelAndErrorMsgAddAccessibilityProvisionPage() {
		verifyBreadCrumbs("Service User Summary Accessibility View Accessibility Add Accessibility Provision");
		Assert.assertTrue("header is not not matched for accessibility provision",
				hdr_AddAccessibilityProvision.getText().trim().equals("ADD ACCESSIBILITY PROVISION"));
		Assert.assertTrue("accessibility provision link does not matched",
				lnk_AccessibilityProvision.getText().trim().equals("ACCESSIBILITY PROVISION"));
		Assert.assertTrue("Start date does not match", lbl_startDateAEPage.getText().trim().equals("Start Date*"));
		Assert.assertTrue("End date does not match", lbl_endDateAEPage.getText().trim().equals("End Date"));
		Assert.assertTrue("Accessibility Provision does not match",
				lbl_AccessibilityProvisionAEPage.getText().trim().equals("Accessibility Provision*"));
		Assert.assertTrue("Notes does not match", lbl_NotesAEPages.getText().trim().equals("Notes"));
		clickSubmitBtn();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue("Error messge not matched for start date",
				txt_errorMsgStartDate.getText().trim().equals("Required field"));
		Assert.assertTrue("Error messge not matched accessibility provision",
				txt_errorMsgAccesibilityProvision.getText().trim().equals("Required field"));
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_ADD", "./InvalidStartDate"));
		waitABit(100);
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_ADD", "./InvalidEndDate"));
		waitABit(100);
		ddl_AccessibilityProvision.selectByIndex(1);
		clickSubmitBtn();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue("Error messge not matched for start date",
				txt_errorMsgStartDate.getText().trim().equals("Start Date cannot be in future."));
		Assert.assertTrue("Error messge not matched accessibility provision",
				txt_errorMsgAccesibilityProvision.getText().trim().equals("End Date must be todays date."));
	}

	public void verifyLabelsAndErrorMsgEditAccessibilityProvisionPage() {
		tbx_startDate.clear();
		tbx_endDate.clear();
		clickSubmitBtn();
		Assert.assertTrue("Header does not match with Accessibility Provision",
				hdr_EditAccessibilityProvision.getText().trim().equals("EDIT ACCESSIBILITY PROVISION"));
		//System.out.println(lnk_AccessibilityProvision.getText());
		Assert.assertTrue("accessibility provision link does not matched",
				lnk_AccessibilityProvision.getText().trim().equals("ACCESSIBILITY PROVISION"));
		/*System.out.println(lbl_startDateAEPage.getText());
		System.out.println(lbl_endDateAEPage.getText());
		System.out.println(lbl_AccessibilityProvisionAEPage.getText());
		System.out.println(lbl_NotesAEPages.getText());*/
		Assert.assertTrue("Start date does not match", lbl_startDateAEPage.getText().trim().equals("Start Date*"));
		Assert.assertTrue("End date does not match", lbl_endDateAEPage.getText().trim().equals("End Date"));
		Assert.assertTrue("Accessibility Provision does not match",
				lbl_AccessibilityProvisionAEPage.getText().trim().equals("Accessibility Provision*"));
		Assert.assertTrue("Notes does not match", lbl_NotesAEPages.getText().trim().equals("Notes"));
		waitABit(1000);
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./InvalidStartDate"));
		waitABit(1000);
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./InvalidEndDate"));
		clickSubmitBtn();
		Assert.assertTrue("Error messge not matched for start date",
				txt_errorMsgStartDate.getText().trim().equals("Start Date cannot be in future."));
		
	}

	public void updateInAccessibiltyProvision() {
		tbx_startDate.clear();
		waitABit(500);
		tbx_endDate.clear();
		waitABit(500);
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./StartDate"));
		waitABit(500);
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./EndDate"));
		waitABit(500);
		//ddl_AccessibilityProvision.selectByIndex(1);
		tbx_Notes.clear();
		waitABit(500);
		tbx_Notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Provision_UPD", "./Notes"));
		waitABit(500);
	}

	public void verifyInsertedValueWithOutboundXML() {
		Assert.assertTrue("INS xml should generate",
				ReadXMLData
						.getXMLData("outboundXML/AddAccessibilityProvision.xml", "//SPGMessageHeader", "./MessageType")
						.equals("INS"));
		Assert.assertTrue("Satrt date does not match with IB Xml and ui",
				fValue_startDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("outboundXML/AddAccessibilityProvision.xml", "//Provision", "./StartDate"))));
		System.out.println(fValue_AccessibilityProvision.getText());
		System.out.println(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DISABILITY PROVISION",
				ReadXMLData.getXMLData("outboundXML/AddAccessibilityProvision.xml", "//Provision", "./Adjustment")));
		Assert.assertTrue("Accessibilty Provision does not match with IB Xml and ui",
				fValue_AccessibilityProvision.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DISABILITY PROVISION",
								ReadXMLData.getXMLData("outboundXML/AddAccessibilityProvision.xml", "//Provision",
										"./Adjustment"))));

	}

	public void verifyUpdatedValueWithOutboundXML() {
		Assert.assertTrue("INS xml should generate",
				ReadXMLData
						.getXMLData("outboundXML/UPDAccessibilityProvision.xml", "//SPGMessageHeader", "./MessageType")
						.equals("UPD"));
		Assert.assertTrue("Satrt date does not match with OutBound Xml and ui",
				fValue_startDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("outboundXML/AddAccessibilityProvision.xml", "//Provision", "./StartDate"))));
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_AccessibilityProvision;
	}

}

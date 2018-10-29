package com.meganexus.pageObjectLib;

import org.junit.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.ReadXMLData;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddressAssessmentPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[contains(text(),'VIEW Address Assessment')]")
	private WebElementFacade hdr_VIEWAddressAssessment;
	@FindBy(xpath = "//h2[contains(text(),'Edit Address Assessment')]")
	private WebElementFacade hdr_EditAddressAssessment;
	@FindBy(xpath = "//h2[contains(text(),'Add Address Assessment')]")
	private WebElementFacade hdr_AddAddressAssessment;
	@FindBy(xpath = "//a[contains(text(),'Address Assessment')]")
	private WebElementFacade lnk_AddressAssessment;
	@FindBy(xpath = "//input[@ng-reflect-name='date']")
	private WebElementFacade tbx_date;

	@FindBy(xpath = "//select[@ng-reflect-name='addressAssessmentProviderId']")
	private WebElementFacade ddl_AddAProvider;

	@FindBy(xpath = "//textarea[@ng-reflect-name='notes']")
	private WebElementFacade tbx_notes;
	@FindBy(xpath = "//div[@class='error-msg']")
	private WebElementFacade txt_errorMsg;

	// @FindBy(xpath="//button[text()='Save']")
	// public WebElementFacade btn_Save;

	public void addAddAssessment() {
		if (hdr_AddAddressAssessment.isCurrentlyVisible()) {
		waitABit(100);
		tbx_date.sendKeys("12/11/2005");
		waitABit(100);
		ddl_AddAProvider.selectByVisibleText("NPS North West");
		waitABit(100);
		tbx_notes.sendKeys("Address Assessment Added");
		waitABit(100);
		clickSubmitBtn();
		waitABit(100);
		}else
			System.out.println("Add page is not available for Address Assessment");
	}

	public void editAddAssessment() {
		if (hdr_EditAddressAssessment.isCurrentlyVisible()) {
			tbx_date.clear();
			waitABit(100);
			tbx_date.sendKeys("12/11/2005");
			waitABit(100);
			ddl_AddAProvider.selectByVisibleText("NPS North West");
			waitABit(100);
			tbx_notes.clear();
			waitABit(100);
			tbx_notes.sendKeys("Address Assessment updated");
			waitABit(100);
		} else
			System.out.println("Edit page is not available for Address Assessment");

	}

	@FindBy(xpath = "//div[contains(text(),'Date')]/following-sibling::p")
	private WebElementFacade txt_date;

	@FindBy(xpath = "//div[@id='label_addressAssessmentProviderId']/following-sibling::p")
	private WebElementFacade txt_AddAProvider;

	@FindBy(xpath = "//div[@id='label_notes']/following-sibling::p")
	private WebElementFacade txt_notes;

	public void verifyViewAddedAddressAssessment() {

	}

	public void verifyViewEditedAddressAssessment() {
		// ----Add assert for other two fields after srd tables are added in
		// db-----
		Assert.assertTrue("Notes does not match", txt_notes.getText().trim().equals("Address Assessment updated"));

	}

	@Override
	public WebElementFacade getUniqueElement() {

		return ddl_AddAProvider;
	}

	public void detailsViewForAddressAssessmentReview() {
		if (hdr_VIEWAddressAssessment.isCurrentlyVisible()) {
			verifyBreadCrumbs("Service User Summary Contact Information View Address View Address Assessment");
			try {
				Assert.assertEquals("View Address assessment header not matched",
						hdr_VIEWAddressAssessment.getText().trim(), "VIEW ADDRESS ASSESSMENT");
				Assert.assertEquals("Address assessment link not matched", lnk_AddressAssessment.getText().trim(),
						"ADDRESS ASSESSMENT");
				Assert.assertTrue("Date does not match",
						txt_date.getText().trim().equals(DateFormatter.changeDateFormat(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//AddressAssessment", "./Date"))));
				Assert.assertTrue("Address assessment Provider does not match",
						txt_AddAProvider.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AO.xml",
								"//AddressAssessment", "./AddressAssessmentProvider")));
				Assert.assertTrue("Notes does not match", txt_notes.getText().trim()
						.equals(ReadXMLData.getXMLData("inboundXML/AO.xml", "//AddressAssessment", "./Notes")));
			} catch (ElementNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("View Page is not available for address assessment");

	}

	public void enterInvalidDataAndVerifyErrorMessage() {
		if (hdr_EditAddressAssessment.isCurrentlyVisible()) {
			tbx_date.clear();
			tbx_date.sendKeys("01/06/2022");
			ddl_AddAProvider.selectByVisibleText("NPS North West");
			tbx_notes.sendKeys("Notes Updated for address assessment");
			clickSubmitBtn();
			Assert.assertTrue("Error message for date is not matched",
					txt_errorMsg.getText().trim().equals("Date cannot be in future."));
		} else
			System.out.println("Edit page is not available");

	}
}

package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class AccessbilityPage extends NeoTR_Page {
	// h2[text()='Accessibility']
	@FindBy(xpath = "//h2[text()='Accessibility']")
	public WebElementFacade hdr_Accessibility;
	@FindBy(xpath = "//a[contains(text(),'Accessibility')]")
	public WebElementFacade lnk_Accessibility;
	@FindBy(xpath = "//a[text()='filter']")
	public WebElementFacade lnk_filter;
	@FindBy(xpath = "//button[text()='Add']")
	public WebElementFacade btn_addAccessibility;
	@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'edit')]")
	public WebElementFacade btn_editAccessibility;

	public void clickAddAccessibilityBtn() {
		btn_addAccessibility.click();
		waitABit(1000);
	}

	@FindBy(xpath = "//a[text()='VIEW offender Disability']")
	public WebElementFacade txt_viewOffenderDisability;

	@FindBy(xpath = "//select[@ng-reflect-name]")
	private WebElementFacade ddl_disabiltyType;
	@FindBy(xpath = "//input[@ng-reflect-name='startDate']")
	private WebElementFacade tbx_startDate;
	@FindBy(xpath = "//input[@ng-reflect-name='endDate']")
	private WebElementFacade tbx_endDate;
	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade tbx_note;

	public void enterDisabiltyDetails() {
		ddl_disabiltyType.selectByIndex(1);
		waitABit(100);
		tbx_startDate.clear();
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Accessibility_ADD", "./StartDate"));
		waitABit(100);
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Accessibility_ADD", "./EndDate"));
		waitABit(100);
		tbx_note.sendKeys("accessibilty added from cms");
	}

	@FindBy(xpath = "(//button[contains(@class,'btn btn-default btn-small')])[1]")
	public WebElementFacade btn_viewAccessibility;

	public void clickAccessibilityViewBtn() {
		System.out.println(btn_viewAccessibility.getAttribute("innerHTML"));
		if (btn_viewAccessibility.isCurrentlyVisible()) {
			btn_viewAccessibility.click();
			waitABit(1000);
		} else {
			System.out.println("Offender disabilty is not available on ui");
		}

	}

	// -----------Delete Accessibility-----------------//
	@FindBy(xpath = "(//button[@id='offenderDisability_delete'])[1]")
	private WebElementFacade btn_deleteAccessibility;

	public void clickDeleteAccessibilityWithProvisionBtn() {
		// if (btn_deleteAccessibility.isCurrentlyVisible()) {
		try {
			btn_viewAccessibility.click();
			waitABit(100);
			lnk_AccessibilityProvision.click();
			waitABit(100);
			
			if (fValue_EndDate.isPresent() && btn_deleteAccessibiltyProvision.isCurrentlyVisible()) {
				clickBackBtn();
				btn_deleteAccessibility.click();
				waitABit(1000);
			} else if (!fValue_EndDate.isPresent() && btn_deleteAccessibiltyProvision.isCurrentlyVisible()) {
				clickBackBtn();
				btn_deleteAccessibility.click();
				waitABit(1000);
			}

			else if (!btn_deleteAccessibiltyProvision.isCurrentlyVisible()) {
				clickBackBtn();
				btn_deleteAccessibility.click();
				waitABit(1000);
			}

			else
				System.out.println("Delete btn is not available");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public void verfiyAccessibilityRecordDeleted() {
		if (!btn_deleteAccessibility.isCurrentlyVisible()) {
			System.out.println("Delete is working for Accessibility");
		} else
			System.out.println("Delete is not working for Accessibility");
	}

	// for accessibility provision structure
	@FindBy(xpath = "//h2[contains(text(),'Accessibility Provision')]")
	private WebElementFacade hdr_AccessibilityProvision;
	@FindBy(xpath = "//a[contains(text(),'Accessibility Provision')]")
	private WebElementFacade lnk_AccessibilityProvision;
	@FindBy(xpath = "//button[text()='Add']")
	private WebElementFacade btn_addAccessibilityProvision;

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'provision')])[2]")
	private WebElementFacade btn_viewAccessibiltyProvision;
	@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'provision,edit')]")
	private WebElementFacade btn_editAccessibiltyProvision;
	@FindBy(xpath = "//span[contains(text(),'Accessibility Provision')]")
	private WebElementFacade lbl_AccessibiltyProvision;
	@FindBy(xpath = "//span[contains(text(),'Start Date')]")
	private WebElementFacade lbl_StartDate;
	@FindBy(xpath = "//span[contains(text(),'End Date')]")
	private WebElementFacade lbl_EndDate;
	@FindBy(xpath = "//th[contains(text(),'View')]")
	private WebElementFacade lbl_View;
	@FindBy(xpath = "//th[contains(text(),'Edit')]")
	private WebElementFacade lbl_Edit;
	@FindBy(xpath = "(//span[contains(text(),'Accessibility Provision')]/following::td/span)[1]")
	private WebElementFacade fValue_AccessibiltyProvision;
	@FindBy(xpath = "(//span[contains(text(),'Accessibility Provision')]/following::td)[2]")
	private WebElementFacade fValue_StartDate;
	@FindBy(xpath = "(//span[contains(text(),'Accessibility Provision')]/following::td)[3]")
	private WebElementFacade fValue_EndDate;

	public void clickAddAccessibilityProvisionBtn() {
		waitFor(btn_addAccessibilityProvision);
		btn_addAccessibilityProvision.click();
		waitABit(5000);
	}

	public void clickEditAccessibilityProvisionBtn() {
		if (!btn_editAccessibiltyProvision.isCurrentlyVisible()) {
			lnk_AccessibilityProvision.click();
			waitABit(2000);
		}
		waitFor(btn_editAccessibiltyProvision);
		btn_editAccessibiltyProvision.click();
		waitABit(2000);
	}

	public void clickExpandAccessibiltyProvision() {

		lnk_AccessibilityProvision.click();
		waitABit(2000);

	}

	public void clickViewAccessibilityProvisionBtn() {

		if (!btn_viewAccessibiltyProvision.isCurrentlyVisible()) {
			lnk_AccessibilityProvision.click();
			waitABit(2000);

		}
		btn_viewAccessibiltyProvision.click();
		waitABit(2000);

	}

	public void verifyAccessibiltyProvisionListViewDetails() {
		verifyBreadCrumbs("Service User Summary Accessibility View Accessibility");
		Assert.assertTrue("header does not match for ACCESSIBILITY PROVISION",
				hdr_AccessibilityProvision.getText().trim().equals("ACCESSIBILITY PROVISION"));
		Assert.assertTrue("link does not match for ACCESSIBILITY PROVISION",
				lnk_AccessibilityProvision.getText().trim().equals("ACCESSIBILITY PROVISION"));
		Assert.assertTrue("Add btn is not available for ACCESSIBILITY PROVISION",
				btn_addAccessibilityProvision.getText().trim().equals("ADD"));
		Assert.assertTrue("Label does not match with ACCESSIBILITY PROVISION",
				lbl_AccessibiltyProvision.getText().trim().equals("Accessibility Provision"));
		Assert.assertTrue("Label does not match with Start Date", lbl_StartDate.getText().trim().equals("Start Date"));
		Assert.assertTrue("Label does not match with End Date", lbl_EndDate.getText().trim().equals("End Date"));
		Assert.assertTrue("Label does not match with View", lbl_View.getText().trim().equals("View"));
		Assert.assertTrue("Label does not match with View", lbl_Edit.getText().trim().equals("Edit"));
		Assert.assertTrue("field value validation AccessibiltyProvision", fValue_AccessibiltyProvision.isPresent());
		Assert.assertTrue("field value validation StartDate", fValue_StartDate.isPresent());
		Assert.assertTrue("View btn is not available for ACCESSIBILITY PROVISION",
				btn_viewAccessibiltyProvision.isPresent());
		/*
		 * Assert.assertTrue(
		 * "Edit btn is not available for ACCESSIBILITY PROVISION",
		 * btn_editAccessibiltyProvision.isPresent());
		 */
	}

	public void clickEditAccessibilityBtn() {

		btn_editAccessibility.click();
		waitABit(1000);
	}

	// -----------Delete ACCESSIBILITY PROVISION-----------------//
	@FindBy(xpath = "(//button[@id='provision_delete'])[1]")
	private WebElementFacade btn_deleteAccessibiltyProvision;

	public void clickDeleteAccessibiltyProvisionBtn() {
		if (!btn_deleteAccessibiltyProvision.isCurrentlyVisible()) {
			lnk_AccessibilityProvision.click();
			waitABit(1000);
			if (btn_deleteAccessibiltyProvision.isCurrentlyVisible()) {
				btn_deleteAccessibiltyProvision.click();
				waitABit(1000);
			} else
				System.out.println("Delete btn is not available");
		}
	}

	public void verfiyAccessibiltyProvisionRecordDeleted() {
		if (!btn_deleteAccessibiltyProvision.isCurrentlyVisible()) {
			System.out.println("Delete is working for Accessibilty Provision");
		} else
			System.out.println("Delete is not working for Accessibilty Provision");
	}

	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_Accessibility;
	}

	public void enterUpdateValueInAccessibilty() {

	}

	@FindBy(xpath = "//label[text()='Accessibility Type']")
	private WebElementFacade lbl_AccessibiltyType;
	@FindBy(xpath = "//label[text()='Start Date']")
	private WebElementFacade lbl_StartDate_Search;
	@FindBy(xpath = "//label[text()='End Date']")
	private WebElementFacade lbl_EndDate_Search;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElementFacade btn_Search;
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElementFacade btn_Reset;
	@FindBy(xpath = "//select[@ng-reflect-name='disabilityTypeId']")
	private WebElementFacade ddl_AccessibilityType;

	public void listViewReview() {
		Assert.assertTrue("Back button is not available", getTextForBackBtn().equals("BACK"));
		Assert.assertTrue("Accessibility header does not match",
				hdr_Accessibility.getText().trim().equals("ACCESSIBILITY"));
		Assert.assertTrue("Accessibility expand link does not match",
				lnk_Accessibility.getText().trim().equals("ACCESSIBILITY"));
		Assert.assertTrue("Accessibility filter link does not match", lnk_filter.getText().trim().equals("FILTER"));
		lnk_filter.click();
		waitABit(10000);
		/*
		 * System.out.println(lbl_AccessibiltyType.getText());
		 * System.out.println(lbl_StartDate_Search.getText());
		 * System.out.println(lbl_EndDate_Search.getText());
		 * System.out.println(btn_Search.getText().trim());
		 * System.out.println(btn_Reset.getText().trim());
		 */
		Assert.assertTrue("label does not match for accessibility type in filter ",
				lbl_AccessibiltyType.getText().trim().equals("Accessibility Type"));
		Assert.assertTrue("label does not match for start date in filter ",
				lbl_StartDate_Search.getText().trim().equals("Start Date"));
		Assert.assertTrue("label does not match for end date type in filter ",
				lbl_EndDate_Search.getText().trim().equals("End Date"));
		Assert.assertTrue("label does not match for search button in filter ",
				btn_Search.getText().trim().equals("SEARCH"));
		Assert.assertTrue("label does not match for reset button in filter ",
				btn_Reset.getText().trim().equals("RESET"));
		ddl_AccessibilityType.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DISABILITY TYPE",
				ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDisability", "./Disability")));
		btn_Search.click();
		waitABit(200);
	}

}

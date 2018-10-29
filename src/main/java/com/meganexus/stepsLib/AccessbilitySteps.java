package com.meganexus.stepsLib;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.AccessbilityPage;

import net.thucydides.core.annotations.Step;

public class AccessbilitySteps extends NeoTR_Steps {

	AccessbilityPage accessbilityPage;

	@Step
	public void navigateToAccessibiltyViewPage() {

		accessbilityPage.clickAccessibilityViewBtn();
	}

	/*
	 * @Step public void deleteAccessibility() { if
	 * (!accessbilityPage.btn_deleteDisability.isCurrentlyVisible()) {
	 * clickOnAccessibiltyLink(); } if
	 * (accessbilityPage.btn_deleteDisability.isCurrentlyVisible()) {
	 * accessbilityPage.clickDeleteDisabilityBtn(); getAlert().accept(); }
	 * 
	 * }
	 * 
	 * @Step public void deleteAccessibilityReview() {
	 * accessbilityPage.verifyDelteDisability(); }
	 */

	@Step
	public void accessibilityLink() {
		clickOnAccessibiltyLink();
	}

	@Step
	public void insertRecordAccessibility() throws InterruptedException {
		accessbilityPage.enterDisabiltyDetails();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "AddAccessibility.xml");
	}

	@Step
	public void addAccessibilityBtn() {
		accessbilityPage.clickAddAccessibilityBtn();
	}

	@Step
	public void editAccessibilityBtn() {
		accessbilityPage.clickEditAccessibilityBtn();
	}

	@Step
	public void updateAccessibilty() throws InterruptedException {
		accessbilityPage.enterUpdateValueInAccessibilty();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "UPDAccessibility.xml");

	}
	@Step
	public void verifyInsertedRecord() {
		accessbilityPage.clickAccessibilityViewBtn();
		
	}
	@Step
	public void verifyListViewNetwork() {
		verifyBreadCrumbs("Service User Summary Accessibility");
		accessbilityPage.listViewReview();
		
	}
	@Step
	public void deleteAccessibilityWithProvision() {
		accessbilityPage.clickDeleteAccessibilityWithProvisionBtn();
		waitABit(1000);
		clickOnDeleteConfirmOkBtn();
		waitABit(1000);
		
	}
	

	public void validateDeletedAccessibilityRecord() {
		accessbilityPage.verfiyAccessibilityRecordDeleted();
		
	}
	
	public void validateAccessibilityWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELAccessibility.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}

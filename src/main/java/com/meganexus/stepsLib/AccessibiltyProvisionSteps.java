package com.meganexus.stepsLib;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.AccessbilityPage;
import com.meganexus.pageObjectLib.AccessibilityProvisionPage;

import net.thucydides.core.annotations.Step;

public class AccessibiltyProvisionSteps extends NeoTR_Steps {
	AccessbilityPage accessibilityPage;
	AccessibilityProvisionPage accessibilityProvisionPage;

	@Step
	public void expandAccessibilityProvision() {
		accessibilityPage.clickExpandAccessibiltyProvision();
	}

	@Step
	public void verifyListViewOfAccessibilityProvision() {
		accessibilityPage.verifyAccessibiltyProvisionListViewDetails();

	}

	@Step
	public void clickOnViewAccessibilityProvision() {
		accessibilityPage.clickViewAccessibilityProvisionBtn();
	}

	@Step
	public void clickOnAddAccessibilityProvision() {
		accessibilityPage.clickAddAccessibilityProvisionBtn();
	}

	@Step
	public void saveDetailsForAddAccessibilityProvision() throws InterruptedException {
		accessibilityProvisionPage.enterAddFieldValueAccessibilityProvision();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "AddAccessibilityProvision.xml");
	}

	@Step
	public void clickOnEditAccessibilityProvision() {
		accessibilityPage.clickEditAccessibilityProvisionBtn();
	}

	@Step
	public void updateAccessibilityProvision() throws InterruptedException {
		accessibilityProvisionPage.updateInAccessibiltyProvision();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(3000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "UPDAccessibilityProvision.xml");
	}

	// for inbound xml
	@Step
	public void verifyInboundAccessibilityProvision() {
		accessibilityProvisionPage.verifyInboundViewAccessibilityPage();
	}

	// back button navigation verification
	@Step
	public void verifyBackBtnForAccessibilityProvision() {
		accessibilityProvisionPage.backBtnNaviVerification();
	}

	@Step
	public void verifyErrorMsgForInsertRecordAndLabels() {
		accessibilityProvisionPage.verifyLabelAndErrorMsgAddAccessibilityProvisionPage();
	}

	@Step
	public void verifyErrorMsgForUpdateRecordAndLabels() {
		accessibilityProvisionPage.verifyLabelsAndErrorMsgEditAccessibilityProvisionPage();
	}

	// for outbond xml insert page
	@Step
	public void verifyInsertedRecord() {
		accessibilityPage.clickViewAccessibilityProvisionBtn();
		accessibilityProvisionPage.verifyInsertedValueWithOutboundXML();
	}

	// for outbond xml update page
	@Step
	public void verifyUpdatedRecord() {
		accessibilityPage.clickViewAccessibilityProvisionBtn();
		accessibilityProvisionPage.verifyUpdatedValueWithOutboundXML();
	}
	
	public void deleteAccessibilityProvision() {
		accessibilityPage.clickDeleteAccessibiltyProvisionBtn();
		clickOnDeleteConfirmOkBtn();
		
	}
	
	public void validateDeletedAccessibilityProvisionRecord() {
		accessibilityPage.verfiyAccessibiltyProvisionRecordDeleted();
		
	}
	
	public void validateAccessibilityProvisionWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELAccessibilityProvision.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
}

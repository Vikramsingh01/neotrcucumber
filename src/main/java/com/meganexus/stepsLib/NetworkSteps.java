package com.meganexus.stepsLib;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.ContactInformationPage;
import com.meganexus.pageObjectLib.NetworkPage;

import net.thucydides.core.annotations.Step;

public class NetworkSteps extends NeoTR_Steps {

	ContactInformationPage contactInfo;
    NetworkPage network;

	@Step
	public void clickOnContactInformationTab() {
		clickOnContactInformationLink();
	}

	@Step
	public void addNetworkStructure() throws InterruptedException {
		network.inserDataForNetwork();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "ADDNetwork.xml");

	}

	@Step
	public void updateNetworkFieldValue() throws InterruptedException {

		network.updateNetwork();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "UPDNetwork.xml");

	}

	@Step
	public void viewNetwork() {

		contactInfo.viewNetwork();

	}

	@Step
	public void expandNetwork() {
		contactInfo.clickOnExpandNetwork();

	}

	@Step
	public void veriBackBtnForNetwork() {
		clickBackBtn();
		verifyBreadCrumbs("Service User Summary Contact Information");
	}

	@Step
	public void verifyNetworkWithIBXML() {
		network.networkViewFieldVerificationWithIB_XML();

	}

	@Step
	public void editNetworkBTN() {
		contactInfo.clickEditNetworkBtn();

	}

	@Step
	public void verifyAddNetworkStructureWithOBXML() {
		contactInfo.clickOnExpandNetwork();
		contactInfo.viewNetwork();
		network.fieldValueVerificationAddNetwork();
	}

	@Step
	public void verifyEditNetworkStructureWithOBXML() {
		contactInfo.clickOnExpandNetwork();
		contactInfo.viewNetwork();
		network.fieldValueVerificationEditNetwork();
	}

	@Step
	public void invalidDataForNetwork() {
		network.invalidValueForNetwork();
		network.clickSubmitBtn();

	}

	@Step
	public void addNetworkBtn() {
		contactInfo.addNetworkBtn();

	}
	
	@Step
	public void deleteNetwork() {
		contactInfo.clickDeleteNetworkBtn();
		waitABit(1000);
		clickOnDeleteConfirmOkBtn();
		waitABit(1000);
	}
	
	@Step
	public void validateDeletedNetworkRecord() {
		contactInfo.verfiyNetworkRecordDeleted();
		
	}
	
	@Step
	public void validateNetworkWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELNetwork.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}

package com.meganexus.stepsLib;

import com.meganexus.genericLib.DatabaseConnection;
import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.AddressPage;
import com.meganexus.pageObjectLib.ContactInformationPage;

import net.thucydides.core.annotations.Step;

public class AddressSteps extends NeoTR_Steps {

	AddressPage address;
	ContactInformationPage contactInfo;

	@Step
	public void clickOnContactInformationTab() {
		clickOnContactInformationLink();

	}

	@Step
	public void expandAddress() {
		contactInfo.clickOnAddressExpandLnk();
	}

	@Step
	public void viewAddress() {
		contactInfo.viewAddressBtn();
	}

	@Step
	public void addAddressBtn() {
		contactInfo.addAddressBtn();
		;
	}

	@Step
	public void editAddress() {
		contactInfo.editAddressBtn();
		;
	}

	@Step
	public void verifyAddressWithIBXML() {

	}

	@Step
	public void veriBackBtnForAddress() {
		address.clickBackBtn();
		verifyBreadCrumbs("Service User Summary Contact Information View address");
	}

	@Step
	public void verifyListviewOfAddress() {
		verifyBreadCrumbs("Service User Summary Contact Information");
		contactInfo.listDetailsAddressReview();
	}

	public void submitAddressDetails() throws InterruptedException {
		address.insertAddressDetails();
		clickSubmitBtn();
		address.clickOKBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "ADD_Address.xml");
	}

	@Step
	public void updateAddressFieldValue() throws InterruptedException {

		address.updateAddressDetails();
		clickSubmitBtn();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(5000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "UPDAddress.xml");

	}

	@Step
	public void verifyInsertedAdressStructureWithOB_XML() {
		contactInfo.clickOnAddressExpandLnk();
		contactInfo.viewAddressBtn();
		address.verifyViewAddedSUAddress();

	}
	
	public void deleteAddress() {
		contactInfo.clickOnAddressExpandLnk();
		contactInfo.clickDeleteAddressBtn();
		clickOnDeleteConfirmOkBtn();
		;
	}
	
	public void validateFromDatabse() {
		contactInfo.VerifyDBRecord();
	}
	
	public void validateDeletedAddressRecord() {
		contactInfo.verfiyAddressRecordDeleted();
		
	}
	
	public void validateAddressWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELAddress.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	@Step
    public void clickMainAddressDELButton() {
		
		address.clickDeleteMainAddress();
		
	}
	
	@Step
    public void verifyMainAddressDeleteErrorMessage() {
		
		address.validateMainAddressDeleteErrorMessage();
		
	}
	
	
}

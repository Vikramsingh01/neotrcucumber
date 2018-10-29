package com.meganexus.stepsLib;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.AddressAssessmentPage;
import com.meganexus.pageObjectLib.AddressPage;

import net.thucydides.core.annotations.Step;

public class AddressAssessmentSteps extends NeoTR_Steps {

	AddressPage sUAddress;
	AddressAssessmentPage addressAssessment;

	@Step
	public void addAddressAssessment() {

		addressAssessment.addAddAssessment();
		clickSubmitBtn();
		waitABit(100);
	}

	@Step
	public void viewAddressAssessment() {

		sUAddress.clickOnViewAssessmentBtn();
		waitABit(100);
	}

	@Step
	public void editAddressAssessment() {

		sUAddress.clickOnEditAssessmentBtn();
		addressAssessment.editAddAssessment();
	}

	@Step
	public void verifyAdedAddressAssessment() {
		addressAssessment.verifyViewAddedAddressAssessment();
		waitABit(200);
	}

	@Step
	public void verifyEditedAddressAssessment() {
		addressAssessment.verifyViewEditedAddressAssessment();
		waitABit(200);
	}

	@Step
	public void clickOnAddressAssessmentLink() {
		sUAddress.expandAddAssessment();

	}
	@Step
	public void verifyListViewAssessmentPage() {
		verifyBreadCrumbs("Service User Summary Contact Information View Address");
		sUAddress.listViewAssesmentReview();
	}
	@Step
	public void verifyDetailsViewForAddressAssessmentWithIB_XML() {
		addressAssessment.detailsViewForAddressAssessmentReview();
		
	}
	@Step
	public void verifyBackBtnForViewAddressassessment() {
		clickBackBtn();
		verifyBreadCrumbs("Service User Summary Contact Information View Address");
		
	}
	@Step
	public void verifyErrorMessgageForAddressAssessment() {
		clickSubmitBtn();
		addressAssessment.enterInvalidDataAndVerifyErrorMessage();
	}
	@Step
	public void deleteAddressAssessment() {
		sUAddress.clickDeleteAddressAssessmentBtn();
		waitABit(200);
		clickOnDeleteConfirmOkBtn();
		waitABit(200);
		
	}
	@Step
	public void validateDeletedAddressAssessment() {
		sUAddress.clickOnViewAssessmentBtn();
		waitABit(200);
		sUAddress.verfiyAddressAssessmentRecordDeleted();
		waitABit(200);
	}
	@Step
	public void validateAddressAssessmentDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELAlias.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

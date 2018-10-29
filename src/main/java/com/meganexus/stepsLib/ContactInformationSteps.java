package com.meganexus.stepsLib;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.meganexus.pageObjectLib.ContactEditAddPage;
import com.meganexus.pageObjectLib.ContactInformationPage;

import net.thucydides.core.annotations.Step;

public class ContactInformationSteps extends NeoTR_Steps {

	ContactInformationPage contactInfoPage;
	ContactEditAddPage addEditcontactInformation;

	@Step
	public void verifyDetailsViewContactInformationWithIB_XML() {
		verifyBreadCrumbs("Service User Summary Contact Information");
		contactInfoPage.verifyViewContactInformationPageWithInboundXML();
	}

	@Step
	public void verifyBackBtnForContactInformationPage() {
		clickBackBtn();
		verifyBreadCrumbs("Service User Summary");

	}

	@Step
	public void editBtnForContactInformation() {
		try {
			contactInfoPage.editContactBtn();
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
			System.out.println("Edit btn is not available first add contact information then check for edit scenario");
		}

	}

	@Step
	public void enterInvalidValueInContactInformationAndVerifyErrorMesg() {
		try {
			addEditcontactInformation.verifyLabelsAndErrorMsgEditContactInformationPage();
		} catch (ElementNotFoundException a) {
			a.printStackTrace();
		} catch (NullPointerException n) {
			n.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Step
	public void enterValidValueForUpdateContactInformation() {
		addEditcontactInformation.enterValidValueForEditContactInformationPage();

	}

	@Step
	public void clickOnAddBtnForContactInformation() {
		try {
			contactInfoPage.addContactBtn();
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Step
	public void enterValuesForAddContactInformation() {
		try {
			addEditcontactInformation.enterFieldValueAddContactInformation();
			clickSubmitBtn();
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	public void validateUpdatedValuesInContactInformationPage() {
		
		try {
			contactInfoPage.verifyUpdatedContactInformationValueWithOutboundXML();
			clickSubmitBtn();
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
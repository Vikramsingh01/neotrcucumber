package com.meganexus.stepsLib;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.AdditionalIdentifierPage;
import com.meganexus.pageObjectLib.OffenderDetailsPage;
import com.meganexus.pageObjectLib.ProfilesPage;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class AdditionalIdentifierSteps extends NeoTR_Steps {
	ProfilesPage pp;
	AdditionalIdentifierPage Adilib;

	@Step

	public void ExpandableAdditionalIdentifier() {
		pp.expandAdditionalIdentifier();
	}

	@Step
	public void Search() {
		pp.SearchAdditionalIdentifier();
	}

	@Step
	public void listAdditionalIdentifierDetails() {
		pp.listAdditionalIdentifierDetails();
	}

	@Step
	public void clickonAddButton() {
		pp.clickOnAddadditionalIdentifier();
	}

	@Step
	public void saveDetailsForAdditionalIdetifier() throws InterruptedException {
		Adilib.addAditionalIdentifierPage();

	}

	@Step
	public void addaditionalIdentifier() throws InterruptedException {
		Adilib.addAditionalIdentifierPage();
		Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
		Thread.sleep(10000);
		Outbound_Xml.changeXMLName("-C20-to-N00-", "AddadditionalIdentifier.xml");
	}
	// for outbond xml insert page
		@Step
		public void verifyAddedRecord() {
			pp.expandAdditionalIdentifier();
			pp.SearchAdditionalIdentifier();
			//pp.clickviewbutton();
			pp.clickbuttonview();
			Adilib.verifyAddedValueWithOutboundXML();
		}

	@Step
	public void validateinsertedrecord() {
		Adilib.validateAdditionalIdentifierDetails();
	}

	@Step
	public void clickOnViewBtn() {
		pp.clickviewbutton();
	}

	@Step
	public void AIviewVarification() {
		Adilib.AdditionalIdentifierViewVarification();
	}

	//------Delete------------------//
	
	@Step
	public void deleteAdditionalIdentifier() {
		pp.clickDeleteAdditionalIdentifierBtn();
		waitABit(1000);
		clickOnDeleteConfirmOkBtn();
		waitABit(1000);
		
	}
	@Step
	public void validateDeletedAdditionalIdentifierRecord() {
		pp.verfiyAdditionalIdentifierRecordDeleted();
		
	}
	@Step
	public void validateAdditionalIdentifierWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELAdditionalIdentifier.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
	

	/*
	 * //-----------------------------------------------------------------------
	 * -------------- AdditionalIdentifierPage adnlIden; OffenderDetailsPage
	 * offDetails;
	 * 
	 * @Step public void addNewAdditionalIdentifier() {
	 * offDetails.addAdnlIdentifierBtn(); adnlIden.addAdditionalIdentifier(); }
	 * 
	 * @Step public void viewAdditionalIdentifier() {
	 * offDetails.clickViewAdditionalIdentifierBtn();
	 * 
	 * }
	 * 
	 * @Step public void AdditionalIdentifierReview(){
	 * adnlIden.additionalIdentifierViewFieldVerification();
	 * 
	 * }
	 * 
	 * @Step public void deleteAdditionalIdentifier(){
	 * offDetails.clickDeleteAdditionalIdentifierBtn();
	 * 
	 * }
	 * 
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Step public void AdditionalIdentifierDeleteReview() {
	 * 
	 * Assert.assertTrue("Additional Identifier is not deleted"
	 * ,offDetails.additionalIdentifierDetails().equals("Duplicate Offender CRN"
	 * )); }
	 */



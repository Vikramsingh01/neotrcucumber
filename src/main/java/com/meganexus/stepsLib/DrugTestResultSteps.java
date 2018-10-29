package com.meganexus.stepsLib;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.DrugTestResult;
import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.EventViewPage;
import com.meganexus.pageObjectLib.ReferralPage;

import net.thucydides.core.annotations.Step;

public class DrugTestResultSteps extends NeoTR_Steps{

	DrugTestResult drugResult;
	EventPage eventPage;
	EventViewPage eventViewPage;
	ReferralPage referralPage;

	@Step
	public void clickOnViewReferral() {
		eventPage.viewEvent();
		eventViewPage.clickOnReferralLnk();
		referralPage.clickReferralViewBtn();

	}
	@Step
	public void validateDrugTestResultList() {
		drugResult.expandDrugResultTab();
		drugResult.validateDrugTestList();

	}

	@Step
	public void clickAddButton() {
		drugResult.clickAddDrugResultBtn();


	}
	@Step
	public void clickViewButton() {

		drugResult.expandDrugResultTab();
		drugResult.clickDrugResultViewBtn();
	}

	@Step
	public void clickEditButton() {
		drugResult.expandDrugResultTab();
		drugResult.clickEditDrugResultBtn();

	}
	@Step
	public void clickBackButton(){
		clickBackBtn();
	}
	@Step
	public void clickSaveButton(){
		drugResult.clickOnSaveBtn();
	}
	@Step
	public void clickSubmitButton(){
		drugResult.clickOnSubmitBtn();
	}
	@Step
	public void clickDeleteButton() {
		drugResult.expandDrugResultTab();
		drugResult.clickDeleteDrugResultBtn();
		
	}
	@Step
	public void clickCancelButton() {
		drugResult.cancelBtnFunctionality();
	}
	@Step
	public void verifyAddPageLabels() {
		drugResult.addeditDrugTestPageLabelVerification();

	}

	@Step
	public void enterDrugTestResult() {
		drugResult.addDrugTestResultValidDetails();

	}

	@Step
	public void vaidateDrugTestFutureDate() {
		drugResult.addDrugTestResultFutureDate();

	}
	@Step
	public void vaidateDrugFutureDateWithSUComplied() {
		drugResult.addDrugFutureDateWithSUCompled();

	}
	@Step
	public void verifyAddPageErrorMessage() {


	}
	@Step
	public void verifyEditPageLabels() {


	}

	@Step
	public void enterEditDrugTestResult() {
		drugResult.editDrugTestResultValidDetails();


	}

	@Step
	public void enterEditDrugTestReultInvalidData() {
		drugResult.addDrugResultErrorMessageValidation();
		drugResult.clickOnSubmitBtn();
	}
	@Step
	public void validateViewDrugTestResultDetail(){

	}

	@Step
	public void validateDrugTestResultRecordDeleted(){
		drugResult.verfiyDrugTestRecordDeleted();

	}
	public void validateAccessibilityWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C07-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C07-to-N00-", "DELDrugTest.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	@Step
	public void verifyDrugTestResultHeader(){

	}
	@Step
	public void verifyToNavigateDrugTestList(){
		drugResult.navigateToHeader();
	}
	@Step
	public void verifyMandatoryFields(){
		drugResult.addDrugResultMandaotryfieldsValidation();
	}

}

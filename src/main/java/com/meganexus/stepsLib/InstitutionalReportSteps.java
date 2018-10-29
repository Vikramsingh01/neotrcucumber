package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CourtAndCustodyPage;
import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.InstitutionalReportPage;

import jnr.ffi.annotations.In;
import net.thucydides.core.annotations.Step;
//step for institutional report
public class InstitutionalReportSteps extends NeoTR_Steps {

	EventPage Event;

	InstitutionalReportPage InstRpt;

	@Step
	public void addInstitutionalReportwithAllTheMandatoryFields() {
		//ClickOnEventLink();
		Event.viewEvent();
		InstRpt.addInstitutionalReportwithAllTheMandatoryFields();
		clickSubmitBtn();
        getDriver().navigate().refresh();
	}

	@Step
	public void viewInstitutionalReport() {
		InstRpt.clickViewInstitutionalReportBtn();
		InstRpt.verifyViewInstitutionalReportDetails();
	}

	@Step
	public void editInstitutionalReport() {
		InstRpt.clickEditInstitutionalReportBtn();
		InstRpt.editInstitutionalReportDetails();
		clickSubmitBtn();
	}

	@Step
	public void deleteInstitutionalReport() {
		InstRpt.clickDeleteInstitutionalReportBtn();

	}

	@Step
	public void throughcareTabForInstitutionalReport() {
		InstRpt.clickOnThroughcareTab();

	}

	@Step
	public void institutioanlReportBtn() {
		InstRpt.clickOnInstitutionalReportTab();

	}

	public void validateListViewOnUi() {
		InstRpt.validateListView();
		
	}

	public void viewUpdateInstitutionalReport() {
		InstRpt.clickViewInstitutionalReportBtn();
		InstRpt.verifyUpdatedViewInstitutionalReportDetails();
	}

	public void deleteValidation() {
		InstRpt.validationDeleteInstitutionalReportOnUI();		
	}

	
}

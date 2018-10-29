package com.meganexus.stepDefs;

import com.meganexus.stepsLib.CourtWorkSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CourtWorkRequestStepDefs {
	@Steps
	CourtWorkSteps courtWork;
	@When("^I clicked on court work tab in CM Page$")
	public void i_clicked_on_court_work_tab_in_CM_Page() throws Throwable {
		courtWork.clickOnCourtWorkTab();
	}

	@When("^I sent request for court work to PSC_Admin$")
	public void i_sent_request_for_court_work_to_PSC_Admin() throws Throwable {
		courtWork.sentCourtWorkRequestToPSCAdmin();
	}

	@Then("^I validate court work request added in list view of court work log$")
	public void i_validate_court_work_request_added_in_list_view_of_court_work_log() throws Throwable {
		courtWork.courtWorkListViewValidation();
	}
	@When("^I clicked on court work tab in PSC Admin Page$")
	public void i_clicked_on_court_work_tab_in_PSC_Admin_Page() throws Throwable {
		courtWork.clickOnCourtWorkTabInPSC_AdminPage();
		courtWork.searchCourtWorkPSC_Admin();
	}

	@Then("^I validate Court work request which is sent by Case Manager$")
	public void i_validate_Court_work_request_which_is_sent_by_Case_Manager() throws Throwable {

	}

	@When("^I clicked on edit button for court work request$")
	public void i_clicked_on_edit_button_for_court_work_request() throws Throwable {

	}

	@When("^I enter required data and attached document and clickon submit button$")
	public void i_enter_required_data_and_attached_document_and_clickon_submit_button() throws Throwable {

	}

	@Then("^I verifed inserted data for courk work request$")
	public void i_verifed_inserted_data_for_courk_work_request() throws Throwable {

	}

}

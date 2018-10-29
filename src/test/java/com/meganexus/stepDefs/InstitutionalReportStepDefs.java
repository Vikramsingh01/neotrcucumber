package com.meganexus.stepDefs;

import com.meganexus.stepsLib.InstitutionalReportSteps;
import com.meganexus.stepsLib.RegistrationSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
//step defs for institutional report
public class InstitutionalReportStepDefs {

	@Steps
	InstitutionalReportSteps InsRptsteps;

	@Given("^I navigate to throughcare page$")
	public void i_navigate_to_throughcare_page() throws Throwable {
		InsRptsteps.throughcareTabForInstitutionalReport();
	}

	@Given("^I navigate to institutional report page$")
	public void i_navigate_to_institutional_report_page() throws Throwable {
		InsRptsteps.institutioanlReportBtn();
	}

	@When("^I add Institutional Report$")
	public void i_add_Institutional_Report() throws Throwable {
		InsRptsteps.addInstitutionalReportwithAllTheMandatoryFields();
	}

	@When("^I add Institutional Report with all the mandatory fields$")
	public void i_add_Institutional_Report_with_all_the_mandatory_fields() throws Throwable {
		InsRptsteps.addInstitutionalReportwithAllTheMandatoryFields();

	}

	@When("^I add Institutional Report with all the fields$")
	public void add_Institutional_Report() throws Throwable {

		InsRptsteps.addInstitutionalReportwithAllTheMandatoryFields();
	}

	@When("^I view Institutional Report record$")
	public void i_view_Institutional_Report_record() throws Throwable {
		System.out.println("I'm viewing Institutional Report");
		InsRptsteps.viewInstitutionalReport();
	}

	@Then("^I validate Institutional Report records should be on ui$")
	public void i_validate_Institutional_Report_records_should_be_on_ui() throws Throwable {
		System.out.println("I'm verifying Institutional Report record on list view");
		InsRptsteps.validateListViewOnUi();

	}

	@When("^I edit Institutional Report$")
	public void i_edit_Institutional_Report() throws Throwable {
		System.out.println("I'm editing Institutional Report record");
		InsRptsteps.editInstitutionalReport();
	}

	@When("^I delete Institutional Report record$")
	public void i_delete_Institutional_Report_record() throws Throwable {
		System.out.println("I'm deleting Institutional Report record");
		InsRptsteps.deleteInstitutionalReport();
	}

	@Then("^I validate Institutional Report records should be delete from ui$")
	public void i_validate_Institutional_Report_records_should_be_delete_from_ui() throws Throwable {

	}

	@Then("^I validate Institutional Report details$")
	public void i_validate_Institutional_Report_details() throws Throwable {

	}

	@Then("^I validate Back for Institutional Report page$")
	public void i_validate_Back_for_Institutional_Report_page() throws Throwable {

	}

	@When("^I view Institutional Report record after update$")
	public void i_view_Institutional_Report_record_after_update() throws Throwable {
		System.out.println("I'm viewing updating Institutional Report");
		InsRptsteps.viewUpdateInstitutionalReport();

	}

	@Then("^I validate  updated Institutional Report should be on ui$")
	public void i_validate_updated_Institutional_Report_should_be_on_ui() throws Throwable {

	}

	@When("^I delete Institutional Report$")
	public void i_delete_Institutional_Report() throws Throwable {
		InsRptsteps.deleteInstitutionalReport();
	}

	@When("^I validate Institutional Report records should not be on ui$")
	public void i_validate_Institutional_Report_records_should_not_be_on_ui() throws Throwable {
		InsRptsteps.deleteValidation();
	}

}

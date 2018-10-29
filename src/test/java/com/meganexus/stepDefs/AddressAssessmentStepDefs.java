package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AddressAssessmentSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddressAssessmentStepDefs {

	@Steps
	AddressAssessmentSteps addressAssessment;

	@When("^I Expand Address Assessment Link$")
	public void i_Expand_Address_Assessment_Link() throws Throwable {
		addressAssessment.clickOnAddressAssessmentLink();
	}

	@Then("^I validate Address Assessment list view page$")
	public void i_validate_Address_Assessment_list_view_page() throws Throwable {
		addressAssessment.verifyListViewAssessmentPage();
	}

	@When("^I clicked view button for Address Assessment Structure$")
	public void i_clicked_view_button_for_Address_Assessment_Structure() throws Throwable {
		addressAssessment.viewAddressAssessment();
	}

	@Then("^I validate Address Assessment record with Inbound xml$")
	public void i_validate_Address_Assessment_record_with_Inbound_xml() throws Throwable {
		addressAssessment.verifyDetailsViewForAddressAssessmentWithIB_XML();
	}

	@Then("^I vaildate back button is working for Address Assessment Strucure$")
	public void i_vaildate_back_button_is_working_for_Address_Assessment_Strucure() throws Throwable {
		addressAssessment.verifyBackBtnForViewAddressassessment();
	}

	@When("^I clicked on edit button for Address Assessment Structure$")
	public void i_clicked_on_edit_button_for_Address_Assessment_Structure() throws Throwable {
		addressAssessment.editAddressAssessment();
	}

	@Then("^I updated invalid value and verified labels and error message is showing on edit Address Assessment Page$")
	public void i_updated_invalid_value_and_verified_labels_and_error_message_is_showing_on_edit_Address_Assessment_Page()
			throws Throwable {
		addressAssessment.verifyErrorMessgageForAddressAssessment();
	}

	@When("^I updated field value for Address Assessment Structure with valid data$")
	public void i_updated_field_value_for_Address_Assessment_Structure_with_valid_data() throws Throwable {

	}

	@Then("^I validate Update Value in Edit Address Assessment Page with outbound xml$")
	public void i_validate_Update_Value_in_Edit_Address_Assessment_Page_with_outbound_xml() throws Throwable {

	}

	@When("^I clicked on add button for Address Assessment Structure$")
	public void i_clicked_on_add_button_for_Address_Assessment_Structure() throws Throwable {
		addressAssessment.addAddressAssessment();
	}

	@Then("^I insert invalid value and verified labels and error message is showing on add Address Assessment Structure$")
	public void i_insert_invalid_value_and_verified_labels_and_error_message_is_showing_on_add_Address_Assessment_Structure()
			throws Throwable {

	}

	@When("^I insert field value for Address Assessment Structure with valid data\\.$")
	public void i_insert_field_value_for_Address_Assessment_Structure_with_valid_data() throws Throwable {

	}

	@Then("^I validate insert record for Add Address Assessment structure with outbound xml$")
	public void i_validate_insert_record_for_Add_Address_Assessment_structure_with_outbound_xml() throws Throwable {

	}

	@When("^I delete Address Assessment details$")
	public void i_delete_Address_Assessment_details() throws Throwable {
		addressAssessment.deleteAddressAssessment();
	}

	@Then("^I validate AddressAssessmentDEL outboundXML$")
	public void i_validate_AddressAssessmentDEL_outboundXML() throws Throwable {
		addressAssessment.validateAddressAssessmentDELoutbound();
	}

	@When("^I verify whether Address Assessment is deleted from AssessmentList$")
	public void i_verify_whether_Address_Assessment_is_deleted_from_AssessmentList() throws Throwable {

	}

}

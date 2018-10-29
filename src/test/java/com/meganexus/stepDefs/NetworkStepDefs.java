package com.meganexus.stepDefs;

import com.meganexus.stepsLib.NetworkSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NetworkStepDefs {

	@Steps

	NetworkSteps network;

	@Given("^I navigate to view Contact Information Page$")
	public void i_navigate_to_view_Contact_Information_Page() throws Throwable {
		network.clickOnContactInformationTab();
	}

	@When("^I expand Network Structure$")
	public void i_expand_Network_Structure() throws Throwable {
		network.expandNetwork();
	}

	@Then("^I vaildate list details of Network Structure$")
	public void i_vaildate_list_details_of_Network_Structure() throws Throwable {

	}

	@When("^I clicked view button for Network structure$")
	public void i_clicked_view_button_for_Network_structure() throws Throwable {
		network.viewNetwork();
	}

	@Then("^I validate Network record with Inbound xml$")
	public void i_validate_Network_record_with_Inbound_xml() throws Throwable {
		network.verifyNetworkWithIBXML();
	}

	@Then("^I vaildate back button is working for Network Strucure$")
	public void i_vaildate_back_button_is_working_for_Network_Strucure() throws Throwable {
		network.veriBackBtnForNetwork();
	}

	@When("^I clicked on edit button for Network Structure$")
	public void i_clicked_on_edit_button_for_Network_Structure() throws Throwable {
		network.editNetworkBTN();
	}

	@Then("^I verified labels and error message is showing on edit Network Page$")
	public void i_updated_invalid_value_and_verified_labels_and_error_message_is_showing_on_edit_Network_Page()
			throws Throwable {

	}

	@When("^I updated field value for Network Structure with valid data$")
	public void i_updated_field_value_for_Network_Structure_with_valid_data() throws Throwable {
		network.updateNetworkFieldValue();
	}

	@Then("^I validate Update Value in Edit Network Page with outbound xml$")
	public void i_validate_Update_Value_in_Edit_Network_Page_with_outbound_xml() throws Throwable {
		network.verifyEditNetworkStructureWithOBXML();
	}

	@When("^I clicked on add button for Network Structure$")
	public void i_clicked_on_add_button_for_Network_Structure() throws Throwable {
		network.addNetworkBtn();
		
	}

	@When("^I insert invalid value for Network Structure$")
	public void i_insert_invalid_value_for_Network_Structure() {
		network.invalidDataForNetwork();
	}
	@When("^I update invalid value for Network Structure$")
	public void i_update_invalid_value_for_Network_Structure() {
		network.invalidDataForNetwork();
	}


	@Then("^I verified labels and error message is showing on add Network Structure$")
	public void i_verified_labels_and_error_message_is_showing_on_add_Network_Structure() throws Throwable {

	}

	@When("^I insert field value for Network Structure with valid data\\.$")
	public void i_insert_field_value_for_Network_Structure_with_valid_data() throws Throwable {
		network.addNetworkStructure();
	}

	@Then("^I validate insert record for Add Network structure with outbound xml$")
	public void i_validate_insert_record_for_Add_Network_structure_with_outbound_xml() throws Throwable {
		network.verifyAddNetworkStructureWithOBXML();
	}
	
	@When("^I delete NetworkRecord from UI$")
	public void i_delete_NetworkRecord_from_UI() throws Throwable {
		System.out.println("I am deleting Network details");
		network.deleteNetwork();
	   
	}

	@Then("^I verify whether NetworkRecord is deleted from aliasList$")
	public void i_verify_whether_NetworkRecord_is_deleted_from_aliasList() throws Throwable {
		System.out.println("I am verifying deleted Network record");
		network.validateDeletedNetworkRecord();
	    
	}

	@Then("^I validate NetworkDEL outboundXML$")
	public void i_validate_NetworkDEL_outboundXML() throws Throwable {
		System.out.println("I am verifying Network with DEL outboundXML values");
		network.validateNetworkWithDELoutbound();
	}
}

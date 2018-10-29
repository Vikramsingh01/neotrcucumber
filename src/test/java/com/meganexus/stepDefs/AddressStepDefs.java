package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AddressSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddressStepDefs {

	@Steps

	AddressSteps address;

	@When("^I expand Address Structure$")
	public void i_expand_Address_Structure() throws Throwable {
		address.expandAddress();
	}

	@Then("^I vaildate list details of Address Structure$")
	public void i_vaildate_list_details_of_Address_Structure() throws Throwable {
		address.verifyListviewOfAddress();
	}

	@When("^I clicked view button for Address structure$")
	public void i_clicked_view_button_for_Address_structure() throws Throwable {
		address.viewAddress();
	}

	@Then("^I validate Address record with Inbound xml$")
	public void i_validate_Address_record_with_Inbound_xml() throws Throwable {
		address.verifyAddressWithIBXML();
	}

	@Then("^I vaildate back button is working for Address Strucure$")
	public void i_vaildate_back_button_is_working_for_Address_Strucure() throws Throwable {
		address.veriBackBtnForAddress();
	}

	@When("^I clicked on edit button for Address Structure$")
	public void i_clicked_on_edit_button_for_Address_Structure() throws Throwable {
		address.editAddress();
	}

	@Then("^I updated invalid value and verified labels and error message is showing on edit Address Page$")
	public void i_updated_invalid_value_and_verified_labels_and_error_message_is_showing_on_edit_Address_Page()
			throws Throwable {

	}

	@When("^I updated field value for Address Structure with valid data$")
	public void i_updated_field_value_for_Address_Structure_with_valid_data() throws Throwable {
		address.updateAddressFieldValue();
	}

	@Then("^I validate Update Value in Edit Address Page with outbound xml$")
	public void i_validate_Update_Value_in_Edit_Address_Page_with_outbound_xml() throws Throwable {

	}

	@When("^I clicked on add button for Address Structure$")
	public void i_clicked_on_add_button_for_Address_Structure() throws Throwable {
		address.addAddressBtn();
	}

	@Then("^I insert invalid value and verified labels and error message is showing on add Address Structure$")
	public void i_insert_invalid_value_and_verified_labels_and_error_message_is_showing_on_add_Address_Structure()
			throws Throwable {

	}

	@When("^I insert field value for Address Structure with valid data\\.$")
	public void i_insert_field_value_for_Address_Structure_with_valid_data() throws Throwable {
		address.submitAddressDetails();
	}

	@Then("^I validate insert record for Add Address structure with outbound xml$")
	public void i_validate_insert_record_for_Add_Address_structure_with_outbound_xml() throws Throwable {
		address.verifyInsertedAdressStructureWithOB_XML();
	}
	
     @When("^I delete Address details$")
	 public void i_delete_Address_details() throws Throwable {
	 System.out.println("I am deleting Address details");
	 address.deleteAddress();
	    }
	    

	 @Then("^I verify whether AddressRecord is deleted from aliasList$")
	 public void i_verify_whether_AddressRecord_is_deleted_from_aliasList() throws Throwable {
	 System.out.println("I am verifying deleted Address record");
	 address.validateDeletedAddressRecord();
	    	
	    }
	 
	 @When("^I verify deleted record of Address should be deleted from Database$")
	 public void i_verify_deleted_record_of_Address_should_be_deleted_from_Database() throws Throwable {
		 System.out.println("I am verifying deleted record from database");
		 address.validateFromDatabse();
	 }


	 @Then("^I validate AddressDEL outboundXML$")
	 public void i_validate_AddressDEL_outboundXML() throws Throwable {
	 System.out.println("I am verifying Address with DEL outboundXML values");
	 address.validateAddressWithDELoutbound();
}
	 @When("^I click on delete button of Address type Main$")
	 public void i_click_on_delete_button_of_Address_type_Main() throws Throwable {
	    address.clickMainAddressDELButton(); 
	 }

	 @Then("^I verify pop-up box displayed to user with Close button$")
	 public void i_verify_pop_up_box_displayed_to_user_with_Close_button() throws Throwable {
	    address.verifyMainAddressDeleteErrorMessage(); 
	 }
}
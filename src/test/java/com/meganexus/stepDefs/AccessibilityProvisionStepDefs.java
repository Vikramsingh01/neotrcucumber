package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AccessbilitySteps;
import com.meganexus.stepsLib.AccessibiltyProvisionSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AccessibilityProvisionStepDefs {
	@Steps
	AccessbilitySteps accessbilitySteps;
	AccessibiltyProvisionSteps accessbilityProvisionSteps;

	@When("^I navigate to view Accessibilty Provision Page$")
	public void i_navigate_to_view_Accessibilty_Provision_Page() throws Throwable {
		accessbilityProvisionSteps.clickOnViewAccessibilityProvision();

	}

	@When("^I navigate to view Accessibilty Page$")
	public void i_navigate_to_view_Accessibilty_Page() throws Throwable {
		accessbilitySteps.navigateToAccessibiltyViewPage();
	}

	@When("^I expand Accessibility Provision$")
	public void i_expand_Accessibility_Provision() throws Throwable {
		accessbilityProvisionSteps.expandAccessibilityProvision();
	}

	@Then("^I vaildate list details of Accessibilty Provision$")
	public void i_vaildate_list_details_of_Accessibilty_Provision() throws Throwable {
		accessbilityProvisionSteps.verifyListViewOfAccessibilityProvision();
	}

	@When("^I clicked on edit button for Accessibilty Provision$")
	public void i_clicked_on_edit_button_for_Accessibilty_Provision() throws Throwable {
		accessbilityProvisionSteps.clickOnEditAccessibilityProvision();
	}

	@When("^I updated field value for Accessibilty Provision$")
	public void i_updated_field_value_for_Accessibilty_Provision() throws Throwable {
		accessbilityProvisionSteps.updateAccessibilityProvision();
	}

	@When("^I clicked on add button for Accessibilty Provision$")
	public void i_clicked_on_add_button_for_Accessibilty_Provision() throws Throwable {
		accessbilityProvisionSteps.clickOnAddAccessibilityProvision();
	}

	@When("^I insert field value for Accessibilty Provision$")
	public void i_insert_field_value_for_Accessibilty_Provision() throws Throwable {
		accessbilityProvisionSteps.saveDetailsForAddAccessibilityProvision();
	}

	@Then("^I validate View Accessibilty Provision Page For Inbound xml$")
	public void i_validate_all_the_labels_for_View_Accessibilty_Provision_Page() throws Throwable {
		accessbilityProvisionSteps.verifyInboundAccessibilityProvision();
	}

	@Then("^I vaildate back button is working for Accessibilty Provision$")
	public void i_vaildate_back_button_is_working_for_Accessibilty_Provision() throws Throwable {
		accessbilityProvisionSteps.verifyBackBtnForAccessibilityProvision();
	}

	@Then("^I validate Update Value in Edit Accessibilty Provision Page$")
	public void i_validate_Update_Value_in_Edit_Accessibilty_Provision_Page() throws Throwable {
		accessbilityProvisionSteps.verifyUpdatedRecord();
	}

	@Then("^I validate insert record for Add Accessibilty Provision Page with outbound xml$")
	public void i_validate_insert_record_for_Add_Accessibilty_Provision_Page() throws Throwable {
		accessbilityProvisionSteps.verifyInsertedRecord();
	}

	@Then("^I insert invalid value and verified labels and error message is showing on edit Accessibilty ProvisionUI$")
	public void i_insert_invalid_value_and_verified_error_message_is_showing_on_edit_Accessibilty_ProvisionUI()
			throws Throwable {
		accessbilityProvisionSteps.verifyErrorMsgForInsertRecordAndLabels();

	}

	@Then("^I updated invalid value and verified labels and error message is showing on edit Accessibilty ProvisionUI$")
	public void i_updated_invalid_value_and_verified_error_message_is_showing_on_edit_Accessibilty_ProvisionUI()
			throws Throwable {
		accessbilityProvisionSteps.verifyErrorMsgForUpdateRecordAndLabels();

	}
	
	@When("^I delete Accessibilty Provision details$")
	public void i_delete_Accessibilty_Provision_details() throws Throwable {
	System.out.println("I am deleting Accessibilty Provision  details");
	accessbilityProvisionSteps.deleteAccessibilityProvision();
	}

	@When("^I verify whether Accessibilty Provision Record is deleted from accessibiltyProvisionList$")
	public void i_verify_whether_Accessibilty_Provision_Record_is_deleted_from_accessibiltyProvisionList() throws Throwable {
	System.out.println("I am verifying deleted Accessibilty Provision  record");
	accessbilityProvisionSteps.validateDeletedAccessibilityProvisionRecord();
	}

	@Then("^I validate AccessibiltyProvisionDEL outboundXML$")
	public void i_validate_AccessibiltyProvisionDEL_outboundXML() throws Throwable {
    System.out.println("I am verifying Accessibilty Provision with DEL outboundXML values");
    accessbilityProvisionSteps.validateAccessibilityProvisionWithDELoutbound();   
	}



}

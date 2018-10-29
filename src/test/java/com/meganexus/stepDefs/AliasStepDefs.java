package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AliasSteps;
import com.meganexus.stepsLib.LoginSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")
public class AliasStepDefs {
	@Steps
	AliasSteps aliasSteps;
	
	@When("^I navigate to Profiles tab$")
	public void i_navigate_to_Profiles_tab() throws Throwable {
	    aliasSteps.clickProfilesTab();
	}
	
	@Then("^I validate aliasList and one aliasRecord should be present on ui$")
	public void i_validate_aliasList_and_one_aliasRecord_should_be_present_on_ui() throws Throwable {
		System.out.println("I am verifying the alias table");
		aliasSteps.validateAliasList();
	}

	@When("^I view alias details of corresponding offender$")
	public void i_view_alias_details_of_corresponding_offender() throws Throwable {
		System.out.println("I am viewing alias details");
		aliasSteps.clickViewAliasBtn();
		aliasSteps.verifyAliasDetails();
	}
	
	@Then("^I validate aliasStructure values with the inboundXML$")
	public void i_validate_aliasStructure_values_with_the_inboundXML() throws Throwable {
		System.out.println("I am verifying alias with inbound values");
		aliasSteps.validateAliasWithInbound();
	}
	
	@Then("^I click on back button on view alias screen$")
	public void i_click_on_back_button_on_view_alias_screen() throws Throwable {
	aliasSteps.clickBackButton();
	aliasSteps.verifyServiceUserProfileHeader();
	}

	@When("^I update aliasStructure on UI$")
	public void i_update_aliasStructure_on_UI() throws Throwable {
		System.out.println("I am updating alias details");
		aliasSteps.updateAlias();
	}

	@Then("^I validate aliasRecord with updated data should be on ui$")
	public void i_validate_aliasRecord_with_updated_data_should_be_on_ui() throws Throwable {
		System.out.println("I am verifying updated alias record");
		aliasSteps.validateUpdatedAliasRecord();
	}

	@Then("^I validate aliasUPD outboundXML$")
	public void i_validate_aliasUPD_outboundXML() throws Throwable {
		System.out.println("I am verifying alias with UPD outboundXML values");
		aliasSteps.validateAliasWithUPDoutbound();
	}

	@When("^I delete aliasRecord from UI$")
	public void i_delete_aliasRecord_from_UI() throws Throwable {
		System.out.println("I am deleting alias details");
		aliasSteps.deleteAlias();
	}

	@Then("^I verify whether aliasRecord is deleted from aliasList$")
	public void i_verify_whether_aliasRecord_is_deleted_from_aliasList() throws Throwable {
		System.out.println("I am verifying deleted alias record");
		aliasSteps.validateDeletedAliasRecord();
	}

	@Then("^I validate aliasDEL outboundXML$")
	public void i_validate_aliasDEL_outboundXML() throws Throwable {
		System.out.println("I am verifying alias with DEL outboundXML values");
		aliasSteps.validateAliasWithDELoutbound();
	}
	
	@When("^I add aliasStructure to corresponding offender$")
	public void i_add_alias_to_corresponding_offender() throws Throwable {
		System.out.println("I'm adding alias");
		aliasSteps.addNewAlias();

	}
	
	@Then("^I validate newly added aliasRecord should be on ui$")
	public void i_validate_newly_added_aliasRecord_should_be_on_ui() throws Throwable {
		System.out.println("I am verifying newly added alias record");
		aliasSteps.validateCreatedAliasRecord();
	}

	@Then("^I validate aliasINS outboundXML$")
	public void i_validate_aliasINS_outboundXML() throws Throwable {
		System.out.println("I am verifying alias with INS outboundXML values");
		aliasSteps.validateAliasWithINSoutbound();
	}

	@When("^I view add Alias screen and verify all labels$")
	public void i_view_add_Alias_screen_and_verify_all_labels() throws Throwable {
		System.out.println("I am clicking on Add button for Alias Structure");
		aliasSteps.clickAddAliasButton();
	}
	
	@When("^I view edit Alias screen and verify all labels$")
	public void i_view_edit_Alias_screen_and_verify_all_labels() throws Throwable {
		System.out.println("I am clicking on edit button for Alias Structure");
		aliasSteps.clickEditAliasButton();
	}

	@When("^I enter invalid values in all the inputs$")
	public void i_enter_invalid_values_in_all_the_inputs() throws Throwable {
		System.out.println("I am entering all the invalid values for all fields");
		aliasSteps.enterInvalidValuesAndSave();
	}

	@Then("^I verify all the validation messages on ui$")
	public void i_verify_all_the_validation_messages_on_ui() throws Throwable {
		System.out.println("I am verifying all the validation messages");
		aliasSteps.verifyValidationMessages();
	}

}

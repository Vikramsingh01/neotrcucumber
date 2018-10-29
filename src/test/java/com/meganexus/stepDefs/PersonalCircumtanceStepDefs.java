package com.meganexus.stepDefs;

import com.meganexus.stepsLib.PersonalCircumtanceSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("serial")
public class PersonalCircumtanceStepDefs {
	@Steps
	PersonalCircumtanceSteps perscirumtance;
	
	@When("^I navigate to Personal Circumstance Tab$")
	public void i_navigate_to_Personal_Circumstance_Tab() throws Throwable {
		System.out.println("I am clicking on the Personal Circumtance tab");
		perscirumtance.clickPersonalCircumstanceTab();
	}

	@Then("^I validate personalCircumtance list and one personalCircumtance should be present on ui$")
	public void i_validate_personalCircumtance_List_and_one_personalCircumtanceRecord_should_be_present_on_ui() throws Throwable {
		System.out.println("I am verifying the personalCircumtance table");
		perscirumtance.validatePersonalCircumtanceList();
	}
	
	@Then("^I click on back button on Personal Circumstance Tab$")
	public void i_click_on_back_button_on_Personal_Circumstance_Tab() throws Throwable {
		System.out.println("I am clicking on back button");
		perscirumtance.clickBackButton();
	}
	

	@When("^I add PersonalCircumtance to corresponding offender$")
	public void i_add_PersonalCircumtance_to_corresponding_offender() throws Throwable {
		System.out.println("I'm adding Personal Circumtance");
		perscirumtance.addPersonalCircumtance();
	}

	@When("^I view PersonalCircumtance details$")
	public void i_view_PersonalCircumtance_details() throws Throwable {
		System.out.println("I'm viewing Personal Circumtance");
		perscirumtance.viewPersonalCircumtance();
	}
	
	@Then("^I click on back button on view personalCircumtance screen$") 
	public void i_click_on_back_button_on_view_personalCircumtance_screen() throws Throwable {
		System.out.println("I click on back button");
		perscirumtance.clickBackButton();
		perscirumtance.verifyServiceUserProfileHeader();
	}

	@Then("^I validate PersonalCircumtance record should be on ui$")
	public void i_validate_PersonalCircumtance_record_should_be_on_ui() throws Throwable {
		perscirumtance.validatePersonalCircumtance();
		System.out.println("personal circumtance verified");
	}

	@When("^I edit PersonalCircumtance details$")
	public void i_edit_PersonalCircumtance_details() throws Throwable {
		perscirumtance.clickEditButton();
		perscirumtance.editPersonalCircumtance();
	}

	@When("^I delete PersonalCircumtance details$")
	public void i_delete_PersonalCircumtance_details() throws Throwable {
		perscirumtance.deletePersonalCircumtance();
	
	}

	@Then("^I validate PersonalCircumtance record should be delete on ui$")
	public void i_validate_PersonalCircumtance_record_should_be_delete_on_ui() throws Throwable {
		perscirumtance.validatePersonalCircumtanceRecordDeleted();
	}
	
	@When("^I view edit PersonalCircumtance screen and verify all labels$")
	public void i_view_edit_PersonalCircumtance_screen_and_verify_all_labels() throws Throwable {
		perscirumtance.clickEditButton();
	    perscirumtance.verifyLabelsForEdit();
	}
	
	@When("^I enter invalid PersonalCircumtance values in all the inputs$")
	public void i_enter_invalid_PersonalCircumtance_values_in_all_the_inputs() throws Throwable {
	    perscirumtance.enterInvalidData();
	}
	
	@Then("^I verify all the PersonalCircumtance validation messages on ui$")
	public void i_verify_all_the_PersonalCircumtance_validation_messages_on_ui() throws Throwable {
		
	    perscirumtance.verifyValidationMessages();
	}

}

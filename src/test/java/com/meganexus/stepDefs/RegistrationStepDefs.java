package com.meganexus.stepDefs;

import com.meganexus.pageObjectLib.RegistrationPage;
import com.meganexus.stepsLib.RegistrationSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationStepDefs {

	@Steps
	RegistrationPage registrationPage;
	RegistrationSteps registrationSteps;

	@When("^I click on R button$")
	public void i_click_on_R_button() throws Throwable {
		registrationSteps.viewRegistrationTable();
	}

	@Then("^I click on Registration link$")
	public void i_click_on_Registration_link() throws Throwable {
		registrationSteps.clickOnRegistrationlink();
	}

	@Then("^I validate the Registration listing Table$")
	public void i_validate_the_Registration_listing_Table() throws Throwable {
		registrationSteps.validateRegistrationTable();
	}
	
	@Then("^I click on Add Regsitration button$")
	public void i_click_on_Add_Regsitration_button() throws Throwable {
		registrationPage.ClickAddRegistrationbtn();
	}

	@Then("^I add RegistrationStructure to corresponding offender$")
	public void i_add_RegistrationStructure_to_corresponding_offender() throws Throwable {
		registrationSteps.addRegistration();
	}
	
	   
	@When("^I add registrationStructure to corresponding offender$")
	public void i_add_registrationStructure_to_corresponding_offender() throws Throwable {
		System.out.println("I'm adding registrationStructure");
		registrationSteps.addRegistration();
	}

//	@When("^I view registrationStructure details$")
//	public void i_view_registrationStructure_details() throws Throwable {
//		System.out.println("I'm viewing registrationStructure");
//		registrationSteps.viewRegistration();
//	}

	@Then("^I validate registrationStructure record should be present on ui$")
	public void i_validate_registrationStructure_record_should_be_present_on_ui() throws Throwable {
		System.out.println("I'm verifying registrationStructure record");
		registrationSteps.verifyRegistration();
		
	}

	@When("^I edit registrationStructure details$")
	public void i_edit_registrationStructure_details() throws Throwable {
		System.out.println("I'm editing registrationStructure");
		registrationSteps.editRegistration();
	}

	@When("^I delete registrationStructure details$")
	public void i_delete_registrationStructure_details() throws Throwable {
		System.out.println("I'm deleting registrationStructure");
		registrationSteps.deleteRegistration();
	}

	@Then("^I validate registrationStructure record should be deleted from ui$")
	public void i_validate_registrationStructure_record_should_be_deleted_from_ui() throws Throwable {
		
	}

}

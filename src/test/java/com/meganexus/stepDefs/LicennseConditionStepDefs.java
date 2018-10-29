package com.meganexus.stepDefs;

import com.meganexus.stepsLib.LicenseConditionSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")
public class LicennseConditionStepDefs {
	@Steps
	LicenseConditionSteps LicenseConditionSteps;
	
	@When("^I add LicenseCondition to corresponding offender$")
	public void i_add_LicenseCondition_to_corresponding_offender() throws Throwable {
		System.out.println("I'm adding License Conditions Structure");
		LicenseConditionSteps.addNewLicenseCondition();
	    
	}

	@When("^I view LicenseCondition details$")
	public void i_view_LicenseCondition_details() throws Throwable {
		System.out.println("I'm viewing License Conditions Structure");
		LicenseConditionSteps.viewLicenseCondition();
	   
	}

	@Then("^I validate LicenseCondition record should be on ui$")
	public void i_validate_LicenseCondition_record_should_be_on_ui() throws Throwable {
		System.out.println("I'm verifying LicenseCondition record");
		LicenseConditionSteps.ValidateLicenseConditionTable();
	}

	@When("^I edit LicenseCondition details$")
	public void i_edit_LicenseCondition_details() throws Throwable {
		System.out.println("I'm updating License Conditions Structure");
	    throw new PendingException();
	}

	@When("^I delete LicenseCondition details$")
	public void i_delete_LicenseCondition_details() throws Throwable {
		System.out.println("I'm deleting License Conditions Structure");
	    throw new PendingException();
	}

	@Then("^I validate LicenseCondition record should be delete on ui$")
	public void i_validate_LicenseCondition_record_should_be_delete_on_ui() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}

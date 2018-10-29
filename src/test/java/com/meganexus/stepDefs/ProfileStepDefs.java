package com.meganexus.stepDefs;

import com.meganexus.stepsLib.ServiceUserSteps;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ProfileStepDefs {
	@Steps
	ServiceUserSteps serviceUserSteps;
	
	@Then("^I validate Title fields should be present on ui$")
	public void i_validate_Title_fields_should_be_present_on_ui() throws Throwable {
		System.out.println("I am verifying the Profile ");
		serviceUserSteps.validateProfile();
	   
	}

	@Then("^I validate Identifiers fields should present on UI$")
	public void  i_validate_identifiers_fields_should_present_on_UI() throws Throwable {
		System.out.println("I am verifying the Identifiers");
		serviceUserSteps.validateIdentifiers();
		
	}


}

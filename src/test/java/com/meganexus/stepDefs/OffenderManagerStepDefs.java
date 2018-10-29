package com.meganexus.stepDefs;

import com.meganexus.stepsLib.OffenderManagerSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OffenderManagerStepDefs {
	
	OffenderManagerSteps OffManager;

	@When("^I view OffenderManager details$")
	public void i_view_OffenderManager_details() throws Throwable {
		System.out.println("I'm viewing Offender Manager");
		OffManager.ViewOffenderManger();
	}

	@Then("^I validate OffenderManager record should be on ui$")
	public void i_validate_OffenderManager_record_should_be_on_ui() throws Throwable {
		System.out.println("I'm viewing Offender Manager");
		OffManager.validateOffenderManager();
	}

}

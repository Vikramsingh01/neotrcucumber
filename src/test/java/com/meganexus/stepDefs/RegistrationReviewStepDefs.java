package com.meganexus.stepDefs;

import com.meganexus.stepsLib.RegistationReviewSteps;
import com.meganexus.stepsLib.RegistrationSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationReviewStepDefs {
	@Steps
	RegistationReviewSteps registrationReviewSteps;
	
	@When("^I add registrationReviewStructure to corresponding offender$")
	public void i_add_registrationReviewStructure_to_corresponding_offender() throws Throwable {
		System.out.println("I'm adding registrationReviewStructure");
		registrationReviewSteps.addRegistrationReview();
	}

	@When("^I view registrationReviewStructure details$")
	public void i_view_registrationReviewStructure_details() throws Throwable {
		System.out.println("I'm viewing registrationReviewStructure");
		registrationReviewSteps.viewRegistrationReview();
	}

	@Then("^I validate registrationReviewStructure record should be present on ui$")
	public void i_validate_registrationReviewStructure_record_should_be_present_on_ui() throws Throwable {
		System.out.println("I'm verifying registrationReviewStructure record");
		registrationReviewSteps.verifyRegistrationReview();
	}

	@When("^I edit registrationReviewStructure details$")
	public void i_edit_registrationReviewStructure_details() throws Throwable {
		System.out.println("I'm editing registrationReviewStructure");
		registrationReviewSteps.editRegistrationReview();
	}

	@When("^I delete registrationReviewStructure details$")
	public void i_delete_registrationReviewStructure_details() throws Throwable {
		System.out.println("I'm deleting registrationReviewStructure");
		registrationReviewSteps.deleteRegistrationReview();
	}

	@Then("^I validate registrationReviewStructure record should be deleted from ui$")
	public void i_validate_registrationReviewStructure_record_should_be_deleted_from_ui() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}

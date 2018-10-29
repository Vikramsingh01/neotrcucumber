package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AdditionalIdentifierSteps;
import com.meganexus.stepsLib.ReleaseSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ReleaseStepDefs {

	@Steps
	ReleaseSteps release;
	@When("^I view release details$")
	public void i_view_release_details() throws Throwable {

		release.viewRelease();
	}

	@Then("^I validate release record should be on ui$")
	public void i_validate_release_record_should_be_on_ui() throws Throwable {
		System.out.println("verified alias details");
		release.releaseReview();
	}
}

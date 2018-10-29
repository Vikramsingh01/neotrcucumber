package com.meganexus.stepDefs;

import com.meganexus.stepsLib.CommReqtManagerSteps;
import com.meganexus.stepsLib.CommunityRequirementSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CommReqtManagerStepDefs {

	
	@Steps
	CommReqtManagerSteps commrqmntmngr;	
	@When("^I view CommunityRequirementManager details$")
	public void i_view_CommunityRequirementManager_details() throws Throwable {
	
			commrqmntmngr.viewCommReqtManager();
	}

	@Then("^I validate CommunityRequirementManager record should be on ui$")
	public void i_validate_CommunityRequirementManager_record_should_be_on_ui() throws Throwable {
		System.out.println("verified alias details");
		commrqmntmngr.CommReqtManagerReview();
	}
	
}

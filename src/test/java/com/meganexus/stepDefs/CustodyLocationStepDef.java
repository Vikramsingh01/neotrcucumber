package com.meganexus.stepDefs;

import com.meganexus.pageObjectLib.CustodyLocationPage;
import com.meganexus.stepsLib.CustodyLocationSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustodyLocationStepDef {
	CustodyLocationSteps custLocn;
	@When("^I view custodyLocation details$")
	public void i_view_custodyLocation_details() throws Throwable {
		custLocn.viewCustodyLocn();
	}

	@Then("^I validate custodyLocation record should be on ui$")
	public void i_validate_custodyLocation_record_should_be_on_ui() throws Throwable {
		custLocn.CustodyLocationReview();
	}
	@When("^I update custodyLocation details$")
	public void i_update_custodyLocation_details() throws Throwable {
		custLocn.updateCustodyLocn();
	}

	@Then("^I validate custodyLocation record should be updated on ui$")
	public void i_validate_custodyLocation_record_should_be_updated_on_ui() throws Throwable {
		custLocn.CustodyLocationReview();
	}
}

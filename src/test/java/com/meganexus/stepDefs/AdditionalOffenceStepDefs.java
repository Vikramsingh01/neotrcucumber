package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AdditionalOffenceSteps;
import com.meganexus.stepsLib.LoginSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")


public class AdditionalOffenceStepDefs {
	AdditionalOffenceSteps additionalOffence;
	@When("^I view AdditionalOffence to corresponding event$")
	public void i_view_AdditionalOffence_to_corresponding_event() throws Throwable {
	 
		additionalOffence.viewAdditionalOffence();
	}

	@Then("^I validate AdditionalOffence record should be on ui$")
	public void i_validate_AdditionalOffence_record_should_be_on_ui() throws Throwable {
	  
		additionalOffence.additionalOffenceReview();
	}
	@Then("^I click back button on AdditionalOffence screen$")
	public void i_click_back_button() throws Throwable {
		additionalOffence.clickBackButton();
		additionalOffence.validateEventHeader();
	}
	
}
	


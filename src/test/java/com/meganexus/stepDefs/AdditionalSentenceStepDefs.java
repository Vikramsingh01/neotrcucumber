	package com.meganexus.stepDefs;

	import com.meganexus.stepsLib.AdditionalSentenceSteps;
	import com.meganexus.stepsLib.LoginSteps;

	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import net.thucydides.core.annotations.Steps;
	@SuppressWarnings("serial")

	public class AdditionalSentenceStepDefs {
		AdditionalSentenceSteps additionalSentence;
		@When("^I view AdditionalSentence to corresponding event$")
		public void i_view_AdditionalSentence_to_corresponding_event() throws Throwable {
		 
			additionalSentence.viewAdditionalSentence();
		}

		@Then("^I validate AdditionalSentence record should be on ui$")
		public void i_validate_AdditionalSentence_record_should_be_on_ui() throws Throwable {
		  
			additionalSentence.additionalSentenceReview();
		}
		@Then("^I click back button on AdditionalSentence screen$")
		public void i_click_back_button() throws Throwable {
			additionalSentence.clickBackButton();
			additionalSentence.validateEventHeader();
		}
		
	}



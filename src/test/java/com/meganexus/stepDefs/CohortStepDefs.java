package com.meganexus.stepDefs;


import com.meganexus.stepsLib.CohortSteps;
import com.meganexus.stepsLib.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")

public class CohortStepDefs {
	
	@Steps
	CohortSteps Cohort;
	

   

	@When("^I view cohort to corresponding offender$")
	public void i_view_cohort_to_corresponding_offender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
Cohort.viewCohort();
	}

	@Then("^I validate cohort record should be on ui$")
	public void i_validate_cohort_record_should_be_on_ui() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Cohort.validateCohort();
	}
	
	@Then("^I validate Cohort list on ui$")
	public void i_validate_cohort_list_on_ui() throws Throwable {
		Cohort.validateCohortList();
	}
    
	@Then("^I click on back button on View Cohort screen$")
	public void i_click_on_back_button_View_Cohort_screen() throws Throwable {
	Cohort.validateBackButton();
	}
	
}


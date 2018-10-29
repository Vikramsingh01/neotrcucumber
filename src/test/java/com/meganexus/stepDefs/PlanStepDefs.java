package com.meganexus.stepDefs;

import com.meganexus.stepsLib.PlanSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PlanStepDefs {
	@Steps
	PlanSteps plan;
	
	@When("^I navigate to Plan Tab$")
	public void i_navigate_to_Plan_Tab() throws Throwable {
		System.out.println("I am clicking on the Plan tab");
		plan.clickPlanTab();
	}

	@Then("^I validate plan list and one plan should be present on ui$")
	public void i_validate_plan_list_and_one_plan_should_be_present_on_ui() throws Throwable {
		System.out.println("I am verifying the plan table");
		plan.validatePlanList();
	}

	@Then("^I click on back button on Plan Tab$")
	public void i_click_on_back_button_on_Plan_Tab() throws Throwable {
		System.out.println("I am clicking on back button");
		plan.clickBackButton();
	}
	
	@When("^I view plan details of corresponding offender$")
	public void i_view_plan_details_of_corresponding_offender() throws Throwable {
	    plan.viewDetails();
	}

	@Then("^I validate all labels and fields for plan details$")
	public void i_validate_all_labels_and_fields_for_plan_details() throws Throwable {
	    plan.verifyAllLabels();
	}

	@Then("^I validate planStructure values with the inboundXML$")
	public void i_validate_planStructure_values_with_the_inboundXML() throws Throwable {
	    plan.validatePlanWithInbound();
	}

	@Then("^I click on back button on view plan screen$")
	public void i_click_on_back_button_on_view_plan_screen() throws Throwable {
	    plan.clickBackButton();
	}

	@When("^I view add Plan screen and verify all labels$")
	public void i_view_add_Plan_screen_and_verify_all_labels() throws Throwable {
	    plan.clickAddButton();
	    plan.verifyAddScreenLabels();
	}

	@When("^I enter invalid Plan values in all the inputs$")
	public void i_enter_invalid_Plan_values_in_all_the_inputs() throws Throwable {
	    plan.enterInvalidAddValues();
	}

	@Then("^I verify all the Plan validation messages on ui$")
	public void i_verify_all_the_Plan_validation_messages_on_ui() throws Throwable {
	    plan.verifyValidationMessages();
	}

	@When("^I add Plan to corresponding offender$")
	public void i_add_Plan_to_corresponding_offender() throws Throwable {
		plan.clickAddButton();
		plan.enterValidAddValues();
		plan.clickSubmitBtn();
	}

	@Then("^I validate Plan record should be on ui$")
	public void i_validate_Plan_record_should_be_on_ui() throws Throwable {
	    plan.validateNewlyAddedPlan();
	}

	@Then("^I validate PlanINS outboundXML$")
	public void i_validate_PlanINS_outboundXML() throws Throwable {
		plan.validatePlanWithOutbound();
	}
	
}

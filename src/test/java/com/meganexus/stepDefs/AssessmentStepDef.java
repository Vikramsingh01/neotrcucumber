package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AssessmentSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AssessmentStepDef {

	@Steps
	AssessmentSteps assessmentSteps;
	
	
	@When("^I navigate to Assessment page$")
	public void i_navigate_to_Assessment_page() throws Throwable {
		assessmentSteps.clickAssessmentTab();
		//test comment
	}

	@Then("^I validate assessment list and one assessment should be present on ui$")
	public void i_validate_assessment_list_and_one_assessment_should_be_present_on_ui() throws Throwable {
		assessmentSteps.validateAssessmentList();
	}

	@Then("^I click on back button on assessment Tab$")
	public void i_click_on_back_button_on_assessment_Tab() throws Throwable {
		assessmentSteps.clickBackButton();
	}

	@When("^I view assessment details$")
	public void i_view_assessment_details() throws Throwable {
		
		assessmentSteps.viewAssessment(); 
	    
	}

	@Then("^I validate assessment record should be on ui$")
	public void i_validate_assessment_record_should_be_on_ui() throws Throwable {
		assessmentSteps.validateAssessment();
	}

	@Then("^I click on back button on view assessment screen$")
	public void i_click_on_back_button_on_view_assessment_screen() throws Throwable {
		 assessmentSteps.clickBackButton();
	}

	@When("^I click on add button for Assessment$")
	public void i_click_on_add_button_for_Assessment() throws Throwable {
		assessmentSteps.clickAddButton();
	}

	@When("^I verify field labels for Assessment$")
	public void i_verify_field_labels_for_Assessment() throws Throwable {
		assessmentSteps.verifyAddPageLabels();
	}
	
	@When("^I add field values for Assessment and submit$")
	public void i_add_field_values_for_Assessment_and_submit() throws Throwable {
		assessmentSteps.addAssessment();
	}

	@Then("^I verify navigation to Assessment list page$")
	public void i_verify_navigation_to_Assessment_list_page() throws Throwable {
		assessmentSteps.validateAssessmentList();
	    
	}
	@Then("^I add invalid values and submit for Assessment$")
	public void i_add_invalid_values_and_submit_for_Assessment() throws Throwable {
		assessmentSteps.addAssessmentInvalidData();
	}


	@Then("^verify error messages displayed on add AssessmentUI$")
	public void verify_error_messages_displayed_on_add_AssessmentUI() throws Throwable {
		
		assessmentSteps.verifyAddPageErrorMessage();
		
	}
	
	@When("^I click on edit button for Assessment$")
	public void i_click_on_edit_button_for_Assessment() throws Throwable {
		assessmentSteps.clickEditButton();
	}

	@Then("^I edit invalid values and submit on Edit Assessment Page$")
	public void i_edit_invalid_values_and_submit_on_Edit_Assessment_Page() throws Throwable {
		assessmentSteps.editAssessmentwithInvalidValues();
	}

	@Then("^verify error messages displayed on edit AssessmentUI$")
	public void verify_error_messages_displayed_on_edit_AssessmentUI() throws Throwable {
		assessmentSteps.verifyEditPageErrorMessage();
	}
	@When("^I delete assessment details$")
	public void i_delete_assessment_details() throws Throwable {
		assessmentSteps.deleteAssessment();
	
	}

	@Then("^I validate assessment record should be delete on ui$")
	public void i_validate_assessment_record_should_be_delete_on_ui() throws Throwable {
		
	}
  

}

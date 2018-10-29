package com.meganexus.stepDefs;

import com.meganexus.stepsLib.DrugTestProfileSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DrugTestProfileStepDefs {
	
	@Steps
	DrugTestProfileSteps drugTestProfileSteps;
	
   @When("^I navigate to Drug Test Profile page$")
    public void i_navigate_to_Drug_Test_Profile_page() throws Throwable {
	drugTestProfileSteps.viewDrugTestReferral();
   }
	
   @Then("^I click on add button for Drug Test Profile$")
	public void i_click_on_add_button_for_Drug_Test_Profile() throws Throwable {
		drugTestProfileSteps.clickAddButton();
	}

  @Then("^I verify field labels for Drug Test Profile$")
	public void i_verify_field_labels_for_Drug_Test_Profile() throws Throwable {
		drugTestProfileSteps.verifyAddPageLabels();
	}

  @Then("^I add field values for Drug Test Profile and submit$")
	public void i_add_field_values_for_Drug_Test_Profile_and_submit() throws Throwable {
		drugTestProfileSteps.addDrugTestProfile();
	}


	@When("^I add invalid values and submit for Drug Test Profile$")
	public void i_add_invalid_values_and_submit_for_Drug_Test_Profile() throws Throwable {
		drugTestProfileSteps.addDrugTestProfileInvalidData();
	}

	@Then("^I verify error messages displayed on add Drug Test Profile UI$")
	public void verify_error_messages_displayed_on_add_Drug_Test_Profile_UI() throws Throwable {
		drugTestProfileSteps.verifyAddPageErrorMessage();
	}

	@When("^I click on edit button for Drug Test Profile$")
	public void i_click_on_edit_button_for_Drug_Test_Profile() throws Throwable {
		drugTestProfileSteps.clickEditButton();
	}

	@Then("^I edit field values for Drug Test Profile and submit$")
	public void i_edit_field_values_for_Drug_Test_Profile_and_submit() throws Throwable {
		drugTestProfileSteps.editDrugTestProfile();
	}
	@When("^I edit invalid values and submit for Drug Test Profile$")
	public void i_edit_invalid_values_and_submit_for_Drug_Test_Profile() throws Throwable {
		drugTestProfileSteps.editDrugTestProfilewithInvalidValues();
	}

	@Then("^I verify error messages displayed on edit Drug Test Profile UI$")
	public void verify_error_messages_displayed_on_edit_Drug_Test_Profile_UI() throws Throwable {
		drugTestProfileSteps.verifyEditPageErrorMessage();
	}

}
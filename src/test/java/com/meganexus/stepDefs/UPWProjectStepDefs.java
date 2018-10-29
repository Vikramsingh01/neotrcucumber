package com.meganexus.stepDefs;

import com.meganexus.stepsLib.UPWProjectSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")
public class UPWProjectStepDefs {
	@Steps
	UPWProjectSteps UPWSteps;

	@Then("^I navigate to UNPAID WORK tab$")
	public void i_navigate_to_UNPAID_WORK_tab() throws Throwable {
		UPWSteps.navigateToUnpaidWorkTab();
	}
	
	@When("^I check for the UPWFilters$")
	public void i_check_for_the_UPWFilters() throws Throwable {
			   UPWSteps.checkUPWFilters();
			}
	@When("^I verify the validation for each filter$")
	public void i_verify_the_validation_for_each_filter() throws Throwable {
		   UPWSteps.verifyFilterValidation();
	}
	@When("^I validate UPWProjectList$")
	public void i_validate_UPWProjectList() throws Throwable {
		   UPWSteps.verifyUPWList();
	}
	@When("^I click on Add New Project$")
	public void i_click_on_Add_New_Project() throws Throwable {
		   UPWSteps.clickOnAddButton();
	}
	@When("^I validate labels on Add UPW PROJECT Page$")
	public void i_validate_labels_on_Add_UPW_PROJECT_Page() throws Throwable {
		UPWSteps.validatelabelonAddPage();
	}
	
	@When("^I add details for UPW Project$")
	public void i_add_details_for_UPW_Project() throws Throwable {
		   UPWSteps.addDetailsOfProject();
	}	
	@When("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
		//   UPWSteps.clickOnSaveButton();
		     UPWSteps.clickCancelBtn();
	}
	//For view UPW project
	
	@When("^I search for newly added Project$")
	public void i_search_for_newly_added_Project() throws Throwable {
		   UPWSteps.searchUPWProject();
	}
	@When("^I validate the searched record value$")
	public void i_validate_the_seached_record_value() throws Throwable {
		   UPWSteps.validateSearchRecordColumnValue();
	}
	@When("^I click on View button$")
	public void I_click_on_View_button() throws Throwable {
		   UPWSteps.clickOnViewButton();
	}
	@When("^I validate the newly added record$")
	public void i_validate_the_newly_added_record() throws Throwable {
		   UPWSteps.validateTheRecord();
		    
	}
	@When("^I validate back navigation$")
	public void i_validate_back_navigation() throws Throwable {
		 UPWSteps.clickOnBackButton(); 
	}
	
	//For Edit UPW project
	
	@When("^I search for last added Project$")
	public void i_search_for_last_added_Project() throws Throwable {
		UPWSteps.searchUPWProject();
	}

	@When("^I click on Update button$")
	 public void i_click_on_Update_button() throws Throwable {
	   UPWSteps.validateUpdateButton();
	   UPWSteps.validatelabelonEditPage();
	 }
	
	@When("^Update the Project$")
	public void update_the_Project() throws Throwable {
		UPWSteps.updateProjectDetails();
		UPWSteps.clickOnSaveButton();
	 
	}

	@Then("^I search for update Project$")
	public void i_search_for_update_Project() throws Throwable {
		UPWSteps.searchUPWProject();
	}
	
	@Then("^I validate the Updated record$")
	public void i_validate_the_Updated_record() throws Throwable {
		
		UPWSteps.validateUpdateRecord();
	}

}

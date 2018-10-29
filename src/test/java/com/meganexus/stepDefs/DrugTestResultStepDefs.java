package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AssessmentSteps;
import com.meganexus.stepsLib.DrugTestResultSteps;
import com.meganexus.stepsLib.ReferralSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("serial")
public class DrugTestResultStepDefs {
	
	
	
	DrugTestResultSteps drugTestResult;
	
	
	@Given("^I navigate to Drug Test Result page$")
	public void i_navigate_to_Drug_Test_Result_page() throws Throwable {
		drugTestResult.clickOnViewReferral();
	   
	}

	@Then("^I validate Drug Test Result list and one Drug Test Result should be present on ui$")
	public void i_validate_Drug_Test_Result_list_and_one_Drug_Test_Result_should_be_present_on_ui() throws Throwable {
		drugTestResult.validateDrugTestResultList();
	   
	}

	@When("^I view Drug Test Result details$")
	public void i_view_Drug_Test_Result_details() throws Throwable {
	    
		drugTestResult.clickViewButton();
	}

	@Then("^I validate Drug Test Result record should be on ui$")
	public void i_validate_Drug_Test_Result_record_should_be_on_ui() throws Throwable {
		drugTestResult.validateViewDrugTestResultDetail();
	   
	}

	@Then("^I click on back button on view Drug Test Result screen$")
	public void i_click_on_back_button_on_view_Drug_Test_Result_screen() throws Throwable {
	    
	    
	}

	@When("^I click on add button for Drug Test Result$")
	public void i_click_on_add_button_for_Drug_Test_Result() throws Throwable {
		drugTestResult.clickAddButton();
		
	}
	@When("^I verify field labels for Add Drug Test Result screen$")
	public void i_verify_field_labels_for_Add_Drug_Test_Result_screen() throws Throwable {
		drugTestResult.verifyAddPageLabels();
		
		
	}
	@When("^I verify mandatory fields for Drug Test and submit$")
	public void i_verify_mandatory_fields_for_Drug_Test_and_submit() throws Throwable {
		drugTestResult.verifyMandatoryFields();
		
		
	}
	@When("^I add field values for Drug Test Result and submit$")
	public void i_add_field_values_for_Drug_Test_Result_and_submit() throws Throwable {
		drugTestResult.enterDrugTestResult();
		drugTestResult.clickSubmitButton();
	}
	
	@When("^I add drug test using future date$")
	public void i_add_drug_test_using_future_date() throws Throwable {
		drugTestResult.vaidateDrugTestFutureDate();
		drugTestResult.clickSubmitButton();
	}
	@Then("^I verify navigation to Drug Test Result list page$")
	public void i_verify_navigation_to_Drug_Test_Result_list_page() throws Throwable {
		drugTestResult.verifyToNavigateDrugTestList(); 
	  
	}

	@Then("^I add Drug Future date with SU Complied value and submit$")
	public void i_add_Drug_Future_date_with_SU_Complied_value_and_submit() throws Throwable {
		drugTestResult.vaidateDrugFutureDateWithSUComplied();
		
	}
	@When("^I click on edit button for drug test result$")
	public void i_click_on_edit_button_for_drug_test_result() throws Throwable {
		drugTestResult.clickEditButton();
	    
	}
    @When("^I edit field values for drug test result and submit$")
	public void i_edit_field_values_for_drug_test_result_and_submit() throws Throwable {
    	drugTestResult.enterEditDrugTestResult();
		drugTestResult.clickSubmitButton();
	   
	}
    @Then("^I edit invalid values and submit for Drug Test Result$")
	public void i_edit_invalid_values_and_submit_for_Drug_Test_Result() throws Throwable {
		drugTestResult.enterEditDrugTestReultInvalidData();
		
		
	}
	@Then("^verify error messages displayed on edit drug test resultUI$")
	public void verify_error_messages_displayed_on_edit_drug_test_resultUI() throws Throwable {
	    
	    
	}
    @When("^I delete drug test result details$")
	public void i_delete_drug_test_result_details() throws Throwable {
		 drugTestResult.clickDeleteButton();
	   
	}
    @Then("^I validate drug test result record should be delete on ui$")
	public void i_validate_drug_test_result_record_should_be_delete_on_ui() throws Throwable {
    	drugTestResult.validateDrugTestResultRecordDeleted();
	   
	}
	@Then("^I add invalid values and submit for Drug Test Result$")
	public void i_add_invalid_values_and_submit_for_Drug_Test_Result() throws Throwable {
		drugTestResult.enterEditDrugTestReultInvalidData();
		
		
	}
	@Then("^I click on Cancel button on add Drug Test Screen$")
	  public void i_click_on_Cancel_button_on_add_Drug_Test_Screen() throws Throwable {
		drugTestResult.clickCancelButton();
	  }
	@Then("^I validate drugTestResultDel outboundXML$")
	  public void i_validate_drugTestResultDel_outboundXML() throws Throwable {
		drugTestResult.validateAccessibilityWithDELoutbound();
	  }
}

package com.meganexus.stepDefs;

import com.meganexus.stepsLib.ReferralSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("serial")
public class ReferralStepdefs {
	
	@Steps
	ReferralSteps referralSteps;
	
	@Given("^I navigate to Referral page$")
	public void i_navigate_to_Referral_page() throws Throwable {
		System.out.println("I am clicking on the Referral tab");
		referralSteps.clickReferralTab();
	    
	}
	@Then("^I validate referral list and one referral should be present on ui$")
	public void i_validate_referral_list_and_one_referral_should_be_present_on_ui() throws Throwable {
	    //referralSteps.clickReferralTab();
		 referralSteps.validateReferralList();
	}
	
	@Then("^I click on back button on referral Tab$")
	public void i_click_on_back_button_on_referral_Tab() throws Throwable {
		referralSteps.clickBackBtn();
		referralSteps.verifyReferralHeader();

	}
	
	@When("^I view referral details$")
	public void i_view_referral_details() throws Throwable {
		referralSteps.viewReferral();

	}
	@When("^I validate using inboundXML$")
	public void i_validate_using_inboundXML() throws Throwable {
	    
	   
	}
	@Then("^I validate referral record should be on ui$")
	public void i_validate_referral_record_should_be_on_ui() throws Throwable {
		referralSteps.validateReferral();
		System.out.println("Referral verified");

	}
	@When("^I click on add button for Referral$")
	public void i_click_on_add_button_for_Referral() throws Throwable {
	   
		referralSteps.clickAddButton();
	    
	}

	@When("^I verify field labels$")
	public void i_verify_field_labels() throws Throwable {
	    
		referralSteps.verifyAddPageLabels();
	}

	@When("^I add field values for Referral and submit$")
	public void i_add_field_values_for_Referral_and_submit() throws Throwable {
	    
		referralSteps.addReferral();
	    
	}

	@Then("^I verify navigation to Referral list page$")
	public void i_verify_navigation_to_Referral_list_page() throws Throwable {
	    
	    
	}

	@Then("^I add invalid values and submit$")
	public void i_add_invalid_values_and_submit() throws Throwable {
	    
		referralSteps.addReferralInvalidData();
		
	}

	@Then("^verify error messages displayed on add ReferralUI$")
	public void verify_error_messages_displayed_on_add_ReferralUI() throws Throwable {
	    
		referralSteps.verifyAddPageErrorMessage();
	}

	@When("^I click on edit button for Referral$")
	public void i_click_on_edit_button_for_Referral() throws Throwable {
	    
		referralSteps.clickEditButton();
		
	}

	@When("^I edit field values for Referral and submit$")
	public void i_edit_field_values_for_Referral_and_submit() throws Throwable {
	    
		referralSteps.editReferral();
	    
	}

	@Then("^I edit invalid values and submit$")
	public void i_edit_invalid_values_and_submit() throws Throwable {
	    
		referralSteps.editReferralInvalidData();
		
	}

	@Then("^verify error messages displayed on edit ReferralUI$")
	public void verify_error_messages_displayed_on_edit_ReferralUI() throws Throwable {
	    
		referralSteps.verifyEditPageErrorMessage();
	    
	}
	@Then("^I click on back button on view referral screen$")
	public void i_click_on_back_button_on_view_referral_screen() throws Throwable {
		referralSteps.clickBackBtn();
		referralSteps.verifyReferralHeader();

	}
	@When("^I delete referral details$")
	public void i_delete_referral_details() throws Throwable {
		
	
	}

	@Then("^I validate referral record should be delete on ui$")
	public void i_validate_referral_record_should_be_delete_on_ui() throws Throwable {
		
	}

}

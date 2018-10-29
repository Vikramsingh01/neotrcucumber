package com.meganexus.stepDefs;

import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.stepsLib.AccessbilitySteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("unused")
public class AccessibilityStepDefs {
	@Steps
	AccessbilitySteps accessibiltySteps;

	@Given("^I navigate to Accessibility page$")
	public void i_navigate_to_Accessibility_page() throws Throwable {
		accessibiltySteps.accessibilityLink();
	}

	@When("^I click on add Accessibility button$")
	public void i_click_on_add_Accessibility_button() throws Throwable {
		accessibiltySteps.addAccessibilityBtn();
	}

	@When("^I insert required data for Accessibility record$")
	public void i_insert_required_data_for_Accessibility_record() throws Throwable {
		accessibiltySteps.insertRecordAccessibility();
		
	}

	@Then("^I validate list view of Accessibility records$")
	public void i_validate_list_view_of_Accessibility_records() throws Throwable {

	}

	@Then("^I validate inserted accessibility record with inbound xml$")
	public void i_validate_inserted_accessibility_record_with_inbound_xml() throws Throwable {

	}

	@Then("^I validate inserted accessibility record with outbound xml$")
	public void i_validate_inserted_accessibility_record_with_outbound_xml() throws Throwable {
		accessibiltySteps.verifyInsertedRecord();
	}

	@When("^I clicked on view Accessibility button$")
	public void i_click_on_view_Accessibility_button() throws Throwable {
		accessibiltySteps.navigateToAccessibiltyViewPage();
	}

	@Then("^I validate to view record information$")
	public void i_validate_to_view_record_information() throws Throwable {

	}

	@Then("^I validate navigate back to privious page$")
	public void i_validate_navigate_back_to_privious_page() throws Throwable {

	}

	@When("^I click on edit Accessibility button$")
	public void i_click_on_edit_Accessibility_button() throws Throwable {
		accessibiltySteps.editAccessibilityBtn();
	}

	@When("^I edit information for Accessibility record$")
	public void i_edit_information_for_Accessibility_record() throws Throwable {
		accessibiltySteps.updateAccessibilty();
	}

	@Then("^I validate list view of Accessibility$")
	public void i_validate_list_view_of_Accessibility() throws Throwable {
		accessibiltySteps.verifyListViewNetwork();
	}
	
	
	@When("^I delete Accessibility details with Inactive Provision Record$")
	public void i_delete_Accessibility_details_with_Inactive_Provision_Record() throws Throwable {
		 System.out.println("I am deleting Accessibility details");
		 accessibiltySteps.deleteAccessibilityWithProvision();
	}


	@When("^I verify whether Accessibility Record is deleted from accessibilityList$")
	public void i_verify_whether_Accessibility_Record_is_deleted_from_accessibilityList() throws Throwable {
		 System.out.println("I am verifying deleted Accessibility record");
		 accessibiltySteps.validateDeletedAccessibilityRecord();
	  
	}
	
	

	@Then("^I validate AccessibilityDEL outboundXML$")
	public void i_validate_AccessibilityDEL_outboundXML() throws Throwable {
		System.out.println("I am verifying Accessibility with DEL outboundXML values");
		accessibiltySteps.validateAccessibilityWithDELoutbound();
	   
	}


}
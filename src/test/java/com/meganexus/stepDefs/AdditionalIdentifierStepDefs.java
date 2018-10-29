
package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AdditionalIdentifierSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AdditionalIdentifierStepDefs {
	@Steps
	AdditionalIdentifierSteps adnlIden;
	
	
	@When("^I expand Additional Identifier$")
	public void i_expand_Additional_Identifier() throws Throwable {
		adnlIden.ExpandableAdditionalIdentifier();
		adnlIden.Search();
	}

	@Then("^I validate Additional Identifier list and one Additional Identifier Record should be present on ui$")
	public void i_validate_Additional_Identifier_list_and_one_Additional_Identifier_Record_should_be_present_on_ui() throws Throwable {
		//adnlIden.clickOnViewbutton();
		adnlIden.listAdditionalIdentifierDetails();
	}
	@When("^I clicked on add button for Additional Identifier$")
	public void i_clicked_on_add_button_for_Additional_Identifier() throws Throwable {
		adnlIden.clickonAddButton();
	}

	@When("^I insert field value for Additional Identifier$")
	public void i_insert_field_value_for_Additional_Identifier() throws Throwable {
		adnlIden.addaditionalIdentifier();
	}

	@Then("^I validate insert record for Add Additional Identifier Page$")
	public void i_validate_insert_record_for_Add_Additional_Identifier_Page() throws Throwable {
		adnlIden.validateinsertedrecord();
	}
	@Then("^I validate insert record for Add Additional Identifier Page with outboundXML$")
	public void i_validate_insert_record_for_Add_Additional_Identifier_Page_with_outboundXML() throws Throwable {
	   adnlIden.verifyAddedRecord();
	}
	
	@When("^I clicked on View button for Additional Identifier\\.$")
	public void i_clicked_on_View_button_for_Additional_Identifier() throws Throwable {
	   adnlIden.clickOnViewBtn();
	}

	@Then("^I validate View AdditionalIdentifier Page For Inbound xml$")
	public void i_validate_View_AdditionalIdentifier_Page_For_Inbound_xml() throws Throwable {
		adnlIden.AIviewVarification();
		//adnlIden.AIDetailsVarification();
		
	}

	@Then("^I vaildate back button is working for AdditionalIdentifier$")
	public void i_vaildate_back_button_is_working_for_AdditionalIdentifier() throws Throwable {
	    
	}
	
	@When("^I delete AdditionalIdentifier details$")
	public void i_delete_AdditionalIdentifier_details() throws Throwable {
		System.out.println("I am deleting Additional Identifier details");
		adnlIden.deleteAdditionalIdentifier();
	}
	
	@Given("^I verify whether additionalIdentifierRecord is deleted from AdditionalIdentifierList$")
	public void i_verify_whether_additionalIdentifierRecord_is_deleted_from_AdditionalIdentifierList() throws Throwable {
		System.out.println("I am verifying deleted additional Identifier record");
		adnlIden.validateDeletedAdditionalIdentifierRecord();
	}

	@Then("^I validate AdditionalIdentifierDEL outboundXML$")
	public void i_validate_AdditionalIdentifierDEL_outboundXML() throws Throwable {
		System.out.println("I am verifying Additional Identifier with DEL outboundXML values");
		adnlIden.validateAdditionalIdentifierWithDELoutbound();
	    
	}
	






	
	
	
	
	
}

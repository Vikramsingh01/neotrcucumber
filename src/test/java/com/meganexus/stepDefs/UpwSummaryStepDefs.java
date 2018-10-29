package com.meganexus.stepDefs;

import com.meganexus.stepsLib.PlanSteps;
import com.meganexus.stepsLib.UpwSummarySteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class UpwSummaryStepDefs {
	@Steps
	UpwSummarySteps UPWSummary;
	PlanSteps plan;
	
	
	@Given("^I navigate to Plan tab$")
	public void i_navigate_to_Plan_tab() throws Throwable {
		plan.clickPlanTab();
	}

	@Given("^I navigate to UPW tab$")
	public void i_navigate_to_UPW_tab() throws Throwable {
	    UPWSummary.clickUPWTab();
	}

	@When("^I validate the labels of UPW Summary$")
	public void i_validate_the_labels_of_UPW_Summary() throws Throwable {
	UPWSummary.validateSummaryLabels();
	}
	
	@Then("^I validate list of UPW Details$")
	public void i_validate_list_of_UPW_Details() throws Throwable {
		UPWSummary.verifyUPWDetailsList();
	}
	
	@Then("^I validate the value present with inbound xml$")
	public void i_validate_the_value_present_with_inbound_xml() throws Throwable {
	    UPWSummary.verifyUpwSummaryInboundxml();
	    
	}

	@When("^I click edit UPW Summary button$")
	public void i_click_edit_UPW_Summary_button() throws Throwable {
	  UPWSummary.clickEditUPWSummaryButton();
	}

	@When("^I validate labels on Edit UPW Summary Page$")
	public void i_validate_labels_on_Edit_UPW_Summary_Page() throws Throwable {
	   UPWSummary.validateEditUPWSummaryPageLabels();
	}

	@When("^I edit details of UPW Summary Page$")
	public void i_edit_details_of_UPW_Summary_Page() throws Throwable {
	    UPWSummary.enterValueEditUPWSummaryPage();
	}
	@When("^I click on Submit button$")
	public void i_click_on_Submit_button() throws Throwable {
		UPWSummary.clickOnSubmitButton();
	}

	@When("^I click on View button for last edited UPW Summary$")
	public void i_click_on_View_button_for_last_edited_UPW_Summary() throws Throwable {
	    UPWSummary.clickViewUPWSummary();
	}

	@When("^I validate the edited record on UI with OUTBOUND XML of UPW details$")
	public void i_validate_the_edited_record_on_UI_with_OUTBOUND_XML_of_UPW_details() throws Throwable {
	    UPWSummary.validateUPWDetailRecord();
	}

	@When("^I validate the OUTBOUND XML of UPW details$")
	public void i_validate_the_OUTBOUND_XML_of_UPW_details() throws Throwable {
	    
	}
	
//========For Add Recurring Appointment==========================
	@When("^I click on Add Recurring button$")
	public void i_click_on_Add_Recurring_button() throws Throwable {
		UPWSummary.clickViewUPWSummary();
		UPWSummary.clickAddRecurringButton();
	}

	@Then("^I click on View button for last added Appointment$")
	public void i_click_on_View_button_for_last_added_Appointment() throws Throwable {
	  
	}

	
//==================== ADD Single Recurring Appointment============
	@When("^I click on view UPW Summary$")
	public void i_click_on_view_UPW_Summary() throws Throwable {
		UPWSummary.clickViewUPWSummary();
	}
	
	@When("^I click on Add Single button$")
	public void i_click_on_Add_Single_button() throws Throwable {
		UPWSummary.clickAddSingleButton();
	}
	
	//@Given("^I click on View button for last added Single Recurring Appointment$")
	//public void i_click_on_View_button_for_last_added_Single_Recurring_Appointment() throws Throwable {
	   
	//}
	
	//============ List of UPW Appointment============
	
	@When("^I verify the UPW Appointment filters$")
	public void i_verify_the_UPW_Appointment_filters() throws Throwable {
		UPWSummary.clickViewUPWSummary();
		UPWSummary.ValidateUPWAppointmentFilter();
	}

	@Then("^I verify the UPW Appointment columns$")
	public void i_verify_the_UPW_Appointment_columns() throws Throwable {
	   UPWSummary.UPWAppointmentListTable();
	}

	@Then("^I click On search button$")
	public void i_click_On_search_button() throws Throwable {
		UPWSummary.clickOnAppointmenFilterSearch();
	}

	@Then("^I verify the UPW Appointment with inbound XML$")
	public void i_verify_the_UPW_Appointment_with_inbound_XML() throws Throwable {
		UPWSummary.verifyUpwAppointmentInboundXML();
	}
	
	//========Edit UPW Appointment ======================for Sprint 18=====
	@When("^I click on Edit button$")
	public void i_click_on_Edit_button() throws Throwable {
	   
	}

	@Then("^I validate the labels of Edit UPW Appointment Page$")
	public void i_validate_the_labels_of_Edit_UPW_Appointment_Page() throws Throwable {
	    
	}

	@Then("^I edit details of UPW Appointment Page$")
	public void i_edit_details_of_UPW_Appointment_Page() throws Throwable {
	   
	}

	@Then("^I click on View button for last updated Appointment$")
	public void i_click_on_View_button_for_last_updated_Appointment() throws Throwable {
	   
	}

	@Then("^I validate the edited record on UI$")
	public void i_validate_the_edited_record_on_UI() throws Throwable {
	   
	}

	@Then("^I validate the OUTBOUND XML of Edit UPW Appointment$")
	public void i_validate_the_OUTBOUND_XML_of_Edit_UPW_Appointment() throws Throwable {
	   
	}
	
	
	//============ View UPW Details============

	@When("^I click on View UPW Summary button$")
	public void i_click_on_View_UPW_Summary_button() throws Throwable {
		UPWSummary.clickViewUPWSummary();
	}
	@When("^I validate labels on View UPW Summary Page$")
	public void i_validate_labels_on_View_UPW_Summary_Page() throws Throwable {
		UPWSummary.validateLabelsOnViewUPWDetails();
	}
	@When("^I validate details with Inbound XMLs$")
	public void i_validate_details_with_Inbound_XMLs() throws Throwable {
	 UPWSummary.validateUpwDetailsWithInboundXMLs();
	}
	
}

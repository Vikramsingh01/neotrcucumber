package com.meganexus.stepDefs;


import com.meganexus.stepsLib.PlanSteps;
import com.meganexus.stepsLib.UpwAppointmentSteps;
import com.meganexus.stepsLib.UpwSummarySteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class UpwAppointmentStepDefs {
	@Steps
	UpwSummarySteps UPWSummary;
	PlanSteps plan;
	UpwAppointmentSteps UPWAppSteps;
	
	//==================== ADD Single Appointment============
	@Given("^I validate the labels of Add Single Schedule UPW Appointment Page$")
	public void i_validate_the_labels_of_Add_Single_Schedule_UPW_Appointment_Page() throws Throwable {
		UPWAppSteps.validateADDSingleAppointmentPage();
		
	}
	
	@Given("^I add details of Add Single Schedule UPW Appointment Page for Attended Complied outcome$")
	public void i_add_details_of_Add_Single_Schedule_UPW_Appointment_Page_for_Attended_Complied_outcome() throws Throwable {
		UPWAppSteps.valuesADDSingleAppointmentPage();
	}
	
	@Given("^I click on Add Single Save button$")
	public void i_click_on_Add_Single_Save_button() throws Throwable {
		UPWAppSteps.clickonsubmitbutton();
	}
	
	@Given("^I validate the appointment record on UI$")
	public void i_validate_the_appointment_record_on_UI() throws Throwable {
	   
	}
	//@Given("^I validate the OUTBOUND XML of ADD Single UPW Appointment$")
	//public void i_validate_the_OUTBOUND_XML_of_ADD_Single_UPW_Appointment() throws Throwable {
	    
	//}
	
	@Then("^I validate the labels of Schedule Recurring UPW Appointment Page$")
	public void i_validate_the_labels_of_Schedule_Recurring_UPW_Appointment_Page() throws Throwable {
		UPWAppSteps.validateAddRecurringAppointmentLabels();
	}
	
	@Then("^I add details of Schedule Recurring UPW Appointment Page$")
	public void i_add_details_of_Schedule_Recurring_UPW_Appointment_Page() throws Throwable {
		UPWAppSteps.CreateADDRecurringAppointment();
	}

	@Then("^I click on Add Button$")
	public void i_click_on_Add_Button() throws Throwable {
	    UPWSummary.clickAddButton();
	}
	
	@Then("^I validate the record on UI$")
	public void i_validate_the_record_on_UI() throws Throwable {
	
	}

	//@Then("^I validate the OUTBOUND XML of UPW Appointment$")
	//public void i_validate_the_OUTBOUND_XML_of_UPW_Appointment() throws Throwable {
	   
	//}

}

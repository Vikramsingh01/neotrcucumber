package com.meganexus.stepDefs;

import com.meganexus.stepsLib.UPWProjectDiarySteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPWProjectDiaryStepDefs 
{
	UPWProjectDiarySteps projectDiaryStep;
	
	@When("^I click on UPW Prject Diary collapsible link$")
	public void i_click_on_UPW_Prject_Diary_collapsible_link() throws Throwable {
		projectDiaryStep.validateProjectDiaryLink();
	}
	@When("^I validate the labels of UPW Prject Diary$")
	public void i_validate_the_labels_of_UPW_Prject_Diary() throws Throwable {
		projectDiaryStep.validateLabelUPWprojectDiary();
	 
	}

	@Then("^I validate the Search filter and search the appointment list$")
	public void i_validate_the_Search_filter_and_search_the_appointment_list() throws Throwable {
		projectDiaryStep.validateSearchFilter();
	}

	@Then("^I validate list of UPW Appointments$")
	public void i_validate_list_of_UPW_Appointments() throws Throwable {
		projectDiaryStep.validateListOfAppointment();
	}
	   
	@When("^I navigate to project diary page$")
	public void i_navigate_to_project_diary_page() throws Throwable {
		projectDiaryStep.validateProjectDiaryLink();
	}
	
//	@Then("^I select one appointment and click on View button$")
//	public void i_select_one_appointment_and_click_on_View_button() throws Throwable {
//		projectDiaryStep.clickOnViewAppoinmentList();
//	}

	@When("^I validate labels on Project Attendance list Page$")
	public void i_validate_labels_on_Project_Attendance_list_Page() throws Throwable {
		projectDiaryStep.validateSearchFilter();
	}

	@When("^I validate Project Attendance list$")
	public void i_validate_Project_Attendance_list() throws Throwable {
	   
	}
	@Then("^I select one appointment and click on Edit button$")
	public void i_select_one_appointment_and_click_on_Edit_button() throws Throwable {
	  
	}

	@Then("^I validate the labels on UPW Project Session Outcome page$")
	public void i_validate_the_labels_on_UPW_Project_Session_Outcome_page() throws Throwable {
	   
	}

	@Then("^I update the details and click on Bulk Update button$")
	public void i_update_the_details_and_click_on_Bulk_Update_button() throws Throwable {
	   
	}
	

}

package com.meganexus.stepDefs;

import com.meganexus.stepsLib.EventSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")
public class EventStepDefs {
	@Steps
	EventSteps event;
	@When("^I clicked on event tab and view the event details, if event is availavble on UI$")
	public void i_click_on_event_view_tab() throws Throwable {
		System.out.println("event page");
		event.clickOnEvent();
	}

	@Then("^I should view the event details$")
	public void i_should_view_the_event_details() throws Throwable {
		System.out.println("validate event details");
		event.eventReview();
	}
	//IC 122 and IC-124
	@Given("^I navigate to view List of Events table$")
	public void i_navigate_to_view_List_of_Events_table() throws Throwable {
		event.clickOnEvent();
	}

	@When("^I view Event details page$")
	public void i_view_Event_details_page() throws Throwable {
	   event.viewEventDetailsPage();
	  
	}

	@Then("^I validate Event details$")
	public void i_validate_Event_details() throws Throwable {
	  event.validateEventDetails();
	}
	
	@And("^I validate Back navigation")
	public void i_validate_back_navigation() throws Throwable {
		event.backNavigation();
	}
	
	@When("^I view List of Requirements page$")
	public void i_view_List_of_Requirements_page() throws Throwable {
		event.clickOnEvent();
		event.viewEventDetailsPage();
		event.clickOnReq();
	}

	@Then("^I validate List of Requirements$")
	public void i_validate_List_of_Requirements() throws Throwable {
	  event.reqListTable();
	  
	}	
}

package com.meganexus.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderManagerStepDefs {

	
	@When("^I view OrderManager to corresponding event$")
	public void i_view_OrderManager_to_corresponding_event() throws Throwable {
		
	   System.out.println("I am Viewing the Order Manager details");
	}

	@Then("^I validate OrderManager record should be on ui$")
	public void i_validate_OrderManager_record_should_be_on_ui() throws Throwable {
		
		System.out.println("I am Validating record on the Order Manager");
	}

	@Then("^I click back button on OrderManager screen$")
	public void i_click_back_button_on_OrderManager_screen() throws Throwable {
		
		System.out.println("I am validating the navigation");
	}
	
	
}

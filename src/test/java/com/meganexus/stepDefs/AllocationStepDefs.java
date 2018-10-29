package com.meganexus.stepDefs;



import com.meganexus.stepsLib.AllocationSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AllocationStepDefs {

	@Steps
	
	AllocationSteps allocationSteps;
	
	@When("^I navigate to Allocation tab on Components to Allocate page$")
	public void i_navigate_to_Allocation_tab_on_Components_to_Allocate_page() throws Throwable {
	    
		allocationSteps.navigateToAllocationPage();
	}

	@When("^I verify Address Registration and Component section$")
	public void i_verify_Address_Registration_and_Component_section() throws Throwable {
		allocationSteps.verifyAddressandRegistrationDetails();
	}

	@Then("^I navigate to Componet Allocation page$")
	public void i_navigate_to_Componet_Allocation_page() throws Throwable {
		allocationSteps.navigateToComponentAllocationPage();
	}

	@Then("^I Accept Component$")
	public void i_Accept_Component() throws Throwable {
		allocationSteps.acceptComponents();
	
	}
	
	@Then("^I Reject Component$")
	public void i_Reject_Component() throws Throwable {
		
		allocationSteps.rejectComponents();
	}
}

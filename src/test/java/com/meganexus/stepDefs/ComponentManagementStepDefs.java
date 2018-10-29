package com.meganexus.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.meganexus.stepsLib.ComponentManagementSteps;
public class ComponentManagementStepDefs {
	
@Steps
	
ComponentManagementSteps ComponentManagementSteps;


@When("^I navigate to Component Management page$")
public void i_navigate_to_Component_Management_page() throws Throwable {
	ComponentManagementSteps.navigateToComponentManagement();
}

@When("^I verify field list of Component Management$")
public void i_verify_field_list_of_Component_Management() throws Throwable {
	ComponentManagementSteps.verifyFieldsListView();
}

@Then("^I want verify to Reallocate components$")
public void i_want_verify_to_Reallocate_components() throws Throwable {
	ComponentManagementSteps.reAllocateComponents();
}
}

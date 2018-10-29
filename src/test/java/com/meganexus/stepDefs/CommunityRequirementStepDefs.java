package com.meganexus.stepDefs;

import com.meganexus.stepsLib.AliasSteps;
import com.meganexus.stepsLib.CommReqtManagerSteps;
import com.meganexus.stepsLib.CommunityRequirementSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CommunityRequirementStepDefs {
	CommunityRequirementSteps CommReqStep;
	
	@Steps
	CommReqtManagerSteps commrqmntmngr;	
	@When("^I view Community Requirement page$")
	public void i_view_Community_Requirement_page() throws Throwable {
		CommReqStep.viewCommunityRequirement();
	}

	@Then("^I validate Community Requirement details$")
	public void i_validate_Community_Requirement_details() throws Throwable {
		CommReqStep.verifyCommunityRequirement();
	}

	@Then("^I validate Back for Community Requirement page$")
	public void i_validate_Back_for_Community_Requirement_page() throws Throwable {
	   System.out.println("Community Requirement validated successfully");
	}
	 
	@When("^I view Terminate Requirement page$")
	public void i_view_Terminate_Requirement_page() throws Throwable {
	    System.out.println("User is able to view Terminate structure for Community Requirement ");
	}

	@Then("^I terminate Community Requirement details$")
	public void i_terminate_Community_Requirement_details() throws Throwable {
		CommReqStep.terminateCommunityRequirement();
	}

	@Then("^I validate Termination of Community Requirement$")
	public void i_validate_Termination_of_Community_Requirement() throws Throwable {
		 System.out.println("Community Requirement Terminaed successfully");
	}
	
	@When("^I view Terminate Event$")
	public void i_view_Terminate_Event() throws Throwable {
		 System.out.println("User is able to view Terminate structure for Event");
	}

	@Then("^I terminate Event$")
	public void i_terminate_Event() throws Throwable {
		CommReqStep.terminateEvent();
	}

	@Then("^I validate Termination of Event$")
	public void i_validate_Termination_of_Event() throws Throwable {
		 System.out.println("Event Terminaed successfully ");
	}
	

	
}

package com.meganexus.stepDefs;

import com.meganexus.stepsLib.ProtectedCharacteristicsSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProtectedCharacteristicsStepDefs 
{
	
	@Steps
	ProtectedCharacteristicsSteps protectedCharacteristicsSteps;
	
	@Given("^I navigate to Protected Characteristics Tab$")
	public void i_navigate_to_Protected_Characteristics_Tab() throws Throwable {
		System.out.println("I am clicking on Protected characteristics tab");
	    protectedCharacteristicsSteps.clickProtectedCharacteristicsTab();
	}

	@Then("^I validate protectedCharacteristicsStructure values with the inboundXML$")
	public void i_validate_protectedCharacteristicsStructure_values_with_the_inboundXML() throws Throwable {
		System.out.println("I am validating Protected characteristics Details");
		protectedCharacteristicsSteps.verifyProtectedCharacteristicsDetails();
	    protectedCharacteristicsSteps.validateProtectedCharacteristicsWithInbound();
	}

	@Then("^I click on back button on Protected Characteristics Tab$")
	public void i_click_on_back_button_on_Protected_Characteristics_Tab() throws Throwable {
		System.out.println("I am clicking on back button from  Protected characteristics tab");
	    protectedCharacteristicsSteps.clickBackButton();
	}

	@When("^I add protectedCharacteristicsStructure to corresponding offender$")
	public void i_add_protectedCharacteristicsStructure_to_corresponding_offender() throws Throwable {
		System.out.println("I am adding Protected characteristics details");
	    protectedCharacteristicsSteps.addNewProtectedCharacteristics();
	}

	@Then("^I validate newly added protectedCharacteristics should be on ui$")
	public void i_validate_newly_added_protectedCharacteristics_should_be_on_ui() throws Throwable {
		System.out.println("I am validating newly addded Protected characteristics Details");
	    protectedCharacteristicsSteps.validateCreatedProtectedCharacteristics();
	}

	@Then("^I validate protectedCharacteristicsINS outboundXML$")
	public void i_validate_protectedCharacteristicsINS_outboundXML() throws Throwable {
		System.out.println("I am validating inserted Protected characteristics with outboundXML");
	    protectedCharacteristicsSteps.validateProtectedCharacteristicsWithINSoutbound();
	}

	@When("^I edit protectedCharacteristicsStructure to corresponding offender$")
	public void i_edit_protectedCharacteristicsStructure_to_corresponding_offender() throws Throwable {
		System.out.println("I am editing Protected characteristics details");
	    protectedCharacteristicsSteps.editProtectedCharacteristics();
	}

	@Then("^I validate newly edited protectedCharacteristics should be on ui$")
	public void i_validate_newly_edited_protectedCharacteristics_should_be_on_ui() throws Throwable {
		System.out.println("I am clicking on Protected characteristics tab");
	    protectedCharacteristicsSteps.validateEditedProtectedCharacteristics();
	}

	@Then("^I validate protectedCharacteristicsUPD outboundXML$")
	public void i_validate_protectedCharacteristicsUPD_outboundXML() throws Throwable {
		System.out.println("I am validating edited Protected characteristics with outboundXML");
	    protectedCharacteristicsSteps.validateProtectedCharacteristicsWithUPDoutbound();
	}

}

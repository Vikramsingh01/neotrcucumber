package com.meganexus.stepDefs;

import com.meganexus.genericLib.ReadXMLData;
import com.meganexus.stepsLib.CaseManagerSteps;
import com.meganexus.stepsLib.PendingTransferSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class CaseManagerStepDefs {
	
	@Steps
	CaseManagerSteps caseManager;
	
	@When("^I view Case Manager page$")
	public void i_view_Case_Manager_page() throws Throwable {
		caseManager.navigateToCaseManagerPage();
		caseManager.VerifyCaseManagerfields();
	}

	@Then("^I validate Current Case Manager details$")
	public void i_validate_Current_Case_Manager_details() throws Throwable {
		String username = ReadXMLData.getXMLData("TestData.xml", "//login", "./username");
		caseManager.VerifyCaseManagerfieldValues(username);
	}

	@Then("^I validate Case Manager History details$")
	public void i_validate_Case_Manager_History_details() throws Throwable {
		String username = ReadXMLData.getXMLData("TestData.xml", "//login", "./username");
		caseManager.VerifyCaseManagerHistoryfieldValues(username);
	}
	
	@Then("^I validate Back for Case Manager$")
	public void i_validate_Back_for_Case_Manager() throws Throwable {
	   
	}
	
	

}

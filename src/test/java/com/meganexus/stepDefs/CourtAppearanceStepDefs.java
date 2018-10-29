package com.meganexus.stepDefs;

import com.meganexus.stepsLib.CommReqtManagerSteps;
import com.meganexus.stepsLib.CourtAppearanceSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CourtAppearanceStepDefs {
	CourtAppearanceSteps CourtStep;
	
	@Steps
	CommReqtManagerSteps commrqmntmngr;	
	@When("^I view Court Appearance page$")
	public void i_view_Court_Appearance_page() throws Throwable {
	    CourtStep.viewCourtAppearance();
	}

	@Then("^I validate list view of Court Appearances$")
	public void i_validate_list_view_of_Court_Appearances() throws Throwable {
	   CourtStep.verifyCourtAppearanceListView();
	}

	@Then("^I validate detailed view of individual Court Appearance$")
	public void i_validate_detailed_view_of_individual_Court_Appearance() throws Throwable {
	    CourtStep.verifyCourtAppearanceDetail();
	}



	
}

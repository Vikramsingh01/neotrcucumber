package com.meganexus.stepDefs;

import com.meganexus.stepsLib.OffenderDetailStep;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OffenderDetailsStepDefs 
{
	@Steps
	OffenderDetailStep offenderDetail;
	@Then("^I Validate fields in Service User profile Page with reference to xml\\.$")
	public void i_Validate_fields_in_Service_User_profile_Page_with_reference_to_xml() throws Throwable {
		offenderDetail.offenderDetailsReview();
	}

	@Then("^I able to Edit offender details click on edit button\\.$")
	public void i_able_to_Edit_offender_details_click_on_edit_button() throws Throwable {
	    
	}
}

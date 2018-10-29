package com.meganexus.stepDefs;

	import com.meganexus.stepsLib.PSSContactSteps;
	import com.meganexus.stepsLib.LoginSteps;

	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import net.thucydides.core.annotations.Steps;
	@SuppressWarnings("serial")

	public class PSSContactStepsDefs {
		PSSContactSteps pssContact;
		
	@Then("^I validate pssContact list on ui$")
	public void i_validate_pssContact_list_on_ui() throws Throwable {
	    pssContact.validatePSSContactList();
	}

	@When("^I view pssContact to corresponding offender$")
	public void i_view_pssContact_to_corresponding_offender() throws Throwable {
	    pssContact.viewPSSContact();
	}

	@Then("^I validate pssContact record details on ui with Inbound XML$")
	public void i_validate_pssContact_record_details_on_ui_with_Inbound_XML() throws Throwable {
		pssContact.validatePSSRecordOnUI();
	}
	
	@Then("^I click on back button on view pssContact screen$")
	public void i_click_on_back_button_on_view_pssContact_screen() throws Throwable {
		pssContact.validateBackButton();
		
	}


}

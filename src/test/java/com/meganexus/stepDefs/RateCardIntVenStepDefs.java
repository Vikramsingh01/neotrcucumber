package com.meganexus.stepDefs;

import com.meganexus.stepsLib.RateCardInterVentionSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class RateCardIntVenStepDefs {
	@Steps
	RateCardInterVentionSteps rateCardIntv;
	
	@Then("^I validate rateCardList and one rateCardRecord should be present on ui$")
	public void i_validate_rateCardList_and_one_rateCardRecord_should_be_present_on_ui() throws Throwable {
		rateCardIntv.viewRateCardList();
		System.out.println("I am verifying the rate card table");
	}

	@When("^I view ratecard details to corresponding offender$")
	public void i_view_ratecard_details_to_corresponding_offender() throws Throwable {
		rateCardIntv.viewRateCardIntervention();
		System.out.println("I am verifying the rate card details");
	    throw new PendingException();
	}

	@Then("^I validate ratecard structure values with the inboundXML$")
	public void i_validate_ratecard_structure_values_with_the_inboundXML() throws Throwable {
		System.out.println("Verifying the rate card values with the inboundXMLs");
	    throw new PendingException();
	}

	@Then("^I click on back button on view rate card screen$")
	public void i_click_on_back_button_on_view_rate_card_screen() throws Throwable {
		System.out.println("Verifying the rate card back navigation");
	    throw new PendingException();
	}

	@When("^I update rate card structure on UI$")
	public void i_update_rate_card_structure_on_UI() throws Throwable {
		System.out.println("Verifying the rate card update");
	    throw new PendingException();
	}

	@Then("^I validate rateCardRecord with updated data should be on ui$")
	public void i_validate_rateCardRecord_with_updated_data_should_be_on_ui() throws Throwable {
		System.out.println("Verifying the rate card record with updated data on UI");
	    throw new PendingException();
	}

	@Then("^I validate rateCardUPD outboundXML$")
	public void i_validate_rateCardUPD_outboundXML() throws Throwable {
		System.out.println("Verifying the rate card UPD_outboundXML");
	    throw new PendingException();
	}

	@When("^I delete rateCardRecord from UI$")
	public void i_delete_rateCardRecord_from_UI() throws Throwable {
		System.out.println("I am verifying the delete rate card");
	    throw new PendingException();
	}

	@Then("^I verify whether rateCardRecord is deleted from rate card list$")
	public void i_verify_whether_rateCardRecord_is_deleted_from_rate_card_list() throws Throwable {
		System.out.println("Verifying the rate card record is deleted from UI");
	    throw new PendingException();
	}

	@Then("^I validate rateCard DEL outbound xml$")
	public void i_validate_rateCard_DEL_outbound_xml() throws Throwable {
		System.out.println("I am verifying the rate card DEL outbound xml");
	    throw new PendingException();
	}

	@When("^I add ratecard to corresponding offender$")
	public void i_add_ratecard_to_corresponding_offender() throws Throwable {
		System.out.println("I am verifying the add rate card to corresponding offender");
	    throw new PendingException();
	}

	@Then("^I validate newly added ratecardRecord should be on ui$")
	public void i_validate_newly_added_ratecardRecord_should_be_on_ui() throws Throwable {
		System.out.println("I am verifying the newly added ratecardRecord should be on ui");
	    throw new PendingException();
	}

	@Then("^I validate ratecardINS outbound xml$")
	public void i_validate_ratecardINS_outbound_xml() throws Throwable {
		System.out.println("I am verifying ratecardINS outbound xml");
	    throw new PendingException();
	}

	@When("^I view add Rate card screen$")
	public void i_view_add_Rate_card_screen() throws Throwable {
		System.out.println("I am verifying view add Rate card screen");
	    throw new PendingException();
	}

	@When("^I view edit Rate card screen$")
	public void i_view_edit_Rate_card_screen() throws Throwable {
		System.out.println("I am verifying view edit Rate card screen");
	    throw new PendingException();
	}
	   
}

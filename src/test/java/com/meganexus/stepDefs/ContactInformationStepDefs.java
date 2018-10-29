/**
 * 
 */
package com.meganexus.stepDefs;

import com.meganexus.stepsLib.ContactInformationSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author Vikram.Singh
 *
 */
public class ContactInformationStepDefs {

	@Steps
	ContactInformationSteps contact;

	@Then("^I validate Details view for Contact Information with Inbound XML$")
	public void i_validate_Contact_Information_record_should_be_on_ui() throws Throwable {
		contact.verifyDetailsViewContactInformationWithIB_XML();
	}

	@Then("^I click on back button on view Contact Information page$")
	public void i_click_on_back_button_on_view_Contact_Information_page() throws Throwable {
		contact.verifyBackBtnForContactInformationPage();
	}

	@When("^I clicked on edit button for Contact Information$")
	public void i_clicked_on_edit_button_for_Contact_Information() throws Throwable {
		contact.editBtnForContactInformation();
	}

	@Then("^I inserted invalid values for contact information$")
	public void i_insert_invalid_values() throws Throwable {
		contact.enterInvalidValueInContactInformationAndVerifyErrorMesg();
	}

	@Then("^verify field labels and error messages displayed on edit Contact Information UI$")
	public void verify_field_labels_and_error_messages_displayed_on_edit_Contact_Information_UI() throws Throwable {

	}

	@When("^I update field values for Contact Information$")
	public void i_update_field_valuess_for_Contact_Information() throws Throwable {
		contact.enterValidValueForUpdateContactInformation();
	}

	@Then("^I validate updated values in View Contact Information Page$")
	public void i_validate_updated_values_in_View_Contact_Information_Page() throws Throwable {
		contact.validateUpdatedValuesInContactInformationPage();
		
		
	}

	@When("^I click on Add button for Contact Information$")
	public void i_click_on_add_button_for_Contact_Information() throws Throwable {
		contact.clickOnAddBtnForContactInformation();
	}

	@When("^I inserted field values for Contact Information$")
	public void i_inserted_field_values_for_contact_information() throws Throwable {
		contact.enterValuesForAddContactInformation();
	}

	@Then("^I validate inserted values in View Contact Information Page with Outbound XML$")
	public void i_validate_inserted_values_in_View_Contact_Information_Page_with_Outbound_XML() throws Throwable {

	}

}

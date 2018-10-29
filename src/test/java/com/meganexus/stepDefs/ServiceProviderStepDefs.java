package com.meganexus.stepDefs;

import com.meganexus.stepsLib.ServiceProviderSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ServiceProviderStepDefs {
	@Steps
	ServiceProviderSteps srvPrvdr;
	
	 @Given("^I click on Directory of Services Maintenance tab$")
	public void i_click_on_Directory_of_Services_Maintenance_tab() throws Throwable {
		srvPrvdr.clickOnDosTab();
	
	}

	@When("^I click on Add button on Service Provider Page\\.$")
	public void i_click_on_Add_button_on_Service_Provider_Page() throws Throwable {
	    srvPrvdr.clickOnAddServiceProviderBtn();
	  
	}
	
	@When("^I try to add a Service Provider Structure to Service Providers Page by providing invalid data$")
	public void i_try_to_add_a_Service_Provider_Structure_to_Service_Providers_Page_by_providing_invalid_data() throws Throwable {
		srvPrvdr.addInvalidServiceProviderDetails();
	}

 @Then("^I verify Error Messages displayed on Add ui$")
	public void i_verify_Error_Messages_displayed_on_ui() throws Throwable {
	    srvPrvdr.validateErrorMessages();
	}

 @Then("^I click on Cancel button$")
  public void i_click_on_Cancel_button() throws Throwable {
    srvPrvdr.clickCancelButton();
  }

	@When("^I validate all fields labels on add service provider page\\.$")
	public void i_validate_all_fields_labels_on_add_service_provider_page() throws Throwable {
	    srvPrvdr.addPageLabelVerification();
	}

	@Then("^I add a Service Provider Structure by providing valid data$")
	public void i_add_a_Service_Provider_Structure_by_providing_valid_data() throws Throwable {
	   srvPrvdr.addServiceProvider();
	
	}

	@Then("^I validate Service provider details displayed on ui$")
	public void i_validate_Service_provider_details_displayed_on_ui() throws Throwable {
		srvPrvdr.viewAddedServiceProvider();
	}
	@Then("^I click on back button on List of Service Provider screen$")
	public void i_click_on_back_button_on_view_service_provider_screen() throws Throwable {
		srvPrvdr.clickBackButton();
	}
	
	
	@When("^I search a service provider by name$")
	public void i_search_a_service_provider_by_name() throws Throwable {
	 srvPrvdr.searchServiceProvider();
	 srvPrvdr.clickOnEditServiceProviderBtn();
	
	}

	@When("^I try to edit a Service Provider Structure by providing invalid data$")
	public void i_try_to_edit_a_Service_Provider_Structure_by_providing_invalid_data() throws Throwable {
		srvPrvdr.editInvalidServiceProviderDetails();
	}

	@When("^I validate all fields labels on edit service provider page$")
	public void i_validate_all_fields_labels_on_edit_service_provider_page() throws Throwable {
		srvPrvdr.editPageLabelVerification();
	}

	@When("^I edit the required Service Provider record by providing valid data$")
	public void i_edit_the_required_Service_Provider_record_by_providing_valid_data() throws Throwable {
	   srvPrvdr.updateValidServiceProviderDetails();
	}
	@Then("^I validate Edited Service provider details displayed on Edit ui$")
	public void i_validate_Edit_Service_provider_details_displayed_on_ui() throws Throwable {
		srvPrvdr.viewEditedServiceProvider();
	}
	

}

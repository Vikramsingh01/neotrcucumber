package com.meganexus.stepDefs;

import com.meganexus.stepsLib.DocumentPendingSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DocumentPendingStefDefs {
	
	
	@Steps
	DocumentPendingSteps docPendingStep;
	
	@Then("^I navigate to document page$")
	public void i_navigate_to_document_page() throws Throwable {
		docPendingStep.clickDocumentTab();
	  
	}
	
	@When("^I click on document button on main navigation of service user\\.$")
	public void i_click_on_document_button_on_main_navigation_of_service_user() throws Throwable {
	    
	  
	}

	@Then("^I validate all list field on document structure\\.$")
	public void i_validate_all_list_field_on_document_structure() throws Throwable {
		docPendingStep.validateDocumentList();
	}

	@When("^I click on entity type & select a value from filter field\\.$")
	public void i_click_on_entity_type_select_a_value_from_filter_field() throws Throwable {
		docPendingStep.selectEntityTypeFilter();
	    
	}

	@Then("^I click on search button on document structure\\.$")
	public void i_click_on_search_button_on_document_structure() throws Throwable {
		docPendingStep.clickSearchBtn();
	   
	}

	@Then("^validate the record on document listing page\\.$")
	public void validate_the_record_on_document_listing_page() throws Throwable {
		docPendingStep.validateDocumentList();
	    
	}

	@When("^I click on linked_to & select a value from filter field\\.$")
	public void i_click_on_linked_to_select_a_value_from_filter_field() throws Throwable {
	    
	    
	}

	@When("^I click on documentType and select a value from filter field\\.$")
	public void i_click_on_documentType_and_select_a_value_from_filter_field() throws Throwable {
		docPendingStep.selectDocumentTypeFilter();
	    
	}

	@Then("^click on download link on document listing structure\\.$")
	public void click_on_download_link_on_document_listing_structure() throws Throwable {
		docPendingStep.clickDownloadBtn();	   
	}

	@Then("^I click Reset button on document listing structure\\.$")
	public void i_click_Reset_button_on_document_listing_structure() throws Throwable {
		docPendingStep.clickResetBtn();
	   
	}

	@When("^I delete document on listing page$")
	public void i_delete_document_on_listing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I verify deleted record of document should be deleted from Database$")
	public void i_verify_deleted_record_of_document_should_be_deleted_from_Database() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}

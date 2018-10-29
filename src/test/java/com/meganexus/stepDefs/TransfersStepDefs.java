package com.meganexus.stepDefs;


import com.meganexus.stepsLib.TransferOutSteps;
import com.meganexus.stepsLib.TransfersSteps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TransfersStepDefs {

@Steps

	
TransfersSteps trOutSteps;
TransferOutSteps transferOutSteps;

//IC-2329
@When("^I navigate to Transfer Out view page$")
public void i_navigate_to_Transfer_Out_view_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	transferOutSteps.transferOut();
}

@Then("^I expand Transfer Out Request view page$")
public void i_expand_Transfer_Out_Request_view_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I validate list view of Transfer Out Request$")
public void i_validate_list_view_of_Transfer_Out_Request() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

// IC-2330
@When("^I expand Transfer Out Request$")
public void i_expand_transfers_request() throws Throwable {
	trOutSteps.clickOnTransferOutLink();
    
}

@Then("^I verify list view of TransferOut Request$")
public void i_verify_list_view_of_TransferOut_Request() throws Throwable {
    trOutSteps.verifyTransferOutRequestListView();
}
@Given("^Transfer case component from Transfer Out Request list$")
public void transfer_case_component_from_Transfer_Out_Request_list() throws Throwable {
	trOutSteps.transferCaseComponents();
}
@Given("^I navigate to Transfers Out page$")
public void i_navigate_to_Transfers_Out_page() throws Throwable {
	
}

//IC-2343
@Then("^Amend Transfer Out Request reason$")
public void amend_Transfer_Out_Request_reason() throws Throwable {
    
	trOutSteps.amendTransferReason();
}

@When("^I navigate to Transfers page$")
	public void i_navigate_to_Transfers_page() throws Throwable {
	trOutSteps.navigateToTransfersTab();
	}

@Then("^I navigate to Edit Withdraw TransferRequest$")
public void i_navigate_to_Edit_Withdraw_TransferRequest() throws Throwable {
	trOutSteps.navigateToEditWithdrawTransferRequest();
}

@Given("^Withdraw Transfer Out Request$")
public void withdraw_Transfer_Out_Request() throws Throwable {
	trOutSteps.withdrawTransferOutRequest();
	
	
}

@Then("^I expand Transfer Out History$")
	public void i_expand_Transfer_Out_History() throws Throwable {
	trOutSteps.navigateToTransfersTab();
	trOutSteps.clickonTransferOutHistory();
}

@Then("^I verify list view of Transfer Out History$")
public void i_verify_list_view_of_Transfer_Out_History() throws Throwable {
	trOutSteps.verifyTransferOuHistoryListViw(); 
}}

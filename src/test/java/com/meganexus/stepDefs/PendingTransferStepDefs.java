package com.meganexus.stepDefs;

import com.meganexus.stepsLib.PendingTransferSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
@SuppressWarnings("serial")
public class PendingTransferStepDefs {
	@Steps
	PendingTransferSteps pendindTrans;
	@When("^I navigate to pending transfer page$")
	public void i_navigate_to_pending_transfer_page() throws Throwable {
		pendindTrans.navigateToPendingTransferPage();
		
	}
	
	@When("^I accept offender from pending transfer page$")
	public void i_accept_offender_from_pending_transfer_page() throws Throwable {
		pendindTrans.acceptOffender();

	}
	@When("^I verify list view of Pending Transfer$")
	public void i_verify_list_view_of_Pending_Transfer() throws Throwable {
		pendindTrans.verifyPendingTransferListViw();
	    
	}
	
	@When("^I reject offender from pending transfer page$")
	public void i_reject_offender_from_pending_transfer_page() throws Throwable {
		System.out.println("rejecting offender");
		pendindTrans.rejectOffender();

	}

	@Then("^I validate OM Transfer Request field value$")
	public void i_validate_OM_Transfer_Request_field_value() throws Throwable {
		pendindTrans.validateOMTransfer();
	}

	@Then("^I validate OS Transfer Request field value$")
	public void i_validate_OS_Transfer_Request_field_value() throws Throwable {
	   
	}

	@Then("^I validate RQ Transfer Request field value$")
	public void i_validate_RQ_Transfer_Request_field_value() throws Throwable {
		pendindTrans.validateRQTransfer();
	}

	@Then("^I validate LC Transfer Request field value$")
	public void i_validate_LC_Transfer_Request_field_value() throws Throwable {
	  
		pendindTrans.validateLCTransfer();
	}

	@Then("^I validate PSS Transfer Request field value$")
	public void i_validate_PSS_Transfer_Request_field_value() throws Throwable {
	   
	}

	@Then("^I validate NSI Transfer Request field value$")
	public void i_validate_NSI_Transfer_Request_field_value() throws Throwable {
	    
	}

	@Then("^I validate CR Transfer Request field value$")
	public void i_validate_CRC_Transfer_Request_field_value() throws Throwable {
	   
	}

	@Then("^I validate IR Transfer Request field value$")
	public void i_validate_IR_Transfer_Request_field_value() throws Throwable {
	   pendindTrans.validateIRTransfer();
	}



	

	@Then("^I validate Offender should be Accepted$")
	public void i_validate_Offender_should_be_Accepted() throws Throwable {

	}

	@Then("^I validate Offender should be rejected$")
	public void i_validate_Offender_should_be_rejected() throws Throwable {

	}

}

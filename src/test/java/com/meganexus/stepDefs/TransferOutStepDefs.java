package com.meganexus.stepDefs;


import com.meganexus.stepsLib.TransferOutSteps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TransferOutStepDefs {

	@Steps
	TransferOutSteps transferOutSteps;
//	@Given("^I navigate to Transfer Out Request page on Service Users$")
//     public void i_navigate_to_Transfer_Out_Request_page_on_Service_Users() throws Throwable {
//    	 transferOutSteps.TransfersButtonOnServiceUsers();
//     }
//    
    //IC-2329
	@Given("^I navigate to Transfer Out Request view page$")
	public void i_navigate_to_Transfer_Out_Request_view_page() throws Throwable {
		transferOutSteps.transferOut();
	    	}
 
	
	@Then("^I validate list view of Tranfer Out Request$")
	public void i_want_to_validate_list_view_of_Tranfer_Out_Request() throws Throwable {
		
		transferOutSteps.verifyListViewTransferOutRequest();
}
	
	@When("^I navigate to Transfer Out Request page on Service Users$")
	public void i_navigate_to_Transfer_Out_Request_page_on_Service_Users() throws Throwable {
		
		 transferOutSteps.TransfersButtonOnServiceUsers();
	}

	@Then("^I want to validate list view of Tranfer Out Request on Service users$")
	public void i_want_to_validate_list_view_of_Tranfer_Out_Request_on_Service_users() throws Throwable {
		
	}
	@Then("^I validate Search Tranfer Out Request$")
	public void i_validate_Search_Tranfer_Out_Request() throws Throwable {
		transferOutSteps.verifySearchTransferOut();
	   
	}
	
	
	  
	}


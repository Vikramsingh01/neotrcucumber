package com.meganexus.stepDefs;

import com.meganexus.genericLib.ReadXMLData;
import com.meganexus.stepsLib.ServiceUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("serial")
public class ServiceUserStepDefs {
	@Steps
	ServiceUserSteps serviceUser;

	@Given("^I select specific offender with name \"([^\"]*)\" or crnNo and clicked on goto button for required offender from Service user page$")
	public void i_search_offender_with_name_or_crnNo_and_clicked_on_goto_button_for_required_offender_from_Service_user_page(
			String offenderName) throws Throwable {
		if (offenderName.trim().length() == 0) {
			serviceUser.selectOffenderWithCrnNO(
					ReadXMLData.getXMLData("inboundXML/AO.xml", "//Offender", "./CaseReferenceNumber"));
		} else {
			serviceUser.selectOffenderWithname(offenderName);
		}
		serviceUser.viewOffender();
	}

	// Myservice users List vikram.boinapalli@meganexus.com
	@When("^I select offender with name \"([^\"]*)\" or crnNo \"([^\"]*)\"$")
	public void i_select_offender_with_name_or_crnNo(String offenderName, String crnNo) throws Throwable {
		System.out.println("MY service users page");

		if (offenderName.trim().length() == 0) {
			serviceUser.selectOffenderWithCrnNO(crnNo);
		} else {
			serviceUser.selectOffenderWithname(offenderName);
		}
	}

	@Then("^I validate MyserviceusersList$")
	public void i_validate_MyserviceusersList() throws Throwable {
		System.out.println("I am verifying the MyService Users table");
		serviceUser.validateMySystemUsersList();

	}

}

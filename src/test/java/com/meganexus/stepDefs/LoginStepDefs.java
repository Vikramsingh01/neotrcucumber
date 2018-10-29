package com.meganexus.stepDefs;

import com.meganexus.genericLib.ReadXMLData;
import com.meganexus.stepsLib.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;

@SuppressWarnings("serial")
public class LoginStepDefs {

	@Steps
	LoginSteps login;

	@Given("^As a Case Manager I want to login to neo_tr with valid credentials$")
	public void as_a_case_manager_I_want_to_login_to_neo_tr_with_valid_credentials() throws Throwable {
		String username = ReadXMLData.getXMLData("TestData.xml", "//casemanagerlogin", "./username");
		String password = ReadXMLData.getXMLData("TestData.xml", "//casemanagerlogin", "./password");
		login.loginToApp(username, password);

	}
	
	@Given("^As a PSC_Admin I want to login to neo_tr with valid credentials$")
	public void as_a_PSC_Admin_I_want_to_login_to_neo_tr_with_valid_credentials() throws Throwable {

		String username = ReadXMLData.getXMLData("TestData.xml", "//psc_login", "./username");
		String password = ReadXMLData.getXMLData("TestData.xml", "//psc_login", "./password");
		login.loginToApp(username, password);

	}

	@Given("^As a Case Manager I want to login to neo_tr with valid Username\"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void as_a_Case_Manager_I_want_to_login_to_neo_tr_with_valid_Username_and_Password(String username,
			String password) throws Throwable {
		login.loginToApp(username, password);
	}

	@Then("^I validate user able to login to the application$")
	public void i_validate_user_able_to_login_to_the_application() throws Throwable {
		login.login_Review();
	}

}

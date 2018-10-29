package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.OffenderDetailsPage;
import com.meganexus.pageObjectLib.RegistrationPage;

import net.thucydides.core.annotations.Step;

public class RegistrationSteps extends NeoTR_Steps {
	OffenderDetailsPage offPage;
	RegistrationPage registrationPage;
	
	@Step
	public void addRegistration() {
		registrationPage.clickOnR();
		registrationPage.ClickAddRegistrationbtn();
		registrationPage.enterRegistrationDetails();
		clickSubmitBtn();
	}
	
	@Step
	public void viewRegistrationTable() {
		registrationPage.clickOnR();
		//		clickBackBtn();
	}
	
	public void clickOnRegistrationlink() {
		registrationPage.clickOnRegisterationLink();
		//		clickBackBtn();
	}
	
	public void validateRegistrationTable() {
		registrationPage.validateRegistriationListingTable();
		//		clickBackBtn();
	}
	
	@Step
	public void editRegistration() {
		offPage.clickEditRegistrationBtn();
		registrationPage.editRegistrationDetails();
		clickSubmitBtn();
	}
	
	@Step
	public void verifyRegistration() {
		//Outbound Verifications here
		System.out.println("Record Verified");
	}
	
	@Step
	public void deleteRegistration() {
		offPage.clickDeleteRegistrationBtn();
		
	}
	
}

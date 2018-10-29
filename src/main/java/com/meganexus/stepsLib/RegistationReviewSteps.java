package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.RegistrationPage;
import com.meganexus.pageObjectLib.RegistrationReviewPage;

import net.thucydides.core.annotations.Step;

public class RegistationReviewSteps extends NeoTR_Steps{
	RegistrationPage registrationPage;
	RegistrationReviewPage registrationReviewPage;
	
	@Step
	public void addRegistrationReview() {
		registrationPage.clickAddRegistrationReviewBtn();
		registrationReviewPage.enterRegistrationReviewDetails();
		clickSubmitBtn();
	}
	
	@Step
	public void viewRegistrationReview() {
		registrationPage.clickViewRegistrationReview();
		clickBackBtn();
	}
	
	@Step
	public void editRegistrationReview() {
		registrationPage.clickEditRegistrationReviewBtn();
		registrationReviewPage.editRegistrationReviewDetails();
		clickSubmitBtn();
	}
	
	@Step
	public void verifyRegistrationReview() {
		//Outbound Verifications here
		System.out.println("Record Verified");
	}
	
	@Step
	public void deleteRegistrationReview() {
		registrationPage.clickDeleteRegistrationReviewBtn();
	}
}

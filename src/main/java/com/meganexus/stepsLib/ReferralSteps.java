package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.EventViewPage;
import com.meganexus.pageObjectLib.ReferralPage;

import net.thucydides.core.annotations.Step;

public class ReferralSteps extends NeoTR_Steps{
	EventPage eventPage;
	EventViewPage eventViewPage;
	ReferralPage referralPage;
	
	
	@Step
	public void clickReferralTab() {
		eventPage.viewEvent();
		eventViewPage.clickOnReferralLnk();
		
	}
	
	@Step
	public void validateReferralList() {
		referralPage.validateReferralList();
		
	}
	
	@Step
    public void clickAddButton() {
		
		referralPage.clickAddReferralBtn();
		
	}
	
	@Step
	public void verifyAddPageLabels() {
		
		//referralPage.addReferralPageLabelVerification();
	}
	
	@Step
	public void addReferral() {
		
		referralPage.addReferralValidDetails();
	}
	
	@Step
	public void addReferralInvalidData() {
		
		referralPage.addReferralInvalidDetails(); ;
	}
	
	@Step
	public void verifyAddPageErrorMessage() {
		
		referralPage.addReferralErrorMessageValidation();
		referralPage.CancelBtnFunctionality();
	}
	@Step
	public void viewReferral() {
		referralPage.clickReferralViewBtn();
        
	}
	
	@Step
    public void clickEditButton() {
		referralPage.clickEditReferralBtn();
		
	}
	
	@Step
	public void verifyEditPageLabels() {
		
		//referralPage.editReferralPageLabelVerification();
	}
	
	@Step
	public void editReferral() {
		
		referralPage.editReferralValidDetails();
		
	}
	
	@Step
	public void editReferralInvalidData() {
		
		referralPage.editReferralInvalidDetails(); ;
	}
	
	
	@Step
	public void verifyEditPageErrorMessage() {
		
		referralPage.editReferralErrorMessageValidation();
		referralPage.CancelBtnFunctionality();
	}
	@Step
	public void deleteReferral() {
		
	}

	@Step
	public void validateReferral(){
		referralPage.validateViewReferralDetails();
	}
	
	@Step
	public void validateReferralRecordDeleted(){
		
		//to be added
	}
	
	@Step
	public void clickBackButton(){
		clickBackBtn();
	}

     @Step
	public void verifyReferralHeader(){
    	 referralPage.verifyReferralTabHeader();
	}

}

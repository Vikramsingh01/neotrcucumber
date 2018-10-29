package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.EventViewPage;
import com.meganexus.pageObjectLib.ReferralPage;
import com.meganexus.pageObjectLib.AssessmentPage;

import net.thucydides.core.annotations.Step;

public class AssessmentSteps {
	EventPage eventPage;
	EventViewPage eventViewPage;
	AssessmentPage assessmentPage;
	ReferralPage referralpage;
	
	@Step
	public void clickAssessmentTab() {
		eventPage.viewEvent();
		eventViewPage.clickOnReferralLnk();
		referralpage.clickReferralViewBtn();
		referralpage.clickLinkAssessmentBtn();
		
	
		
	}
	
	@Step
	public void validateAssessmentList() {
		
		assessmentPage.validateAssessmentList();
		
	}
	
	@Step
    public void clickAddButton() {
		
		assessmentPage.clickAddAssessmentBtn();
		
	}
	
	@Step
	public void verifyAddPageLabels() {
		
		assessmentPage.addAssessmentPageLabelVerification();
	}
	
	@Step
	public void addAssessment() {
		
		assessmentPage.addAssessmentValidDetails();
	}
	
	@Step
	public void addAssessmentInvalidData() {
		
		assessmentPage.addAssessmentInvalidDetails(); ;
	}
	
	@Step
	public void verifyAddPageErrorMessage() {
		
		assessmentPage.addAssessmentErrorMessageValidation();
		assessmentPage.CancelBtnFunctionality();
	}
	@Step
	public void viewAssessment() {
		assessmentPage.clickAssessmentViewBtn();
        
	}
	
	@Step
    public void clickEditButton() {
		assessmentPage.clickEditAssessmentBtn();
		
	}
	
	@Step
	public void verifyEditPageLabels() {
		
		assessmentPage.editAssessmentPageLabelVerification();
	}
	
	@Step
	public void editAssessment() {
		
		assessmentPage.editAssessmentValidDetails();
		
	}
	
	@Step
	public void editAssessmentwithInvalidValues() {
		
		assessmentPage.editAssessmentInvalidDetails();
		

	}
	@Step
	public void verifyEditPageErrorMessage() {
		
		
		assessmentPage.editAssessmentErrorMessageValidation();
		
		assessmentPage.CancelBtnFunctionality();
	}
	public void deleteAssessment() {
		assessmentPage.clickDeleteAssessmentBtn();
		
	}

	@Step
	public void validateAssessment(){
		assessmentPage.validateViewAssessmentDetails();
	}
	
	@Step
	public void validateAssessmentRecordDeleted(){
		
		
	}
	
	@Step
	public void clickBackButton(){
		assessmentPage.clickBackBtn();
	}

     @Step
	public void verifyAssessmentHeader(){
    	 //assessmentPage.verifyAssessmentTabHeader();
	}

}

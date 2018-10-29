package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.AdditionalSentencePage;
import com.meganexus.pageObjectLib.EventViewPage;

import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")
public class AdditionalSentenceSteps extends NeoTR_Steps {
EventViewPage eventDetails;
AdditionalSentencePage additionalSentencePage;
	
	@Step
    public void viewAdditionalSentence() {
		eventDetails.clickViewAdditionalSentenceBtn();
		
	}
	@Step
	public void additionalSentenceReview(){
		System.out.println("DDDDDDDDDDDDDDDDD");
		additionalSentencePage.AdditionalSentenceViewVerification();
		
	}
	
	@Step
	public void clickBackButton(){
		clickBackBtn();
	}
	
	@Step
	public void validateEventHeader() {
		eventDetails.verifyEventHeader();
	}
	
}

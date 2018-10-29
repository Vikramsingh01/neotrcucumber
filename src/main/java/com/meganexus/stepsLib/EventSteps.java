package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.OffenderDetailsPage;

import net.thucydides.core.annotations.Step;
@SuppressWarnings("serial")
public class EventSteps extends NeoTR_Steps{
	EventPage ep;
	OffenderDetailsPage offDetails;
	@Step
	public void eventReview(){
		
		ep.eventDeatisVerification();
	}
	@Step
	public void clickOnEvent() {
		//clickOnEventLink();
		ep.clickOnListOfEventLnk();
		waitABit(1000);	
	}
	
	@Step
	public void viewEventDetailsPage()
	{
		ep.viewEvent();
		
	}
	@Step
	public void validateEventDetails()
	{
		ep.verifyEventTitle();
		waitABit(1000);
		ep.verifyEventDetailsLabel();
		waitABit(2000);
		ep.eventFieldVerificationWithIB_XML();
		waitABit(2000);
		ep.verifyAdditionalSentenceVlue();
		waitABit(1000);
	}
	@Step
	public void backNavigation(){
		ep.verifyBackBtn();
		waitABit(2000);
	}
	@Step
	public void clickOnReq() //Method to click on Requirements Link on Event page 
	{
		ep.clickOnRequirmentsLnk();
		
	}
	@Step
	public void reqListTable(){
		ep.verifyReqTblHdr();
		ep.verifyFirstRowReq();
		ep.verifyReqListData();
		ep.clickOnRequirementGoToButton();
	}

}

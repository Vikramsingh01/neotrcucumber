package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.AliasPage;
import com.meganexus.pageObjectLib.CommunityRequirementPage;
import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.EventViewPage;


import net.thucydides.core.annotations.Step;

	public class CommunityRequirementSteps extends EventStep {
		CommunityRequirementPage comReq;
		@SuppressWarnings("rawtypes")
		EventPage event;
	
		
		@Step
		public void viewCommunityRequirement() {
			event.clickOnListOfEventLnk();
			event.viewEvent();
			event.clickOnRequirmentsLnk();
			event.clickOnRequirementGoToButton();					
		}
		
		@Step
		public void verifyCommunityRequirement() {
			comReq.verifyRequirementTitle();
			comReq.verifyRequirementDetailsLabel();
			comReq.verifyRequirementValues();
			comReq.clickOnBack_btn();			
		   
		}
		
		@Step
		public void terminateCommunityRequirement(){
			event.clickOnListOfEventLnk();
			event.viewEvent();
			event.clickOnRequirmentsLnk();
			event.clickOnRequirementGoToButton();
			waitABit(2000);
			comReq.verifyTerminateRequirementLabels();
			comReq.terminateRequirement();
		}
		
		@Step
		public void terminateEvent(){
			event.clickOnListOfEventLnk();
			event.viewEvent();
			waitABit(2000);
			event.verifyTerminateEventField();
			event.verifyTerminateEvent();
		}
		
}

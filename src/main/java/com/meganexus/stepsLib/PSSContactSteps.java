package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.PSSContactPage;
import com.meganexus.pageObjectLib.EventViewPage;

import net.thucydides.core.annotations.Step;
@SuppressWarnings("serial")
public class PSSContactSteps extends NeoTR_Steps{

	EventViewPage eventDetails;
	PSSContactPage pssContactPage;
		
		@Step
	    public void validatePSSContactList() {
			eventDetails.validatePSSContactList();
			
		}
		
		@Step
		public void viewPSSContact() {
			eventDetails.clickViewPSSContactBtn();
		}
		
		@Step
		public void validatePSSRecordOnUI(){
			pssContactPage.validatePSSContact();
		}
		
		@Step
		public void validateBackButton() {
			clickBackBtn();
		eventDetails.verifyEventHeader();
		}
		
}

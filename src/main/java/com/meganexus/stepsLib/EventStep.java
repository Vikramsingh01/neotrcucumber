package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.OffenderDetailsPage;

import net.thucydides.core.annotations.Step;
@SuppressWarnings("serial")
public class EventStep extends NeoTR_Steps{
	EventPage ep;
	OffenderDetailsPage offDetails;
	@Step
	public void clickOnEvent() {
		//clickOnEventLink();
		ep.clickOnListOfEventLnk();
		ep.viewEvent();
		waitABit(5000);
	}
	@Step
	public void eventReview(){
		ep.eventDeatisVerification();
	}

}

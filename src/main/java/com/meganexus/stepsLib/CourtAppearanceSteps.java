package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CourtAppearancePage;
import com.meganexus.pageObjectLib.EventPage;

import net.thucydides.core.annotations.Step;

public class CourtAppearanceSteps extends EventStep {

	CourtAppearancePage courtApp;
	@SuppressWarnings("rawtypes")
	EventPage event;

	
	@Step
	public void viewCourtAppearance() {
		event.clickOnListOfEventLnk();
		event.viewEvent();
		event.clickOnCourtAppearance();					
	}
	
	@Step
	public void verifyCourtAppearanceListView() {
		courtApp.verifyCourtAppearanceViewListLabel();
		courtApp.verifyFirstRowReq();
		courtApp.verifyCourtappearanceListValues();
		courtApp.clickOnView_btn();
		   
	}
	
	@Step
	public void verifyCourtAppearanceDetail() {
		courtApp.verifyCOurtAppearanceDetailsLabels();
		courtApp.verifyCourtAppearanceValues();
	   
	}
	
}

package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CohortPage;
import net.thucydides.core.annotations.Step;
import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.EventViewPage;

public class CohortSteps extends NeoTR_Steps{


	CohortPage cohort;
	EventViewPage eventViewPage;
	
	
	@Step
	public void viewCohort() {
	
		eventViewPage.clickViewCohortBtn();
		
	}
	@Step
	public void validateCohort() {
		cohort.cohortFieldVerification();
		
	}
	
	@Step
	public void validateCohortList() {
		eventViewPage.validateCohortList();
	}
	
	@Step
	public void validateBackButton() {
		clickBackBtn();
		eventViewPage.verifyEventHeader();
	}
	
}


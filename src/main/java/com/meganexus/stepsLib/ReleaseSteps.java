package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.EventViewPage;
import com.meganexus.pageObjectLib.ReleasePage;

import net.thucydides.core.annotations.Step;

public class ReleaseSteps extends EventStep {

	ReleasePage release;
	EventViewPage eventDetails;


	@Step
	public void viewRelease() {
		eventDetails.clickViewReleaseBtn();
		
	}


	@Step
	public void releaseReview(){
		release.releaseViewFieldVerification();
		
	}




}

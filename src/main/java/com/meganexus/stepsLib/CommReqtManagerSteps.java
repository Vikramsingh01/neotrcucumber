package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CommReqtManagerPage;
import com.meganexus.pageObjectLib.CommunityRequirementPage;
import com.meganexus.pageObjectLib.EventViewPage;

import net.thucydides.core.annotations.Step;

public class CommReqtManagerSteps {

	
	CommReqtManagerPage commreqtmngr;
	EventViewPage eventView;



	@Step
	public void viewCommReqtManager() {
		eventView.clickViewCommReqtManagerBtn();
		
	}

	@Step
	public void CommReqtManagerReview(){
		commreqtmngr.CommReqtManagerViewFieldVerification();
		
	}
	
	
}

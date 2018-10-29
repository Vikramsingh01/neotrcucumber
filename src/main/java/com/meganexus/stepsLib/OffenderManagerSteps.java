package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.OffenderDetailsPage;
import com.meganexus.pageObjectLib.OffenderManagerPage;

import net.thucydides.core.annotations.Step;

public class OffenderManagerSteps extends NeoTR_Steps {
	
	OffenderDetailsPage offPage;
	OffenderManagerPage OffenderManager;
 
	@Step
    public void ViewOffenderManger() {
		offPage.clickViewOffenderManager();
		clickBackBtn();

	}
	
	@Step
	public void validateOffenderManager(){
		OffenderManager.OffenderManagerViewFieldVerification();
}
	
}

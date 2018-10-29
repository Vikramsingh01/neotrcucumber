package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CaseManagerPage;

import net.thucydides.core.annotations.Step;

public class CaseManagerSteps extends NeoTR_Steps{
	
	CaseManagerPage caseManagerPage;
	
	@Step
	public void navigateToCaseManagerPage() {

		caseManagerPage.clickOnCaseManager_btn();
	}

	@Step
	public void VerifyCaseManagerfields() {
		caseManagerPage.verifyCaseManagerTitle();
		caseManagerPage.verifyCaseManagerDetailsLabel();
		caseManagerPage.verifyCaseManagerHistoryDetailsLabel();
		//.verifyCaseManagerValues();
	}
	
	public void VerifyCaseManagerfieldValues(String username) {
		caseManagerPage.verifyCaseManagerValues(username);
		}

	public void VerifyCaseManagerHistoryfieldValues(String username) {
		caseManagerPage.verifyCaseManagerHistoryValues(username);
	}
	
	

}

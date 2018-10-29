package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.EventViewPage;
import com.meganexus.pageObjectLib.LicenceConditionPage;

import net.thucydides.core.annotations.Step;
@SuppressWarnings("serial")
public class LicenseConditionSteps extends NeoTR_Steps{
	LicenceConditionPage lic;
	EventViewPage evp;

	@Step
	public void addNewLicenseCondition() {
		evp.clickLicenceAddBtn();
		lic.addLicenseCondition();
	}

	@Step
	public void viewLicenseCondition() {
		evp.clickLicenceAddBtn();
		lic.clickOnLicenceconditions();
		
	}
	
	public void ValidateLicenseConditionTable() {
		evp.clickLicenceAddBtn();
		lic.clickOnLicenceconditions();
		lic.validateLicenceconditionsTable();
		
	}
	
	@Step
	public void updateLicenseCondition() {
			
		
	}
	@Step
	public void LicenseCondition(){
		lic.licenseViewFieldVerification();
		
	}

}

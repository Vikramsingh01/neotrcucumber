package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.NeoTR_Page;
import com.meganexus.pageObjectLib.OffenderDetailsPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
@SuppressWarnings("serial")
public class NeoTR_Steps extends NeoTR_Page {
	
	@Step
	public void logOutFromCMSApps(){
		clickOnLogoutBtn();
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

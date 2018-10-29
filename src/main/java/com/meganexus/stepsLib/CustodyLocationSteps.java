package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CustodyLocationPage;
import com.meganexus.pageObjectLib.CourtAndCustodyPage;

import net.thucydides.core.annotations.Step;



	public class CustodyLocationSteps extends EventStep {
		CustodyLocationPage custLocn;
		CourtAndCustodyPage courtAndCustodyView;

	

		@Step
		public void viewCustodyLocn() {
			courtAndCustodyView.clickViewCustodyLocnBtn();
			
		}
		@Step
		public void updateCustodyLocn() {
			courtAndCustodyView.clickViewCustodyLocnBtn();
			custLocn.updateCustodyLocation();
			clickSubmitBtn();
			
		}
		@Step
		public void CustodyLocationReview(){
			custLocn.custodyLocationViewFieldVerification();
			
		}
	
	
}

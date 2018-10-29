package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.DrugTestProfilePage;
import com.meganexus.pageObjectLib.EventPage;
import com.meganexus.pageObjectLib.EventViewPage;
import com.meganexus.pageObjectLib.ReferralPage;

import net.thucydides.core.annotations.Step;

public class DrugTestProfileSteps {
	EventPage eventPage;
	EventViewPage eventViewPage;
    ReferralPage referralpage;
    DrugTestProfilePage drugTestProfile;
    
    
    @Step
	public void viewDrugTestReferral() {
    	System.out.println("Check referral page");
		eventPage.viewEvent();
		eventViewPage.clickOnReferralLnk();
		referralpage.clickReferralViewBtn();
		//System.out.println("Check referral page");
		
	}

	@Step
    public void clickAddButton() {
		
		drugTestProfile.clickAddDrugTestProfileBtn();
		
	}
	
	@Step
	public void verifyAddPageLabels() {
		
		drugTestProfile.drugTestProfilePageLabelVerification();
	}
    

		@Step
		public void addDrugTestProfile() {
			
			drugTestProfile.addDrugTestProfileValidDetails();
		}
		
		@Step
		public void addDrugTestProfileInvalidData() {
			
			drugTestProfile.addDrugTestProfileInvalidDetails(); ;
		}
		
		@Step
		public void verifyAddPageErrorMessage() {
			
			drugTestProfile.addDrugTestProfileErrorMessageValidation();
			referralpage.CancelBtnFunctionality();
		}
	
		@Step
	    public void clickEditButton() {
			drugTestProfile.clickEditDrugTestProfileBtn();
			
		}
		
	
		@Step
		public void editDrugTestProfile() {
			
			drugTestProfile.editDrugTestProfileValidDetails();
			
		}
		
		@Step
		public void editDrugTestProfilewithInvalidValues() {
			
			drugTestProfile.editDrugTestProfileInvalidDetails();
			

		}
		@Step
		public void verifyEditPageErrorMessage() {
			
			
			drugTestProfile.editDrugTestProfileErrorMessageValidation();
			
			referralpage.CancelBtnFunctionality();
		}
	
	
    
    
    
    
    
    
    
}



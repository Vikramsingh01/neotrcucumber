package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.AllocationPage;

import net.thucydides.core.annotations.Step;

public class AllocationSteps {

	AllocationPage allocationPage;

	
	@Step	
	 public void navigateToAllocationPage(){
		allocationPage.navigateToAllocationTab();
}
	
	@Step	
	 public void navigateToComponentAllocationPage(){
		allocationPage.acceptOrRejectComponent();
}
	
	@Step	
	 public void acceptComponents(){
		allocationPage.acceptComponent();
}
	@Step	
	 public void rejectComponents(){
		allocationPage.rejectComponent();
}
	@Step	
	 public void verifyAddressandRegistrationDetails(){
		allocationPage.verifyAddressDetails();
		allocationPage.verifyRegistrationDetails();
}

	
	
	
}

package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.OffenderDetailsPage;
import com.meganexus.pageObjectLib.ProfilesPage;
import com.meganexus.pageObjectLib.ServiceUserPage;

import net.thucydides.core.annotations.Step;
@SuppressWarnings("serial")
public class ServiceUserSteps extends NeoTR_Steps {
	ServiceUserPage sp;
	OffenderDetailsPage offDetails;

	@Step
	public void selectOffenderWithname(String offenderName){
	
		sp.searchOffenderWithName(offenderName);
	}
	@Step
	public void selectOffenderWithCrnNO(String crnNo){
		sp.searchOffenderWithCrnNO(crnNo);
	}
	@Step
	public void viewOffender(){
		getImplicitWaitTimeout();
		sp.clickOnViewOffender();
		
	}
	@Step
	public void validateMySystemUsersList() {
		offDetails.validateMyServiceUsersList();
	}
	
	@Step
	public void validateProfile() {
		offDetails.profileFieldLableValidation();
		offDetails.profileFieldValueValidation();
		
	}
	@Step
	public void validateIdentifiers() {
		offDetails.identifiersFieldLableValidation();
		offDetails.identifiersFieldValueValidation();
		
	}
	

}

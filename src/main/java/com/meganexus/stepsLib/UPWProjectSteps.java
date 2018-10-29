package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.ProfilesPage;
import net.thucydides.core.annotations.Step;
import com.meganexus.pageObjectLib.UPWProjectPage;
import com.meganexus.pageObjectLib.UnpaidWorkTab;

public class UPWProjectSteps extends NeoTR_Steps {
		
		ProfilesPage profilePage;
		UPWProjectPage upwPage;
		UnpaidWorkTab unpaidWorkTab;
		String expectedBreadcrumb = null;
		
		@Step
		public void navigateToUnpaidWorkTab() {
			unpaidWorkTab.clickOnUnpaidTab();
		}
		@Step
		public void checkUPWFilters() {
			unpaidWorkTab.clickOnFilter();
			unpaidWorkTab.searchProjectList();
			unpaidWorkTab.VerifyFilterLabel();
		}
		
		@Step
		public void verifyFilterValidation() {
			
		}
		@Step
		public void validatelabelonAddPage() {
			upwPage.checkProjectDetailsCollapsible();
			upwPage.validatelabelsOnAdd();
			
			upwPage.checkProviderDetailCollapsible();
		    upwPage.validatelabelsOfProviderDetails();
		    
		    upwPage.checkBeneficiaryCollapsible();
			upwPage.validatelabelsOfBeneficiaryDetails();
			
			upwPage.checkPlacementCollapsible();
			upwPage.validatelabelsOfPlacementDetails();
			
			upwPage.checkProjectAvailabilityCollapsible();
			upwPage.validatelabelsOfProjectAvailabilityInfo();
			
			upwPage.checkNatureOfWorkCollapsible();
			upwPage.validatelabelsOfNatureOfWorkQualification();
		}
		@Step
		public void verifyUPWList() {
			unpaidWorkTab.checkUPWlist();
		}
		
		@Step
        public void clickOnAddButton() {
        	unpaidWorkTab.clickOnFilter();
			unpaidWorkTab.searchProjectList();
        	unpaidWorkTab.clickOnAddButton();
		}
		@Step
         public void addDetailsOfProject() {
        	 upwPage.enterProjectDetails();
        	 upwPage.enterProviderDetails();
        	 upwPage.enterBeneficiaryDetails();
        	 upwPage.enterPlacementDetails();
        	 upwPage.enterProjectAvailabilityAndInfo();
        	 upwPage.enterProjectAvailability();
        	 upwPage.enterNatureOfWorkQualification();
		}
		
		@Step
         public void clickOnSaveButton() {
 			upwPage.clickSaveBtn();
 		}
		
		@Step
         public void searchUPWProject() {
			unpaidWorkTab.clickOnFilter();
			unpaidWorkTab.searchProjectList();
  		}
		@Step
         public void validateSearchRecordColumnValue(){
        	 unpaidWorkTab.verifyFirstRowUPWProject();
         }
		@Step
         public void clickOnViewButton(){
			unpaidWorkTab.clickViewButton();
         }
		@Step
         public void validateTheRecord() {
			 upwPage.viewProjectDetails();
			 
			 upwPage.checkProviderDetailCollapsible();
        	 upwPage.viewProviderDetails();
        	 
        	 upwPage.checkBeneficiaryCollapsible();
        	 upwPage.viewBeneficiaryDetails();
        	 
        	 upwPage.checkPlacementCollapsible();
        	 upwPage.viewPlacementDetails();
        	 
        	 upwPage.checkProjectAvailabilityCollapsible();
        	 upwPage.viewProjectAvailabilityAndInfo();
        	 
        	 upwPage.checkNatureOfWorkCollapsible();
        	 upwPage.viewNatureOfWorkQualification(); 
         }
		
		@Step
		public void validateUpdateButton() {
			unpaidWorkTab.clickOnEditButton();	
		}
		
		@Step
		public void validatelabelonEditPage() {
			upwPage.validatelabelsOnEdit();
			upwPage.validatelabelsOfProviderDetails();
			upwPage.validatelabelsOfBeneficiaryDetails();
			upwPage.validatelabelsOfPlacementDetails();
			upwPage.validatelabelsOfProjectAvailabilityInfo();
			upwPage.validatelabelsOfNatureOfWorkQualification();
		}
 		@Step
 		public void updateProjectDetails(){
 			upwPage.editProjectDetails();
 			upwPage.editProviderDetails();
 			upwPage.editPlacementDetails();
 			upwPage.editProjectAvailabilityInformation();
 			upwPage.editNatureOfWorkQualification();	
 		}
 		@Step
 		public void clickOnBackButton(){
 			upwPage.clickBackBtn();
 		}
 		
 		public void validateUpdateRecord() {
 			 upwPage.viewEditProjectDetails();
        	 upwPage.viewEditProviderDetails();
        	 upwPage.viewEditBeneficiaryDetails();
        	 upwPage.viewEditPlacementDetails();
        	 upwPage.viewEditProjectAvailabilityAndInfo();
        	 upwPage.viewNatureOfWorkQualification();
 		}
			
}

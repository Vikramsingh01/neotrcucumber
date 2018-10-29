package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.AddServiceProviderPage;
import com.meganexus.pageObjectLib.DirectoryOfServicesMaintenancePage;
import com.meganexus.pageObjectLib.EditServiceProviderPage;

import net.thucydides.core.annotations.Step;

public class ServiceProviderSteps extends DirectoryOfServicesMaintenancePage{

		AddServiceProviderPage addSerPrvdr;
		EditServiceProviderPage editSerPrvdr;
		DirectoryOfServicesMaintenancePage dos;
		
		@Step
		public void clickOnDosTab(){
			dos.clickonDirOfServiceMaintenenceLink();
			
		}
		
		@Step
		public void clickOnAddServiceProviderBtn(){
			dos.clickOnAddServiceProviderBtn();
			
		}
		
		@Step
		public void addInvalidServiceProviderDetails(){
			
			addSerPrvdr.addInvalidServiceProviderDetails();
		}
		
		@Step
		public void validateErrorMessages(){
			
			
			addSerPrvdr.addServiceProviderErrorMessageValidation();
	
		}
		@Step
		public void clickCancelButton(){
	
			dos.CancelBtnFunctionality();
			
		}
		@Step
		public void addPageLabelVerification() {
			
			dos.clickonDirOfServiceMaintenenceLink();
			dos.clickOnAddServiceProviderBtn();
			addSerPrvdr.addServiceProviderPageLabelVerification();
		
		}

		@Step
		public void addServiceProvider() {
			
			addSerPrvdr.addValidServiceProviderDetails();
		}

		@Step
		public void viewAddedServiceProvider() {
			dos.searchOffenderWithName();
			dos.clickOnViewServiceProviderBtn();
	        dos.validateAddedServiceProviderDetails();		
		}
		
//		@Step
//		public void clickBackButton(){
//			dos.clickOnBackServiceProviderBtn();
//		}
		
		@Step
		public void clickBackButton(){
			clickBackBtn();
		}
		
		@Step
		public void searchServiceProvider(){
			waitABit(4000);
			dos.clickonDirOfServiceMaintenenceLink();
			dos.searchOffenderWithStatus();
			dos.resetSearchOffender();
			dos.searchOffenderWithName();
		}
		
		@Step
		public void clickOnEditServiceProviderBtn(){
			dos.clickOnEditServiceProviderBtn();
			
		}
		
		@Step
		public void editInvalidServiceProviderDetails(){
		
			editSerPrvdr.updateInvalidServiceProviderDetails();
			editSerPrvdr.editServiceProviderErrorMessageValidation();
			dos.CancelBtnFunctionality();
			
		}
		@Step
		public void editPageLabelVerification() {
			
			editSerPrvdr.editServiceProviderPageLabelVerification();
		
		}
		
		@Step
		public void updateValidServiceProviderDetails() {
			
			editSerPrvdr.editServiceProviderPageLabelVerification();
			editSerPrvdr.updateValidServiceProviderDetails();
		}

		@Step
		public void viewEditedServiceProvider() {
			dos.clickOnViewServiceProviderBtn();
	        dos.validateUpdatedServiceProviderDetails();		
		}	
		
	
}

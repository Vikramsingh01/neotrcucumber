package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.PersonalCircumstanceTabPage;
import com.meganexus.pageObjectLib.PersonalCircumtancePage;
import net.thucydides.core.annotations.Step;


public class PersonalCircumtanceSteps extends NeoTR_Steps {
	PersonalCircumstanceTabPage tabPage;
	PersonalCircumtancePage PersonalCircumtancePage;
	
	@Step
	public void clickPersonalCircumstanceTab() {
		clickOnPersonalCircumstanceBtn();
		
	}
	
	@Step
	public void validatePersonalCircumtanceList() {
		tabPage.validatePersonalCircumtancList();
	}
	
	@Step
	public void addPersonalCircumtance() {
		tabPage.clickAddPersonalCircumtanceBtn();
		PersonalCircumtancePage.addnewPersonalCircumtanceDetails();
		PersonalCircumtancePage.clickOnSubmitBtn();

	}
	@Step
	public void viewPersonalCircumtance() {
		tabPage.clickViewPersonalCircButton();

	}
	
	public void clickEditButton() {
		tabPage.clickEditPersonalCircumtanceBtn();
	}
	
	@Step
	public void editPersonalCircumtance() {
		PersonalCircumtancePage.updatePersonalCircumtanceDetails();
		PersonalCircumtancePage.clickOnSubmitBtn();
	}
	
	public void deletePersonalCircumtance() {
		tabPage.clickDeletePersonalCircumtanceBtn();
	}

	@Step
	public void validatePersonalCircumtance(){
		PersonalCircumtancePage.validatePersCircumtanceDetails();
	}
	
	@Step
	public void validatePersonalCircumtanceRecordDeleted(){
		tabPage.validatePersonalCircumtanceDeleted();
		
	}
	
	@Step
	public void clickBackButton(){
		clickBackBtn();
	}

     @Step
	public void verifyServiceUserProfileHeader(){
    	 tabPage.verifyPersonalCircumstanceTabHeader();
	}

	public void verifyLabelsForEdit() {
		PersonalCircumtancePage.verifyLabelsForEditPage();
	}

	public void enterInvalidData() {
		PersonalCircumtancePage.enterInvalidData();
		PersonalCircumtancePage.clickOnSubmitBtn();
	}

	public void verifyValidationMessages() {
		// TODO Auto-generated method stub
		
	}

}

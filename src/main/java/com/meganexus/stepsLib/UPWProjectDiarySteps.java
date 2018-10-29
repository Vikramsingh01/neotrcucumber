package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.UPWProjectDiaryPage;
import com.meganexus.pageObjectLib.UnpaidWorkTab;

import net.thucydides.core.annotations.Step;

public class UPWProjectDiarySteps extends NeoTR_Steps {
	
	UPWProjectDiaryPage projectDiaryPage;
	UnpaidWorkTab unptab;
	
	@Step
	public void validateProjectDiaryLink(){
		projectDiaryPage.clickOnUpwProjectDiary();
	}
	@Step
	public void validateSearchFilter(){
		unptab.clickOnFilter();
		projectDiaryPage.enterValueForSearch();	
	}
	@Step
	public void validateLabelUPWprojectDiary(){
		projectDiaryPage.validateUPWProjectDiaryLabels();
	}
	@Step
	public void validateListOfAppointment(){
		projectDiaryPage.verifyFirstRowAttendenceList();
	}
	@Step
	public void clickOnViewAppoinmentList(){
		projectDiaryPage.clickOnViewButton();
	}
	@Step
	public void clickOnEditAppoinmentList(){
		projectDiaryPage.clickOnEditButton();
	}
	
}

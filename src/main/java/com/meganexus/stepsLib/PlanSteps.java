package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.PlanTabPage;
import com.meganexus.pageObjectLib.PlanPage;
import net.thucydides.core.annotations.Step;

public class PlanSteps extends NeoTR_Steps {
	PlanTabPage tabPage;
	PlanPage planDetails;
	
	@Step
	public void clickPlanTab() {
		clickOnPlanBtn();
	}
	
	@Step
	public void validatePlanList() {
		tabPage.validatePlanList();
	}
	
	@Step
	public void clickBackButton() {
		clickBackBtn();
	}

	public void viewDetails() {
		tabPage.clickOnViewBtn();
	}

	public void verifyAllLabels() {
		planDetails.verifyViewLabels();
	}

	public void validatePlanWithInbound() {
		planDetails.validateValuesWithInbound();
	}

	public void clickAddButton() {
		tabPage.clickOnAddBtn();
	}

	public void verifyAddScreenLabels() {
		planDetails.verifyAddLabels();
	}

	public void enterInvalidAddValues() {
		planDetails.enterInvalidAddValues();
	}

	public void verifyValidationMessages() {
		planDetails.verifyValidationMessages();
	}

	public void enterValidAddValues() {
		planDetails.enterValidAddValues();
	}

	public void validateNewlyAddedPlan() {
		tabPage.validateNewlyAddedPlanRecord();
	}

	public void validatePlanWithOutbound() {
		tabPage.clickOnViewBtn();
		planDetails.validateValuesWithOutbound();
	}

}

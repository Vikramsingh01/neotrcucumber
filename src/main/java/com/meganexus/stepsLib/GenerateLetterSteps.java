package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.GenerateLetterPage;
import com.meganexus.pageObjectLib.PlanPage;
import com.meganexus.pageObjectLib.PlanTabPage;

import net.thucydides.core.annotations.Step;

public class GenerateLetterSteps {
	

	GenerateLetterPage GeneratePage;
	@Step
	public void clickAddLetterbutton() {
		GeneratePage.clickOnAddLetterBtn();
		
	}
	@Step
	public void clickGenerateLetterbutton() {
		GeneratePage.clickOnGenerateLetterBtn();
		
	}
	@Step("Test")
	public void clickUplaodLetterbutton() {
		GeneratePage.clickOnUploadBtn();
		GeneratePage.UploadLetterFromLocalMachine();
	
	}

}

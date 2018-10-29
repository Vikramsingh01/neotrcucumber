package com.meganexus.stepDefs;

import com.meganexus.stepsLib.GenerateLetterSteps;
import com.meganexus.stepsLib.PlanSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GenerateLetterStepDefs {
	
	@Steps
	
	GenerateLetterSteps generateLetterSteps;
	 
	
	@When("^I click on Generate Letter button on Plan Entry list screen$")
	public void i_click_on_Generate_Letter_button_on_Plan_Entry_list_screen() throws Throwable {
		generateLetterSteps.clickAddLetterbutton();
	    
	}

	@Then("^I Generate selected Letter$")
	public void i_Generate_selected_Letter() throws Throwable {
		generateLetterSteps.clickGenerateLetterbutton();
	   
	}

	@Then("^I upload generated letter from Local machine to DRS$")
	public void i_upload_generated_letter_from_Local_machine_to_DRS() throws Throwable {
		generateLetterSteps.clickUplaodLetterbutton();
	    
	}

	@Then("^I navigate to plan entry list screen$")
	public void i_navigate_to_plan_entry_list_screen() throws Throwable {
	    
	   
	}



}

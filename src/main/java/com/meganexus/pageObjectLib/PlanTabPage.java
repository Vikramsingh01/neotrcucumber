package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PlanTabPage extends NeoTR_Page {

	@FindBy(xpath = "//span[text()='Related To']")
	private WebElementFacade col_Related_to;
	@FindBy(xpath = "//span[text()='Entry Type']")
	private WebElementFacade col_Entry_type;
	@FindBy(xpath = "//span[contains(text(),'Date & Time')]")
	private WebElementFacade col_Date_and_time;
	@FindBy(xpath = "//span[text()='Outcome']")
	private WebElementFacade col_Outcome;
	@FindBy(xpath = "//span[text()='Officer']")
	private WebElementFacade col_Officer;
	@FindBy(xpath = "//th[text()='View']")
	private WebElementFacade col_View;
	@FindBy(xpath = "//th[text()='Edit']")
	private WebElementFacade col_Edit;
	@FindBy(xpath = "//button[@id='planentry_addLetter0']")
	private WebElementFacade col_addLetter;

	
	@FindBy(xpath = "//tr-accordiontab//tbody/tr[1]")
	private WebElementFacade tr_Plan_firstRecord;
	
	@SuppressWarnings("deprecation")
	public void validatePlanList() {
		// pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		verifyBreadCrumbs("Service User Summary Plan");

		// verifying the alias table now
		System.out.println(col_Related_to.getText().trim());
		System.out.println(col_Entry_type.getText().trim());
		System.out.println(col_Date_and_time.getText().trim());
		System.out.println(col_Outcome.getText().trim());
		System.out.println(col_Officer.getText().trim());
		System.out.println(col_View.getText().trim());
		System.out.println(col_Edit.getText().trim());

		if (col_Related_to.isCurrentlyVisible())
			Assert.assertTrue("Table header for relates to does not match",
					col_Related_to.getText().trim().equals("CIRCUMSTANCE TYPE"));
		if (col_Entry_type.isCurrentlyVisible())
			Assert.assertTrue("Table header for Entry-Type does not match",
					col_Entry_type.getText().trim().equals("CIRCUMSTANCE SUB TYPE"));
		if (col_Date_and_time.isCurrentlyVisible())
			Assert.assertTrue("Table header for Date and time does not match",
					col_Date_and_time.getText().trim().equals("START DATE"));
		if (col_Outcome.isCurrentlyVisible())
			Assert.assertTrue("Table header for outcome does not match",
					col_Outcome.getText().trim().equals("END DATE"));
		if (col_Officer.isCurrentlyVisible())
			Assert.assertTrue("Table header for officer column does not match",
					col_Officer.getText().trim().equals(""));
		if (col_View.isCurrentlyVisible())
			Assert.assertTrue("Table header for view column does not match",
					col_View.getText().trim().equals("VIEW"));
		if (col_Edit.isCurrentlyVisible())
			Assert.assertTrue("Table header for edit column does not match",
					col_Edit.getText().trim().equals("EDIT"));

		// Validating that a record is present
		if (tr_Plan_firstRecord.isCurrentlyVisible())
			System.out.println("one record is present in Plan table as expected.");
		else
			System.out.println("No record is present in Plan table.");
		
	}

	//for clicking on UPW tab in plan page
	@FindBy(xpath="//button[text()='UPW']")
	private WebElementFacade upwTab;

	public void clickOnUPWtab(){
		upwTab.click();
	}
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		return col_Related_to;
	}


	public void clickOnViewBtn() {
		// TODO Auto-generated method stub
		
	}


	public void clickOnAddBtn() {
		
		
	}


	public void validateNewlyAddedPlanRecord() {
		// TODO Auto-generated method stub
		
	}

}

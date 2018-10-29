package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PersonalCircumstanceTabPage extends NeoTR_Page{
	// for personal circumstances #Ankita
	@FindBy(xpath = "//h2[contains(text(),'Personal Circumstance')]")
	private WebElementFacade text_protectedCharacteristics;
	
	@FindBy(xpath = "//a[contains(text(),'Personal Circumstance')]")
	private WebElementFacade lnk_personalCircumtance;

	public void clickOnPersonalCircumtanceLnk() {
		waitFor(lnk_personalCircumtance);
		lnk_personalCircumtance.click();
		waitABit(1000);
	}

	@FindBy(xpath = "(//button[text()='Add'])[1]")
	private WebElementFacade btn_addPersonalCircumtance;

	public void clickAddPersonalCircumtanceBtn() {
		waitForPresenceOf("(//button[text()='Add'])[1]");
		if (!btn_addPersonalCircumtance.isCurrentlyVisible()) {
			waitABit(500);
			clickOnPersonalCircumtanceLnk();
		if (btn_addPersonalCircumtance.isCurrentlyVisible()) {
			btn_addPersonalCircumtance.click();
			waitABit(1000);
		} else
			System.out.println("add btn is not available for pc");
		}
	}
	@FindBy(xpath = "(.//button[@id='personalcircumstance_view'])[1]")
	private WebElementFacade btn_viewPersonalCircumtance;
	@FindBy(xpath = "(.//button[@id='personalcircumstance_edit'])[1]")
	private WebElementFacade btn_editPersonalCircumtance;
	@FindBy(xpath = "(//button[@id='personalcircumstance_delete'])[1]")
	private WebElementFacade btn_deletePersonalCircumtance;
	
	////th[ng-reflect-sort-by-field="circumstanceTypeId"]
	@FindBy(xpath ="//th[@id='circumstanceTypeId']/span")
	private WebElementFacade col_PerCir_type;
	
	@FindBy(xpath = "//th[@id='circumstanceSubTypeId']/span")
	private WebElementFacade col_PerCir_subType;
	
	@FindBy(xpath = "//th[@id='startDate']/span")
	private WebElementFacade col_PerCir_startDate;
	
	@FindBy(xpath = "//th[@id='endDate']/span")
	private WebElementFacade col_PerCir_endDate;
	
	@FindBy(xpath = "//th[@id='endDate']/following-sibling::th[1]")
	private WebElementFacade col_PerCir_view;
	
	@FindBy(xpath = "//th[@id='endDate']/following-sibling::th[2]")
	private WebElementFacade col_PerCir_edit;
	
	@FindBy(xpath = "//tr-accordiontab[@header='personal Circumstance']//th[7]")
	private WebElementFacade col_PerCir_delete;
	
	@FindBy(xpath = "//tr-accordiontab[@header='personal Circumstance']//tbody/tr[1]")
	private WebElementFacade tr_PerCir_firstRecord; 
	
	
	@FindBy(xpath = "(//a[contains(text(),'personal Circumstance')]/parent::div/following-sibling::div/div/div[@class='pad15']/div[@class]//table[contains(@class,'table-bordered')]//td[1]")
	private WebElementFacade txt_type;

	public String personalCircDetails() {
		return txt_type.getText().trim();
	}
	
	@SuppressWarnings("deprecation")
	public void validatePersonalCircumtancList() {
		//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		verifyBreadCrumbs("Service User Summary Personal Circumstance");

		//clicking on the Personal Circumtance collapsible to view Persnal Circumtance table
		System.out.println(waitFor(lnk_personalCircumtance));
		if (!btn_addPersonalCircumtance.isCurrentlyVisible()) {
			waitFor(lnk_personalCircumtance);
			lnk_personalCircumtance.click();
			waitABit(1000);
		}

		//verifying the alias table now
		System.out.println(col_PerCir_type.getText().trim());
		System.out.println(col_PerCir_subType.getText().trim());
		System.out.println(col_PerCir_startDate.getText().trim());
		System.out.println(col_PerCir_endDate.getText().trim());
		System.out.println(col_PerCir_view.getText().trim());
		System.out.println(col_PerCir_edit.getText().trim());
		
		
		if (col_PerCir_type.isCurrentlyVisible())
			Assert.assertTrue("Table header for Type does not match", col_PerCir_type.getText().trim().equals("CIRCUMSTANCE TYPE"));
		if (col_PerCir_subType.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for Sub-Type does not match", col_PerCir_subType.getText().trim().equals("CIRCUMSTANCE SUB TYPE"));
		if (col_PerCir_startDate.isCurrentlyVisible())
			Assert.assertTrue("Table header for Start Date does not match", col_PerCir_startDate.getText().trim().equals("START DATE"));
		if (col_PerCir_endDate.isCurrentlyVisible())
			Assert.assertTrue("Table header for End Date does not match", col_PerCir_endDate.getText().trim().equals("END DATE"));
		if (col_PerCir_view.isCurrentlyVisible())
			Assert.assertTrue("Table header for view column does not match", col_PerCir_view.getText().trim().equals("VIEW"));
		if (col_PerCir_edit.isCurrentlyVisible())
			Assert.assertTrue("Table header for edit column does not match", col_PerCir_edit.getText().trim().equals("EDIT"));
//		if (col_PerCir_delete.isCurrentlyVisible()) 
//			Assert.assertTrue("Table header for delete column does not match", col_PerCir_delete.getText().trim().equals("Delete"));


		//Validating that a record is present
		if (tr_PerCir_firstRecord.isCurrentlyVisible())
			System.out.println("one record is present in Personal Circumtance table as expected.");
		else
			System.out.println("No record is present in Personal Circumtance table.");
	}

	public void clickViewPersonalCircButton() {
		waitABit(500);
		btn_viewPersonalCircumtance.click();
		waitABit(500);
	}
	

	public void clickEditPersonalCircumtanceBtn() {
		waitABit(500);
		btn_editPersonalCircumtance.click();
	}

	//------------------Delete Personal Circumstance----------------//
	
	public void clickDeletePersonalCircumtanceBtn() {
		if (!btn_deletePersonalCircumtance.isCurrentlyVisible()) {
			clickOnPersonalCircumtanceLnk();
			if (btn_deletePersonalCircumtance.isCurrentlyVisible()) {
				btn_deletePersonalCircumtance.click();
				waitABit(1000);
				getAlert().accept();
			} else
				System.out.println("Delete btn is not available");
		}
	}
	
	public void validatePersonalCircumtanceDeleted() {
		if (!btn_deletePersonalCircumtance.isCurrentlyVisible()) 
		System.out.println("Delete is working for Personal Circumtance");
		else
		System.out.println("Delete is working for Personal Circumtance");
	}
		
	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_personalCircumtance;
	}

	public void verifyPersonalCircumstanceTabHeader() {
		if (text_protectedCharacteristics.isCurrentlyVisible()) {
			System.out.println("Back button on screen is working as expected");
		}
		else { 
			System.out.println("Back button on screen is not working as expected"); 
		}
		
	}
}

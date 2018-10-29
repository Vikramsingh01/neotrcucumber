package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CourtAndCustodyPage extends NeoTR_Page  {
	
	@FindBy(xpath = "//div[text()='Court & Custody']")
	private WebElementFacade lbl_CourtAndCustody;
	
	// For Institutional Report
	
	@FindBy(xpath="//a[contains(text(),'Institutional Report')]")
	private WebElementFacade lnk_InstitutionalReport;
	
	@FindBy(xpath="(//button[@ng-reflect-router-link='institutional-report,new'])[1]")
	private WebElementFacade btn_addInstitutionalReport;
	
	@FindBy(xpath="(//button[@ng-reflect-router-link='institutional-report,71'])[1]")
	private WebElementFacade btn_viewInstitutionalReport;
	
	@FindBy(xpath="(//button[@ng-reflect-router-link='institutional-report,71,edit'])[1]")
	private WebElementFacade btn_editInstitutionalReport;
	
	@FindBy(xpath="(//button[@ng-reflect-router-link='institutional-report,71,edit'])[1]/parent::td/following-sibling::td/button")
	private WebElementFacade btn_deleteInstitutionalReport;
	
	
	public void clickOnInstitutionalReportLnk() {
		waitForPresenceOf("//a[contains(text(),'Institutional Report')]");
		lnk_InstitutionalReport.click();
		waitABit(1000);
	}
	
	public void clickAddInstitutionalReportBtn(){
		waitForTextToAppear(lnk_InstitutionalReport.getText(),20000);
		clickOnInstitutionalReportLnk();
		if (btn_addInstitutionalReport.isCurrentlyVisible()) {
			btn_addInstitutionalReport.click();
			waitABit(1000);
		} else
			System.out.println("add btn is not available for Institutional Report.");
	}
    
	public void clickViewInstitutionalReportBtn() {
		waitForTextToAppear(lnk_InstitutionalReport.getText(),20000);
		clickOnInstitutionalReportLnk();
	if (btn_viewInstitutionalReport.isCurrentlyVisible()) {
			btn_viewInstitutionalReport.click();
			waitABit(1000);
		} else
			System.out.println("Institutional Report not available for this offender");
	}
	
	
	public void clickEditInstitutionalReportBtn() {
		waitForTextToAppear(lnk_InstitutionalReport.getText(),20000);
		if (!btn_editInstitutionalReport.isCurrentlyVisible()) {
			waitABit(500);
			clickOnInstitutionalReportLnk();

			if (btn_editInstitutionalReport.isCurrentlyVisible()) {
				btn_editInstitutionalReport.click();
				waitABit(500);
			} else
				System.out.println("no record for Institutional Report is available ... add Institutional Report record first then click on edit button");
		}
	}
	
	public void clickDeleteInstitutionalReportBtn() {
		waitForTextToAppear(lnk_InstitutionalReport.getText(),20000);
		if (!btn_deleteInstitutionalReport.isCurrentlyVisible()) {
			waitABit(500);
			clickOnInstitutionalReportLnk();

			if (btn_deleteInstitutionalReport.isCurrentlyVisible()) {
				btn_deleteInstitutionalReport.click();
				waitABit(500);
			} else
				System.out.println("no record for Institutional Report is available ... add Institutional Report record first then click on delete button");
		}
	}
	
	//----------------------Custody Location-----------------------------------------
	@FindBy(xpath = "//a[contains(text(),'Custody Location')]")
	private WebElementFacade lnk_CustodyLocn;


	//Custody Location table labels xpaths	
	@FindBy(xpath = "(//span[text()='current Location'])")
	private  WebElementFacade lbl_currentLocation;
	@FindBy(xpath = "(//span[text()='location Start Date'])")
	private  WebElementFacade lbl_locnStartDate;
	@FindBy(xpath = "(//span[text()='prisoner Number'])")
	private  WebElementFacade lbl_prisonerNumber;
	@FindBy(xpath = "(//span[text()='parole Number'])")
	private  WebElementFacade lbl_paroleNumber;
	@FindBy(xpath = "(//span[text()='probation Contact'])")
	private  WebElementFacade lbl_probationContact;
	@FindBy(xpath = "(//span[text()='prison Officer'])")
	private  WebElementFacade lbl_prisonOfficer;
	
	
	//Custody Location Table cell values xpaths 
/*	@FindBy(xpath = "//th[contains(text(),'View')]") 
	private  WebElementFacade value_releaseDate;  
	@FindBy(xpath = "(//span[text()='release Type'])")
	private  WebElementFacade value_releaseType;
	
	
	public String CustodyLocnDetails(){
		return value_releaseDate.getText().trim();
	}*/
	
	public void clickOnCustodyLocnLnk() {
		lnk_CustodyLocn.click();
		waitABit(500);

	}

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'custodylocation,141')])[1]")
	private WebElementFacade btn_viewCustodyLocn;

	public void clickViewCustodyLocnBtn() {
		if (!btn_viewCustodyLocn.isCurrentlyVisible()) {
			lnk_CustodyLocn.click();
			waitABit(500);
		}
		try {
			btn_viewCustodyLocn.click();
			waitABit(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
		@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'custodylocation,141,edit')])")
		private WebElementFacade btn_updateCustodyLocn;
		
		public void clickUpdateCustodyLocnBtn() {
			if (!btn_viewCustodyLocn.isCurrentlyVisible()) {
				waitFor(lnk_CustodyLocn);

				lnk_CustodyLocn.click();
				waitABit(500);

				if (btn_updateCustodyLocn.isPresent()) {
					btn_updateCustodyLocn.click();
					waitABit(1000);
				} else
					System.out.println("Custody Location update is locked");
			}
		}
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_InstitutionalReport ;

}
}

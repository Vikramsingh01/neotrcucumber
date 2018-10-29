package com.meganexus.pageObjectLib;

import com.meganexus.pageObjectLib.NeoTR_Page;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


@SuppressWarnings("deprecation")
public class RateCardInterVentionPage extends NeoTR_Page {
	
	//For Rate card list table offender details page
	@FindBy(xpath="")
	private WebElementFacade table;
	
	@FindBy(xpath = "//input[@ng-reflect-name='interventionStatusDate']")
	private WebElementFacade tbx_interVentionStatusDate;
	@FindBy(xpath = "//input[@ng-reflect-name='referralDate']")
	private WebElementFacade tbx_referralDate;
	@FindBy(xpath = "//select[@ng-reflect-name='interventionStatusId']")
	private WebElementFacade ddl_interventionStatus;
	@FindBy(xpath = "//select[@ng-reflect-name='interventionTypeMainCategoryId']")
	private WebElementFacade ddl_interventionTypeMainCategory;
	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade tbx_notes;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElementFacade btn_save;
	@FindBy(xpath = "//select[@ng-reflect-name='interventionProviderId']")
	private WebElementFacade ddl_interVentionProvider;
	
	
	//Validate fields in view Rate card intervention for labels 
	
	
	
	@FindBy(xpath="//div[contains(text(),'intervention Status Date')]") //For  label text
	private WebElementFacade lbl_InterventionStatusDate;
	@FindBy(xpath="//div[contains(text(),'referral Date')]")
	private WebElementFacade lbl_ReferralDate;
	@FindBy(xpath="//div[text()='intervention Status ']")
	private WebElementFacade lbl_InterventionStatus;
	@FindBy(xpath="//div[text()='expected Start Date ']")
	private WebElementFacade lbl_ExpectedStartDate;
	@FindBy(xpath="//div[text()='actual Start Date ']")
	private WebElementFacade lbl_ActualStartDate;
	@FindBy(xpath="//div[text()='length ']")
	private WebElementFacade lbl_length;
	@FindBy(xpath="//div[text()='expected End Date ']")
	private WebElementFacade lbl_ExpectedEndDate;
	@FindBy(xpath="//div[text()='actual End Date ']")
	private WebElementFacade lbl_ActualEndDate;
	@FindBy(xpath="//div[text()='intervention Outcome ']")
	private WebElementFacade lbl_InterventionOutcome;
	@FindBy(xpath="//div[text()='attendance Count ']")
	private WebElementFacade lbl_AttendanceCount;
	@FindBy(xpath="//div[text()='intended Provider ']")	
	private WebElementFacade lbl_IntendedProvider;
	@FindBy(xpath="//div[text()='intervention Provider ']")
	private WebElementFacade lbl_InterventionProvider;
	@FindBy(xpath="//div[text()='intervention Type Main Category ']")
	private WebElementFacade lbl_InterTypeMainCategory;
	@FindBy(xpath="//div[text()='intervention Type Sub Category ']")
	private WebElementFacade lbl_InterTypeSubCategory;
	@FindBy(xpath="//div[text()='notes ']")
	private WebElementFacade lbl_Notes;
	
	

	public void enterRateCardInterVentionDetails() {
		tbx_interVentionStatusDate.sendKeys("03/03/2010");
		waitABit(100);
		tbx_referralDate.sendKeys("03/03/2010");
		waitABit(100);
		ddl_interventionStatus.selectByVisibleText("Breach Proven - Order to Continue");
		waitABit(100);
		ddl_interVentionProvider.selectByVisibleText("NPS South West and South Central");
		waitABit(100);
		ddl_interventionTypeMainCategory.selectByVisibleText("OPD Community Pathway");
		waitABit(100);
		tbx_notes.sendKeys("Rate Card added");
	}

	public void updateRateCardInterVentionDetails() {
		tbx_interVentionStatusDate.clear();
		waitABit(100);
		tbx_interVentionStatusDate.sendKeys("11/03/2010");
		waitABit(100);
		tbx_referralDate.clear();
		waitABit(100);
		tbx_referralDate.sendKeys("13/03/2010");
		waitABit(100);
		ddl_interventionStatus.selectByVisibleText("Warrant Issued");
		waitABit(100);
		ddl_interVentionProvider.selectByVisibleText("NPS London");
		waitABit(100);
		ddl_interventionTypeMainCategory.selectByVisibleText("CRC Parole Report Request");
		waitABit(100);
		tbx_notes.sendKeys("Rate Card updated");

	}


	@FindBy(xpath = "//h2[text()='VIEW rate Card Intervention']")
	private WebElementFacade txt_viewRateCardIntervention;

	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	
	//Method to Validate fields in view Rate card intervention 
	
	public void validateLabelFields	() 
	{
		Assert.assertTrue("Intervention status Date is not available",
				lbl_InterventionStatusDate.getText().trim().equals("Intervention Status Date"));
		Assert.assertTrue("Referral date is not available", 
				lbl_ReferralDate.getText().trim().equals("Referral Date"));
		Assert.assertTrue("Intervention status is not available",
				lbl_InterventionStatus.getText().trim().equals("Intervention Status"));
		Assert.assertTrue("Expected start Date is not available",
				lbl_ExpectedStartDate.getText().trim().equals("Expected Start Date"));
		Assert.assertTrue("Actual Start Date is not available",
				lbl_ActualStartDate.getText().trim().equals("Actual Start Date"));
		Assert.assertTrue("Length field is not available",
				lbl_length.getText().trim().equals("Length"));
		Assert.assertTrue("Exp. End date is not available",
				lbl_ExpectedEndDate.getText().trim().equals("Expected End Date"));
		Assert.assertTrue("Actual End Date is not available",
				lbl_ActualEndDate.getText().trim().equals("Actual End Date"));
		Assert.assertTrue("intervention Outcome is not available",
				lbl_InterventionOutcome.getText().trim().equals("Intervention Outcome"));
		Assert.assertTrue("Attendance Count did not display ", 
				lbl_AttendanceCount.getText().trim().equals("Attendance Count"));
		Assert.assertTrue("Intended Provider is not available",
				lbl_IntendedProvider.getText().trim().equals("Intended Provider"));
		Assert.assertTrue("Intervention Provider",
				lbl_InterventionProvider.getText().trim().equals("Intervention Provider"));
		Assert.assertTrue("Intervention Type Main Category did not display ", 
				lbl_InterTypeMainCategory.getText().trim().equals("Intervention Type Main Category"));
		Assert.assertTrue("intervention Type Sub Category is not available",
				lbl_InterTypeSubCategory.getText().trim().equals("Intervention Type Sub Category"));
		Assert.assertTrue("Notes is not present",
				lbl_Notes.getText().trim().equals("Notes"));
		
	}
	
	

	public void addRateCardVerification() {
		Assert.assertTrue("view rate card intervention text is not available",
				txt_viewRateCardIntervention.getText().trim().equals("VIEW RATE CARD INTERVENTION"));
		Assert.assertTrue("back button is not available", btn_back.getText().trim().equals("BACK"));

	}
	public void editRateCardVerification(){
		Assert.assertTrue("view rate card intervention text is not available",
				txt_viewRateCardIntervention.getText().trim().equals("VIEW RATE CARD INTERVENTION"));
		Assert.assertTrue("back button is not available", btn_back.getText().trim().equals("BACK"));

	}
	

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return tbx_interVentionStatusDate;
	}

}

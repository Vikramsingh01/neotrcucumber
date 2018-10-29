//# Ankita 
package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
@SuppressWarnings("deprecation")
public class PersonalCircumtancePage extends NeoTR_Page {

	String circumtanceType =  GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PERSONAL CIRCUMSTANCE TYPE",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//PersonalCircumstance", "./CircumstanceType"));
	String circumstanceSubType = GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PERSONAL CIRCUMSTANCE SUBTYPE",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//PersonalCircumstance", "./CircumstanceSubType"));
	String startDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AO.xml", "//PersonalCircumstance", "./StartDate"));
	String endDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AO.xml", "//PersonalCircumstance", "./EndDate"));
	String evidencedYesNoId = GetSRD_or_NSRDValue.getUIValue_from_SRD20("",
			ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalCircumstance", "./Evidenced"));
	String notes = ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalCircumstance", "./Notes");
	
	@FindBy(xpath = "//select[@ng-reflect-name='circumstanceTypeId']")
	private WebElementFacade ddl_circumtanceType;
	@FindBy(xpath = "//select[@ng-reflect-name='circumstanceSubTypeId']")
	private WebElementFacade ddl_circumstanceSubType;
	@FindBy(xpath = "//input[@id='startDate']")
	private WebElementFacade tbx_startDate;
	@FindBy(xpath = "//input[@id='endDate']")
	private WebElementFacade tbx_endDate;
	@FindBy(xpath = "//select[@id='evidencedYesNoId']")
	private WebElementFacade ddl_evidencedYesNoId;
	@FindBy(xpath = "//textarea[@id='note']")
	private WebElementFacade tbx_notes;
	
	@FindBy(xpath = "//div[text()='Circumstance Type']/following-sibling::p")
	private WebElementFacade value_circumtanceType;
	@FindBy(xpath = "//div[text()='Circumstance Sub Type']/following-sibling::p")
	private WebElementFacade value_circumtanceSubType;
	@FindBy(xpath = "//div[text()='Start Date']/following-sibling::p")
	private WebElementFacade value_startDate;
	@FindBy(xpath = "//div[text()='End Date']/following-sibling::p")
	private WebElementFacade value_endDate;
	@FindBy(xpath = "//div[text()='Evidenced']/following-sibling::p")
	private WebElementFacade value_evidenced;
	@FindBy(xpath = "//div[text()='Note']/following-sibling::p")
	private WebElementFacade value_notes;
	
	@FindBy(xpath = "//div[text()='Circumstance Type']")
	private WebElementFacade lbl_circumtanceType;
	@FindBy(xpath = "//div[text()='Circumstance Sub Type']")
	private WebElementFacade lbl_circumtanceSubType;
	@FindBy(xpath = "//div[text()='Start Date']")
	private WebElementFacade lbl_startDate;
	@FindBy(xpath = "//div[text()='End Date']")
	private WebElementFacade lbl_endDate;
	@FindBy(xpath = "//div[text()='Evidenced']")
	private WebElementFacade lbl_evidenced;
	@FindBy(xpath = "//div[text()='Note']")
	private WebElementFacade lbl_notes;
	
	@FindBy(xpath = "//h2[contains(text(),'VIEW Personal Circumstance')]")
	private WebElementFacade txt_viewpersonalcircumtance;

	@FindBy(xpath = "//h2[contains(text(),'ADD personal Circumstance')]")
	private WebElementFacade txt_addpersonalcircumtance;
	
	public void addnewPersonalCircumtanceDetails() {
		circumtanceType = "Accommodation" ;
		circumstanceSubType = "Bail/Probation Hostel";
		startDate = "08/08/2016";
		endDate = "06/12/2016";
		evidencedYesNoId = "No";
		notes = "PC added";
		ddl_circumtanceType.selectByVisibleText(circumtanceType);
		waitABit(100);
		ddl_circumstanceSubType.selectByVisibleText(circumstanceSubType);
		waitABit(100);
		tbx_startDate.sendKeys(startDate);
		waitABit(100);
		tbx_endDate.sendKeys(endDate);
		waitABit(100);
		ddl_evidencedYesNoId.selectByVisibleText(evidencedYesNoId);
		waitABit(100);
		tbx_notes.sendKeys(notes);
	}

	
	public void validatePersCircumtanceDetails() {
		waitABit(500);
//		Assert.assertTrue("View Personal Circumtance text is not available",
//				txt_viewpersonalcircumtance.getText().trim().equals("VIEW Personal Circumstance"));
		Assert.assertTrue("Circumstance Type label is not available",
				lbl_circumtanceType.getText().trim().equals("Circumstance Type"));
		Assert.assertTrue("Circumstance Sub Type label is not available",
				lbl_circumtanceSubType.getText().trim().equals("Circumstance Sub Type"));
		Assert.assertTrue("Start Date label is not available",
				lbl_startDate.getText().trim().equals("Start Date"));
		Assert.assertTrue("End Date label is not available",
				lbl_endDate.getText().trim().equals("End Date"));
		Assert.assertTrue("Evidenced label is not available",
				lbl_evidenced.getText().trim().equals("Evidenced"));
		Assert.assertTrue("Notes label is not available",
				lbl_notes.getText().trim().equals("Note"));
		
		System.out.println(circumtanceType);
		System.out.println(circumstanceSubType);
		System.out.println(evidencedYesNoId);
		System.out.println(notes);
		
		Assert.assertTrue("Circumtance type value not matched",
				value_circumtanceType.getText().trim().equals(circumtanceType));
		Assert.assertTrue("Circumtance sub type value not matched",
				value_circumtanceSubType.getText().trim().equals(circumstanceSubType));
		Assert.assertTrue("Start Date value not matched", value_startDate.getText().trim().equals(startDate));
		Assert.assertTrue("End Date value not matched", value_endDate.getText().trim().equals(endDate));
//         Assert.assertTrue("Evidenced value not matched",
//         value_evidenced.getText().trim().equals(evidencedYesNoId));
//         Assert.assertTrue("Personal Circumtance notes value not matched",
//           value_notes.getText().trim().equals(notes));
	                                                                                                                                                                                  
	}
	
	
	
	public void updatePersonalCircumtanceDetails() {
		startDate = "11/03/2010";
		endDate = "13/03/2010";
		evidencedYesNoId = "Yes";
		notes = "Personal Circumtance Updated";

		tbx_startDate.clear();
		waitABit(100);
		tbx_startDate.sendKeys(startDate);
		waitABit(100);
		tbx_endDate.clear();
		waitABit(100);
		tbx_endDate.sendKeys(endDate);
		waitABit(100);
		ddl_evidencedYesNoId.selectByVisibleText(evidencedYesNoId);
		waitABit(100);
		tbx_notes.clear();
		waitABit(100);
		tbx_notes.sendKeys(notes);
	 }
	 

	public void clickSaveBtn() {
		clickSaveBtn();
	}
	
	@FindBy(xpath = "//h2[contains(text(),'Edit Personal Circumstance')]")
	private WebElementFacade txt_editpersonalcircumtance;
	
	@FindBy(xpath = "//label[@for='circumstanceTypeId']")
	private WebElementFacade lbl_editCircumtanceType;
	@FindBy(xpath = "//label[@for='circumstanceSubTypeId']")
	private WebElementFacade lbl_editCircumtanceSubType;
	@FindBy(xpath = "//label[@for='startDate']")
	private WebElementFacade lbl_editStartDate;
	@FindBy(xpath = "//label[@for='endDate']")
	private WebElementFacade lbl_editEndDate;
	@FindBy(xpath = "//label[@for='evidencedYesNoId']")
	private WebElementFacade lbl_editEvidenced;
	@FindBy(xpath = "//label[@for='note']")
	private WebElementFacade lbl_editNotes;

	public void verifyLabelsForEditPage() {
		waitABit(10000);
		System.out.println(txt_editpersonalcircumtance.getText().trim());
		Assert.assertTrue("Edit Personal Circumtance text is not available",
				txt_editpersonalcircumtance.getText().trim().equals("EDIT PERSONAL CIRCUMSTANCE"));
		Assert.assertTrue("Circumstance Type label is not available",
				lbl_editCircumtanceType.getText().trim().equals("Circumstance Type *"));
		Assert.assertTrue("Circumstance Sub Type label is not available",
				lbl_editCircumtanceSubType.getText().trim().equals("Circumstance Sub Type *"));
		Assert.assertTrue("Start Date label is not available",
				lbl_editStartDate.getText().trim().equals("Start Date *"));
		Assert.assertTrue("End Date label is not available",
				lbl_editEndDate.getText().trim().equals("End Date"));
		Assert.assertTrue("Evidenced label is not available",
				lbl_editEvidenced.getText().trim().equals("Evidenced"));
		Assert.assertTrue("Notes label is not available",
				lbl_editNotes.getText().trim().equals("Note"));
		
	}

	public void enterInvalidData() {
		startDate = "11/03/2020";
		endDate = "13/03/2020";
		evidencedYesNoId = "Undefined";
		notes = "Personal Circumtance Updated";

		tbx_startDate.clear();
		waitABit(100);
		tbx_startDate.sendKeys(startDate);
		waitABit(100);
		tbx_endDate.clear();
		waitABit(100);
		tbx_endDate.sendKeys(endDate);
		waitABit(100);
		ddl_evidencedYesNoId.selectByVisibleText(evidencedYesNoId);
		waitABit(100);
		tbx_notes.clear();
		waitABit(100);
		tbx_notes.sendKeys(notes);
	}

	@SuppressWarnings("deprecation")
	public void addPersonalCircumtanceVerification() {
		Assert.assertTrue("Add Personal Circumtance text is not available",
				txt_addpersonalcircumtance.getText().trim().equals("ADD PERSONAL CIRCUMTANCES"));
	
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return tbx_startDate;
	}
	
	@FindBy(xpath = "//button[@id='submitButton']")
	private WebElementFacade btn_submit;

	public void clickOnSubmitBtn() {
		btn_submit.click();
	}

}

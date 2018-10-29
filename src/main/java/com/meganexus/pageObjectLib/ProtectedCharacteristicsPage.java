package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import junit.framework.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProtectedCharacteristicsPage extends NeoTR_Page
{
	String ethnicity = GetSRD_or_NSRDValue.getUIValue_from_SRD20("ETHNICITY",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./REMMainCategory"));
	String nationality = GetSRD_or_NSRDValue.getUIValue_from_SRD20("NATIONALITY",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Nationality"));
	String second_nationality = GetSRD_or_NSRDValue.getUIValue_from_SRD20("NATIONALITY",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SecondNationality"));
	String perfered_language = GetSRD_or_NSRDValue.getUIValue_from_SRD20("LANGUAGE",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Language"));
	
	String interpreter_required = GetSRD_or_NSRDValue.getUIValue_from_SRD20(" ","Y");
//			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./InterpreterRequired").toString());
	String immigration_status = GetSRD_or_NSRDValue.getUIValue_from_SRD20("IMMIGRATION STATUS",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ImmigrationStatus"));

	String immigration_number = ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ImmigrationNumber");
	String religion_belief = GetSRD_or_NSRDValue.getUIValue_from_SRD20("RELIGION/FAITH",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReligionOrFaith"));


	
	@FindBy(xpath="//h2[contains(text(),'Protected Characteristics')]")
	private WebElementFacade hdr_Viewheader;
	
	//---------------------For Ethnicity---------------------------------------
	@FindBy(xpath="//div[contains(text(),'Ethnicity')]")
	private WebElementFacade lbl_Ethnicity;
	
	@FindBy (xpath="//div[contains(text(),'Ethnicity')]/following-sibling::p")
	private WebElementFacade value_Ethnicity;
	//----------------------------Nationality------------------------------------
	@FindBy (xpath="//div[text()='Nationality']")
	private WebElementFacade lbl_Nationality;
	
	@FindBy (xpath="//div[text()='Nationality']/following-sibling::p")
	private WebElementFacade value_Nationality;
	//---------------------------Second Nationality-------------------------------
	@FindBy(xpath="//div[text()='Second Nationality']")
	private WebElementFacade lbl_SecondNationality;
	
	@FindBy (xpath="//div[text()='Second Nationality']/following-sibling::p")
	private WebElementFacade value_SecondNationality;
	//--------------------------Language--------------------------------------------
	@FindBy (xpath="//div[contains(text(),'Language')]")
	private WebElementFacade lbl_Language;
	
	@FindBy(xpath="//div[contains(text(),'Language')]/following-sibling::p")
	private WebElementFacade value_Language;
	// --------------------------Interpreter_required--------------------------------------------
	@FindBy(xpath = "//div[contains(text(),'Interpreter Required')]")
	private WebElementFacade lbl_interpreter;

	@FindBy(xpath = "//div[contains(text(),'Interpreter Required')]/following-sibling::p")
	private WebElementFacade value_interpreter;
	// --------------------------Immigration Status--------------------------------------------
	@FindBy(xpath = "//div[contains(text(),'Immigration Status')]")
	private WebElementFacade lbl_immigration_status;

	@FindBy(xpath = "//div[contains(text(),'Immigration Status')]/following-sibling::p")
	private WebElementFacade value_immigration_status;
	// --------------------------Immigration Number--------------------------------------------
	@FindBy(xpath = "//div[contains(text(),'Immigration Number')]")
	private WebElementFacade lbl_immigration_number;

	@FindBy(xpath = "//div[contains(text(),'Immigration Number')]/following-sibling::p")
	private WebElementFacade value_immigration_number;
	// --------------------------Religion or Belief--------------------------------------------
	@FindBy(xpath = "//div[contains(text(),'Religion or Belief')]")
	private WebElementFacade lbl_religion;

	@FindBy(xpath = "//div[contains(text(),'Religion or Belief')]/following-sibling::p")
	private WebElementFacade value_religion;
		
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	public void validateProCharDetails() {
		waitABit(500);
		Assert.assertTrue("Protected Characteristics text is not matching",
				hdr_Viewheader.getText().trim().equals("PROTECTED CHARACTERISTICS"));
		Assert.assertTrue("Ethinicity text is not matching",
				lbl_Ethnicity.getText().trim().equals("Ethnicity"));
		Assert.assertTrue("Nationality text is not matching",
				lbl_Nationality.getText().trim().equals("Nationality"));
		Assert.assertTrue("Second Nationality text is not matching",
				lbl_SecondNationality.getText().trim().equals("Second Nationality"));
		Assert.assertTrue("Language text is not matching",
				lbl_Language.getText().trim().equals("Preferred Language"));
		Assert.assertTrue("Interpreter Required text is not matching",
				lbl_interpreter.getText().trim().equals("Interpreter Required"));
		Assert.assertTrue("Immigration Status text is not matching",
				lbl_immigration_status.getText().trim().equals("Immigration Status"));
		Assert.assertTrue("Immigration Number text is not matching",
				lbl_immigration_number.getText().trim().equals("Immigration Number"));
		Assert.assertTrue("Religion or Belief text is not matching",
				lbl_religion.getText().trim().equals("Religion Or Belief"));
	}

	@SuppressWarnings("deprecation")
	public void validateProCharWithInbound() {
		
		Assert.assertTrue("Ethnicity value not matched",
				value_Ethnicity.getText().trim().equals(ethnicity));
		Assert.assertTrue("Nationality value not matched",
				value_Nationality.getText().trim().equals(nationality));
		Assert.assertTrue("Second Nationality value not matched",
				value_SecondNationality.getText().trim().equals(second_nationality));
		Assert.assertTrue("Language value not matched",
				value_Language.getText().trim().equals(perfered_language));
		Assert.assertTrue("interpreter value not matched",
				value_interpreter.getText().trim().equals(interpreter_required));
		Assert.assertTrue("immigration_status value not matched",
				value_immigration_status.getText().trim().equals(immigration_status));
		Assert.assertTrue("immigration_number value not matched",
				value_immigration_number.getText().trim().equals(immigration_number));
		Assert.assertTrue("religion value not matched",
				value_religion.getText().trim().equals(religion_belief));
	}
	
	@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'edit')]")
	private WebElementFacade btn_edit;
	
	public void clickEditBtn() {
		btn_edit.click();
	}
	
	@FindBy(xpath = "//select[@id='ethnicityId']")
	private WebElementFacade ddl_editEthinicity;
	
	@FindBy(xpath = "//select[@id='nationalityId']")
	private WebElementFacade ddl_editNationality;
	
	@FindBy(xpath = "//select[@id='secondNationalityId']")
	private WebElementFacade ddl_editSecondNationality;
	
	@FindBy(xpath = "//select[@id='languageId']")
	private WebElementFacade ddl_editLanguage;
	
	@FindBy(xpath = "//select[@id='immigrationStatusId']")
	private WebElementFacade ddl_editImmigrationStatus;
	
	@FindBy(xpath = "//input[@id='immigrationNumber']")
	private WebElementFacade tbx_editImmigrationNo;
	
	@FindBy(xpath = "//select[@id='religionId']")
	private WebElementFacade ddl_editReligion;
	
	public void editProChar() {
		ddl_editEthinicity.selectByVisibleText(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./ethnicity"));
		waitABit(500);
		ddl_editNationality.selectByVisibleText(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./nationality"));
		waitABit(500);
		ddl_editSecondNationality.selectByVisibleText(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./second_nationality"));
		waitABit(500);
		ddl_editLanguage.selectByVisibleText(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./perfered_language"));
		waitABit(500);
		ddl_editImmigrationStatus.selectByVisibleText(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./immigration_status"));
		waitABit(500);
		tbx_editImmigrationNo.sendKeys(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./immigration_number"));
		waitABit(500);
		ddl_editReligion.selectByVisibleText(
				ReadXMLData.getXMLData("TestData.xml", "//ProtectedCharacteristics_UPD", "./religion_belief"));
		waitABit(500);
	}
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElementFacade btn_submit;

	public void clickOnSubmitBtn() {
		btn_submit.click();
	}

	@SuppressWarnings("deprecation")
	public void validateEditedProChar() {
		Assert.assertTrue("Ethnicity value not matched",
				value_Ethnicity.getText().trim().equals("Asian or Asian British: Bangladeshi"));
		Assert.assertTrue("Nationality value not matched",
				value_Nationality.getText().trim().equals("American"));
		Assert.assertTrue("Second Nationality value not matched",
				value_SecondNationality.getText().trim().equals("American Samoan"));
		Assert.assertTrue("Language value not matched",
				value_Language.getText().trim().equals("Bengali"));
		Assert.assertTrue("immigration_status value not matched",
				value_immigration_status.getText().trim().equals("UK National"));
		Assert.assertTrue("immigration_number value not matched",
				value_immigration_number.getText().trim().equals("12345"));
		Assert.assertTrue("religion value not matched",
				value_religion.getText().trim().equals("Christadelphian"));
		
	}

	@SuppressWarnings("deprecation")
	public void validateUPDoutbound() {
		Assert.assertTrue("UPD outbound xml should generate", ReadXMLData
				.getXMLData("outboundXML/UPDProChar.xml", "//SPGMessageHeader", "./MessageType").equals("UPD"));
	}

	public void addNewProChar() {
		// TODO Auto-generated method stub
		
	}

	public void validateNewProChar() {
		// TODO Auto-generated method stub
		
	}

	public void validateINSoutbound() {
		// TODO Auto-generated method stub
		
	}

	

}

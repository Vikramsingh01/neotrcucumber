package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import com.meganexus.genericLib.DateFormatter;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class AliasPage extends NeoTR_Page {
	
	@FindBy(xpath = "//a[contains(text(),'alias')]")
	private WebElementFacade lnk_alias;
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElementFacade tbx_firstName;
	@FindBy(xpath = "//input[@id='secondName']")
	private WebElementFacade tbx_secondName;
	@FindBy(xpath = "//input[@id='thirdName']")
	private WebElementFacade tbx_thirdName;
	@FindBy(xpath = "//input[@id='familyName']")
	private WebElementFacade tbx_familyName;
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	private WebElementFacade tbx_dateOfBirth;
	@FindBy(xpath = "//select[@id='genderId']")
	private WebElementFacade ddl_genderId;
	
	String firstName = ReadXMLData.getXMLData("inboundXML/AO.xml", "//Alias", "./FirstName");
	String secondName = ReadXMLData.getXMLData("inboundXML/AO.xml", "//Alias", "./SecondName");
	String thirdName = ReadXMLData.getXMLData("inboundXML/AO.xml", "//Alias", "./ThirdName");
	String familyName = ReadXMLData.getXMLData("inboundXML/AO.xml", "//Alias", "./FamilyName");
	String dateOfBirth = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AO.xml", "//Alias", "./DateOfBirth"));
	String gender = GetSRD_or_NSRDValue.getUIValue_from_SRD20("GENDER",
			ReadXMLData.getXMLData("inboundXML/Alias.xml", "//Alias", "./Gender"));
	
	public void updateValidAliasDetails() {
		
		firstName = "firstnamupdate";
		secondName = "secnameupadate";
		thirdName = "thirnameupadate";
		familyName = "rasi";
		dateOfBirth = "02/11/1988";
		gender = "Male";
		
		tbx_firstName.clear();
		waitABit(100);
		tbx_firstName.sendKeys(firstName);
		waitABit(100);
		tbx_secondName.clear();
		waitABit(100);
		tbx_secondName.sendKeys(secondName);
		waitABit(100);
		tbx_thirdName.clear();
		waitABit(100);
		tbx_thirdName.sendKeys(thirdName);
		waitABit(100);
		tbx_familyName.clear();
		waitABit(100);
		tbx_familyName.sendKeys(familyName);
		waitABit(100);
		tbx_dateOfBirth.clear();
		waitABit(100);
		tbx_dateOfBirth.clear();
		tbx_dateOfBirth.sendKeys(dateOfBirth);
		waitABit(100);
		ddl_genderId.selectByVisibleText(gender);
		waitABit(1000);
	}

	public void addValidAliasDetails() {
		firstName = "aliasone";
		secondName = "secnameone";
		thirdName = "thirnameone";
		familyName = "rasi";
		dateOfBirth = "02/11/1988";
		gender = "Male";
		
		tbx_firstName.sendKeys(firstName);
		tbx_secondName.sendKeys(secondName);
		tbx_thirdName.sendKeys(thirdName);
		tbx_familyName.sendKeys(familyName);
		tbx_dateOfBirth.sendKeys(dateOfBirth);
		ddl_genderId.selectByVisibleText(gender);
		waitABit(1000);
	}
	

	@FindBy(xpath = "//h2[text()='VIEW Alias']")
	private WebElementFacade txt_viewAlias;
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	
	@FindBy(xpath = "//div[@id='label_firstName']")
	private WebElementFacade lbl_firstName;
	@FindBy(xpath = "//div[@id='label_secondName']")
	private WebElementFacade lbl_secondName;
	@FindBy(xpath = "//div[@id='label_thirdName']")
	private WebElementFacade lbl_thirdName;
	@FindBy(xpath = "//div[@id='label_familyName']")
	private WebElementFacade lbl_familyName;
	@FindBy(xpath = "//div[@id='label_dateOfBirth']")
	private WebElementFacade lbl_dob;
	@FindBy(xpath = "//div[@id='label_genderId']")
	private WebElementFacade lbl_gender;
	
	@FindBy(xpath = "//p[@id='firstName']")
	private WebElementFacade txt_firstName;
	@FindBy(xpath = "//p[@id='secondName']")
	private WebElementFacade txt_secondName;
	@FindBy(xpath = "//p[@id='thirdName']")
	private WebElementFacade txt_thirdName;
	@FindBy(xpath = "//p[@id='familyName']")
	private WebElementFacade txt_familyName;
	@FindBy(xpath = "//p[@id='dateOfBirth']")
	private WebElementFacade txt_dob;
	@FindBy(xpath = "//div[@id='label_genderId']/following-sibling::p")
	private WebElementFacade txt_gender;

	public void aliasViewVerification() {
		//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		verifyBreadCrumbs("Service User Summary Profile View Alias");
		
		//verify the alias page labels
		Assert.assertTrue("View alias text is not available", txt_viewAlias.getText().equals("VIEW ALIAS"));
		Assert.assertTrue("back btn is not available", btn_back.getText().equals("BACK"));
		Assert.assertTrue("first Name label is not available", lbl_firstName.getText().equals("First Name"));
		Assert.assertTrue("second Name label is not available", lbl_secondName.getText().equals("Second Name"));
		Assert.assertTrue("third Name label is not available", lbl_thirdName.getText().equals("Third Name"));
		Assert.assertTrue("family Name label is not available", lbl_familyName.getText().equals("Family Name"));
		Assert.assertTrue("date of birth label is not available", lbl_dob.getText().equals("Date Of Birth"));
		Assert.assertTrue("gender label is not available", lbl_gender.getText().equals("Gender"));

	}
	
	public void validateAliasDetails() {
		Assert.assertTrue("first name value not matched", txt_firstName.getText().trim()
				.equals(firstName));
		Assert.assertTrue("second name value not matched", txt_secondName.getText().trim()
				.equals(secondName));
		Assert.assertTrue("third name value not matched", txt_thirdName.getText().trim()
				.equals(thirdName));
		Assert.assertTrue("family name value not matched", txt_familyName.getText().trim()
				.equals(familyName));
		Assert.assertTrue("date of birth value not matched", txt_dob.getText().trim()
				.equals(dateOfBirth));
		Assert.assertTrue("gender value not matched", txt_gender.getText().trim()
				.equals(gender));
		
	}
	
	

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_alias;
	}
	
	
	@FindBy(xpath = "//button[@id='saveButton']")
	private WebElementFacade btn_submit;
	public void clickSubmitButton() {
			if (btn_submit.isPresent()) {
				btn_submit.click();
				waitABit(1000);
			} else
				System.out.println("alias submit is not clickable.");
		}
}

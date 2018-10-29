
package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.matchers.statematchers.IsCurrentlyVisibleMatcher;


@SuppressWarnings("deprecation")
public class AdditionalIdentifierPage extends NeoTR_Page
{


	
	
//-------------------------Additional Identifier--------------------------------------------
	@FindBy(xpath ="//h2[contains(.,'VIEW Additional Identifier')]")
	private WebElementFacade txt_addAdditionalidentifier;
	@FindBy (xpath ="//a[contains(@id,'Additional Identifier')]")
	private WebElementFacade txt_AdditionalIdentifier;
	@FindBy(xpath="//label[@for='identifierTypeId']")
	private WebElementFacade lbl_identifierTypeId;
	@FindBy(xpath ="//select[contains(@id,'identifierTypeId')]")
	private WebElementFacade ddl_identifierTypeId;
	@FindBy(xpath ="//label[@for='identifier']")
	private WebElementFacade lbl_addidentifier;
	@FindBy(xpath="//input[@id='identifier']")
	private WebElementFacade tbx_identifier;
	@FindBy (xpath = "//button[contains(.,'Submit')]")
	private WebElementFacade btn_submit;
	@FindBy(xpath ="//button[contains(.,'Cancel')]")
	private WebElementFacade btn_cancel;
	@FindBy (xpath = "//select[contains(@id,'identifierTypeId')]")
	private WebElementFacade ddl_identifier;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElementFacade btn_Submit;
	
	String IdentifierType = GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDITIONAL IDENTIFIER TYPE",
			ReadXMLData.getXMLData("inboundXML/AO.xml", "//AdditionalIdentifier", "./IdentifierType"));
	String identifier = ReadXMLData.getXMLData("inboundXML/AO.xml", "//AdditionalIdentifier", "Identifier");
	
	/*public void backBtnNaviVerificationaddAditionalIdentifier() 
	{
		clickBackBtn();
		verifyBreadCrumbs("Service User Summary Profile Add Additional Identifier");
	}*/
	
	public void addAditionalIdentifierPage()
	{   
		IdentifierType="Duplicate Offender CRN";
		identifier="Serinity";
		
		
		ddl_identifier.selectByVisibleText(IdentifierType);
		tbx_identifier.sendKeys(identifier);
		waitABit(1000);
		btn_Submit.click();
	}
		public void AdditionalIdentifierViewVarification()
		{
			//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
			//verifyBreadCrumbs("Service User Summary Profile  View Additional Identifier");
			if (txt_addAdditionalidentifier.isCurrentlyVisible())
			{
				Assert.assertTrue("View additional Identifier text is not available", txt_addAdditionalidentifier.getText().equals("VIEW Additional Identifier"));
			}
			if (txt_AdditionalIdentifier.isCurrentlyVisible())
			{
				Assert.assertTrue("Identifier Heading did not match" ,txt_AdditionalIdentifier.getText().equals("Additional Identifier") );
			}
			if(lbl_identifierTypeId.isCurrentlyVisible())
			{
				Assert.assertTrue("Identifier Type Field label did not match", lbl_identifierTypeId.getText().equals("Identifier Type"));
			}
			
			if(lbl_addidentifier.isCurrentlyVisible())
			{
				Assert.assertTrue("Identifier Type Field label did not match",lbl_addidentifier.getText().equals("Identifier "));
			}
			/*
			if (btn_submit.isCurrentlyVisible())
			{
				Assert.assertTrue("Back btn is not available", btn_submit.getText().equals("Submit"));
			}*/
			/*if(btn_cancel.isCurrentlyVisible())
			{
				Assert.assertTrue("Cancel btn is not available",btn_cancel.getText().equals("Cancel") );
			}
			*/
			
		}
		@FindBy(xpath="(//div[@class='view-title']/following-sibling::p)[1]")
		private WebElementFacade txt_IdentifierType;
		
		@FindBy(xpath="(//div[@class='view-title']/following-sibling::p)[2]")
		private WebElementFacade txt_Identifier;
		
	
	
	/*// insert record for additional Identifier
			public void insertAditionalIdentifierPage()
			{
				ddl_identifier.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//AdditionalIdentifier_ADD", "./IdentifierType"));
				tbx_identifier.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//AdditionalIdentifier_ADD", "./Identifier"));
				btn_Submit.click();
			}*/

			public void validateAdditionalIdentifierDetails()
			{
			/*	System.out.println("First name"+ ddl_identifier.getText());
				System.out.println("Second"+ tbx_identifier.getText());*/
				//Assert.assertTrue("Additional Type value not matched", txt_IdentifierType.getText().trim().equals(IdentifierType));
				//Assert.assertTrue("Additional value not matched", txt_Identifier.getText().trim().equals(identifier));
			}
	
//---------------------View  details page----------------------------------------------
	
	

	@FindBy(xpath = "//button[contains(.,'Back')]")
	WebElementFacade btn_back;
	
	@FindBy(xpath = "//div[contains(text(),'Identifier Type')]")
	WebElementFacade lbl_identifierType;
	@FindBy (xpath ="//div[contains(text(),'Identifier Type')]/following-sibling::p")
	WebElementFacade value_identifierType;
	
	@FindBy(xpath ="(//div[contains(text(),'Identifier')])[2]")
	WebElementFacade lbl_viewidentifier;
	@FindBy(xpath = "(//div[contains(text(),'Identifier')])[2]/following-sibling::p")
	WebElementFacade value_viewidentifier;
	
	public void verifyAddedValueWithOutboundXML()
	{
	
		Assert.assertTrue("INS xml should generate",
				ReadXMLData
						.getXMLData("outboundXML/AddadditionalIdentifier.xml", "//SPGMessageHeader", "./MessageType")
						.equals("INS"));
		Assert.assertTrue("Identifier Type  does not match with IB Xml and ui",
				value_identifierType.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDITIONAL IDENTIFIER TYPE",
								ReadXMLData.getXMLData("outboundXML/AddadditionalIdentifier.xml", "//AdditionalIdentifier",
										"./IdentifierType"))));
		//Assert.assertTrue("Additional Type value not matched", txt_IdentifierType.getText().trim().equals(IdentifierType));
	}
	
	
	/*public void viewAditionalIdentifier()
	{
		verifyBreadCrumbs("Service User Summary Profile View Additional Identifier");
		if (txt_addAdditionalidentifier.isCurrentlyVisible())
		{
			Assert.assertTrue("View additional Identifier text is not available", txt_addAdditionalidentifier.getText().equals("VIEW Additional Identifier"));
		}
		else 
			System.out.println("VIEW Additional Identifier is not avalable");
		if (txt_addAdditionalidentifier.isCurrentlyVisible())
			
		{
			Assert.assertTrue("Back Button is not available", btn_back.getText().equals("Back"));
		}
		else 
			System.out.println("Back Button is not available");
		
		
	}*/
	
	
	
	
	
//----------------------------------------------------------------------
	/*@FindBy(xpath = ".//*[@id='identifierTypeId']")
	private WebElementFacade ddl_IdentifierType;
	
	@FindBy(xpath = "//input[@ng-reflect-name='identifier']")
	private WebElementFacade tbx_Identifier;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElementFacade btn_save;
	
	public void addAdditionalIdentifier()
	{
		ddl_IdentifierType.selectByVisibleText("Duplicate Offender CRN");
		tbx_Identifier.sendKeys("123456");
		btn_save.click();
		waitABit(3000);
		waitForCondition();
	}
	
	@FindBy(xpath = "//h2[text()='VIEW additional Identifier']")
	private WebElementFacade txt_AdnlIdentifierTitle;
   @FindBy(xpath = "//a[contains(text(),'Additional Identifier')]")
	private WebElementFacade txt_AdnlIdentifierTab;
   
   @FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
   
   @FindBy(xpath = "//div[contains(text(),'identifier Type')]")
   private WebElementFacade label_identifierType;
	
   @FindBy(xpath = "(//div[contains(text(),'identifier')])[2]")
   private WebElementFacade label_identifier;
	
   
   @FindBy(xpath = "//div[contains(text(),'identifier Type')]//following-sibling::*")
   private WebElementFacade value_identifierType;
	
   @FindBy(xpath = "(//div[contains(text(),'identifier')])[2]//following-sibling::*")
   private WebElementFacade value_identifier;
   
   @SuppressWarnings("deprecation")
	public void additionalIdentifierViewFieldVerification() {
		Assert.assertTrue("View additional Identifier text is not available", txt_AdnlIdentifierTitle.getText().trim().equals("VIEW additional Identifier"));
		Assert.assertTrue("back btn is not available", btn_back.getText().equals("BACK"));
		Assert.assertTrue("Identifier Type Field label did not match", label_identifierType.getText().trim().equals("identifier Type"));
		Assert.assertTrue("Identifier Type Field value did not match", ddl_IdentifierType.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDITIONAL IDENTIFIER TYPE",ReadXMLData.getXMLData("inboundXML/AO.xml", "//AdditionalIdentifier", "./IdentifierType"))));
		Assert.assertTrue("Identifier Type Field label did not match", label_identifierType.getText().trim().equals("identifier"));
		Assert.assertTrue("Identifier Type Field value did not match", tbx_Identifier.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AO.xml", "//AdditionalIdentifier", "./Identifier")));
   }*/
	
	
	@Override
	public WebElementFacade getUniqueElement() 
	{
	    return txt_addAdditionalidentifier;
	}
	
	
}

package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CustodyLocationPage extends EventViewPage{

	@FindBy(xpath = ".//*[@id='currentLocationId']")
	private WebElementFacade ddl_currLocn;
	
	@FindBy(xpath = ".//*[@id='locationStartDate']")
	private WebElementFacade date_locationStartDate;
	
	@FindBy(xpath = ".//*[@id='prisonerNumber']")
	private WebElementFacade tbx_prisonerNumber;
	
	@FindBy(xpath = ".//*[@id='paroleNumber']")
	private WebElementFacade tbx_paroleNumber;
	
	@FindBy(xpath = ".//*[@id='probationContact']")
	private WebElementFacade tbx_probationContact;
	
	@FindBy(xpath = ".//*[@id='pcTelephoneNumber']")
	private WebElementFacade tbx_pcTelephoneNumber;
	
	@FindBy(xpath = ".//*[@id='prisonOfficer']")
	private WebElementFacade tbx_prisonOfficer;
	
	@FindBy(xpath = ".//*[@id='poTelephoneNumber']")
	private WebElementFacade tbx_poTelephoneNumber;
	
	
	
	public void updateCustodyLocation() {
		ddl_currLocn.clear();
		waitABit(100);
		ddl_currLocn.selectByVisibleText("Stocken (HMP)");
		waitABit(100);
		date_locationStartDate.clear();
		waitABit(100);
		date_locationStartDate.sendKeys("12/12/2012");
		waitABit(100);
		tbx_prisonerNumber.clear();
		waitABit(100);
		tbx_prisonerNumber.sendKeys("1202");
		waitABit(100);
		tbx_prisonOfficer.clear();
		waitABit(100);
		tbx_prisonOfficer.selectByVisibleText("Alexander");
		waitABit(1000);
	}

	//View Page Locators
	@FindBy(xpath = "//h2[text()='VIEW custody Location']")
	private WebElementFacade txt_CustodyLocnTitle;
	
	@FindBy(xpath = "//a[contains(text(),'Custody Location')]")
	private WebElementFacade lnk_CustodyLocn;
   
   @FindBy(xpath = "//div[contains(text(),'location Start Date')]")
   private WebElementFacade lbl_locationStartDate;
	
   @FindBy(xpath = "//div[contains(text(),'current Location')]")
   private WebElementFacade lbl_currentLocation;
	
   @FindBy(xpath = "//div[contains(text(),'prisoner Number')]")
   private WebElementFacade lbl_prisonerNumber;
   
   @FindBy(xpath = "//div[contains(text(),'parole Number')]")
   private WebElementFacade lbl_paroleNumber;
   
   @FindBy(xpath = "//div[contains(text(),'probation Contact')]")
   private WebElementFacade lbl_probationContact;
   
   @FindBy(xpath = "//div[contains(text(),'PC Telephone Number')]")
   private WebElementFacade lbl_PcTelephoneNumber;
   
   @FindBy(xpath = "//div[contains(text(),'prison Officer')]")
   private WebElementFacade lbl_prisonOfficer;
   
   @FindBy(xpath = "//div[contains(text(),'PO Telephone Number')]")
   private WebElementFacade lbl_POTelephoneNumber;
   
   
   
//Locators for field values  
	
   @FindBy(xpath = "//div[contains(text(),'current Location')]//following-sibling::*")
   private WebElementFacade value_currentLocation;
   
  @FindBy(xpath = "//div[contains(text(),'location Start Date')]//following-sibling::*")
  private WebElementFacade value_locationStartDate;

	@FindBy(xpath = "//div[contains(text(),'prisoner Number')]//following-sibling::*")
  private WebElementFacade value_prisonerNumber;
  
  @FindBy(xpath = "//div[contains(text(),'parole Number')]//following-sibling::*")
  private WebElementFacade value_paroleNumber;
  
  @FindBy(xpath = "//div[contains(text(),'probation Contact')]//following-sibling::*")
  private WebElementFacade value_probationContact;
  
  @FindBy(xpath = "//div[contains(text(),'PC Telephone Number')]//following-sibling::*")
  private WebElementFacade value_PcTelephoneNumber;
  
  @FindBy(xpath = "//div[contains(text(),'prison Officer')]//following-sibling::*")
  private WebElementFacade value_prisonOfficer;
  
  @FindBy(xpath = "//div[contains(text(),'PO Telephone Number')]//following-sibling::*")
  private WebElementFacade value_POTelephoneNumber;
   
   //
   @SuppressWarnings("deprecation")
	public void custodyLocationViewFieldVerification() {
		Assert.assertTrue("VIEW custody Location text is not available", txt_CustodyLocnTitle.getText().trim().equals("VIEW custody Location"));
		//Assert.assertTrue("back btn is not available", btn_back.getText().equals("BACK"));
		
		Assert.assertTrue("current Location Field label did not match", lbl_currentLocation.getText().trim().equals("current Location"));
		Assert.assertTrue("current Location Field value did not match", value_currentLocation.getText().trim().
				equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("INSTITUTION",ReadXMLData.getXMLData("inboundXML/AE.xml", "//CustodyLocation", "./CurrentLocation"))));
		
        Assert.assertTrue("location Start Date Field label did not match", lbl_locationStartDate.getText().trim().equals("location Start Date"));
		Assert.assertTrue("location Start Date Field value did not match", value_locationStartDate.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml","//CustodyLocation", "./LocationStartDate")));

		Assert.assertTrue("Prisoner Number Field label did not match", lbl_prisonerNumber.getText().trim().equals("prisoner Number"));
		Assert.assertTrue("Prisoner Number Field value did not match", value_prisonerNumber.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CustodyLocation", "./PrisonerNumber")));

		Assert.assertTrue("Parole Number Field label did not match", lbl_paroleNumber.getText().trim().equals("parole Number"));
		Assert.assertTrue("Parole Number Field value did not match", value_paroleNumber.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CustodyLocation", "./ParoleNumber")));

		Assert.assertTrue("Probation Contact Field label did not match", lbl_probationContact.getText().trim().equals("probation Contact"));
		Assert.assertTrue("Probation Contact Field value did not match", value_probationContact.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CustodyLocation", "./ProbationContact")));

		Assert.assertTrue("PCTelephone Number Field label did not match", lbl_PcTelephoneNumber.getText().trim().equals("PC Telephone Number"));
		Assert.assertTrue("PCTelephone Number Field value did not match", value_PcTelephoneNumber.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CustodyLocation", "./PCTelephoneNumber")));

		Assert.assertTrue("Prison Officer Field label did not match", lbl_prisonOfficer.getText().trim().equals("prison Officer"));
		Assert.assertTrue("Prison Officer Field value did not match", value_prisonOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./PrisonOfficer")));

		Assert.assertTrue("POTelephone Number Field label did not match", lbl_POTelephoneNumber.getText().trim().equals("PO Telephone Number"));
		Assert.assertTrue("POTelephone Number Field value did not match", value_POTelephoneNumber.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./POTelephoneNumber")));

		

  }

   @Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return txt_CustodyLocnTitle;
	}

}

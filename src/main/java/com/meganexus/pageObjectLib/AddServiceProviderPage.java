package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import com.meganexus.genericLib.DateFormatter;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class AddServiceProviderPage extends NeoTR_Page {
	
	//Add Page Labels Locators
	@FindBy(xpath = "//h2[text()='Add Service Provider']")
	private WebElementFacade hdr_AddServiceProviderTitle;
	@FindBy(xpath = "//h2[text()='Service Provider']")
	private WebElementFacade hdr_ServiceProviderTitle;

	@FindBy(xpath = "//a[contains(text(),'Service Provider')]")
	private WebElementFacade lnk_ServiceProvider;

	@FindBy(xpath = "//label[@for='serviceProviderName']")
	private WebElementFacade lbl_serviceProviderName;

	@FindBy(xpath = "//label[contains(@for,'selectedCrc')]")
	private WebElementFacade lbl_selectCRC;

	@FindBy(xpath = "//label[contains(.,'Cheshire & Greater Manchester CRC')]")
	private WebElementFacade lbl_CGMCRC;
	@FindBy(xpath = "//label[contains(.,'Hampshire & IOW CRC')]")
	private WebElementFacade lbl_HIWCRC;
	@FindBy(xpath = "//label[contains(.,'Humberside, Lincolnshire and North Yorkshire CRC')]")
	private WebElementFacade lbl_HLNYCRC;
	@FindBy(xpath = "//label[contains(.,'Merseyside CRC')]")
	private WebElementFacade lbl_MERCRC;
	@FindBy(xpath = "//label[contains(.,'West Yorkshire CRC')]")
	private WebElementFacade lbl_WYCRC; 
    @FindBy(xpath = "//label[contains(text(),'Status')]")
	private WebElementFacade lbl_Status;
    
  
   
	@FindBy(xpath = "//label[@for='activeStart']")
	private WebElementFacade lbl_startDate;

	@FindBy(xpath = "//label[@for='activeEnd']")
	private WebElementFacade lbl_endDate;

	@FindBy(xpath = "//label[@for='addressLineOne']")
	private WebElementFacade lbl_addressLine1;

	@FindBy(xpath = "//label[@for='addressLineTwo']")
	private WebElementFacade lbl_addressLine2;
	@FindBy(xpath = "//label[@for='addressLineThree']")
	private WebElementFacade lbl_addressLine3;
	@FindBy(xpath = "//label[@for='town']")
	private WebElementFacade lbl_Town;
	@FindBy(xpath = "//label[@for='postcode']")
	private WebElementFacade lbl_Postcode;
	@FindBy(xpath = "//label[@for='provision']")
	private WebElementFacade lbl_Provision;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElementFacade btn_cancel;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	private WebElementFacade btn_submit;

	
	//Add Page Field value Locators
	@FindBy(xpath = ".//*[@id='serviceProviderName']")
   private WebElementFacade tbx_serviceProviderName;
	//@FindBy(xpath = "//input[@ng-reflect-name='please select a CRC')]")
   //private WebElementFacade ddl_selectCRC;
	
	@FindBy(xpath = "//input[@value='2']")
	   private WebElementFacade cbx_CGMCRC;
	   @FindBy(xpath = "//input[@value='3']")
	   private WebElementFacade cbx_HIWCRC;
	   @FindBy(xpath = "//input[@value='4']")
	   private WebElementFacade cbx_HLNYCRC;
	   @FindBy(xpath = "//input[@value='5']")
	   private WebElementFacade cbx_MERCRC;
	    @FindBy(xpath = "//input[@value='1']")
	   private WebElementFacade cbx_WYCRC;
	   
	@FindBy(xpath = ".//*[@id='status']")
	private WebElementFacade ddl_status;
	@FindBy(xpath = ".//*[@id='activeStart']")
   private WebElementFacade date_startDate;
	@FindBy(xpath = ".//*[@id='activeEnd']")
   private WebElementFacade date_endDate;
  @FindBy(xpath = ".//*[@id='addressLineOne']")
   private WebElementFacade tbx_addressLine1;
  @FindBy(xpath = ".//*[@id='addressLineTwo']")
  private WebElementFacade tbx_addressLine2;
    @FindBy(xpath = ".//*[@id='town']")
   private WebElementFacade tbx_Town;
   @FindBy(xpath = ".//*[@id='postcode']")
   private WebElementFacade tbx_Postcode;
    @FindBy(xpath = ".//*[@id='provision']")
   private WebElementFacade ddl_Provision;

//Locators for Error messages for each field
    
	
@FindBy(xpath = "//input[@id='serviceProviderName']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_serviceProviderName;
@FindBy(xpath = "//input[@id='serviceProviderName']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_selectCRC;
@FindBy(xpath = "//select[@id='status']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_status;
@FindBy(xpath = "//input[@id='activeStart']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_startDate;
@FindBy(xpath = "//input[@id='activeEnd']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_endDate;
@FindBy(xpath = "//input[@id='addressLineOne']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_addressLine1;
@FindBy(xpath = "//input[@id='town']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_Town;
@FindBy(xpath = "//input[@id='postcode']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_Postcode;
@FindBy(xpath = "//select[@id='provision']/following-sibling::control-messages//div[@class='error-msg']")
private WebElementFacade msg_Provision;


public void addServiceProviderPageLabelVerification(){
	waitABit(4000);
	Assert.assertTrue("Service Provider Name label is not available ", lbl_serviceProviderName.getText().trim().equals("Service Provider Name *"));
	Assert.assertTrue("Cheshire & Greater Manchester CRC label is not available", lbl_CGMCRC.getText().trim().equals("Cheshire & Greater Manchester CRC"));
	Assert.assertTrue("Hampshire & IOW CRC label is not available", lbl_HIWCRC.getText().trim().equals("Hampshire & IOW CRC"));
	//Assert.assertTrue("Humberside, Lincolnshire and North Yorkshire CRC label is not available", lbl_HLNYCRC.getText().trim().equals("Humberside, Lincolnshire and North Yorkshire CRC"));
	Assert.assertTrue("Merseyside CRC label is not available", lbl_MERCRC.getText().trim().equals("Merseyside CRC"));
	Assert.assertTrue("West Yorkshire CRC label is not available", lbl_WYCRC.getText().trim().equals("West Yorkshire CRC"));
	Assert.assertTrue("Select CRC label is not available", lbl_selectCRC.getText().trim().equals("Please Select a CRC *"));

	Assert.assertTrue("Active Start Date label is not available", lbl_startDate.getText().trim().equals("Active Start Date *"));
	Assert.assertTrue("Active End Date label is not available", lbl_endDate.getText().trim().equals("Active End Date"));
	Assert.assertTrue("Address line1 label is not available", lbl_addressLine1.getText().trim().equals("Address Line 1"));
	Assert.assertTrue("Address line2 label is not available", lbl_addressLine2.getText().trim().equals("Address Line 2"));
	Assert.assertTrue("Address line3 label is not available", lbl_addressLine3.getText().trim().equals("Address Line 3"));
	Assert.assertTrue("Town label is not available", lbl_Town.getText().trim().equals("Town"));
	Assert.assertTrue("Postcode label is not available", lbl_Postcode.getText().trim().equals("Postcode *"));
	Assert.assertTrue("Provision label is not available", lbl_Provision.getText().trim().equals("Provision *"));
	// waitABit(1000);

}
	

public void addInvalidServiceProviderDetails() {

	tbx_serviceProviderName.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./serviceProviderName"));
    //ddl_status.selectByVisibleText(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./status"));
	date_startDate.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./startDate"));
	date_endDate.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./endDate"));
	tbx_addressLine1.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./addressLine1"));
	tbx_addressLine2.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./addressLine2"));
	tbx_Town.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./town"));
	tbx_Postcode.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./postcode"));
	//ddl_Provision.selectByVisibleText(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDInvalid", "./provision"));
	
	cbx_HIWCRC.click();
	
	waitABit(4000);

	btn_submit.click();

	waitABit(4000);
}



public void addServiceProviderErrorMessageValidation(){

	//Assert.assertTrue("Length exceeded for value of Service Provider Name field", msg_serviceProviderName.getText().trim().equals("Exceeds allowed maximum length"));
	//Assert.assertTrue("Required CRC field is not selected", msg_selectCRC.getText().trim().equals("Required field"));
	//Assert.assertTrue("Enter incorrect End Date format", msg_startDate.getText().trim().equals("Invalid date format"));
	//Assert.assertTrue("Enter incorrect Start Date format", msg_endDate.getText().trim().equals("Invalid date format"));
	Assert.assertTrue("Length exceeded for value of address line1 field", msg_addressLine1.getText().trim().equals("Exceeds allowed maximum length"));
	Assert.assertTrue("Length exceeded for value of town field", msg_Town.getText().trim().equals("Exceeds allowed maximum length"));
	Assert.assertTrue("Postcode format incorrect", msg_Postcode.getText().trim().equals("Incorrect Format of PostCode"));
	//Assert.assertTrue("Required Provision field is not selected", msg_Provision.getText().trim().equals("Required field"));
    waitABit(4000);
	
}


public void addValidServiceProviderDetails() {

	tbx_serviceProviderName.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./serviceProviderName"));	
	date_startDate.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./startDate"));
	date_endDate.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./endDate"));
	tbx_addressLine1.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./addressLine1"));
	tbx_addressLine2.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./addressLine2"));
	tbx_Town.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./town"));
	tbx_Postcode.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./postcode"));
	ddl_status.selectByVisibleText(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./status"));
	ddl_Provision.selectByVisibleText(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./provision"));
	cbx_MERCRC.click();
	waitABit(2000);
	if (btn_submit.isCurrentlyVisible()) {
		btn_submit.click();
		waitABit(3000);

	} else
		System.out.println("Service Provider Submit button is not available");
	waitABit(2000);
}
	
	@Override
	public WebElementFacade getUniqueElement() {
	
		return lnk_ServiceProvider;
	}

	

}

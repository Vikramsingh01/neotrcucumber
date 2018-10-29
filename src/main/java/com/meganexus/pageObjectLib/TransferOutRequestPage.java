package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public  class TransferOutRequestPage extends NeoTR_Page {
	
	
	@FindBy(xpath = "//ul[@id='accordion']/li[3]/button")
	public WebElementFacade btn_TransferOut;
	
	@FindBy(xpath = "//h2[text()='Transfer Out Request']")
	public WebElementFacade hdr_TransferOutRequest;
	@FindBy(xpath = "//a[contains(text(),'Transfer Out Request')]")
    public WebElementFacade lnk_TransferOutRequest;
	@FindBy(xpath = "//a[text()='filter']")
	public WebElementFacade lnk_filter;
	//xpath for Labels
	@FindBy(xpath = "//*[contains(text(),'Surname') and  @ng-reflect-html-for='sirName']")
	private WebElementFacade lbl_Surname;
	
	
	@FindBy(xpath = "//label[text()='From Provider']")
	private WebElementFacade lbl_FromProvider;
	
	@FindBy(xpath = "//label[text()='To Provider']")
	private WebElementFacade lbl_ToProvider;
	
	@FindBy(xpath = "//*[@id='collapseExample']/div[1]/div[4]/div/label")
			//label[text()='Request Date (start)']")
	//label[@for='requestDate']
	
	private WebElementFacade lbl_RequestDateStart;
	
	@FindBy(xpath = "//label[text()='Request Date (end)']")
	private WebElementFacade lbl_RequestDateEnd;
	//label[@for='requestEndDate']
	
	@FindBy(xpath = "//label[text()='Type']")
	private WebElementFacade lbl_Type;
	
	//xpath for field values
	@FindBy(xpath = "//input [@id='familyName']")
	private WebElementFacade tbx_Surname;
	
	@FindBy(xpath = "//select[@id='transferFromProviderId']")
	private WebElementFacade ddl_FromProvider;
	@FindBy(xpath = "//select[@id='transferToProviderId']")
	private WebElementFacade ddl_ToProvider;
	
	@FindBy(xpath = "(.//*[@id='requestDate'])[1]")
	private WebElementFacade tbx_RequestDateStart;
	
	@FindBy(xpath = " //*[@id='collapseExample']/div[1]/div[5]/div/label")
		//	(//*[@id='requestDate'])[2]")
	//input[@id=’requestDate’]
					
	private WebElementFacade tbx_RequestDateEnd;
	@FindBy(xpath = ".//input[@id='type']")
	private WebElementFacade tbx_Type;
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElementFacade btn_Search;
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElementFacade btn_Reset;
	
	// For Table header xpaths.
	@FindBy(xpath = ".//*[@id='sirName' and @ng-reflect-sort-by-field='sirName']")
	private WebElementFacade tblHdr_Surname;
	
	@FindBy(xpath = ".//*[@id='firstName' and @ng-reflect-sort-by-field='firstName']")
	private WebElementFacade tblHdr_FirstName;
	
	@FindBy(xpath = "//span[contains(text(),'type')]")
	private WebElementFacade tblHdr_Type;
	
	@FindBy(xpath = "//span[contains(text(),'Description')]")
	public WebElementFacade tblHdr_Description;
	
	@FindBy(xpath = ".//span[contains(text(),'Request Date')]")
	public WebElementFacade tblHdr_RequestDate;
	@FindBy(xpath = "//th[@id='transferFromProviderId' and @trsortby= 'transferFromProviderId']")
	
	public WebElementFacade tblHdr_FromProvider;
	
	@FindBy(xpath = ".//span[contains(text(),'To Provider')]")
	public WebElementFacade tblHdr_ToProvider;
	
	@FindBy(xpath = ".//span[contains(text(),'Transfer Reason')]")
	public WebElementFacade tblHdr_TransferReason;
	@FindBy(xpath = ".//th[contains(text(),'Go To')]")
	public WebElementFacade tblHdr_GoTo;
	
	
	// xpath for Transfer out Request inside Service Users screen. 
  
	@FindBy(xpath = "//button[text()='Transfers']")
	public WebElementFacade btn_ServiceUsers_Transfers;
	
	@FindBy(xpath = "//h2[text()='Transfer Out Request']")
	public WebElementFacade hdr_ServiceUsers_TransferOutRequest;
	
	@FindBy(xpath = "//a[contains(text(),'Transfer Out Request')]")
	public WebElementFacade lnk_ServiceUsers_TransferOutRequest;
	
	@FindBy(xpath = "//label[@for='transferToProviderId']")
	public WebElementFacade lbl_ServiceUsers_ToProvider;
	
	@FindBy(xpath = "//select[@id='transferToProviderId']")
	public WebElementFacade ddl_ServiceUsers_ToProvider;
	
	@FindBy(xpath = "//label[@for='transferToTeam']")
	public WebElementFacade lbl_ServiceUsers_ToTeam;
	
	@FindBy(xpath = "//input[@id='transferToTeam']")
	public WebElementFacade tbx_ServiceUsers_ToTeam;
	
	@FindBy(xpath = "//label[@for='transferToOfficer']")
	public WebElementFacade lbl_ServiceUsers_ToOfficer;
	
	@FindBy(xpath = "//input[@id='transferToOfficer']")
	public WebElementFacade tbx_ServiceUsers_ToOfficer;
	
	//Table lebel for Service Users screen
	@FindBy(xpath = ".//th[@id='type']")
	public WebElementFacade lbl_ServiceUsers_Type;
	@FindBy(xpath = "//th[@id='description']")
	public WebElementFacade lbl_ServiceUsers_Description;
	
	
	@FindBy(xpath = "//span[contains(text(),'Start Date')]")
	public WebElementFacade lbl_ServiceUsers_StartDate;
	
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	public WebElementFacade lbl_ServiceUsers_Status;
	@FindBy(xpath = "//span[@id='label_transferReasonId']")
	public WebElementFacade lbl_ServiceUsers_TransferReason;
	
	@FindBy(xpath = "//select[@id='transferReasonId']")
	public WebElementFacade ddl_ServiceUsers_TransferReason;
	
	
	//Transfer and Cancel button
	@FindBy(xpath = "//button[text()='Transfer']")
	public WebElementFacade btn_Transfer;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	public WebElementFacade btn_Cancel;
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_TransferOutRequest;
	}
	public void clickOnTransferOut() {
		btn_TransferOut.click();
		waitABit(1000);
	}
	
	public String getTextForSearchBtn() {
		return btn_Search.getText().trim();
	}
	public void clickOnFilter()
	{
		lnk_filter.click();
	}

	@SuppressWarnings("deprecation")
	public void listViewTransferOutRequest() {
		Assert.assertTrue("Transfer Out button name does not match",btn_TransferOut.getText().trim().equals("TRANSFER OUT"));
		Assert.assertTrue("Transfer Out Request header does not match",
				hdr_TransferOutRequest.getText().trim().equals("TRANSFER OUT REQUEST"));

		Assert.assertTrue("Transfer Out Request expand link does not match",
				lnk_TransferOutRequest.getText().trim().equals("TRANSFER OUT REQUEST"));
		Assert.assertTrue("Transfer Out Request filter link does not match", lnk_filter.getText().trim().equals("FILTER"));
		//lnk_filter.click();
		clickOnFilter();
		waitABit(10000);
		System.out.println(lbl_RequestDateStart.getText().trim());
		System.out.println(lbl_RequestDateEnd.getText().trim());
		Assert.assertTrue("Label does not match for Surname in list view ", lbl_Surname.getText().trim().equals("Surname"));
		Assert.assertTrue("Label does not match for From Provider in filter ", lbl_FromProvider.getText().trim().equals("From Provider"));
		Assert.assertTrue("Label does not match for To Provider in filter ", lbl_ToProvider.getText().trim().equals("To Provider"));
		Assert.assertTrue("Label does not match for Request Date(Start) in filter", lbl_RequestDateStart.getText().trim().contains("Request Date (start)"));
		Assert.assertTrue("Label does not match for Request Date(End) in filter ", lbl_RequestDateEnd.getText().trim().contains("Request Date (End)"));
		Assert.assertTrue("Label does not match for Type in filter ", 	lbl_Type.getText().trim().equals("Type"));
	
		Assert.assertTrue("Table header does not match for Surname in list view ", tblHdr_Surname.getText().trim().equals("SURNAME"));
		Assert.assertTrue("Table header does not match for First name in list view ", tblHdr_FirstName.getText().trim().equals("FIRSR NAME"));
		Assert.assertTrue("Table header does not match for Type in list view ", tblHdr_Type.getText().trim().equals("TYPE"));
		Assert.assertTrue("Table header does not match for Description in list view ", tblHdr_Description.getText().trim().equals("DESCRIPTION"));
		Assert.assertTrue("Table header does not match for Request Date in list view ", tblHdr_RequestDate.getText().trim().equals("REQUEST DATE"));
		Assert.assertTrue("Table header does not match for From Provider in list view ", tblHdr_FromProvider.getText().trim().equals("FROM PROVIDER"));
		Assert.assertTrue("Table header does not match for To Provider in list view ", tblHdr_ToProvider.getText().trim().equals("TO PROVIDER"));
		Assert.assertTrue("Table header does not match for Transfer Reason view ", tblHdr_TransferReason.getText().trim().equals("TRANSFER REASON"));
		Assert.assertTrue("Table header does not match for Go To in list view ", tblHdr_GoTo.getText().trim().equals("GO TO"));
		
		
		Assert.assertTrue("Button does not match for Search button in filter ", btn_Search.getText().trim().equals("SEARCH"));
		Assert.assertTrue("Button does not match for Reset button in filter ", btn_Reset.getText().trim().equals("RESET"));
}
	
	
	public void clickOnTransfersButtonOnServiceUsers() {
		btn_ServiceUsers_Transfers.click();
		
	}
	
	public void clickOnSearchButtonOnTransferOutRequest(){
		//lnk_filter.click();
		clickOnFilter();
		tbx_Surname.sendKeys("ABCDHV");
		btn_Search.click();
	}
	public void clickOnResetButtonOnTransferOutRequest(){
		btn_Reset.click();
	}
	public void enterSearchDetailsForTransferOutRequest(){
		clickOnFilter();
//	ddl_FromProvider.selectByIndex(2);
//	clickOnResetButtonOnTransferOutRequest();
//	clickOnResetButtonOnTransferOutRequest();
//	ddl_ToProvider.selectByIndex(3);
//	clickOnResetButtonOnTransferOutRequest();
//	clickOnResetButtonOnTransferOutRequest();
//	waitABit(100);
	tbx_RequestDateStart.clear();
	tbx_RequestDateStart.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//TransferOutRequest_Search", "./RequestDateStart"));
	waitABit(100);
	clickOnResetButtonOnTransferOutRequest();
	clickOnResetButtonOnTransferOutRequest();
	tbx_RequestDateEnd.clear();
	tbx_RequestDateEnd.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//TransferOutRequest_Search", "./RequestDateEnd"));
	clickOnResetButtonOnTransferOutRequest();
	clickOnResetButtonOnTransferOutRequest();
	waitABit(100);
	tbx_Type.sendKeys("Offender");
	clickOnResetButtonOnTransferOutRequest();
	clickOnResetButtonOnTransferOutRequest();

	
	}
	}
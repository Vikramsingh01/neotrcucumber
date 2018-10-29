package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public  class TransferOutPage extends NeoTR_Page {
	
	
	@FindBy(xpath = "//ul[@id='accordion']/li[2]/button")
	//*[@id='accordion']/li[2]/button
	public WebElementFacade btn_TransferOut;
	
	@FindBy(xpath = "//h2[text()='Transfer Out Request']")
	public WebElementFacade hdr_TransferOutRequest;
	@FindBy(xpath = "//a[contains(text(),'Transfer Out Request')]")
    public WebElementFacade lnk_TransferOutRequest;
	@FindBy(xpath = "//a[text()='filter']")
	public WebElementFacade lnk_filter;
	//xpath for Labels
	@FindBy(xpath = "//label[@for='familyName']")
	private WebElementFacade lbl_Surname;
	
	
	@FindBy(xpath = "//label[text()='From Provider']")
	private WebElementFacade lbl_FromProvider;
	
	@FindBy(xpath = "//label[text()='To Provider']")
	private WebElementFacade lbl_ToProvider;
	
	@FindBy(xpath = "//label[@for='requestDate']")
			//label[text()='Request Date (start)']")
	//label[@for='requestDate']
	
	private WebElementFacade lbl_RequestDateStart;
	
	@FindBy(xpath = "//label[@for='requestEndDate']")
			//label[text()='Request Date (end)']")
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
	
	@FindBy(xpath = "//input[@id='requestDate']")
	private WebElementFacade tbx_RequestDateStart;
	
	@FindBy(xpath = ".//input[@id='requestEndDate' and @placeholde='dd/mm/yyyy']")
			
		//	
	//input[@id=’requestEndDate’]
					
	private WebElementFacade tbx_RequestDateEnd;
	@FindBy(xpath = ".//input[@id='type']")
	private WebElementFacade tbx_Type;
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElementFacade btn_Search;
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElementFacade btn_Reset;
	
	// For Table header xpaths.
	@FindBy(xpath = "//th[@id='familyName']")
	private WebElementFacade tblHdr_Surname;
	
	@FindBy(xpath = ".//th[@id='firstName']")
	private WebElementFacade tblHdr_FirstName;
	
	@FindBy(xpath = "//th[@id='type']")
	private WebElementFacade tblHdr_Type;
	
	@FindBy(xpath = "//th[@id='description']")
	private WebElementFacade tblHdr_Description;
	
	@FindBy(xpath = "//th[@id='requestDate']")
	private WebElementFacade tblHdr_RequestDate;
	@FindBy(xpath = "//th[@id='transferFromProviderId']")
	
	private WebElementFacade tblHdr_FromProvider;
	
	@FindBy(xpath = "//th[@id='transferToProviderId']")
	private WebElementFacade tblHdr_ToProvider;
	
	@FindBy(xpath = "//th[@id='transferReasonId']")
	private WebElementFacade tblHdr_TransferReason;
	@FindBy(xpath = "//th[contains(text(),'Go To')]")
	private WebElementFacade tblHdr_GoTo;
	
	@FindBy(xpath = "//th[@id='status']")
	private WebElementFacade tblHdr_Status;
	
	
	// xpath for Transfer out Request inside Service Users screen on Transfes Tab. 
  
	@FindBy(xpath = "//button[text()='Transfers']")
	private WebElementFacade btn_ServiceUsers_Transfers;
	
	@FindBy(xpath = "//h2[text()='Transfer Out Request']")
	private WebElementFacade hdr_ServiceUsers_TransferOutRequest;
	
	@FindBy(xpath = "//a[contains(text(),'Transfer Out Request')]")
	private WebElementFacade lnk_ServiceUsers_TransferOutRequest;
	
	@FindBy(xpath = "//label[@for='transferToProviderId']")
	private WebElementFacade lbl_ServiceUsers_ToProvider;
	
	@FindBy(xpath = "//select[@id='transferToProviderId']")
	private WebElementFacade ddl_ServiceUsers_ToProvider;
	
	@FindBy(xpath = "//label[@for='transferToTeam']")
	private WebElementFacade lbl_ServiceUsers_ToTeam;
	
	@FindBy(xpath = "//input[@id='transferToTeam']")
	private WebElementFacade tbx_ServiceUsers_ToTeam;
	
	@FindBy(xpath = "//label[@for='transferToOfficer']")
	private WebElementFacade lbl_ServiceUsers_ToOfficer;
	
	@FindBy(xpath = "//input[@id='transferToOfficer']")
	private WebElementFacade tbx_ServiceUsers_ToOfficer;
	
	//Table lebel for Service Users screen
	@FindBy(xpath = ".//th[@id='type']")
	private WebElementFacade lbl_ServiceUsers_Type;
	@FindBy(xpath = "//th[@id='description']")
	private WebElementFacade lbl_ServiceUsers_Description;
	
	
	@FindBy(xpath = "//span[contains(text(),'Start Date')]")
	private WebElementFacade lbl_ServiceUsers_StartDate;
	
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElementFacade lbl_ServiceUsers_Status;
	@FindBy(xpath = "//span[@id='label_transferReasonId']")
	private WebElementFacade lbl_ServiceUsers_TransferReason;
	
	@FindBy(xpath = "//select[@id='transferReasonId']")
	private WebElementFacade ddl_ServiceUsers_TransferReason;
	
	
	//Transfer and Cancel button
	@FindBy(xpath = "//button[text()='Transfer']")
	private WebElementFacade btn_Transfer;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElementFacade btn_Cancel;
	@FindBy(xpath ="(//tr/td)[9]")
			//"html/body/tr-root/div[2]/div/div[4]/tr-transfer-out-request/div/div[2]/tr-accordion/div/tr-accordiontab/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[9]/tr-list-label")
			//"((//tr/td)[9]")
	
	private WebElementFacade fieldPendingStatus;
	
	 
	
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
	public void verifylistViewTransferOutRequest() {
//		Assert.assertTrue("Transfer Out button name does not match",btn_TransferOut.getText().trim().equals("TRANSFER OUT"));
//		Assert.assertTrue("Transfer Out Request header does not match",
//				hdr_TransferOutRequest.getText().trim().equals("TRANSFER OUT REQUEST"));
//
//		Assert.assertTrue("Transfer Out Request expand link does not match",
//				lnk_TransferOutRequest.getText().trim().equals("TRANSFER OUT REQUEST"));
//		Assert.assertTrue("Transfer Out Request filter link does not match", lnk_filter.getText().trim().equals("FILTER"));
//		//lnk_filter.click();
      clickOnFilter();
		waitABit(10000);
		System.out.println(lbl_RequestDateStart.getText().trim());
		System.out.println(lbl_RequestDateEnd.getText().trim());
		Assert.assertTrue("Label does not match for Surname in list view ", lbl_Surname.getText().trim().equals("Surname"));
		Assert.assertTrue("Label does not match for From Provider in filter ", lbl_FromProvider.getText().trim().equals("From Provider"));
		Assert.assertTrue("Label does not match for To Provider in filter ", lbl_ToProvider.getText().trim().equals("To Provider"));
		Assert.assertTrue("Label does not match for Request Date(Start) in filter", lbl_RequestDateStart.getText().trim().contains("Request Date (start)"));
		Assert.assertTrue("Label does not match for Request Date(End) in filter ", lbl_RequestDateEnd.getText().trim().contains("Request Date (end)"));
		Assert.assertTrue("Label does not match for Type in filter ", 	lbl_Type.getText().trim().equals("Type"));
	
		Assert.assertTrue("Table header does not match for Surname in list view ", tblHdr_Surname.getText().trim().equals("SURNAME"));
		Assert.assertTrue("Table header does not match for First name in list view ", tblHdr_FirstName.getText().trim().equals("FIRST NAME"));
		Assert.assertTrue("Table header does not match for Type in list view ", tblHdr_Type.getText().trim().equals("TYPE"));
		Assert.assertTrue("Table header does not match for Description in list view ", tblHdr_Description.getText().trim().equals("DESCRIPTION"));
		Assert.assertTrue("Table header does not match for Request Date in list view ", tblHdr_RequestDate.getText().trim().equals("REQUEST DATE"));
		Assert.assertTrue("Table header does not match for From Provider in list view ", tblHdr_FromProvider.getText().trim().equals("FROM PROVIDER"));
		Assert.assertTrue("Table header does not match for To Provider in list view ", tblHdr_ToProvider.getText().trim().equals("TO PROVIDER"));
		Assert.assertTrue("Table header does not match for Transfer Reason view ", tblHdr_TransferReason.getText().trim().equals("TRANSFER REASON"));
		Assert.assertTrue("Table header does not match for Status in list view ", tblHdr_Status.getText().trim().equals("STATUS"));
		
		Assert.assertTrue("Table header does not match for Go To in list view ", tblHdr_GoTo.getText().trim().equals("GO TO"));
		
		
		Assert.assertTrue("Button does not match for Search button in filter ", btn_Search.getText().trim().equals("SEARCH"));
		Assert.assertTrue("Button does not match for Reset button in filter ", btn_Reset.getText().trim().equals("RESET"));
}
	
	
	public void clickOnTransfersButtonOnServiceUsers() {
		btn_ServiceUsers_Transfers.click();
		
	}
	
	
	public void enterSearchDetailsForTransferOutRequest(){
		
		
		if (btn_Search.isCurrentlyVisible())
		{	
		}
		else
		{
			clickOnFilter();
		}	
			//	ddl_FromProvider.selectByIndex(2);
//	clickOnResetButtonOnTransferOutRequest();
//	clickOnResetButtonOnTransferOutRequest();
//	ddl_ToProvider.selectByIndex(3);
//	clickOnResetButtonOnTransferOutRequest();
//	clickOnResetButtonOnTransferOutRequest();
//	waitABit(100);
//	tbx_RequestDateStart.clear();
		tbx_Surname.sendKeys("#U%UU#1");
		waitABit(1000);
		btn_Search.click();
		btn_Reset.click();
//		tbx_RequestDateStart.sendKeys("28/06/2017");
//tbx_RequestDateStart.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//TransferOutRequest_Search", "./RequestDateStart"));
	waitABit(100);
	
	//tbx_RequestDateEnd.sendKeys("28/06/2017");
	//tbx_RequestDateEnd.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//TransferOutRequest_Search", "./RequestDateEnd"));
	
	waitABit(100);
	tbx_Type.sendKeys("Offender");
	btn_Search.click();
	waitABit(1000);
	
	}
	public void verifyPendingStatusOnTransferOut()
	{ if(fieldPendingStatus!=null){
		waitABit(3000);
		//System.out.println(fieldPendingStatus.getText());
		Assert.assertTrue("Status Pending does not match for Status value in list view ", fieldPendingStatus.getText().trim().equals("Pending"));	
	}
	else
	{
		System.out.println("No pending status record found");
	}
	}
	
	public void verifySearchTransferOut()
	{ enterSearchDetailsForTransferOutRequest();

		
	}
	
	
	}
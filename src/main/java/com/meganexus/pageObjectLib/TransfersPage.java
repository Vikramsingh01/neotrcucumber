package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public  class TransfersPage extends NeoTR_Page  {
    // click on Transfers button
	@FindBy(xpath = "//button[text()='Transfers']")
	private WebElementFacade btn_Transfers;
	
	
	//click on Transfer Out Request  and create page objects for Transfer Out Request list.
	
	
	@FindBy(xpath = "//button[text()='Transfers']")
	private WebElementFacade lnk_Transfers;
	
	@FindBy(xpath = "//h2[text()='Transfer Out Request']")
	private WebElementFacade hdr_TransferReq;
	
	@FindBy(xpath = "//a[@id='Transfer Out Request']")
	private WebElementFacade lnk_TransferReq;
	
	@FindBy(xpath = "//select[@id='transferToProviderId']")
	private WebElementFacade ddl_ToProvider;
	
	
	
	@FindBy(xpath = "(//select[@id='transferReasonId'])[1]")
	private WebElementFacade ddlOff_TrReason;
	
	/*@FindBy(xpath = "(//select[@id='transferReasonId'])[2]")
	private WebElementFacade ddlOff_TrReason;
	@FindBy(xpath = "(//select[@id='transferReasonId'])[3]")
	private WebElementFacade ddlOff_TrReason;
	*/
	@FindBy(xpath = "//th[@id='type']")
	private WebElementFacade hdr_Type;
	
	@FindBy(xpath = "//th[@id='descriptionId']")
	private WebElementFacade hdr_Description;
	
	@FindBy(xpath = "//th[@id='startDate']")
	private WebElementFacade hdr_StartDate;
	
	@FindBy(xpath = "//th[@id='statusId']")
	private WebElementFacade hdr_Status;
	
	@FindBy(xpath = "//th[@id='transferReason']")
	private WebElementFacade hdr_TrnsReason;
	
	//transfer and cancel button
	
	@FindBy(xpath = "//button[@id='cancelButton']")
	private WebElementFacade btn_Cancel;
	
	@FindBy(xpath = "//button[text()='Transfer']")
	private WebElementFacade btn_Transfer;
	
	@FindBy(xpath = "(//tr/td)[4]")
	private WebElementFacade fieldValuePending_Status;
	
	@FindBy(xpath = "(//tr/td[6])[1]/button")

	private WebElementFacade btn_View;
	
	public void clickTansfersTab()
	{
		lnk_Transfers.click();
		waitABit(2000);	
	}
	
	
	public void clickOnTransferOutReqLink()
	{
		lnk_TransferReq.click();
		waitABit(1000);	
	}
	
	public void clickOnCancelBtn(){	
		btn_Cancel.click();
	}
	
	public void TransferCaseComponents()
	{
		verifyFieldValidation();
ddl_ToProvider.selectByVisibleText("NPS North West");	
        ddlOff_TrReason.selectByVisibleText("Offender Moved");
		btn_Transfer.click();
		
	}
	
	
	@SuppressWarnings("deprecation")
	public void verifyTransferRequestListView(){
		
		System.out.println(hdr_Type.getText());
		System.out.println(hdr_Description.getText());
		System.out.println(hdr_StartDate.getText());
		System.out.println(hdr_Status.getText());
		System.out.println(hdr_TrnsReason.getText());
		System.out.println(btn_Cancel.getText());
		Assert.assertTrue("Type header label is not present",hdr_Type.getText().trim().equals("TYPE"));
		Assert.assertTrue("Description header  label is not present",hdr_Description.getText().trim().equals("DESCRIPTION"));
		Assert.assertTrue("Date header label is not present",hdr_StartDate.getText().trim().equals("START DATE"));
		Assert.assertTrue("Status header label is not present",hdr_Status.getText().trim().equals("STATUS"));
		Assert.assertTrue("Reason header label is not present",hdr_TrnsReason.getText().trim().equals("TRANSFER REASON"));
		Assert.assertTrue("Cancel button label is not present",btn_Cancel.getText().trim().equals("CANCEL"));	
	}
	
	@FindBy(xpath= "//div[contains(text(),'Required field ')]")
			//th[@id='transferReason']")
			//div[@class='error-msg']") 
			
	
	private WebElementFacade errorMsg_ToProvider;

//	public void xpath(){
//		for (int i=0; i<=i+1;i++)
//		{
//		String xpathpart1= "//tr[i]/td[1]";
//		
//		}
//	}
//	
	
	@SuppressWarnings("deprecation")
	public void verifyFieldValidation(){
		
		/*ddl_ToProvider.selectByVisibleText("CPA Merseyside");
		waitABit(2000);*/
		
		ddlOff_TrReason.selectByVisibleText("Offender Moved");
		waitABit(1000);
		btn_Transfer.click();
		waitABit(2000);
		System.out.println(errorMsg_ToProvider.getText());
		
		Assert.assertTrue("Error messasge is not displaying ",errorMsg_ToProvider.getText().trim().equals("Required field"));	
		
	}

		
	
	
	
	//click on Transfer Out History  and create page objects for Transfer Out History.
	//....................................................................................
	@FindBy(xpath = "//a[@id='Transfer Out History' and contains(text(),'Transfer Out History') ]")
	private WebElementFacade lnk_TransferOutHistory;
	
	// Transfer Out History  table fields 
	
	
	@FindBy(xpath = "(//th[@id='type'])[2]")
	//(xpath = "(//th[@id='type'])[2]")
	private WebElementFacade toh_tblHdr_Type;
	
	@FindBy(xpath = "//th[@id='description']")
	private WebElementFacade toh_tblHdr_Description;
	
	@FindBy(xpath = "//th[@id='requestDate']")
	private WebElementFacade toh_tblHdr_RequestDate;
	@FindBy(xpath = "//th[@id='transferFromProviderId']")
	private WebElementFacade toh_tblHdr_FromProvider;
	@FindBy(xpath = "//th[@id='transferToProviderId']")
	private WebElementFacade toh_tblHdr_ToProvider;
	
	@FindBy(xpath = "//th[@id='transferReasonId']")
	private WebElementFacade toh_tblHdr_TransferReason;
	
	@FindBy(xpath = "//th[@id='status']")
	private WebElementFacade toh_tblHdr_Status;
	@FindBy(xpath = "//th[@id='rejectionReason']")
	private WebElementFacade toh_tblHdr_RejectionReason;
	
	// xpath for Edit or withdrawal  Transfer out request
	//*******************************************************************************************************
	@FindBy(xpath = "//label[@for='type']")
	private WebElementFacade awtr_lbl_Type;
	
	@FindBy(xpath = "//label[@for='descriptionId']")
	private WebElementFacade awtr_lbl_Description;
	
	@FindBy(xpath = "//label[@for='transferToProviderId']")
	private WebElementFacade awtr_lbl_ToProvider;
	
	@FindBy(xpath = "//label[@for='transferToTeam']")
	private WebElementFacade awtr_lbl_ToTeam;
	
	@FindBy(xpath = "//label[@for='transferToOfficer']")
	private WebElementFacade awtr_lbl_ToOfficer;
	
	@FindBy(xpath = "//label[@for='requestDate']")
	private WebElementFacade awtr_lbl_RequestDate;
	
	@FindBy(xpath = "//label[@for='statusId']")
	private WebElementFacade awtr_lbl_Status;
	
	@FindBy(xpath = "//label[@for='transferReasonId']")
	private WebElementFacade awtr_lbl_TransferReason;
	
	@FindBy(xpath = "//*[@for='transferWithdrawnReasonId']")
			 //label[@for='transferWithdrawnReasonId']")	
	private WebElementFacade awtr_lbl_WithdrawalReason;
	
	@FindBy(xpath = "//select[@id='transferReasonId']")
	private WebElementFacade awtr_ddl_TransferReason;
	
	@FindBy(xpath = "//select[@id='transferWithdrawnReasonId']")
	private WebElementFacade awtr_ddl_WithdrawalReason;

	@FindBy(xpath = "//button[@id='saveButton' and text()='Submit']")
	private WebElementFacade awtr_btn_Submit;
	@FindBy(xpath = "//button[@id='cancelButton']")
	private WebElementFacade awtr_btn_Cancel;
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		
		return null;
	}
	
	public void clickOnTransfers() {
		btn_Transfers.click();
		waitABit(3000);
	}	
		public void clickOnTransferOutHistory() {
			lnk_TransferOutHistory.click();
			waitABit(3000);	
}
		@SuppressWarnings("deprecation")
		public void verifyTransferOutHistoryListview() {
			
			clickOnTransferOutHistory();
			System.out.println( toh_tblHdr_Type.getText().trim());
			System.out.println(toh_tblHdr_Description.getText());
			System.out.println(toh_tblHdr_RequestDate.getText().trim());
			System.out.println(toh_tblHdr_TransferReason.getText());
			System.out.println(toh_tblHdr_FromProvider.getText());
			System.out.println(toh_tblHdr_ToProvider.getText());
			System.out.println(toh_tblHdr_Status.getText());
			System.out.println( toh_tblHdr_RejectionReason.getText());
		
		Assert.assertTrue("Table header does not match for Type in list view ", toh_tblHdr_Type.getText().trim().equals("TYPE"));
		Assert.assertTrue("Table header does not match for Description in list view ", toh_tblHdr_Description.getText().trim().equals("DESCRIPTION"));
		Assert.assertTrue("Table header does not match for Request Date in list view ", toh_tblHdr_RequestDate.getText().trim().equals("REQUEST DATE"));
		Assert.assertTrue("Table header does not match for Transfer Reason view ", toh_tblHdr_TransferReason.getText().trim().equals("TRANSFER REASON"));
		Assert.assertTrue("Table header does not match for From Provider in list view ", toh_tblHdr_FromProvider.getText().trim().equals("FROM PROVIDER"));
		Assert.assertTrue("Table header does not match for To Provider in list view ", toh_tblHdr_ToProvider.getText().trim().equals("TO PROVIDER"));
		Assert.assertTrue("Table header does not match for Status in list view ", toh_tblHdr_Status.getText().trim().equals("STATUS"));

		Assert.assertTrue("Table header does not match for Go To in list view ", toh_tblHdr_RejectionReason.getText().trim().equals("REJECTION REASON"));
		
		}
		@SuppressWarnings({ "deprecation" })
		public void verifyPendingStatus()
		{
			System.out.println(fieldValuePending_Status.getText().trim());
			Assert.assertTrue("Status Pending does not match for Pending Status value in list view ", fieldValuePending_Status.getText().trim().equals("Pending"));
		}
		@SuppressWarnings("deprecation")
		public void clickOnViewButton()
		{
		if(btn_View.isEnabled())
				{
				btn_View.click();
			}

		}
		
		public void navigateToEditWithdrawTransferRequest(){
			clickOnViewButton();
			waitABit(3000);
		}
		
		@SuppressWarnings("deprecation")
		public void verifyEditWithdrawTransferRequest(){
			
			System.out.println(awtr_lbl_Type.getText());
			System.out.println(awtr_lbl_Description.getText());
			System.out.println(awtr_lbl_ToProvider.getText());
			System.out.println(awtr_lbl_ToTeam.getText());
			System.out.println(awtr_lbl_ToOfficer.getText());
			System.out.println(awtr_lbl_RequestDate.getText());
			System.out.println(awtr_lbl_Status.getText());
			System.out.println(awtr_lbl_TransferReason.getText());
			System.out.println(awtr_lbl_WithdrawalReason.getText());
			Assert.assertTrue("Type header label is not present",awtr_lbl_Type.getText().trim().equals("TYPE"));
			Assert.assertTrue("Description header  label is not present",awtr_lbl_Description.getText().trim().equals("DESCRIPTION"));
			Assert.assertTrue("To Provider header  label is not present",awtr_lbl_ToProvider.getText().trim().equals("TO PROVIDER"));
			Assert.assertTrue("To Team header  label is not present",awtr_lbl_ToTeam.getText().trim().equals("TO TEAM"));
			Assert.assertTrue("To Officer header  label is not present",awtr_lbl_ToOfficer.getText().trim().equals("TO OFFICER"));
			
			Assert.assertTrue("Request Date header label is not present",awtr_lbl_RequestDate.getText().trim().equals("REQUEST DATE"));
			Assert.assertTrue("Status header label is not present",awtr_lbl_Status.getText().trim().equals("STATUS"));
			Assert.assertTrue("Transsfer Reason header label is not present",awtr_lbl_TransferReason.getText().trim().equals("TRANSFER REASON"));
			Assert.assertTrue("Withdrawal Reason header label is not present",awtr_lbl_WithdrawalReason.getText().trim().equals("WITHDRAWAL REASON"));
			Assert.assertTrue("Submit button text is not present",awtr_btn_Submit.getText().trim().equals("SUBMIT"));
			Assert.assertTrue("Cancel button text is not present",awtr_btn_Cancel.getText().trim().equals("CANCEL"));	
			waitABit(3000);
		 }
		
		
		
		public void amendTransferReason()
		{
			
			awtr_ddl_TransferReason.selectByVisibleText("Other");
			awtr_btn_Submit.click();
			waitABit(5000);
		}
		
		public void withdrawTransferOutRequest()
		{
			awtr_ddl_WithdrawalReason.selectByVisibleText("Transferred in Error");
			awtr_btn_Submit.click();
			waitABit(5000);
		}
		
		
		
		
}

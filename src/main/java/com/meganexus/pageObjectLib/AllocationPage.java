package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AllocationPage extends NeoTR_Page {

	@FindBy(xpath = "//*[@id='pendingTransfer_view1']")
			//"//button[@id='pendingTransfer_view0']")
	private WebElementFacade btn_View;
	
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[1]")
			//"html/body/tr-root/div[2]/div/div[4]/tr-pending-transfer-allocation/tr-consolated-transfer-requests/div/div/div[1]/div/table/tbody/tr[1]/td[4]/span/button")
			// "(//button[@title='Add Record'])[1]")
	private WebElementFacade btn_Edit;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElementFacade Radiobtn_Accept;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElementFacade Radiobtn_Reject;
	
	
	
	// inside the Component Allocation screen
	
	//Labels 
	

	@FindBy(xpath = "//label[@for='component']")
	private WebElementFacade lbl_Component;
	
	@FindBy(xpath = "//label[@for='bandId']")
	private WebElementFacade lbl_Band;
	
	@FindBy(xpath = "//select[@ng-reflect-name='officeTeamId']")
	private WebElementFacade ddl_Team;
	
	@FindBy(xpath = "//select[@id='rejectionReasonId']")
	private WebElementFacade ddl_RejectionReason;
	
	@FindBy(xpath = "//select[@ng-reflect-name='officerId']")
	private WebElementFacade ddl_Officer;
	@FindBy(xpath = "//select[@id='bandId']")
	private WebElementFacade ddl_Band;
	
	@FindBy(xpath = "//button[@id='saveButton']")
	private WebElementFacade btn_Save;
	
	@FindBy(xpath = "//button[@id='cancelButton']")
	private WebElementFacade btn_Cancel;
	
	@FindBy(xpath = "//input[@ng-reflect-name='component']")
	private WebElementFacade tbx_Component;
	
	@FindBy(xpath = "//button[@ng-reflect-router-link='/pending-transfer']")
	private WebElementFacade lnk_PTansfer;
	
	//Address 
	@FindBy(xpath = "//div[@id='label_streetName']")
	private WebElementFacade lbl_Street;
	
	@FindBy(xpath = "//div[@id='label_county']")
	private WebElementFacade lbl_County;
	
	
	@FindBy(xpath = "//div[@id='label_townCity']")
	private WebElementFacade lbl_Town;
	@FindBy(xpath = "//div[@id='label_addressStatusId']")
	private WebElementFacade lbl_Type;
	@FindBy(xpath = "//div[@id='label_postcode']")
	private WebElementFacade lbl_PostCode;
	
	// Registration details
	@FindBy(xpath = "//a[@id='Registrations']")
	private WebElementFacade lnk_Registration;
	
	@FindBy(xpath = "//th[@id='registrationDate']/span")
	private WebElementFacade tblHdr_Date;
	
	@FindBy(xpath = "//th[@id='registerFlagId']/span")
	private WebElementFacade tblHdr_Type;
	@FindBy(xpath = "//th[@id='registrationCategoryId']/span")
	private WebElementFacade tblHdr_Category;
	
	@FindBy(xpath= "(//div[contains(text(),'Required field ')])[1]")
	private WebElementFacade errorMsg_Team;
	@FindBy(xpath= "(//div[contains(text(),'Required field ')])[2]")
	private WebElementFacade errorMsg_Officer;
	@FindBy(xpath= "(//div[contains(text(),'Required field ')])[1]")
	private WebElementFacade errorMsg_RejectionReason;
	
	
	
//	String Team = DateFormatter.changeDateFormat(
//		ReadXMLData.getXMLData("TestData.xml", "//Allocation_AcceptReject", "./Team"));
//			
//	String Officer = DateFormatter.changeDateFormat(
//		ReadXMLData.getXMLData("TestData.xml", "//Allocation_AcceptReject", "./Officer"));
//	
//	String Band = DateFormatter.changeDateFormat(
//			ReadXMLData.getXMLData("TestData.xml", "//Allocation_AcceptReject", "./Band"));
//	
//	String RejectionReason = DateFormatter.changeDateFormat(
//			ReadXMLData.getXMLData("TestData.xml", "//Allocation_AcceptReject", "./RejectionReason"));

	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}	
	public void acceptOrRejectComponent(){
 
		waitABit(10000);
		
		try
		{
		//if(btn_Edit.isDisplayed(){
		waitFor(btn_Edit);
		btn_Edit.click();
		//}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void navigateToAllocationTab(){
		lnk_PTansfer.click();
		waitABit(1000);
		btn_View.click();
		
	}
	
	public void verifyErrorMessage() {
		//ddl_Team.selectByVisibleText("--Select--");
		System.out.println(ddl_Team.selectByIndex(0));
		
		btn_Save.click();
		waitABit(8000);
		System.out.println(errorMsg_Team.getText());
		System.out.println(errorMsg_Officer.getText());
		Assert.assertTrue("Error messasge is not displaying ",errorMsg_Team.getText().trim().equals("Required field"));	
		Assert.assertTrue("Error messasge is not displaying ",errorMsg_Officer.getText().trim().equals("Required field"));	
		
	}
	public void acceptComponent(){
		
	
		//if (tbx_Component.getText()=="Service User") {
		if (Radiobtn_Accept.isSelected())
		{
			 if(ddl_Team.isEnabled()&& ddl_Officer.isEnabled())
			{
		waitABit(1000);
		
//		ddl_Team.selectByVisibleText(Team);
//		ddl_Officer.selectByVisibleText(Officer);
//		if(ddl_Band.isEnabled()) {
//		ddl_Band.selectByVisibleText(Band);
		
		ddl_Team.selectByVisibleText("Flex Team 1");
		ddl_Officer.selectByIndex(0);
		
		if(lbl_Band.isPresent()) {
		if(ddl_Band.isEnabled()) {
		ddl_Band.selectByVisibleText("B2");
		btn_Save.click();
		}}
		else
		{
		btn_Save.click();
			}}
		
		}
		else
		{
	
			Radiobtn_Accept.click();
			
				 if(ddl_Team.isEnabled()&& ddl_Officer.isEnabled())
				{
			waitABit(1000);
			ddl_Team.selectByVisibleText("Flex Team 1");
			ddl_Officer.selectByIndex(1);
//			ddl_Team.selectByVisibleText(Team);
//			ddl_Officer.selectByVisibleText(Officer);
			btn_Save.click();
			waitABit(8000);
		
				}	
		}
		
}
		
	
	
	@SuppressWarnings("deprecation")
	public void rejectComponent(){
		Radiobtn_Reject.click();
		waitABit(8000);
		btn_Save.click();
		Assert.assertTrue("Error messasge is not displaying ",errorMsg_RejectionReason.getText().trim().equals("Required field"));	
		
		
		waitABit(8000);
	acceptOrRejectComponent();
		if (Radiobtn_Reject.isSelected()) {
			ddl_RejectionReason.selectByIndex(2);
			btn_Save.click();
}
		else
		{
			Radiobtn_Reject.click();
			waitABit(5000);
			ddl_RejectionReason.selectByIndex(2);
			btn_Save.click();
		}
}

	
		
		@SuppressWarnings("deprecation")
		public void verifyAddressDetails()
		{  System.out.println(lbl_County.getText());
		System.out.println(lbl_Town.getText());
		System.out.println(lbl_PostCode.getText());
		System.out.println(lbl_Type.getText());
			
		Assert.assertTrue("Street label header is not present",lbl_Street.getText().trim().equals("STREET :"));
		Assert.assertTrue("Town label header is not present",lbl_Town.getText().trim().equals("TOWN :"));
		Assert.assertTrue("County label header is not present",lbl_County.getText().trim().equals("COUNTY :"));
		Assert.assertTrue("PostCode label header is not present",lbl_PostCode.getText().trim().equals("POSTCODE :"));
		Assert.assertTrue("Type label header is not present",lbl_Type.getText().trim().equals("TYPE :"));
		
	}

		@SuppressWarnings("deprecation")
		public void verifyRegistrationDetails() 
		{lnk_Registration.click();
			Assert.assertTrue("Date table header is not present",tblHdr_Date.getText().trim().equals("DATE"));
			Assert.assertTrue("Type table header is not present",tblHdr_Type.getText().trim().equals("TYPE"));
			Assert.assertTrue("Category table header is not present",tblHdr_Category.getText().trim().equals("CATEGORY"));
			;
		}		
		
}



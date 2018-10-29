package com.meganexus.pageObjectLib;

import org.openqa.selenium.By;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;

public class PendingTransferPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[text()='Pending Transfer']")
	private WebElementFacade txt_pendingTransfer;
	@FindBy(xpath = "//button[@ng-reflect-router-link='/pending-transfer']")
	private WebElementFacade lnk_pendingTransfer;
	@FindBy(xpath = "//a[text()='filter']")
	private WebElementFacade lnk_filter;
	
	@FindBy(xpath = ".//th[@id='rosh']")
	private WebElementFacade tblHdr_Rosh;	
	
	@FindBy(xpath = "//th[@id='rsr']")
	private WebElementFacade tblHdr_RSR;
	
	@FindBy(xpath = "//th[@id='dateTimeReceived']/span")
	private WebElementFacade tblHdr_DateSent;
	
	@FindBy(xpath = "//th[@id='ogrs1']/span")
	private WebElementFacade tblHdr_OGRS1YR;
	@FindBy(xpath = "//th[@id='ogrs2']/span")
	private WebElementFacade tblHdr_OGRS2YR;
	
	@FindBy(xpath = "//th[@id='crn']")
	private WebElementFacade tblHdr_CRN;
	@FindBy(xpath = "//th[@id='serviceUserName']")
	private WebElementFacade tblHdr_SUName;

	
	@FindBy(xpath = "//th[@id='senderId']")
	private WebElementFacade tblHdr_Sender;
	
	@FindBy(xpath = "//th[@id='targetId']")
	private WebElementFacade tblHdr_Target;
	
	@FindBy(xpath = "//th[@id='categoryId']/span")
	private WebElementFacade tblHdr_Category;
	
	// filter labels
	@FindBy(xpath = "//label[@for='dateReceived']")
	private WebElementFacade lbl_DateSent;
	@FindBy(xpath = "//label[@for='crn']")
	private WebElementFacade lbl_CRN;
	@FindBy(xpath = "//label[@for='senderId']")
	private WebElementFacade lbl_Sender;
	@FindBy(xpath = "//label[@for='targetId']")
	private WebElementFacade lbl_Target;
	@FindBy(xpath = "//label[@for='categoryId']")
	private WebElementFacade lbl_Category;
	
	
	@SuppressWarnings("deprecation")
	public void verifyPendingTransferListViw()
	{  lnk_filter.click();
	Assert.assertTrue("Date Sent label header is not present",lbl_DateSent.getText().trim().equals("Date Sent"));
	Assert.assertTrue("CRN label header is not present",lbl_CRN.getText().trim().equals("CRN"));
	Assert.assertTrue("Sender label header is not present",lbl_Sender.getText().trim().equals("Sender"));
	Assert.assertTrue("Target label header is not present",lbl_Target.getText().trim().equals("Target"));
	Assert.assertTrue("Category label header is not present",lbl_Category.getText().trim().equals("Category"));
	
	
	
//		System.out.println(tblHdr_Rosh.getText());
//		System.out.println(tblHdr_RSR.getText());
//		System.out.println(tblHdr_DateRecieved.getText());
//		System.out.println(tblHdr_SUName.getText());
//		System.out.println(tblHdr_CRN.getText());
//		System.out.println(tblHdr_Sender.getText());
//		System.out.println(tblHdr_Target.getText());
//       System.out.println(tblHdr_Type.getText());
		
		
		
		
		Assert.assertTrue("RoSH header is not present",tblHdr_Rosh.getText().trim().equals("ROSH"));
		Assert.assertTrue("RSR header is not present",tblHdr_RSR.getText().trim().equals("RSR"));
		Assert.assertTrue("OGRS 1YR header is not present",tblHdr_OGRS1YR.getText().trim().equals("OGRS 1YR"));
		Assert.assertTrue("OGRS 2YR header is not present",tblHdr_OGRS2YR.getText().trim().equals("OGRS 2YR"));
		
		Assert.assertTrue("DateSent header is not present",tblHdr_DateSent.getText().trim().equals("DATE SENT"));
		Assert.assertTrue("Service user name header is not present",tblHdr_SUName.getText().trim().equals("SERVICE USER NAME"));
		Assert.assertTrue("CRN header is not present",tblHdr_CRN.getText().trim().equals("CRN"));
		Assert.assertTrue("Sender header is not present",tblHdr_Sender.getText().trim().equals("SENDER"));
		Assert.assertTrue("Target header is not present",tblHdr_Target.getText().trim().equals("TARGET"));
        Assert.assertTrue("Type header is not present",tblHdr_Category.getText().trim().equals("CATEGORY"));

		
		
	}
	
	
	
	
	
	public void clickOnPendingTransferLink() {
		waitABit(2000);
		//waitForTextToAppear(lnk_pendingTransfer.getText(), 100);
		lnk_pendingTransfer.click();
		waitABit(1000);
	}

	@FindBy(xpath = "//select[@id='pendingTransferList_itemsPerPage']")
	public WebElementFacade itemPerPage;

	public void viewOffenderWithCrnNO()  {
		
		//itemPerPage.selectByVisibleText("50");
		waitABit(4000);
		lnk_filter.click();
		String cRNNo = ReadXMLData.getXMLData("inboundXML/AO.xml", "//Offender", "./CaseReferenceNumber").trim();
		// System.out.println("//td[contains(text(),'" + cRNNo +
		// "')]/following-sibling::td/button");
		try {
			getDriver()
					.findElement(By.xpath("//td[contains(text(),'" + cRNNo + "')]/following-sibling::td/span/button"))
					.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Service user is not available in Pending Transfer Page with this CRNNo: " + cRNNo);
		}

	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return txt_pendingTransfer;
	}

}

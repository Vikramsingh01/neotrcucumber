package com.meganexus.pageObjectLib;

import javax.validation.constraints.AssertTrue;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")

public class OrderManagerPage extends NeoTR_Page {
	
	@FindBy(xpath = "//h2[text()='VIEW order Manager']")
	private WebElementFacade txt_viewOrderManager;
	
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	
           ////////--------- Start of Label Elements--------//
	
	@FindBy(xpath="//div[contains(text(),'allocation Date')]")
	private WebElementFacade lbl_AllocationDate;
	
	@FindBy(xpath="//div[contains(text(),'allocation Reason')]")
	private WebElementFacade lbl_allocationReason;
	
	@FindBy(xpath="//div[contains(text(),'end Date')]")
	private WebElementFacade lbl_EndDate;
	
	@FindBy(xpath="//div[contains(text(),'provider')]")
	private WebElementFacade lbl_Provider;
	
	@FindBy(xpath="//div[contains(text(),'responsible Officer')]")
	private WebElementFacade lbl_ResponsibleOfficer;
	
	@FindBy(xpath="//div[contains(text(),'responsible Team')]")
	private WebElementFacade lbl_ResponsibleTeam;
	
	         /////////--------- End of Label Elements--------//
	
	@FindBy(xpath="//div[contains(text(),'allocation Date')]/following-sibling::div")
	private WebElementFacade txt_AllocationDate;
	
	@FindBy(xpath="//div[contains(text(),'allocation Reason')]/following-sibling::div")
	private WebElementFacade txt_allocationReason;
	
	@FindBy(xpath="//div[contains(text(),'end Date')]/following-sibling::div")
	private WebElementFacade txt_EndDate;
	
	@FindBy(xpath="//div[contains(text(),'provider')]/following-sibling::div")
	private WebElementFacade txt_Provider;
	
	@FindBy(xpath="//div[contains(text(),'responsible Officer')]/following-sibling::div")
	private WebElementFacade txt_ResponsibleOfficer;
	
	@FindBy(xpath="//div[contains(text(),'responsible Team')]/following-sibling::div")
	private WebElementFacade txt_ResponsibleTeam;
	
	public void OrderManagerViewVerification()
	{
		
		Assert.assertTrue("VIEW OFFENDER ADDITIONAL SENTENCE text is not available", txt_viewOrderManager.getText().equals("VIEW ORDER MANAGER"));
		Assert.assertTrue("Allocation Date label name not matched", lbl_AllocationDate.getText().trim()
				.equals("Allocation Date"));
		Assert.assertTrue("Allocation Reason label name not matched", lbl_allocationReason.getText().trim()
				.equals("Allocation Reason"));
		Assert.assertTrue("End Date label name not matched", lbl_EndDate.getText().trim()
				.equals("End Date"));
		Assert.assertTrue("Provider label name not matched", lbl_Provider.getText().trim()
				.equals("Provider"));
		Assert.assertTrue("Responsible Officer label name not matched", lbl_ResponsibleOfficer.getText().trim()
				.equals("Responsible Officer"));
		Assert.assertTrue("Responsible Team label name not matched", lbl_ResponsibleTeam.getText().trim()
				.equals("Responsible Team"));
		
		Assert.assertTrue("Date value not matched", txt_AllocationDate.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//OrderManager", "./AllocationDate")));
		Assert.assertTrue("Allocation Reason value not matched", txt_allocationReason.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("INTER AREA ORDER TRANSFER REASON",
				ReadXMLData.getXMLData("inboundXML/AE.xml", "//OrderManager", "./AllocationReason"))));
		Assert.assertTrue("End Date doesnot match", txt_EndDate.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//OrderManager", "./EndDate")));
		Assert.assertTrue("End Date doesnot match", txt_Provider.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//OrderManager", "./Provider")));
		
	}
		
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

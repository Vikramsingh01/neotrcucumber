package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OffenderManagerPage extends NeoTR_Page {
	
	
	@FindBy(xpath = "//h2[text()='VIEW offender Manager']")
	private WebElementFacade txt_ViewOffenderManager;
	
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	
	@FindBy(xpath = "//a[text()='Offender Manager']")
	private WebElementFacade lnk_OffenderManger;
	
	@FindBy(xpath = "//div[contains(text(), 'allocation Start Date')]/following-sibling::div[1]")
	private WebElementFacade txt_AllocationStartDate;
	
	@FindBy(xpath = "//div[contains(text(), 'allocation Reason')]/following-sibling::div[1]")
	private WebElementFacade txt_AllocationReason;
	
	
	@SuppressWarnings("deprecation")
	public void OffenderManagerViewFieldVerification()
	
	{
		Assert.assertTrue("allocation start date not matched", txt_AllocationStartDate.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//OffenderManager", "./AllocationDate")));
		
		Assert.assertTrue("Allocation Reason not matched",
				txt_AllocationReason.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("INTER AREA TRANSFER REASON",
						ReadXMLData.getXMLData("inboundXML/Ao.xml", "//OffenderManager", "./AllocationReason"))));
	}
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_OffenderManger ;
	}
	
}

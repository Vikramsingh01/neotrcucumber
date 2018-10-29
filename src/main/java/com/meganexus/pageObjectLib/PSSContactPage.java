package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import com.meganexus.genericLib.DateFormatter;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
@SuppressWarnings("deprecation")

public class PSSContactPage extends NeoTR_Page{
	
	DateFormatter dateformat;
	
	@FindBy(xpath = "//h2[text()='VIEW PSS Contact']")
	private WebElementFacade hdr_viewPSSContact;
	
	@FindBy(xpath = "//div[contains(text(), 'PSS Date')]")
	private WebElementFacade lbl_pssDate;
	
	@FindBy(xpath = "//div[contains(text(), 'PSS Date')]/following-sibling::div")
	private WebElementFacade value_pssDate;
	

	
	public void validatePSSContact(){
		
		Assert.assertTrue("VIEW PSS CONTACT header is not available", hdr_viewPSSContact.getText().equals("VIEW PSS CONTACT"));
		
		Assert.assertTrue("PSS Date label is not available", lbl_pssDate.getText().equals("PSS Date"));
		
		Assert.assertTrue("PSS Date value not matched", value_pssDate.getText().trim().equals(dateformat.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//PSSContact", "./PSSDate"))));
		
	}
	
	public void clickOnBackButton()
	{
		
	}
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
}

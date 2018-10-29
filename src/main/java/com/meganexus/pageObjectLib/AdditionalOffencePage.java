package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")

public class AdditionalOffencePage extends NeoTR_Page {
	
	
	@FindBy(xpath = "//h2[text()='VIEW additional Offence']")
	private WebElementFacade txt_viewAdditionalOffence;
	
	@FindBy(xpath = "//div[contains(text(), 'offence Code')]")
	private WebElementFacade lbl_offenceCode;
	@FindBy(xpath = "//div[contains(text(), 'offence Date')]")
	private WebElementFacade lbl_offenceDate;
	@FindBy(xpath = "//div[contains(text(), 'offence Count')]")
	private WebElementFacade lbl_offenceCount;
	
	
	@FindBy(xpath = "//div[contains(text(), 'offence Code')]/following-sibling::p[1]")
	private WebElementFacade txt_offenceCode;
	@FindBy(xpath = "//div[contains(text(), 'offence Date')]/following-sibling::p[1]")
	private WebElementFacade txt_offenceDate;
	@FindBy(xpath = "//div[contains(text(), 'offence Count')]/following-sibling::p[1]")
	private WebElementFacade txt_offenceCount;
	

	public void AdditionalOffenceViewVerification() {
		
	}
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
	return null;	
	}


}

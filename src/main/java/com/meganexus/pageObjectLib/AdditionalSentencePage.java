package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")

public class AdditionalSentencePage extends NeoTR_Page {

	@FindBy(xpath = "//h2[text()='VIEW offender Additional Sentence']")
	private WebElementFacade txt_viewAdditionalOffence;
	
	@FindBy(xpath = "//div[contains(text(), 'additional Sentence')]")
	private WebElementFacade lbl_additionalSentence;
	@FindBy(xpath = "//div[contains(text(), 'length')]")
	private WebElementFacade lbl_length;
	@FindBy(xpath = "//div[contains(text(), 'amount')]")
	private WebElementFacade lbl_amount;
	@FindBy(xpath = "//div[contains(text(), 'notes')]")
	private WebElementFacade lbl_notes;
	
	
	@FindBy(xpath = "//div[contains(text(), 'additional Sentence')]/following-sibling::div")
	private WebElementFacade txt_additionalSentence;
	@FindBy(xpath = "//div[contains(text(), 'length')]/following-sibling::div")
	private WebElementFacade txt_length;
	@FindBy(xpath = "//div[contains(text(), 'amount')]/following-sibling::div")
	private WebElementFacade txt_amount;
	@FindBy(xpath = "//div[contains(text(), 'notes')]/following-sibling::div")
	private WebElementFacade txt_notes;
	

	public void AdditionalSentenceViewVerification() {
		System.out.println("HHHHHHHHHHHHHHHH");
		System.out.println(lbl_additionalSentence.getText());
		Assert.assertTrue("VIEW OFFENDER ADDITIONAL SENTENCE text is not available", txt_viewAdditionalOffence.getText().equals("VIEW OFFENDER ADDITIONAL SENTENCE"));
	    Assert.assertTrue("Additional Sentence label name not matched", lbl_additionalSentence.getText().trim()
				.equals("Additional Sentence"));
	    Assert.assertTrue("Length label name not matched", lbl_length.getText().trim()
				.equals("Length"));
	    Assert.assertTrue("Amount label name not matched", lbl_amount.getText().trim()
				.equals("Amount"));
	    Assert.assertTrue("Notes label name not matched", lbl_notes.getText().trim()
				.equals("Notes"));
	    System.out.println(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDITIONAL SENTENCE",ReadXMLData.getXMLData("inboundXML/AE.xml", "//AdditionalSentence", "./AdditionalSentence")));
		Assert.assertTrue("Additional Sentence value not matched", txt_additionalSentence.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDITIONAL SENTENCE",
ReadXMLData.getXMLData("inboundXML/AE.xml", "//AdditionalSentence", "./AdditionalSentence"))));
		Assert.assertTrue("Length value not matched", txt_length.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//AdditionalSentence", "./Length")));
		Assert.assertTrue("Amount value not matched", txt_amount.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//AdditionalSentence", "./Amount")));
		Assert.assertTrue("Notes value not matched", txt_notes.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//AdditionalSentence", "./Notes")));
		
	}


	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

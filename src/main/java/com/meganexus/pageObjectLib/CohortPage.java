package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class CohortPage extends NeoTR_Page {

	@FindBy(xpath = "//h2[text()='VIEW cohort']")
	private WebElementFacade txt_viewCohort;
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	
	@FindBy(xpath = "//div[contains(text(), 'Sentence')]")
	private WebElementFacade lbl_sentenceOrReleaseDate;
	@FindBy(xpath = "//div[contains(text(), 'start Date ')]")
	private WebElementFacade lbl_startDate;
	@FindBy(xpath = "//div[contains(text(), 'cohort Provider ')]")
	private WebElementFacade lbl_cohortProvider;
	@FindBy(xpath = "//div[contains(text(), 'cohort Code ')]")
	private WebElementFacade lbl_cohortCode;
	@FindBy(xpath = "//div[contains(text(), 'case Reference Number ')]")
	private WebElementFacade lbl_caseRefenceNumber;
	
	

	@FindBy(xpath = "//div[contains(text(), 'Sentence')]//following-sibling::div")
	private WebElementFacade val_sentenceOrReleaseDate ;
	@FindBy(xpath = "//div[contains(text(), 'start Date ')]//following-sibling::div")
	private WebElementFacade val_startDate;
	@FindBy(xpath = "//div[contains(text(), 'cohort Provider ')]//following-sibling::div")
	private WebElementFacade val_cohortProvider;
	@FindBy(xpath = "//div[contains(text(), 'cohort Code ')]//following-sibling::div")
	private WebElementFacade val_cohortCode;
	@FindBy(xpath = "//div[contains(text(), 'case Reference Number ')]//following-sibling::div")
	private WebElementFacade val_caseRefenceNumber;

	
	public void cohortFieldVerification() {
		Assert.assertTrue("View Cohort text is not available", txt_viewCohort.getText().equals("VIEW COHORT"));
		Assert.assertTrue("Back btn is not available", btn_back.getText().equals("BACK"));
		
		Assert.assertTrue("Sentence or Release Date label name not matched", lbl_sentenceOrReleaseDate.getText().trim()
				.equals("Sentence or Release Date"));
		Assert.assertTrue("Start Date label name not matched", lbl_startDate.getText().trim()
				.equals("Start Date"));
		Assert.assertTrue("Cohort Provider label name not matched", lbl_cohortProvider.getText().trim()
				.equals("Cohort Provider"));
		Assert.assertTrue("Cohort Code label name not matched", lbl_cohortCode.getText().trim()
				.equals("Cohort Code"));
		Assert.assertTrue("case Reference Number label name not matched", lbl_caseRefenceNumber.getText().trim()
				.equals("Case Reference Number"));
		
		
		//String sentenceOrRelease_val = ReadXMLData.getXMLData("inboundXML/AE.xml", "//Cohort", "./SentenceReleaseDate").replace("-", "/");
		//String startDate_val = ReadXMLData.getXMLData("inboundXML/AE.xml", "//Cohort", "./StartDate").replace("-", "/");
		
		//Replace the hard code value once method for Date conversion is defined
		Assert.assertTrue("Sentence or Release Date value not matched", val_sentenceOrReleaseDate.getText().trim().equals("08/01/2012"));
		Assert.assertTrue("Start Date value not matched", val_startDate.getText().trim().equals("08/01/2012"));
		Assert.assertTrue("Cohort Provider value not matched", val_cohortProvider.getText().trim().
				equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Cohort", "./CohortProvider")))));
		
		Assert.assertTrue("Cohort Code value not matched",
				val_cohortCode.getText().trim().equals(
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//Cohort", "./CohortCode")));
		Assert.assertTrue("case Reference Number value not matched",
				val_caseRefenceNumber.getText().trim().equals("B974109"));
	}
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}

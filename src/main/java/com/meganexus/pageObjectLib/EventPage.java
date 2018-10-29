package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class EventPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[text()=' event']")
	private WebElementFacade lbl_Event;
	@FindBy(xpath = "//a[@id='Event Details']")
	private WebElementFacade lnk_EventDetails;

	@FindBy(xpath = "//button[@id='event_view0']")
	private WebElementFacade btn_viewEvent;

	// IC-122

	@FindBy(xpath = "//a[contains(text(),'List Of Events')]")
	private WebElementFacade lnk_listOfEvent;
	@FindBy(xpath = "//h2[contains(text(),'Event Details')]")
	private WebElementFacade title_eventDetails;
	@FindBy(xpath = "//thead")
	private WebElementFacade tbl_headerEventList;

	public void clickOnListOfEventLnk() {
		if (lnk_listOfEvent.isCurrentlyVisible()) {
			lnk_listOfEvent.click();
			waitABit(100);
		}
	}

	// else{
	// System.out.println("Table is already diplayed");
	// }

	public void viewEvent() {
		waitForPresenceOf("//button[@id='event_view0']");
		if (btn_viewEvent.isCurrentlyVisible()) {
			btn_viewEvent.click();
			waitABit(500);
		} else
			System.out.println("Event not available for this offender");
	}

	public void verifyEventTitle() {
		// System.out.println(title_eventDetails.getText());
		Assert.assertTrue("Event details title not displayed", title_eventDetails.isDisplayed());// getText().contains("Event
																									// Details"));
	}

	// For label validation
	@FindBy(xpath = "//div[contains(text(),'Sentence Type')]")
	private WebElementFacade lbl_sentenceType;
	@FindBy(xpath = "//div[contains(text(),'sentence Date')]")
	private WebElementFacade lbl_sentenceDate;
	@FindBy(xpath = "//div[contains(text(),'Additional Sentence')]")
	private WebElementFacade lbl_additionalSentences;
	@FindBy(xpath = "//div[contains(text(),'offence Date')]")
	private WebElementFacade lbl_offenceDate;
	@FindBy(xpath = "//div[contains(text(),'RSR Score')]")
	private WebElementFacade lbl_rsrScore;
	@FindBy(xpath = "//div[contains(text(),'Main Offence')]")
	private WebElementFacade lbl_mainOffence;
	@FindBy(xpath = "//div[contains(text(),'RSR Date')]")
	private WebElementFacade lbl_rsrDate;
	@FindBy(xpath = "//div[contains(text(),'offence Count')]")
	private WebElementFacade lbl_offenceCount;
	@FindBy(xpath = "//div[contains(text(),'RSR Provider')]")
	private WebElementFacade lbl_rsrProvider;
	@FindBy(xpath = "//div[contains(text(),'TICS')]")
	private WebElementFacade lbl_TICS;
	@FindBy(xpath = "//div[contains(text(),'allocation Decision')]")
	private WebElementFacade lbl_allocationDecision;
	@FindBy(xpath = "//div[contains(text(),'length')]")
	private WebElementFacade lbl_length;
	@FindBy(xpath = "//div[contains(text(),'allocation Date')]")
	private WebElementFacade lbl_allocationDate;
	@FindBy(xpath = "//div[contains(text(),'decision Provider')]")
	private WebElementFacade lbl_decisionProvider;
	@FindBy(xpath = "//div[contains(text(),'allocated Provider')]")
	private WebElementFacade lbl_allocatedProvider;
	@FindBy(xpath = "//div[contains(text(),'expected End Date')]")
	private WebElementFacade lbl_expEndDate;
	@FindBy(xpath = "//div[contains(text(),'Provider Team')]")
	private WebElementFacade lbl_providerTeam;
	@FindBy(xpath = "//div[contains(text(),'Provider Case Manager')]")
	private WebElementFacade lbl_providerCaseManager;
	@FindBy(xpath = "//div[contains(text(),'Length Days')]")
	private WebElementFacade lbl_lengthDays;
	@FindBy(xpath = "//div[contains(text(),'OGRS 2 Score')]")
	private WebElementFacade lbl_OGRS2Score;
	@FindBy(xpath = "//div[contains(text(),'OGRS 3 Score 1')]")
	private WebElementFacade lbl_OGRS3Score1;
	@FindBy(xpath = "//div[contains(text(),'OGRS 3 Score 2')]")
	private WebElementFacade lbl_OGRS3Score2;
	@FindBy(xpath = "//div[contains(text(),'Conviction Date')]")
	private WebElementFacade lbl_convictionDate;
	@FindBy(xpath = "//div[contains(text(),'Referral Date')]")
	private WebElementFacade lbl_referalDate;
	@FindBy(xpath = "//div[contains(text(),'termination Date')]")
	private WebElementFacade lbl_terminationDate;
	@FindBy(xpath = "//div[contains(text(),'termination Reason')]")
	private WebElementFacade lbl_terminationReason;
	@FindBy(xpath = "//div[contains(text(),'Notes')]")
	private WebElementFacade lbl_notes;

	public void verifyEventDetailsLabel() {
		// System.out.println(lbl_sentenceType.getText());
		Assert.assertTrue("Sentence Type not displayed", lbl_sentenceType.getText().trim().contains("Sentence Type")); // Using
																														// contains
																														// to
																														// ignore
																														// colon(:)
		Assert.assertTrue("Sentence Date not displayed ", lbl_sentenceDate.getText().trim().contains("Sentence Date"));
		Assert.assertTrue("Additional Sentences not displayed ",
				lbl_additionalSentences.getText().trim().contains("Additional Sentence"));
		Assert.assertTrue("Offence Date not displayed ", lbl_offenceDate.getText().trim().contains("Offence Date"));
		Assert.assertTrue("RSR Score not displayed ", lbl_rsrScore.getText().trim().contains("RSR Score"));
		Assert.assertTrue("Main Offence not displayed ", lbl_mainOffence.getText().trim().contains("Main Offence"));
		Assert.assertTrue("RSR Date not displayed ", lbl_rsrDate.getText().trim().contains("RSR Date"));
		Assert.assertTrue("Offence Count not displayed ", lbl_offenceCount.getText().trim().contains("Offence Count"));
		Assert.assertTrue("RSR Provider not displayed ", lbl_rsrProvider.getText().trim().contains("RSR Provider"));
		Assert.assertTrue("TICS not displayed ", lbl_TICS.getText().trim().contains("TICS"));
		Assert.assertTrue("Allocation Decision not displayed ",
				lbl_allocationDecision.getText().trim().contains("Allocation Decision"));
		Assert.assertTrue("Length not displayed ", lbl_length.getText().trim().contains("Length"));
		Assert.assertTrue("Allocation Date not displayed ",
				lbl_allocationDate.getText().trim().contains("Allocation Date"));
		Assert.assertTrue("Decision Provider not displayed ",
				lbl_decisionProvider.getText().trim().contains("Decision Provider"));
		Assert.assertTrue("Allocated Provider not displayed ",
				lbl_allocatedProvider.getText().trim().contains("Allocated Provider"));
		Assert.assertTrue("Expected End Date not displayed ",
				lbl_expEndDate.getText().trim().contains("Expected End Date"));
		Assert.assertTrue("Provider Team not displayed ", lbl_providerTeam.getText().trim().contains("Provider Team"));
		Assert.assertTrue("Provider Case Manager not displayed ",
				lbl_providerCaseManager.getText().trim().contains("Provider Case Manager"));
		Assert.assertTrue("Length Days not displayed ", lbl_lengthDays.getText().trim().contains("Length Days"));
		Assert.assertTrue("OGRS2 Score not displayed ", lbl_OGRS2Score.getText().trim().contains("OGRS 2 Score"));
		Assert.assertTrue("OGRS3 Score1 not displayed ", lbl_OGRS3Score1.getText().trim().contains("OGRS 3 Score 1"));
		Assert.assertTrue("OGRS3 Score2 not displayed ", lbl_OGRS3Score2.getText().trim().contains("OGRS 3 Score 2"));
		Assert.assertTrue("Conviction Date not displayed ",
				lbl_convictionDate.getText().trim().contains("Conviction Date"));
		Assert.assertTrue("Referral Date not displayed ", lbl_referalDate.getText().trim().contains("Referral Date"));
		Assert.assertTrue("Termination Date not displayed ",
				lbl_terminationDate.getText().trim().contains("Termination Date"));
		Assert.assertTrue("Termination Reason not displayed ",
				lbl_terminationReason.getText().trim().contains("Termination Reason"));
		Assert.assertTrue("Notes not displayed ", lbl_notes.getText().trim().contains("Notes"));

	}

	// For label Value validation with XML
	@FindBy(xpath = "//div[contains(text(),'Sentence Type')]/following-sibling::div") // 301
																						// CJA
																						// -Std
																						// Determinate
																						// Custody
	private WebElementFacade value_sentenceType; // Sentence type is Order type
	@FindBy(xpath = "//div[contains(text(),'sentence Date')]/following-sibling::div")
	private WebElementFacade value_sentenceDate;
	@FindBy(xpath = "//div[contains(text(),'Additional Sentence')]/following-sibling::div")
	private WebElementFacade value_additionalSentence;
	@FindBy(xpath = "//div[contains(text(),'offence Date')]/following-sibling::div")
	private WebElementFacade value_offenceDate;
	@FindBy(xpath = "//div[contains(text(),'RSR Score')]/following-sibling::div")
	private WebElementFacade value_rsrScore;
	@FindBy(xpath = "//div[contains(text(),'Main Offence')]/following-sibling::div")
	private WebElementFacade value_mainOffence;
	@FindBy(xpath = "//div[contains(text(),'RSR Date')]/following-sibling::div")
	private WebElementFacade value_rsrDate;
	@FindBy(xpath = "//div[contains(text(),'offence Count')]/following-sibling::div")
	private WebElementFacade value_offenceCount;
	@FindBy(xpath = "//div[contains(text(),'RSR Provider')]/following-sibling::div")
	private WebElementFacade value_rsrProvider;
	@FindBy(xpath = "//div[contains(text(),'TICS')]/following-sibling::div")
	private WebElementFacade value_TICS;
	@FindBy(xpath = "//div[contains(text(),'allocation Decision')]/following-sibling::div")
	private WebElementFacade value_allocationDecision;
	@FindBy(xpath = "//div[contains(text(),'length')]/following-sibling::div")
	private WebElementFacade value_length;
	@FindBy(xpath = "//div[contains(text(),'allocation Date')]/following-sibling::div")
	private WebElementFacade value_allocationDate;
	@FindBy(xpath = "//div[contains(text(),'decision Provider')]/following-sibling::div")
	private WebElementFacade value_decisionProvider;
	@FindBy(xpath = "//div[contains(text(),'allocated Provider')]/following-sibling::div")
	private WebElementFacade value_allocatedProvider;
	@FindBy(xpath = "//div[contains(text(),'expected End Date')]/following-sibling::div")
	private WebElementFacade value_expEndDate;
	@FindBy(xpath = "//div[contains(text(),'Provider Team')]/following-sibling::div")
	// OSresponsible team is provider team
	private WebElementFacade value_providerTeam;
	@FindBy(xpath = "//div[contains(text(),'Provider Case Manager')]/following-sibling::div")
	// OSResponsibleOfficer is provider Case Manager
	private WebElementFacade value_providerCaseManager;
	@FindBy(xpath = "//div[contains(text(),'Length Days')]/following-sibling::div")
	private WebElementFacade value_lengthDays;
	@FindBy(xpath = "//div[contains(text(),'OGRS 2 Score')]/following-sibling::div")
	private WebElementFacade value_OGRS2Score;
	@FindBy(xpath = "//div[contains(text(),'OGRS 3 Score 1')]/following-sibling::div")
	private WebElementFacade value_OGRS3Score1;
	@FindBy(xpath = "//div[contains(text(),'OGRS 3 Score 2')]/following-sibling::div")
	private WebElementFacade value_OGRS3Score2;
	@FindBy(xpath = "//div[contains(text(),'Conviction Date')]/following-sibling::div")
	private WebElementFacade value_convictionDate;
	@FindBy(xpath = "//div[contains(text(),'Referral Date')]/following-sibling::div")
	private WebElementFacade value_referralDate;
	@FindBy(xpath = "//div[contains(text(),'termination Date')]/following-sibling::div")
	private WebElementFacade value_terminationDate;
	@FindBy(xpath = "//div[contains(text(),'termination Reason')]/following-sibling::div")
	private WebElementFacade value_terminationReason;
	@FindBy(xpath = "//div[contains(text(),'Notes')]/following-sibling::div")
	private WebElementFacade value_notes;

	public void eventFieldVerificationWithIB_XML() {
		System.out.println("before method");
		// System.out.println(ReadXMLData.getXMLData("inboundXML/AE_updated.xml",
		// "//Event", "./SentenceDate"));
		// System.out.println(ReadXMLData.getXMLData("inboundXML/AE_updated.xml",
		// "//Event", "./Notes"));

		Assert.assertTrue("Sentence Type does not match with IB Xml and ui",
				value_sentenceType.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("COURT APPEARANCE OUTCOME",
								ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OrderType")))); // for
																											// sentence
																											// type

		Assert.assertTrue("Sentence date Value not matched", value_sentenceDate.getText().trim().equals(DateFormatter
				.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./SentenceDate"))));

		Assert.assertTrue("Offence date Value not matched", value_offenceDate.getText().trim().equals(DateFormatter
				.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OffenceDate"))));

		Assert.assertTrue("RSR Score Value not matched", value_rsrScore.getText().trim()
				.contains(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./RSRScore")));

		Assert.assertTrue("Main Offence does not match with IB Xml and ui",
				value_mainOffence.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("OFFENCE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OffenceCode"))));

		Assert.assertTrue("RSR Date Value not matched", value_rsrDate.getText().trim().equals(
				DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./RSRDate"))));

		Assert.assertTrue("Offence count Value not matched", value_offenceCount.getText().trim()
				.equals((ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OffenceCount"))));

		Assert.assertTrue("RSR provider value does not match with IB Xml and ui",
				value_rsrProvider.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./RSRProvider"))));

		// Assert.assertTrue("TICS Value not matched",value_TICS.
		// getText().trim().equals((ReadXMLData.getXMLData("inboundXML/AE_updated.xml",
		// "//Event", "./TICS"))));

		Assert.assertTrue("Allocation Decision value does not match with IB Xml and ui",
				value_allocationDecision.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ALLOCATION DECISION",
								ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./AllocationDecision"))));

		Assert.assertTrue("Length Value not matched", value_length.getText().trim()
				.contains(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./Length")));

		Assert.assertTrue("Allocation Date Value not matched",
				value_allocationDate.getText().trim().equals(DateFormatter
						.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./AllocationDate"))));

		Assert.assertTrue(" Decision Provider value does not match with IB Xml and ui",
				value_decisionProvider.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./DecisionProvider"))));

		Assert.assertTrue(" Decision Provider value does not match with IB Xml and ui",
				value_allocatedProvider.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./AllocatedProvider"))));

		Assert.assertTrue("Expected End Date Value not matched", value_expEndDate.getText().trim().equals(DateFormatter
				.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./ExpectedEndDate"))));

		Assert.assertTrue("Provieder Team Value not matched", value_providerTeam.getText().trim()
				.equals((ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OSResponsibleTeam"))));

		Assert.assertTrue("Provieder case manager Value not matched", value_providerCaseManager.getText().trim()
				.contains((ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OSResponsibleOfficer"))));

		Assert.assertTrue("Length Days Value not matched", value_lengthDays.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./LengthDays")));

		Assert.assertTrue("OGRS2Score Value not matched", value_OGRS2Score.getText().trim()
				.equals((ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OGRS2Score"))));
		Assert.assertTrue("OGRS3Score1 Value not matched", value_OGRS3Score1.getText().trim()
				.equals((ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OGRS3Score1"))));
		Assert.assertTrue("OGRS3Score2 Value not matched", value_OGRS3Score2.getText().trim()
				.equals((ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OGRS3Score2"))));

		Assert.assertTrue("Conviction Date Value not matched",
				value_convictionDate.getText().trim().equals(DateFormatter
						.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./ConvictionDate"))));

		Assert.assertTrue("Referral Date Value not matched", value_referralDate.getText().trim().equals(DateFormatter
				.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./ReferralDate"))));

		Assert.assertTrue("Termination Date Value not matched",
				value_terminationDate.getText().trim().equals(DateFormatter.changeDateFormat(
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./TerminationDate"))));

		Assert.assertTrue("Termination Reason value does not match with IB Xml and ui",
				value_terminationReason.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DISPOSAL TERMINATION REASON",
								ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./TerminationReason"))));

		Assert.assertTrue("Notes Value not matched", value_notes.getText().trim()
				.contains(ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event", "./Notes")));

		// System.out.println("After method");//for srd and nsrd values
		//
		// value_mainOffence.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("OFFENCE",
		// ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event",
		// "./OffenceCode")));//offence code is MainOffence
		// value_rsrProvider.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",
		// ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event",
		// "./RSRProvider")));
		// value_allocationDecision.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("ALLOCATION
		// DECISION",
		// ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event",
		// "./AllocationDecision")));
		// value_decisionProvider.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",
		// ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event",
		// "./DecisionProvider")));
		// value_allocatedProvider.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER",
		// ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event",
		// "./AllocatedProvider")));
		// value_terminationReason.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("DISPOSAL
		// TERMINATION REASON",
		// ReadXMLData.getXMLData("inboundXML/AE_updated.xml", "//Event",
		// "./TerminationReason")));
		//
	}

	// Check additional sentences for Yes/No
	public void verifyAdditionalSentenceVlue() {
		try {
			if (ReadXMLData.getXMLData("inboundXML/AE.xml", "//AdditionalSentence", "./AdditionalSentence")
					.length() != 0) {
				value_additionalSentence.getText().trim().equals("Yes");
				System.out.println("Additional sentences value is " + value_additionalSentence.getText());
			} else {
				value_additionalSentence.getText().trim().equals("No");
				System.out.println("Additional sentences not present in XML" + "label value is"
						+ value_additionalSentence.getText());
			}
		} catch (Exception e) {
			System.out.println("XML structure is not present for Additional sentence");
		}
	}

	public void verifyBackBtn() {
		clickBackBtn();

	}

	// IC-124 Verify Requirements list

	@FindBy(xpath = "//a[contains(text(),'Requirements')]")
	private WebElementFacade lnk_requirements;

	public void clickOnRequirmentsLnk() {
		if (lnk_requirements.isCurrentlyVisible()) {
			lnk_requirements.click();
			waitABit(3000);
		} else
			System.out.println("Requirements table link not available for this event");
	}

	// Requirements table header validation
	@FindBy(xpath = "//thead")
	private WebElementFacade reqTableHeader;
	@FindBy(xpath = "//thead/tr/th[1]")
	private WebElementFacade tblHdr_srNo;
	@FindBy(xpath = "//thead/tr/th[2]")
	private WebElementFacade tblHdr_sentenceDate;
	@FindBy(xpath = "//thead/tr/th[3]")
	private WebElementFacade tblHdr_description;
	@FindBy(xpath = "//thead/tr/th[4]")
	private WebElementFacade tblHdr_length;
	@FindBy(xpath = "//thead/tr/th[5]")
	private WebElementFacade tblHdr_commenced;
	@FindBy(xpath = "//thead/tr/th[6]")
	private WebElementFacade tblHdr_terminated;
	@FindBy(xpath = "//thead/tr/th[7]")
	private WebElementFacade tblHdr_reqManager;
	@FindBy(xpath = "//thead/tr/th[8]")
	private WebElementFacade tblHdr_GoTo;

	public void verifyReqTblHdr() {
		System.out.println(tblHdr_srNo.getText());
		Assert.assertTrue("Sr no. header didnot display", tblHdr_srNo.getText().trim().contains("SR. NO."));
		Assert.assertTrue("Sentence Date header didnot display",
				tblHdr_sentenceDate.getText().trim().equals("SENTENCE DATE"));
		Assert.assertTrue("Description header didnot display",
				tblHdr_description.getText().trim().equals("DESCRIPTION"));
		Assert.assertTrue("Length header didnot display", tblHdr_length.getText().trim().equals("LENGTH"));
		Assert.assertTrue("Commenced header didnot display", tblHdr_commenced.getText().trim().equals("COMMENCED"));
		Assert.assertTrue("Terminated header didnot display", tblHdr_terminated.getText().trim().equals("TERMINATED"));
		Assert.assertTrue("Requirement Manager header didnot display",
				tblHdr_reqManager.getText().trim().equals("REQUIREMENT MANAGER"));
		Assert.assertTrue("Go To header didnot display", tblHdr_GoTo.getText().trim().equals("GO TO"));
		System.out.println("Table header validation");
	}

	// Verify list of Requirements
	@FindBy(xpath = "//tbody/tr[1]")
	private WebElementFacade firstRowReq;

	public void verifyFirstRowReq() {
		if (firstRowReq.isVisible())
			System.out.println("Requirement is available in list");
		else
			System.out.println("Requirement is not available");
	}

	// Requirement list value validation

	@FindBy(xpath = "(//tbody/tr[1]/td)[1]")
	private WebElementFacade value_reqSrNo;
	@FindBy(xpath = "(//tbody/tr[1]/td)[2]")
	private WebElementFacade value_reqSentenceDate;
	@FindBy(xpath = "(//tbody/tr[1]/td)[3]")
	private WebElementFacade value_reqDesc;
	@FindBy(xpath = "(//tbody/tr[1]/td)[4]")
	private WebElementFacade value_reqLength;
	@FindBy(xpath = "(//tbody/tr[1]/td)[5]")
	private WebElementFacade value_reqCommenced;
	@FindBy(xpath = "(//tbody/tr[1]/td)[6]")
	private WebElementFacade value_reqTerminated;
	@FindBy(xpath = "(//tbody/tr[1]/td)[7]")
	private WebElementFacade value_reqManager;

	public void verifyReqListData() {

		Assert.assertTrue("Req. Sentence Date Value not matched",
				value_reqSentenceDate.getText().trim().equals(DateFormatter.changeDateFormat(
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./ImposedDate"))));
		// In xml sentence date is imposed date
		Assert.assertTrue("Description first part value does not match with IB Xml and ui",
				value_reqDesc.getText().trim()
						.contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("REQUIREMENT MAIN TYPE",
								ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement",
										"./RequirementTypeMainCategory"))));
		Assert.assertTrue("Description remaining part value does not match with IB Xml and ui",
				value_reqDesc.getText().trim()
						.contains(GetSRD_or_NSRDValue.getUIValue_from_SRD20("REQUIREMENT SUB CATEGORY",
								ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement",
										"./RequirementTypeSubCategory"))));

		Assert.assertTrue("Commenced Date Value not matched",
				value_reqCommenced.getText().trim().equals(DateFormatter.changeDateFormat(
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./ActualStartDate"))));
		// In xml Actual start date is Commenced Date.

		Assert.assertTrue("Requirement manager Value not matched", value_reqManager.getText().trim()
				.contains(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./RQResponsibleOfficer")));

	}

	@FindBy(xpath = "//button[@class='btn btn-default btn-small']")
	private WebElementFacade btn_goto;

	public void clickOnRequirementGoToButton() {
		if (btn_goto.isVisible()) {
			waitABit(2000);
			if (btn_goto.isCurrentlyVisible()) {
				btn_goto.click();
				System.out.println("Clicked");
				waitABit(2000);
			} else
				System.out.println("GoTo button for Requirement is not available");
		}

	}

	public void verifyEventText() {
		lbl_Event.getText().equals("EVENT");
	}

	@FindBy(xpath = "//h2[text()='VIEW event']")
	private WebElementFacade hdr_viewEvent;
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	// @FindBy(xpath="//div[text()='offence Date ']/following-sibling::div")
	// private WebElementFacade value_offenceDate;

	public void eventDeatisVerification() {

		Assert.assertTrue("view event is not available", hdr_viewEvent.getText().trim().equals("VIEW EVENT"));
		Assert.assertTrue("back button is not ui", btn_back.getText().trim().equals("BACK"));
		// Assert.assertTrue("Offence date does not
		// match",value_offenceDate.getText().trim().equals(ReadData.getXMLData("src/main/resources/Ao.xml",
		// parentNode, childNode);) );

	}

	// *************Terminate Event*****************
	@FindBy(xpath = "//a[@id='Terminate Event']")
	private WebElementFacade hdr_terminateEvent;
	@FindBy(xpath = "(//label[contains(text(),'Termination Date')])")
	private WebElementFacade lbl_terminateDate;
	@FindBy(xpath = "(//label[contains(text(),'Termination Reason')])")
	private WebElementFacade lbl_terminateReason;
	@FindBy(xpath = "(//label[contains(text(),'Notes')])")
	private WebElementFacade lbl_note;

	public void verifyTerminateEventField() {
		Assert.assertTrue("Terminate Event Header not displayed",
				hdr_terminateEvent.getText().trim().contains("TERMINATE EVENT"));
		hdr_terminateEvent.click();
		waitABit(1000);
		System.out.println(lbl_terminateDate.getText());
		System.out.println(lbl_terminateReason.getText());
		System.out.println(lbl_note.getText());
		Assert.assertTrue("Terminate Date Header not displayed",
				lbl_terminateDate.getText().trim().contains("TERMINATION DATE*"));
		Assert.assertTrue("Terminate Reason Header not displayed",
				lbl_terminateReason.getText().trim().contains("TERMINATION REASON*"));
		Assert.assertTrue("Notes Header not displayed", lbl_note.getText().trim().contains("NOTES"));
		System.out.println("Verification completed");
	}

	@FindBy(xpath = "(//label[contains(text(),'Termination Date')]/following::input[1])")
	private WebElementFacade txt_terminateDate;
	@FindBy(xpath = "(//label[contains(text(),'Termination Reason')]/following::select[1])")
	private WebElementFacade ddl_terminateReason;
	@FindBy(xpath = "(//label[contains(text(),'Notes')]/following::textarea[1])")
	private WebElementFacade txt_eventNotes;
	@FindBy(xpath = "//button[@id='saveButton']")
	private WebElementFacade btn_submit;
	@FindBy(xpath = "//button[@id='cancelButton']")
	private WebElementFacade btn_clear;
	@FindBy(xpath = "//button[@class='btn button'][2]")
	private WebElementFacade btn_ok;

	public void verifyTerminateEvent() {
		// hdr_terminateEvent.click();
		// btn_submit.click();
		waitABit(2000);
		txt_terminateDate.sendKeys("11/06/2017");
		ddl_terminateReason.selectByValue("11");
		txt_eventNotes.sendKeys("Event Terminated");
		waitABit(1000);
		btn_submit.click();
		waitABit(2000);

		// Alert
		btn_ok.click();
		waitABit(2000);
	}

	// CortWork tab -Tapan
	@FindBy(xpath = "//button[@ng-reflect-router-link='court-work']")
	private WebElementFacade btn_CourtWorkTab;

	public void courtWorkTab() {
		try {
			btn_CourtWorkTab.click();
			waitABit(1000);
		} catch (Exception e) {
			System.out.println("Court work button is not available");
		}

	}

	// ************clickOnCourtAppearanceType*******************

	@FindBy(xpath = "//button[text()='Court Appearances']")
	private WebElementFacade btn_courtAppearance;

	public void clickOnCourtAppearance() {
		if (btn_courtAppearance.isVisible()) {
			waitABit(2000);
			if (btn_courtAppearance.isCurrentlyVisible()) {
				btn_courtAppearance.click();
				System.out.println("Clicked");
				waitABit(2000);
			} else
				System.out.println("Court Appearance Button is not available for this Event");
		}
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_EventDetails;
	}

}

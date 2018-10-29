package com.meganexus.pageObjectLib;

import org.openqa.selenium.Keys;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
@SuppressWarnings("deprecation")
public class OffenderDetailsPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[contains(text(),'VIEW service User profile')]")
	private WebElementFacade text_viewServiceUserProfile;
	// For Offender Profile Page(Abhijit.Behuria@meganexus.com)
//Profile page is modified by vikram.boinapalli@meganexus.com
				// -------------------Profile-----------------------------------------------
				@FindBy(xpath = "//a[contains(text(),'View Profile ')]")
				private WebElementFacade lbl_Profile;
				// ---------------for title----------------------------------
				@FindBy(xpath = "//div[contains(text(),'title')]")
				private WebElementFacade lbl_offenderTitle;

				@FindBy(xpath = "//div[contains(text(),'title')]/following-sibling::p")
				private WebElementFacade value_offenderTitle;
				// ---------------for first name------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'first Name')]")
				private WebElementFacade lbl_offenderFirstName;

				@FindBy(xpath = "//div[contains(text(),'first Name')]/following-sibling::p")
				private WebElementFacade value_offenderFirstName;

				// --------------------for second name-----------------------------------
				@FindBy(xpath = "//div[contains(text(),'second Name')]")
				private WebElementFacade lbl_offenderSecondName;

				@FindBy(xpath = "//div[contains(text(),'second Name')]/following-sibling::p")
				private WebElementFacade value_offenderSecondName;
				// ---------------Third Name--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'third Name')]")
				private WebElementFacade lbl_ThirdName;
				@FindBy(xpath = "//div[contains(text(),'third Name')]/following-sibling::p")
				private WebElementFacade value_ThirdName;
				// ---------------Family Name--------------------------------------
				@FindBy(xpath = "//div[contains(text(),'family Name')]")
				private WebElementFacade lbl_familyName;
				//@FindBy(xpath = "((//div[@class = 'view-title'])[5]/following-sibling::p")
				@FindBy(xpath = "//div[contains(text(),'family Name')]/following-sibling::p")
				//div[contains(text(),'family Name')]/following-sibling::p
				private WebElementFacade value_familyName;
				// ------------------------previous Name------------------------------------
				@FindBy(xpath = "//div[contains(text(),'previous Name')]")
				private WebElementFacade lbl_previousName;
				@FindBy(xpath = "//div[contains(text(),'previous Name')]/following-sibling::p")
				private WebElementFacade value_previousName;
				// ----------------------date Of
				// Birth-----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Date oF Birth')]")
				private WebElementFacade lbl_dateOfBirth;
				@FindBy(xpath = "//div[contains(text(),'Date oF Birth')]/following-sibling::p")
				private WebElementFacade value_dateOfBirth;
				// ----------------------------gender--------------------------------------
				@FindBy(xpath = "//div[contains(text(),'gender')]")
				private WebElementFacade lbl_gender;
				@FindBy(xpath = "//div[contains(text(),'gender')]/following-sibling::p")
				private WebElementFacade value_gender;
				// --------------------Date of
				// Death---------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'second Name')]")
				private WebElementFacade lbl_DateofDeath;
				@FindBy(xpath = "//div[contains(text(),'previous Name')]/following-sibling::p")
				private WebElementFacade value_DateofDeath;
			
				
				//----------------------IDENTIFIERS -------------------------------
				// ------------------Case Reference
				// Number---------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Case Reference Number')]")
				private WebElementFacade lbl_CaseReferenceNumber;
				@FindBy(xpath = "//div[contains(text(),'Case Reference Number')]/following-sibling::p")
				private WebElementFacade value_CaseReferenceNumber;
				// ----------------------PNC
				// Number--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'PNC Number')]")
				private WebElementFacade lbl_PNCNumber;
				@FindBy(xpath = "//div[contains(text(),'PNC Number')]/following-sibling::p")
				private WebElementFacade value_PNCNumber;
				// -----------------------CRO Number----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'CRO Number')]")
				private WebElementFacade lbl_CRONumber;
				@FindBy(xpath = "//div[contains(text(),'CRO Number')]/following-sibling::p")
				private WebElementFacade value_CRONumber;
				// ------------------------NOMS
				// Number-----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'NOMS Number')]")
				private WebElementFacade lbl_NOMSNumber;
				@FindBy(xpath = "//div[contains(text(),'NOMS Number')]/following-sibling::p")
				private WebElementFacade value_NOMSNumber;
				// ----------------------------NI
				// Number-------------------------------------
				@FindBy(xpath = "//div[contains(text(),'NI Number')]")
				private WebElementFacade lbl_NI_Number;
				@FindBy(xpath = "//div[contains(text(),'NI Number')]/following-sibling::p")
				private WebElementFacade value_NI_Number;
				// ----------------------Band----------------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'tier')]")
				private WebElementFacade lbl_band;
				@FindBy(xpath = "//div[contains(text(),'Band')]/following-sibling::p")
				private WebElementFacade value_tier;
												
				//---------------------Protected Characteristics -------------------------
				// ---------------------immigration Status----------------------------------
				@FindBy(xpath = "//div[contains(text(),'immigration Status')]")
				private WebElementFacade lbl_immigrationStatus;
				@FindBy(xpath = "//div[contains(text(),'immigration Status')]/following-sibling::p")
				private WebElementFacade value_immigrationStatus;
				// -----------------------language-----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'language')]")
				private WebElementFacade lbl_language;
				@FindBy(xpath = "//div[contains(text(),'language')]/following-sibling::p")
				private WebElementFacade value_language;
				// ---------------------Immigration
				// Number-----------------------------------
				@FindBy(xpath = "//div[contains(text(),'Immigration Number')]")
				private WebElementFacade lbl_ImmigrationNumber;
				@FindBy(xpath = "//div[contains(text(),'Immigration Number')]/following-sibling::p")
				private WebElementFacade value_ImmigrationNumber;
				// ---------------interpreter
				// Required---------------------------------------
				@FindBy(xpath = "//div[contains(text(),'interpreter Required')]")
				private WebElementFacade lbl_interpreterRequired;
				@FindBy(xpath = "//div[contains(text(),'interpreter Required')]/following-sibling::p")
				private WebElementFacade value_interpreterRequired;
				// ---------------------Current remand Status----------------------------
				@FindBy(xpath = "//div[contains(text(),'Current remand Status')]")
				private WebElementFacade lbl_CurrentremandStatus;
				@FindBy(xpath = "//div[contains(text(),'Current remand Status')]/following-sibling::p")
				private WebElementFacade value_CurrentremandStatus;
				// ----------------telephone
				// Number--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'telephone Number')]")
				private WebElementFacade lbl_telephone_Number;
				@FindBy(xpath = "//div[contains(text(),'telephone Number')]/following-sibling::p")
				private WebElementFacade value_telephone_Number;
				// -------------------------mobile
				// Number------------------------------------
				@FindBy(xpath = "//div[contains(text(),'mobile Number')]")
				private WebElementFacade lbl_mobileNumber;
				@FindBy(xpath = "//div[contains(text(),'mobile Number')]/following-sibling::p")
				private WebElementFacade value_mobileNumber;
				// -------------------------------allow
				// SMS----------------------------------
				@FindBy(xpath = "//div[contains(text(),'allow SMS')]")
				private WebElementFacade lbl_allowSMS;
				@FindBy(xpath = "//div[contains(text(),'allow SMS')]/following-sibling::p")
				private WebElementFacade value_allowSMS;
				// -------------------email
				// Address-------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'email Address')]")
				private WebElementFacade lbl_emailAddress;
				@FindBy(xpath = "//div[contains(text(),'email Address')]/following-sibling::p")
				private WebElementFacade value_emailAddress;
				// --------------------offender Manager
				// Provider-----------------------------
				@FindBy(xpath = "//div[contains(text(),'offender Manager Provider')]")
				private WebElementFacade lbl_offenderManagerProvider;
				@FindBy(xpath = "//div[contains(text(),'offender Manager Provider')]/following-sibling::p")
				private WebElementFacade value_offenderManagerProvider;
				// -----------------------offender Manager Responsible
				// Team------------------
				@FindBy(xpath = "//div[contains(text(),'offender Manager Responsible Team')]")
				private WebElementFacade lbl_offenderManagerResponsibleTeam;
				@FindBy(xpath = "//div[contains(text(),'offender Manager Responsible Team')]/following-sibling::p")
				private WebElementFacade value_offenderManagerResponsibleTeam;
				// ----------------offender Manager Responsible
				// Officer-----------------------
				@FindBy(xpath = "//div[contains(text(),'offender Manager Responsible Officer')]")
				private WebElementFacade lbl_offenderManagerResponsibleOfficer;
				@FindBy(xpath = "//div[contains(text(),'offender Manager Responsible Officer')]/following-sibling::p")
				private WebElementFacade value_offenderManagerResponsibleOfficer;

				// ---------------------------restriction
				// Message----------------------------
				@FindBy(xpath = "//div[contains(text(),'restriction Message')]")
				private WebElementFacade lbl_restrictionMessage;
				@FindBy(xpath = "//div[contains(text(),'restriction Message')]/following-sibling::p")
				private WebElementFacade value_restrictionMessage;
				// -------------------exclusionMessage-------------------------------------
				@FindBy(xpath = "//div[contains(text(),'exclusion Message')]")
				private WebElementFacade lbl_exclusionMessage;
				@FindBy(xpath = "//div[contains(text(),'exclusion Message')]/following-sibling::p")
				private WebElementFacade value_exclusionMessage;
				// ---------------------sexual Orientation----------------------------------
				@FindBy(xpath = "//div[contains(text(),'sexual Orientation')]")
				private WebElementFacade lbl_sexualOrientation;
				@FindBy(xpath = "//div[contains(text(),'sexual Orientation')]/following-sibling::p")
				private WebElementFacade value_sexualOrientation;
				// ---------------------ethnicity--------------------------------------
				@FindBy(xpath = "//div[contains(text(),'ethnicity')]")
				private WebElementFacade lbl_ethnicity;
				@FindBy(xpath = "//div[contains(text(),'ethnicity')]/following-sibling::p")
				private WebElementFacade value_ethnicity;
				// ------------------nationality--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'nationality')]")
				private WebElementFacade lbl_nationality;
				@FindBy(xpath = "//div[contains(text(),'nationality')]/following-sibling::p")
				private WebElementFacade value_nationality;
				// ---------------------second Nationality---------------------------------
				@FindBy(xpath = "//div[contains(text(),'second Nationality')]")
				private WebElementFacade lbl_secondNationality;
				@FindBy(xpath = "//div[contains(text(),'second Nationality')]/following-sibling::p")
				private WebElementFacade value_secondNationality;
				// --------------------religion-------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'religion')]")
				private WebElementFacade lbl_religion;
				@FindBy(xpath = "//div[contains(text(),'religion')]/following-sibling::p")
				private WebElementFacade value_religion;
				// ---------------------event
				// Count--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'event Count')]")
				private WebElementFacade lbl_eventCount;
				@FindBy(xpath = "//div[contains(text(),'event Count')]/following-sibling::p")
				private WebElementFacade value_eventCount;
				// --------------------terminated Event
				// Count---------------------------------
				@FindBy(xpath = "//div[contains(text(),'terminated Event Count')]")
				private WebElementFacade lbl_terminatedEventCount;
				@FindBy(xpath = "//div[contains(text(),'terminated Event Count')]/following-sibling::p")
				private WebElementFacade value_terminatedEventCount;
				// ---------------------exclusions
				// Exist-------------------------------------
				@FindBy(xpath = "//div[contains(text(),'exclusions Exist')]")
				private WebElementFacade lbl_exclusionsExist;
				@FindBy(xpath = "//div[contains(text(),'exclusions Exist')]/following-sibling::p")
				private WebElementFacade value_exclusionsExist;
				// -------------------------file
				// Name-----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'file Name')]")
				private WebElementFacade lbl_fileName;
				@FindBy(xpath = "//div[contains(text(),'file Name')]/following-sibling::p")
				private WebElementFacade value_fileName;
				// ------------------------------RSR
				// Score------------------------------------
				@FindBy(xpath = "//div[contains(text(),'RSR Score')]")
				private WebElementFacade lbl_RSRScore;
				@FindBy(xpath = "//div[contains(text(),'RSR Score')]/following-sibling::p")
				private WebElementFacade value_RSRScore;
				// ---------------------------RSR
				// Date--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'RSR Date')]")
				private WebElementFacade lbl_RSRDate;
				@FindBy(xpath = "//div[contains(text(),'RSR Date')]/following-sibling::p")
				private WebElementFacade value_RSRDate;
				// --------------------------restrictions
				// Exist-------------------------------------
				@FindBy(xpath = "//div[contains(text(),'restrictions Exist')]")
				private WebElementFacade lbl_restrictionsExist;
				@FindBy(xpath = "//div[contains(text(),'restrictions Exist')]/following-sibling::p")
				private WebElementFacade value_restrictionsExist;
				
				// --------------------------trans Gender Disclose
				// Consent-------------------------
				@FindBy(xpath = "//div[contains(text(),'trans Gender Disclose Consent')]")
				private WebElementFacade lbl_transGenderDiscloseConsent;
				@FindBy(xpath = "//div[contains(text(),'trans Gender Disclose Consent')]/following-sibling::p")
				private WebElementFacade value_transGenderDiscloseConsent;
				// -----------------------trans Gender
				// Process--------------------------------------
				@FindBy(xpath = "//div[contains(text(),'trans Gender Process')]")
				private WebElementFacade lbl_transGenderProcess;
				@FindBy(xpath = "//div[contains(text(),'trans Gender Process')]/following-sibling::p")
				private WebElementFacade value_transGenderProcess;
				// -------------------transfer
				// Pending---------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'transfer Pending')]")
				private WebElementFacade lbl_transferPending;
				@FindBy(xpath = "//div[contains(text(),'transfer Pending')]/following-sibling::p")
				private WebElementFacade value_transferPending;
				// -------------------------Case Review Date
				// ------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Case Review Date')]")
				private WebElementFacade lbl_CaseReviewDate;
				@FindBy(xpath = "//div[contains(text(),'Case Review Date')]/following-sibling::p")
				private WebElementFacade value_CaseReviewDate;
				// --------------------------Reallocation Date------------------------------
				@FindBy(xpath = "//div[contains(text(),'Reallocation Date')]")
				private WebElementFacade lbl_ReallocationDate;
				@FindBy(xpath = "//div[contains(text(),'Reallocation Date')]/following-sibling::p")
				private WebElementFacade value_ReallocationDate;
				// --------------------Date Released From
				// Custody-----------------------------
				@FindBy(xpath = "//div[contains(text(),'Date Released From Custody')]")
				private WebElementFacade lbl_DateReleasedFromCustody;
				@FindBy(xpath = "//div[contains(text(),'Date Released From Custody')]/following-sibling::p")
				private WebElementFacade value_DateReleasedFromCustody;
				// -----------------------Date Returned To
				// Custody---------------------------
				@FindBy(xpath = "//div[contains(text(),'Date Returned To Custody')]")
				private WebElementFacade lbl_DateReturnedToCustody;
				@FindBy(xpath = "//div[contains(text(),'Date Returned To Custody')]/following-sibling::p")
				private WebElementFacade value_DateReturnedToCustody;
				// -------------------Referral Date-----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Referral Date')]")
				private WebElementFacade lbl_ReferralDate;
				@FindBy(xpath = "//div[contains(text(),'Referral Date')]/following-sibling::p")
				private WebElementFacade value_ReferralDate;
				// ----------------------Dependants-------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Dependants')]")
				private WebElementFacade lbl_Dependants;
				@FindBy(xpath = "//div[contains(text(),'Dependants')]/following-sibling::p")
				private WebElementFacade value_Dependants;
				// ----------------------------Suitable for Group
				// Work------------------------
				@FindBy(xpath = "//div[contains(text(),'Suitable for Group Work')]")
				private WebElementFacade lbl_SuitableforGroupWork;
				@FindBy(xpath = "//div[contains(text(),'Suitable for Group Work')]/following-sibling::p")
				private WebElementFacade value_SuitableforGroupWork;
				// -----------------------Reviewing Officer
				// Team------------------------------
				@FindBy(xpath = "//div[contains(text(),'Reviewing Officer Team')]")
				private WebElementFacade lbl_ReviewingOfficerTeam;
				@FindBy(xpath = "//div[contains(text(),'Reviewing Officer Team')]/following-sibling::p")
				private WebElementFacade value_ReviewingOfficerTeam;
				// ----------------------Service User
				// State-----------------------------------
				@FindBy(xpath = "//div[contains(text(),'Service User State')]")
				private WebElementFacade lbl_ServiceUserState;
				@FindBy(xpath = "//div[contains(text(),'Service User State')]/following-sibling::p")
				private WebElementFacade value_ServiceUserState;
				// --------------------Service User
				// Type-------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Service User Type')]")
				private WebElementFacade lbl_ServiceUserType;
				@FindBy(xpath = "//div[contains(text(),'Service User Type')]/following-sibling::p")
				private WebElementFacade value_ServiceUserType;
				// -----------------------status---------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'status')]")
				private WebElementFacade lbl_status;
				@FindBy(xpath = "//div[contains(text(),'status')]/following-sibling::p")
				private WebElementFacade value_status;
				// -------------------------Team--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'offender Manager Responsible Team')]")
				private WebElementFacade lbl_team;
				@FindBy(xpath = "//div[contains(text(),'offender Manager Responsible Team')]/following-sibling::p")
				private WebElementFacade value_team;
				// ----------------------Private--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Private')]")
				private WebElementFacade lbl_Private;
				@FindBy(xpath = "//div[contains(text(),'Private')]/following-sibling::p")
				private WebElementFacade value_Private;
				// -----------------------Domicile--------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Domicile')]")
				private WebElementFacade lbl_Domicile;
				@FindBy(xpath = "//div[contains(text(),'Domicile')]/following-sibling::p")
				private WebElementFacade value_Domicile;
				// --------------------Officer
				// -------------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Officer')]")
				private WebElementFacade lbl_Officer;
				@FindBy(xpath = "//div[contains(text(),'Officer')]/following-sibling::p")
				private WebElementFacade value_Officer;
				// ------------------Preferred Communication Method
				// ----------------------------
				@FindBy(xpath = "//div[contains(text(),'Preferred Communication Method')]")
				private WebElementFacade lbl_PreferredCommunicationMethod;
				@FindBy(xpath = "//div[contains(text(),'Preferred Communication Method')]/following-sibling::p")
				private WebElementFacade value_PreferredCommunicationMethod;
				// ---------------------------Provider------------------------------------------
				@FindBy(xpath = "//div[contains(text(),'Provider')]")
				private WebElementFacade lbl_Provider;
				@FindBy(xpath = "//div[contains(text(),'Provider')]/following-sibling::p")
				private WebElementFacade value_Provider;
				// ------------------------Reviewing Officer Provider
				// --------------------------
				@FindBy(xpath = "//div[contains(text(),'Reviewing Officer Provider')]")
				private WebElementFacade lbl_ReviewingOfficerProvider;
				@FindBy(xpath = "//div[contains(text(),'Reviewing Officer Provider')]/following-sibling::p")
				private WebElementFacade value_ReviewingOfficerProvider;
				// -------------------------------equality Monitoring
				// Notes---------------------
				@FindBy(xpath = "//div[contains(text(),'equality Monitoring Notes')]")
				private WebElementFacade lbl_equalityMonitoringNotes;
				@FindBy(xpath = "//div[contains(text(),'equality Monitoring Notes')]/following-sibling::p")
				private WebElementFacade value_equalityMonitoringNotes;
				// --------------------------------notes----------------------------------------
				@FindBy(xpath = "//div[contains(text(),'notes')]")
				private WebElementFacade lbl_notes;
				@FindBy(xpath = "//div[contains(text(),'notes')]/following-sibling::p")
				private WebElementFacade value_notes;

				
				public void profileFieldLableValidation() {
					if (lbl_Profile.isCurrentlyVisible()) {
						Assert.assertTrue("View Profile ia not Match", lbl_Profile.getText().equals("VIEW PROFILE"));
					}
					if (lbl_offenderTitle.isCurrentlyVisible()) {
						Assert.assertTrue("Titel label is not match", lbl_offenderTitle.getText().equals("Title"));
					}
					if (lbl_offenderFirstName.isCurrentlyVisible()) {
						Assert.assertTrue("First Name label is not match", lbl_offenderFirstName.getText().equals("First Name"));
					}
					if (lbl_offenderSecondName.isCurrentlyVisible()) {
						Assert.assertTrue("Second Name label is not match", lbl_offenderSecondName.getText().equals("Second Name"));
					}
					if (lbl_ThirdName.isCurrentlyVisible()) {
						Assert.assertTrue("Third Name is not match", lbl_ThirdName.getText().equals("Third Name"));
					}
					if (lbl_familyName.isCurrentlyVisible()) {
						Assert.assertTrue("Family Name label is not match", lbl_familyName.getText().equals("Family Name"));
					}				
					if (lbl_previousName.isCurrentlyVisible()) {
						Assert.assertTrue("Previous Name label is not match", lbl_previousName.getText().equals("Previous Name"));
					}
					if (lbl_dateOfBirth.isCurrentlyVisible()) {
						Assert.assertTrue("Date Of Birth label is not match", lbl_dateOfBirth.getText().equals("Date oF Birth"));
					}
					if (lbl_gender.isCurrentlyVisible()) {
						Assert.assertTrue("Gender label is not match", lbl_gender.getText().equals("Gender"));
					}
					if (lbl_DateofDeath.isCurrentlyVisible()) {
						Assert.assertTrue("Date of Death label is not match", lbl_DateofDeath.getText().equals("Date oF Death"));
					}
					
				}
				
			
				public void identifiersFieldLableValidation(){
					if (lbl_CaseReferenceNumber.isCurrentlyVisible()) {
						Assert.assertTrue("Case Reference Number label is not match",lbl_CaseReferenceNumber.getText().equals("Case Reference Number"));
					}
					if (lbl_PNCNumber.isCurrentlyVisible()) {
						Assert.assertTrue("PNC Number label is not match", lbl_PNCNumber.getText().equals("PNC Number"));
					}
					if (lbl_CRONumber.isCurrentlyVisible()) {
						Assert.assertTrue("Titel label is not match", lbl_CRONumber.getText().equals("CRO Number"));
					}
					if (lbl_NOMSNumber.isCurrentlyVisible()) {
						Assert.assertTrue("NOMS Number label is not match", lbl_NOMSNumber.getText().equals("NOMS Number"));
					}
					if (lbl_NI_Number.isCurrentlyVisible()) {
						Assert.assertTrue("NI Number label is not match", lbl_NI_Number.getText().equals("NI Number"));
					}
					if (lbl_band.isCurrentlyVisible()) {
						Assert.assertTrue("Band label is not match", lbl_band.getText().equals("Band"));
					}
					
				}
				public void protectedCharacteristicsFieldLableValidation(){
					
					if (lbl_immigrationStatus.isCurrentlyVisible()) {
						Assert.assertTrue("Immigration Status label is not match", lbl_immigrationStatus.getText().equals("Immigration Status"));
					}
					if (lbl_language.isCurrentlyVisible()) {
						Assert.assertTrue("Language label is not match", lbl_language.getText().equals("Language"));
					}
				
					if (lbl_ImmigrationNumber.isCurrentlyVisible()) {
						Assert.assertTrue("CRO Number label is not match", lbl_ImmigrationNumber.getText().equals("Immigration Number"));
					}				
					if (lbl_interpreterRequired.isCurrentlyVisible()) {
						Assert.assertTrue("Interpreter Required label is not match",lbl_interpreterRequired.getText().equals("Interpreter Required"));
					}
					if (lbl_CurrentremandStatus.isCurrentlyVisible()) {
						Assert.assertTrue("Current Remand Status label is not match", lbl_CurrentremandStatus.getText().equals("Current Remand Status"));
					}
					if (lbl_telephone_Number.isCurrentlyVisible()) {
						Assert.assertTrue("Telephone Number label is not match", lbl_telephone_Number.getText().equals("Telephone Number"));
					}
					if (lbl_mobileNumber.isCurrentlyVisible()) {
						Assert.assertTrue("Mobile Number label is not match", lbl_mobileNumber.getText().equals("Mobile Number"));
					}
					if (lbl_allowSMS.isCurrentlyVisible()) {
						Assert.assertTrue("Allow SMS label is not match", lbl_allowSMS.getText().equals("Allow SMS"));
					}
					if (lbl_emailAddress.isCurrentlyVisible()) {
						Assert.assertTrue("Email Address label is not match", lbl_emailAddress.getText().equals("Email Address"));
					}
					if (lbl_offenderManagerProvider.isCurrentlyVisible()) {
						Assert.assertTrue("Offender Manager Provider label is not match",
								lbl_offenderManagerProvider.getText().equals("Offender Manager Provider"));
					}
					if (lbl_offenderManagerResponsibleTeam.isCurrentlyVisible()) {
						Assert.assertTrue("Offender Manager Responsible Team label is not match",
								lbl_offenderManagerResponsibleTeam.getText().equals("Offender Manager Responsible Team"));
					}
					if (lbl_offenderManagerResponsibleOfficer.isCurrentlyVisible()) {
						Assert.assertTrue("Offender Manager Responsible Officer label is not match",
								lbl_offenderManagerResponsibleOfficer.getText().equals("Offender Manager Responsible Officer"));
					}
					if (lbl_restrictionMessage.isCurrentlyVisible()) {
						Assert.assertTrue("Restriction Message label is not match",
								lbl_restrictionMessage.getText().equals("Restriction Message"));
					}
					if (lbl_exclusionMessage.isCurrentlyVisible()) {
						Assert.assertTrue("Exclusion Message label is not match", lbl_exclusionMessage.getText().equals("Exclusion Message"));
					}
					if (lbl_sexualOrientation.isCurrentlyVisible()) {
						Assert.assertTrue("Sexual Orientation label is not match", lbl_sexualOrientation.getText().equals("Sexual Orientation"));
					}
					if (lbl_ethnicity.isCurrentlyVisible()) {
						Assert.assertTrue("Ethnicity label is not match", lbl_ethnicity.getText().equals("Ethnicity"));
					}
					if (lbl_nationality.isCurrentlyVisible()) {
						Assert.assertTrue("Nationality label is not match", lbl_nationality.getText().equals("Nationality"));
					}
					if (lbl_secondNationality.isCurrentlyVisible()) {
						Assert.assertTrue("Second Nationality label is not match", lbl_secondNationality.getText().equals("Second Nationality"));
					}
					if (lbl_religion.isCurrentlyVisible()) {
						Assert.assertTrue("Religion label is not match", lbl_religion.getText().equals("Religion"));
					}
					if (lbl_eventCount.isCurrentlyVisible()) {
						Assert.assertTrue("Event Count label is not match", lbl_eventCount.getText().equals("Event Count"));
					}
					if (lbl_terminatedEventCount.isCurrentlyVisible()) {
						Assert.assertTrue("Terminated Event Count label is not match",
								lbl_terminatedEventCount.getText().equals("Terminated Event Count"));
					}
					if (lbl_exclusionsExist.isCurrentlyVisible()) {
						Assert.assertTrue("Exclusions Exist label is not match", lbl_exclusionsExist.getText().equals("Exclusions Exist"));
					}
					if (lbl_fileName.isCurrentlyVisible()) {
						Assert.assertTrue("File Name label is not match", lbl_fileName.getText().equals("File Name"));
					}
					if (lbl_RSRScore.isCurrentlyVisible()) {
						Assert.assertTrue("RSR Score label is not match", lbl_RSRScore.getText().equals("RSR Score"));
					}
					if (lbl_RSRDate.isCurrentlyVisible()) {
						Assert.assertTrue("RSR Date label is not match", lbl_RSRDate.getText().equals("RSR Date"));
					}
					if (lbl_restrictionsExist.isCurrentlyVisible()) {
						Assert.assertTrue("Restrictions Exist label is not match", lbl_restrictionsExist.getText().equals("Restrictions Exist"));
					}
				
					if (lbl_transGenderDiscloseConsent.isCurrentlyVisible()) {
						Assert.assertTrue("Trans Gender Disclose Consent label is not match",
								lbl_transGenderDiscloseConsent.getText().equals("Trans Gender Disclose Consent"));
					}
					if (lbl_transGenderProcess.isCurrentlyVisible()) {
						Assert.assertTrue("Trans Gender Process label is not match",
								lbl_transGenderProcess.getText().equals("Trans Gender Process"));
					}
					if (lbl_transferPending.isCurrentlyVisible()) {
						Assert.assertTrue("Transfer Pending label is not match", lbl_transferPending.getText().equals("Transfer Pending"));
					}
					if (lbl_CaseReviewDate.isCurrentlyVisible()) {
						Assert.assertTrue("Case Review Date label is not match", lbl_CaseReviewDate.getText().equals("Case Review Date"));
					}
					if (lbl_ReallocationDate.isCurrentlyVisible()) {
						Assert.assertTrue("Reallocation Date label is not match", lbl_ReallocationDate.getText().equals("Reallocation Date"));
					}
					if (lbl_DateReleasedFromCustody.isCurrentlyVisible()) {
						Assert.assertTrue("Date Released From Custody label is not match",
								lbl_DateReleasedFromCustody.getText().equals("Date Released From Custody"));
					}
					if (lbl_DateReturnedToCustody.isCurrentlyVisible()) {
						Assert.assertTrue("Date Returned To Custody label is not match",
								lbl_DateReturnedToCustody.getText().equals("Date Returned To Custody"));
					}
					if (lbl_ReferralDate.isCurrentlyVisible()) {
						Assert.assertTrue("Referral Date label is not match", lbl_ReferralDate.getText().equals("Referral Date"));
					}
					if (lbl_Dependants.isCurrentlyVisible()) {
						Assert.assertTrue("Dependants label is not match", lbl_Dependants.getText().equals("Dependants"));
					}
					
					if (lbl_SuitableforGroupWork.isCurrentlyVisible()) {
						Assert.assertTrue("Suitable for Group Work label is not match",
								lbl_SuitableforGroupWork.getText().equals("Suitable For Group Work"));
					}
					if (lbl_ReviewingOfficerTeam.isCurrentlyVisible()) {
						Assert.assertTrue("Reviewing Officer Team label is not match",
								lbl_ReviewingOfficerTeam.getText().equals("Reviewing Officer Team"));
					}
					if (lbl_ServiceUserState.isCurrentlyVisible()) {
						Assert.assertTrue("Service User State label is not match", lbl_ServiceUserState.getText().equals("Service User State"));
					}
					if (lbl_ServiceUserType.isCurrentlyVisible()) {
						Assert.assertTrue("Service User Type label is not match", lbl_ServiceUserType.getText().equals("Service User Type"));
					}
					if (lbl_status.isCurrentlyVisible()) {
						Assert.assertTrue("Status label is not match", lbl_status.getText().equals("Status"));
					}
					/*if (lbl_team.isCurrentlyVisible()) {
						Assert.assertTrue("Team label is not match", lbl_team.getText().equals("Team"));
					}*/
					if (lbl_Private.isCurrentlyVisible()) {
						Assert.assertTrue("Private label is not match", lbl_Private.getText().equals("Private"));
					}
					if (lbl_Domicile.isCurrentlyVisible()) {
						Assert.assertTrue("Domicile label is not match", lbl_Domicile.getText().equals("Domicile"));
					}
					/*if (lbl_Officer.isCurrentlyVisible()) {
						Assert.assertTrue("Officer label is not match", lbl_Officer.getText().equals("Officer"));
					}*/
					if (lbl_PreferredCommunicationMethod.isCurrentlyVisible()) {
						Assert.assertTrue("Preferred Communication Method label is not match",
								lbl_PreferredCommunicationMethod.getText().equals("Preferred Communication Method"));
					}
					/*if (lbl_Provider.isCurrentlyVisible()) {
						Assert.assertTrue("Provider label is not match", lbl_Provider.getText().equals("Provider"));
					}*/
					if (lbl_ReviewingOfficerProvider.isCurrentlyVisible()) {
						Assert.assertTrue("Reviewing Officer Provider label is not match",
								lbl_ReviewingOfficerProvider.getText().equals("Reviewing Officer Provider"));
					}
					if (lbl_equalityMonitoringNotes.isCurrentlyVisible()) {
						Assert.assertTrue("Equality Monitoring Notes label is not match",
								lbl_equalityMonitoringNotes.getText().equals("Equality Monitoring Notes"));
					}
					if (lbl_notes.isCurrentlyVisible()) {
						Assert.assertTrue("Notes label is not match", lbl_notes.getText().equals("Notes"));
					}

				}

				public void profileFieldValueValidation()
				{
					//System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Title"));
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Title").length()!=0) 
						
					{
						//System.out.println(GetSRD_or_NSRDValue.getUIValue_from_SRD20("DomainName", ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Title")));
						/*Assert.assertTrue("Title Doesn't match with XML Field value", value_offenderTitle.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Title")));*/
						Assert.assertTrue("Title Doesn't match with XML Field value", value_offenderTitle.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("TITLE", ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Title"))));
					}
					else 
						System.out.println("Title is not available in xml");
					
					System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FirstName"));
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FirstName").length()!=0) 
					
					{
					Assert.assertTrue("First Name Doesn't match with XML Field value", value_offenderFirstName.getText().trim().equals(
							ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FirstName")));
					}
					else 
						System.out.println("First Name is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SecondName").length()!=0) 
				
						
					{
						Assert.assertTrue("SecondName Doesn't match with XML Field value", value_offenderSecondName.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/A0.xml", "//OffenderDetails", "./SecondName")));
					}
					else 
						System.out.println("Second Name is not available in xml");
					
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ThirdName").length()!=0) 	
					{
						Assert.assertTrue("ThirdName Doesn't match with XML Field value", value_ThirdName.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ThirdName")));
					}
					else 
						System.out.println("Third Name Name is not available in xml");
					
					System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FamilyName"));
					//System.out.println(value_familyName.getText());
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FamilyName").length()!=0) 
					 
					{
						Assert.assertTrue("Family Name Doesn't match with XML Field value", value_familyName.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FamilyName")));
					}
					
					else 
						System.out.println("Family Name is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./PreviousName").length()!=0) 
					
					{
						Assert.assertTrue("Previous Name Doesn't match with XML Field value", value_previousName.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./PreviousName")));
					}
					else 
						System.out.println("Previous Name is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./DateOfBirth").length()!=0)
					{
						Assert.assertTrue("Date Of Birth Doesn't match with XML Field value", value_dateOfBirth.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./DateOfBirth")));
					}
					else 
						System.out.println("Date Of Birth is not available in xml");
					
					System.out.println(value_gender.getText());
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Gender").length()!=0)
					{
						/*Assert.assertTrue("Gender Doesn't match with XML Fiel value", value_gender.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Gender")));*/
						Assert.assertTrue("Gender Doesn't match with XML Field value", value_gender.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("GENDER", ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Gender"))));

					}
					else 
						System.out.println("Gender is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Date of Death").length()!=0)
					{
						Assert.assertTrue("Date of Death Doesn't match with XML Field value", value_DateofDeath.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Date of Death")));
					}
					else 
						System.out.println("Date of Death is not available in xml");
				}
				
				public void identifiersFieldValueValidation()
				{
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CaseReferenceNumber").length()!=0)
					{
						Assert.assertTrue("Case Reference Number Doesn't match with XML Field value", value_CaseReferenceNumber.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CaseReferenceNumber")));
					}
					else 
						System.out.println("CaseReference Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./PNCNumber").length()!=0)
					{
						Assert.assertTrue("PNC Number Doesn't match with XML Field value", value_PNCNumber.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./PNCNumber")));
					}
					else 
						System.out.println("PNC Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CRONumber").length()!=0)
						
						
					{
						Assert.assertTrue("CRO Number Doesn't match with XML Field value", value_CRONumber.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CRONumber")));
					}
					else 
						System.out.println("CRO Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./NOMSNumber").length()!=0)
						
					{
						Assert.assertTrue("NOMS Number Doesn't match with XML Field value", value_NOMSNumber.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./NOMSNumber")));
					}
					else 
						System.out.println("NOMS Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./NINumber").length()!=0)
						
					{
						Assert.assertTrue("NI Number Doesn't match with XML Field value", value_NI_Number.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./NINumber")));
					}
					else 
						System.out.println("NI Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Tier").length()!=0)
					{
						Assert.assertTrue("Tier Doesn't match with XML Field value", value_tier.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Tier")));
					}
					else 
						System.out.println("Tier is not available in xml");
				}
				
				public void protectedCharacteristicsFieldValueValidation()
				{
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ImmigrationStatus").length()!=0)
					
					{
						Assert.assertTrue("Title Doesn't match with XML Field value", value_immigrationStatus.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ImmigrationStatus")));
					}
					else 
						System.out.println("ImmigrationStatus is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./language").length()!=0)
					
					{
						Assert.assertTrue("Title Doesn't match with XML Field value", value_language.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./language")));
					}
					else 
						System.out.println("Language is not available in xml");
					

					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ImmigrationNumber").length()!=0)
					
					{
						Assert.assertTrue("Immigration Number Doesn't match with XML Field value", value_ImmigrationNumber.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ImmigrationNumber")));
					}
					else 
						System.out.println("Immigration Number is not available in xml");
										
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./InterpreterRequired").length()!=0)
					{
						Assert.assertTrue("Interpreter Required Doesn't match with XML Fiedl value", value_interpreterRequired.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./InterpreterRequired")));
					}
					else 
						System.out.println("InterpreterRequired is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CurrentremandStatus").length()!=0)
					{
						Assert.assertTrue("Current remand Status Doesn't match with XML Field value", value_CurrentremandStatus.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CurrentremandStatus")));
					}
					else 
						System.out.println("Current Remand Status is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TelephoneNumber").length()!=0)
					{
						Assert.assertTrue("Telephone Number Doesn't match with XML Field value", value_telephone_Number.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TelephoneNumber")));
					}
					else 
						System.out.println("Telephone Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./MobileNumber").length()!=0)
					{
						Assert.assertTrue("Mobile Number Doesn't match with XML Field value", value_mobileNumber.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./MobileNumber")));
					}
					else 
						System.out.println("Mobile Number is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./AllowSMS").length()!=0)
					{
						Assert.assertTrue("Allow SMS Doesn't match with XML Field value", value_allowSMS.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./AllowSMS")));
					}
					else 
						System.out.println("Allow SMS is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./EmailAddress").length()!=0)
					{
						Assert.assertTrue("Email Address Doesn't match with XML Field value", value_emailAddress.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/A0.xml", "//OffenderDetails", "./EmailAddress")));
					}
					else 
						System.out.println("Email Address is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./OMProvider").length()!=0)
					{
						Assert.assertTrue("OM Provider Doesn't match with XML Field value", value_offenderManagerProvider.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./OMProvider")));
					}
					else 
						System.out.println("Offender Manager Provider is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./OMResponsibleTeam").length()!=0)
					{
						Assert.assertTrue("OM Responsible Team Doesn't match with XML Field value", value_offenderManagerResponsibleTeam.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./OMResponsibleTeam")));
					}
					else 
						System.out.println("Offender Manager Responsible Team is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./OMResponsibleOfficer").length()!=0)
					{
						Assert.assertTrue("OM Responsible Officer Doesn't match with XML Field value", value_offenderManagerResponsibleOfficer.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./OMResponsibleOfficer")));
					}
					else 
						System.out.println("offender Manager Responsible Officer is not available in xml");
										
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RestrictionMessage").length()!=0)
					{
						Assert.assertTrue("Restriction Message Doesn't match with XML Field value", value_restrictionMessage.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RestrictionMessage")));
					}
					else 
						System.out.println("Restriction Message is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ExclusionMessage").length()!=0)
					{
						/*Assert.assertTrue("Exclusion Message Doesn't match with XML Field value", value_exclusionMessage.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ExclusionMessage")));*/
						Assert.assertTrue("Exclusion Message Doesn't match with XML Field Value", value_exclusionMessage.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20(" ", ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ExclusionMessage"))));
					}
					else 
						System.out.println("Exclusion Message is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SexualOrientation").length()!=0)
					{
						Assert.assertTrue("Sexual Orientation Doesn't match with XML Field value", value_sexualOrientation.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SexualOrientation")));
					}
					else 
						System.out.println("Sexual Orientation is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Ethnicity").length()!=0)
					{
						Assert.assertTrue("Ethnicity Doesn't match with XML Field value", value_ethnicity.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Ethnicity")));
					}
					else 
						System.out.println("Ethnicity is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Nationality").length()!=0)
					{
						Assert.assertTrue("Nationality Doesn't match with XML Field value", value_nationality.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Nationality")));
					}
					else 
						System.out.println("Nationality is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SecondNationality").length()!=0)
					{
						Assert.assertTrue("Second Nationality Doesn't match with XML Field value", value_secondNationality.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SecondNationality")));
					}
					else 
						System.out.println("Second Nationality is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Religion").length()!=0)
					{
						Assert.assertTrue("Religion Doesn't match with XML Field value", value_religion.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Religion")));
					}
					else 
						System.out.println("Religion is not available in xml");
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./EventCount").length()!=0)
					
					{
						Assert.assertTrue("Event Count Doesn't match with XML Field value", value_eventCount.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./EventCount")));
					}
					else 
						System.out.println("Event Count is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TerminatedEventCount").length()!=0)
					{
						Assert.assertTrue("Terminated Event Count Doesn't match with XML Field value", value_terminatedEventCount.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TerminatedEventCount")));
					}
					else 
						System.out.println("Terminated Event Count is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ExclusionsExistYN").length()!=0)
					{
						/*Assert.assertTrue("Exclusions ExistYN Doesn't match with XML Field value", value_exclusionsExist.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ExclusionsExistYN")));*/
						Assert.assertTrue("Exclusions Exist YN Message Doesn't match with XML Field Value", value_exclusionMessage.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20(" ", ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ExclusionsExistYN"))));

					}
					else 
						System.out.println("Exclusions ExistYN is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FileName").length()!=0)
					{
						Assert.assertTrue("File Name Doesn't match with XML Field value", value_fileName.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./FileName")));
					}
					else 
						System.out.println("File Name is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RSRScore").length()!=0)
					{
						Assert.assertTrue("RSR Score Doesn't match with XML Field value", value_RSRScore.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RSRScore")));
					}
					else 
						System.out.println("RSR Score is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RSRDate").length()!=0)
					{
						Assert.assertTrue("RSR Date Doesn't match with XML Field value", value_RSRDate.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/A0.xml", "//OffenderDetails", "./RSRDate")));
					}
					else 
						System.out.println("RSR Date is not available in xml");
					
					/*if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RestrictionsExistYN").length()!=0)
					{
						Assert.assertTrue("Restrictions ExistYN Doesn't match with XML Field value", value_restrictionsExist.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./RestrictionsExistYN")));
					}
					else 
						System.out.println("Restrictions ExistYN is not available in xml");*/
					

					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TransGenderDiscloseConsent").length()!=0)
					{
						Assert.assertTrue("Trans Gender Disclose Consent Doesn't match with XML Field value", value_transGenderDiscloseConsent.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/A0.xml", "//OffenderDetails", "./TransGenderDiscloseConsent")));
					}
					else 
						System.out.println("TransGender Disclose Consent is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TransGenderProcess").length()!=0)
					{
						Assert.assertTrue("Trans Gender Process Doesn't match with XML Field value", value_transGenderProcess.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TransGenderProcess")));
					}
					else 
						System.out.println("TransGenderProcess is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TransferPending").length()!=0)
					{
						Assert.assertTrue("TransferPending Doesn't match with XML Field value", value_transferPending.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./TransferPending")));
					}
					else 
						System.out.println("Transfer Pending is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CaseReviewDate").length()!=0)
					{
						Assert.assertTrue("Case Review Date Doesn't match with XML Field value", value_CaseReviewDate.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./CaseReviewDate")));
					}
					else 
						System.out.println("Case ReviewDate is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReallocationDate").length()!=0)
					{
						Assert.assertTrue("Reallocation Date Doesn't match with XML Field value", value_ReallocationDate.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReallocationDate")));
					}
					else 
						System.out.println("Reallocation Date is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./DateReleasedFromCustody").length()!=0)
					{
						Assert.assertTrue("Date Released From Custody Doesn't match with XML Field value", value_DateReleasedFromCustody.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./DateReleasedFromCustody")));
					}
					else 
						System.out.println("Date Released From Custody is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./DateReturnedToCustody").length()!=0)
					{
						Assert.assertTrue("Date Returned To Custody Doesn't match with XML Field value", value_DateReturnedToCustody.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./DateReturnedToCustody")));
					}
					else 
						System.out.println("Date Returned To Custody is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReferralDate").length()!=0)
					{
						Assert.assertTrue("Referral Date Doesn't match with XML Field value", value_ReferralDate.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReferralDate")));
					}
					else 
						System.out.println("Referral Date is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Dependants").length()!=0)
					
					{
						Assert.assertTrue("Dependants Doesn't match with XML Field value", value_Dependants.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Dependants")));
					}
					else 
						System.out.println("Dependants is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SuitableforGroupWork").length()!=0)
					{
						Assert.assertTrue("Suitable for Group Work Doesn't match with XML Field value", value_SuitableforGroupWork.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./SuitableforGroupWork")));
					}
					else 
						System.out.println("Suitable for Group Work is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReviewingOfficerTeam").length()!=0)
					{
						Assert.assertTrue("Reviewing Officer Team Doesn't match with XML Field value", value_ReviewingOfficerTeam.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReviewingOfficerTeam")));
					}
					else 
						System.out.println("Reviewing Officer Team is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ServiceUserState").length()!=0)
					{
						Assert.assertTrue("Service User State Doesn't match with XML Field value", value_ServiceUserState.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ServiceUserState")));
					}
					else 
						System.out.println("Service User State is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ServiceUserType").length()!=0)
					{
						Assert.assertTrue("Service User Type Doesn't match with XML Field value", value_ServiceUserType.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ServiceUserType")));
					}
					else 
						System.out.println("Service User Type is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Status").length()!=0)
					{
						Assert.assertTrue("Status Doesn't match with XML Field value", value_status.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Status")));
					}
					else 
						System.out.println("Status is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Team").length()!=0)
					{
						Assert.assertTrue("Team Doesn't match with XML Field value", value_team.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Team")));
					}
					else 
						System.out.println("Team is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Private").length()!=0)
					{
						Assert.assertTrue("Private Doesn't match with XML Field value", value_Private.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Private")));
					}
					else 
						System.out.println("Private is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Domicile").length()!=0)
					{
						Assert.assertTrue("Domicile Doesn't match with XML Field value", value_Domicile.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Domicile")));
					}
					else 
						System.out.println("Domicile is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Officer").length()!=0)
					{
						Assert.assertTrue("Officer Doesn't match with XML Field value", value_Officer.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Officer")));
					}
					else 
						System.out.println("Officer is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./PreferredCommunicationMethod").length()!=0)
					{
						Assert.assertTrue("Preferred Communication Method Doesn't match with XML Field value", value_PreferredCommunicationMethod.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./PreferredCommunicationMethod")));
					}
					else 
						System.out.println("Preferred Communication Method is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Provider").length()!=0)
					{
						Assert.assertTrue("Provider Doesn't match with XML Field value", value_Provider.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Provider")));
					}
					else 
						System.out.println("Provider is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReviewingOfficerProvider").length()!=0)
					{
						Assert.assertTrue("Reviewing Officer Provider Doesn't match with XML Field value", value_ReviewingOfficerProvider.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./ReviewingOfficerProvider")));
					}
					else 
						System.out.println("Reviewing Officer Provider is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./EqualityMonitoringNotes").length()!=0)
					{
						Assert.assertTrue("Equality Monitoring Notes Doesn't match with XML Field value", value_equalityMonitoringNotes.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./EqualityMonitoringNotes")));
					}
					else 
						System.out.println("Equality Monitoring Notes is not available in xml");
					
					if (ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Notes").length()!=0)

					{
						Assert.assertTrue("Notes Doesn't match with XML Field value", value_notes.getText().trim().equals(
								ReadXMLData.getXMLData("inboundXML/AO.xml", "//OffenderDetails", "./Notes")));
					}
					else 
						System.out.println("Notes is not available in xml");
					
				}
			@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[2]")
			private WebElementFacade clickOnEditOffenderBtn;
			
			public void clickOnEditOffenderBtn()
			{
				if(!clickOnEditOffenderBtn.isCurrentlyVisible())
					clickOnEditOffenderBtn.click();
					waitABit(1000);
			}
			
			@FindBy(xpath="//select[@ng-reflect-name='titleId']")
			private WebElementFacade edit_offenderTitle;
			
			@FindBy(xpath="//input[@ng-reflect-name='firstName']")
			private WebElementFacade edit_offenderFirstName;
			
			@FindBy(xpath="//input[@ng-reflect-name='familyName']")
			private WebElementFacade edit_offenderFamilyName;
			
			@FindBy(xpath="//input[@ng-reflect-name='caseReferenceNumber']")
			private WebElementFacade edit_offenderCRN;
			
			@FindBy(xpath="//select[@ng-reflect-name='offenderManagerProviderId']")
			private WebElementFacade edit_offenderManagerProviderId;
			
			@FindBy(xpath="//input[@ng-reflect-name='offenderManagerResponsibleTeam']")
			private WebElementFacade edit_offenderManagerResponsibleTeam;
			
			@FindBy(xpath="//input[@ng-reflect-name='offenderManagerResponsibleOfficer']")
			private WebElementFacade edit_offenderManagerResponsibleOfficer;
			
			@FindBy(xpath="//input[@ng-reflect-id='dateOfBirth']")
			private WebElementFacade edit_offenderDateOfBirth;
			
			@FindBy(xpath="//select[@ng-reflect-name='genderId']")
			private WebElementFacade edit_offenderGenderId;
			
			@FindBy(xpath="//input[@ng-reflect-name='terminatedEventCount']")
			private WebElementFacade edit_offenderTerminatedEventCount;
			
			@FindBy(xpath="//select[@ng-reflect-name='exclusionsExistYesNoId']")
			private WebElementFacade edit_offenderExclusionsExistYesNoId;
			
			@FindBy(xpath="//select[@ng-reflect-id='restrictionsExistYesNoId']")
			private WebElementFacade edit_offenderRestrictionsExistYesNoId;
			
			public void edit_offenderValue()
			{
			
			}
		
	
			//for Mysystemusers (vikram.boinapalli@meganexus.com)
				
				@FindBy(xpath = "")
				private WebElementFacade col_msu_familyName;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_firstName;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_dateOfBirth;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_crn;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_pnc;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_gender;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_provider;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_team;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_caseManager;
				@FindBy(xpath = "")
				private WebElementFacade col_msu_goTo;
				
		public void validateMyServiceUsersList(){
			verifyBreadCrumbs("Service User");
			
			//verifying the alias table now
			if (col_msu_familyName.isCurrentlyVisible())
				Assert.assertTrue("Table header for family name does not match", col_msu_familyName.getText().trim().equals("Family Name"));
			if (col_msu_firstName.isCurrentlyVisible()) 
				Assert.assertTrue("Table header for first name does not match", col_msu_firstName.getText().trim().equals("First Name"));
			if (col_msu_dateOfBirth.isCurrentlyVisible())
				Assert.assertTrue("Table header for dob does not match", col_msu_dateOfBirth.getText().trim().equals("Date of Birth"));
			if (col_msu_crn.isCurrentlyVisible())
				Assert.assertTrue("Table header for crn does not match", col_msu_crn.getText().trim().equals("CRN"));
			if (col_msu_pnc.isCurrentlyVisible())
				Assert.assertTrue("Table header for pnc does not match", col_msu_pnc.getText().trim().equals("PNC"));
			if (col_msu_gender.isCurrentlyVisible())
				Assert.assertTrue("Table header for gender does not match", col_msu_gender.getText().trim().equals("Gender"));
			if (col_msu_provider.isCurrentlyVisible())
				Assert.assertTrue("Table header for  provider does not match", col_msu_provider.getText().trim().equals("Provider"));
			if (col_msu_team.isCurrentlyVisible())
				Assert.assertTrue("Table header for team  does not match", col_msu_team.getText().trim().equals("Team"));
			if (col_msu_caseManager.isCurrentlyVisible()) 
				Assert.assertTrue("Table header for casemanager does not match", col_msu_caseManager.getText().trim().equals("Case Manager"));
			if (col_msu_goTo.isCurrentlyVisible()) 
				Assert.assertTrue("Table header for go to does not match", col_msu_goTo.getText().trim().equals("Go To"));
			
			}

	
	 
	// ratecard intervention  #tapan
	@FindBy(xpath = "//a[contains(text(),'Rate Card Intervention')]")
	private WebElementFacade lnk_rateCardInterVention;

	public void clickOnRateCardInterventionLnk() {
		waitForPresenceOf("//a[contains(text(),'Rate Card Intervention')]");
		lnk_rateCardInterVention.click();
		waitABit(1000);

	}

	@FindBy(xpath = "(//button[text()='Add'])[3]")
	private WebElementFacade btn_addRateCardInterVention;

	public void clickAddRateCardInterVentionBtn() {
		waitForPresenceOf("(//button[text()='Add'])[3]");
		btn_addRateCardInterVention.click();
		waitABit(1000);

	}

	@FindBy(xpath="(//button[@class='btn btn-default btn-small'])[4]")
//	@FindBy(xpath = "(//a[contains(text(),'Rate Card')]/parent::div/following-sibling::div/div/div[@class='pad15']/div[@class]//table[contains(@class,'table-bordered')]//a)[1]") //xpath is not working
	private WebElementFacade btn_viewRateCardInterVention;  

	@FindBy(xpath = "(//a[contains(text(),'Rate Card')]/parent::div/following-sibling::div/div/div[@class='pad15']/div[@class]//table[contains(@class,'table-bordered')]//a)[2]")
	private WebElementFacade btn_editRateCardInterVention;
	@FindBy(xpath = "(//a[contains(text(),'Rate Card')]/parent::div/following-sibling::div/div/div[@class='pad15']/div[@class]//table[contains(@class,'table-bordered')]//a)[3]")
	private WebElementFacade btn_deleteRateCardInterVention;
	@FindBy(xpath = "//a[contains(text(),'Rate Card')]/parent::div/following-sibling::div/div/div[@class='pad15']/div[@class]//table[contains(@class,'table-bordered')]//td[1]")
	private WebElementFacade txt_provider;

	public String ratecardDetails() {
		return txt_provider.getText().trim();
	}

	public void clickViewRateCardInterVentionBtn() {
		waitFor(lnk_rateCardInterVention);
		if (!btn_viewRateCardInterVention.isCurrentlyVisible()) {
			waitABit(500);
			clickOnRateCardInterventionLnk();

			if (btn_viewRateCardInterVention.isCurrentlyVisible()) {
				btn_viewRateCardInterVention.click();
				waitABit(500);
			} else
				System.out.println("no record for rate card is available add rate card first then click on view");
		}

	}

	public void clickEditRateCardInterVentionBtn() {
		if (!btn_editRateCardInterVention.isCurrentlyVisible()) {
			clickOnRateCardInterventionLnk();
			if (btn_editRateCardInterVention.isCurrentlyVisible()) {
				btn_editRateCardInterVention.click();
				waitABit(500);
			} else
				System.out.println("rate card not available or current record is locked");
		}

	}

	public void clickDeleteRateCardInterVentionBtn() {
		if (!btn_deleteRateCardInterVention.isCurrentlyVisible()) {
			clickOnRateCardInterventionLnk();
			if (btn_deleteRateCardInterVention.isCurrentlyVisible()) {
				btn_deleteRateCardInterVention.click();
				waitABit(1000);
				getAlert().accept();
			} else
				System.out.println("Delete btn is not available");
		}

	}
	
	//rate card intervention #Anuranjan
	
	//For clicking on View button of rate card on offender details page
	@FindBy(xpath="(//button[contains(@ng-reflect-router-link,'rate-card-intervention')])[2]")
	private WebElementFacade btn_viewRateCard;
	
	public void clickOnViewRateCardInterventionButton() //click on view button of rate card
	{
		try{
			btn_viewRateCard.click();
		}
		catch(Exception e){
			btn_viewRateCard.sendKeys(Keys.ENTER);
		}
	}
	
	//Validating rate card table details 
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[1]")
		private WebElementFacade col_provider;
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[2]")
		private WebElementFacade col_status;
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[3]")
		private WebElementFacade col_statusDate;
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[4]")
		private WebElementFacade col_interventionType;
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[5]")
		private WebElementFacade col_viewRateCard;
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[6]")
		private WebElementFacade col_editRateCard;
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//th[7]")
		private WebElementFacade col_deleteRateCard;
		
		@FindBy(xpath="//tr-accordiontab[@header='Rate Card Intervention']//tbody/tr[1]")
		private WebElementFacade tr_firstRecordRateCard;
		
		//Verifying the Rate Card table now
		public void validateRateCardList() {
			
					if (col_provider.isCurrentlyVisible())
						Assert.assertTrue("Table header for Provider does not match", col_provider.getText().trim().equals("Provider"));
					if (col_status.isCurrentlyVisible())
						Assert.assertTrue("Table header for Status does not match", col_status.getText().trim().equals("Status"));
					if (col_statusDate.isCurrentlyVisible()) 
						Assert.assertTrue("Table header for Status Date does not match", col_statusDate.getText().trim().equals("Status Date"));
					if (col_interventionType.isCurrentlyVisible()) 
						Assert.assertTrue("Table header for Intervention Type does not match", col_interventionType.getText().trim().equals("Intervention Type"));
					if (col_viewRateCard.isCurrentlyVisible()) 
						Assert.assertTrue("Table header for Viewdoes not match", col_viewRateCard.getText().trim().equals("View"));
					if (col_editRateCard.isCurrentlyVisible()) 
						Assert.assertTrue("Table header for Edit does not match", col_editRateCard.getText().trim().equals("Edit"));
					if (col_deleteRateCard.isCurrentlyVisible()) 
						Assert.assertTrue("Table header for Delete does not match", col_deleteRateCard.getText().trim().equals("Delete"));
					
					//Validating that a record is present for Rate card
					if (tr_firstRecordRateCard.isCurrentlyVisible())
						System.out.println("one record is present in Rate Card table as expected.");
					else
						System.out.println("No record is present in Rate Card table.");
					
		}	
	
		// for registration - yogesh
		@FindBy(xpath = "//a[contains(text(),'Registration')]")
		private WebElementFacade lnk_registration;
		
		@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'registration')])[2]/button")
		private WebElementFacade btn_viewRegistration;
		
		@FindBy(xpath = "//a[@ng-reflect-router-link='registration,new']/button")
		private WebElementFacade btn_addRegistration;
		
		@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'registration')])[2]/parent::td/following-sibling::td[1]/a")
		private WebElementFacade btn_editRegistration;
		
		@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'registration')])[3]/parent::td/following-sibling::td//button")
		private WebElementFacade btn_deleteRegistration;

		public void clickOnRegistrationLnk() {
			waitForPresenceOf("//a[contains(text(),'Registration')]");
			lnk_registration.click();
			waitABit(1000);
		}
		
		public void clickViewRegistration() {
			waitForTextToAppear(lnk_registration.getText(),20000);
			if (!btn_viewRegistration.isCurrentlyVisible()) {
				waitABit(500);
				clickOnRegistrationLnk();

				if (btn_viewRegistration.isCurrentlyVisible()) {
					btn_viewRegistration.click();
					waitABit(500);
				} else
					System.out.println("no record for registration is available ... add registration record first then click on view button");
			}
		}
		
		public void clickAddRegistrationBtn() {
			waitForTextToAppear(lnk_registration.getText(),20000);
			clickOnRegistrationLnk();
			if (btn_addRegistration.isCurrentlyVisible()) {
				btn_addRegistration.click();
				waitABit(1000);
			} else
				System.out.println("add btn is not available for Registration.");
		}
		
		public void clickEditRegistrationBtn() {
			waitForTextToAppear(lnk_registration.getText(),20000);
			if (!btn_editRegistration.isCurrentlyVisible()) {
				waitABit(500);
				clickOnRegistrationLnk();

				if (btn_editRegistration.isCurrentlyVisible()) {
					btn_editRegistration.click();
					waitABit(500);
				} else
					System.out.println("no record for registration is available ... add registration record first then click on edit button");
			}
		}
		
		public void clickDeleteRegistrationBtn() {
			waitForTextToAppear(lnk_registration.getText(),20000);
			if (!btn_deleteRegistration.isCurrentlyVisible()) {
				waitABit(500);
				clickOnRegistrationLnk();

				if (btn_deleteRegistration.isCurrentlyVisible()) {
					btn_deleteRegistration.click();
					waitABit(500);
				} else
					System.out.println("no record for registration is available ... add registration record first then click on delete button");
			}
		}
		
		//For Offender Manager

		@FindBy(xpath = "//a[contains(text(),'Offender Manager')]")
		private WebElementFacade lnk_OffenderManager;

		@FindBy(xpath = "//a[contains(@ng-reflect-router-link,'offendermanager')][1]/button")
		private WebElementFacade btn_viewOffenderManager;
		public Object clickViewOffenderManager;
		
		public void clickOnOffenderManagerLnk() {
			waitForPresenceOf("//a[contains(text(),'Offender Manager')]");
			lnk_OffenderManager.click();
			waitABit(1000);
		}
		
		public void clickViewOffenderManager() {
			waitForTextToAppear(lnk_OffenderManager.getText(),20000);
			if (!btn_viewOffenderManager.isCurrentlyVisible()) {
				waitABit(500);
				clickOnOffenderManagerLnk();

				if (btn_viewOffenderManager.isCurrentlyVisible()) {
					btn_viewOffenderManager.click();
					waitABit(500);
				} else
					System.out.println("no record for offender manager is available ... add offender manager record first then click on view button");
		
			}
		}
		
		public void verifyServiceUserProfileHeader() {
			if (text_viewServiceUserProfile.isCurrentlyVisible()) {
				System.out.println("Back button on screen is working as expected");
			}
			else { 
				System.out.println("Back button on screen is not working as expected"); 
			}
		}

		//For Additional Identifier
		@FindBy(xpath = "//a[contains(text(),'Additional Identifier')]")
		private WebElementFacade lnk_adnlIdentifier;

		@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'additionalidentifier')]/button)[1]")
		private WebElementFacade btn_addAdnlIdentifier;
		
		@FindBy(xpath = "(//span[text()='Duplicate Offender CRN']/parent::td)[1]/following-sibling::td[3]//button")
		private WebElementFacade btn_delAdnlIdentifier;
		
		@FindBy(xpath = "//a[contains(text(),'Additional Identifier')]/parent::div/following-sibling::div/div/div[@class='pad15']/div[@class]//table[contains(@class,'table-bordered')]//td[1]")
		private  WebElementFacade value_identifierType;
		
		public String additionalIdentifierDetails(){
			return value_identifierType.getText().trim();
		}
		public void clickOnAdditionalIdentifierLnk() {
			lnk_adnlIdentifier.click();
			waitABit(3000);

		}

		public void addAdnlIdentifierBtn() {
			
			btn_addAdnlIdentifier.click();
			waitABit(1000);
		}

		@FindBy(xpath = "(//span[text()='Duplicate Offender CRN']/parent::td)[1]/following-sibling::td[2]//button")
		private WebElementFacade btn_viewAdnlIdentifier;


		public void clickViewAdditionalIdentifierBtn() {
			waitABit(1000);
			clickOnAdditionalIdentifierLnk();
			waitABit(1000);
			if (!btn_viewAdnlIdentifier.isCurrentlyVisible()) {
				//setImplicitTimeout(20,TimeUnit.SECONDS);
				
				if (btn_viewAdnlIdentifier.isCurrentlyVisible()) {
					btn_viewAdnlIdentifier.click();
					//setImplicitTimeout(5,TimeUnit.SECONDS);
				} else
					System.out.println(
							"no record for Additional Identifier is available ");
			}
		}
		
		public void clickDeleteAdditionalIdentifierBtn() {
			if (!btn_delAdnlIdentifier.isCurrentlyVisible()) {
				clickOnAdditionalIdentifierLnk();
				if (btn_delAdnlIdentifier.isCurrentlyVisible()) {
					btn_delAdnlIdentifier.click();
					waitABit(1000);
					getAlert().accept();
				}
				else
					System.out.println("Delete btn is not available");
			}
		}
		
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return text_viewServiceUserProfile;
	}

	
}

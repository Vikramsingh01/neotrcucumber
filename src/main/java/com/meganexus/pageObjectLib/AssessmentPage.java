package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class AssessmentPage extends NeoTR_Page{
    
	@FindBy(xpath = "//h2[text()='Assessment']")
	public WebElementFacade hdr_Assessment;
	@FindBy(xpath = "//a[contains(text(),'Assessment')]")
	public WebElementFacade lnk_assessment;
	@FindBy(xpath = "//a[@id='filter']")
	public WebElementFacade lnk_filter;
	@FindBy(xpath = ".//*[@id='assessment_addButton']")
	public WebElementFacade btn_addAssessment;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[1]")
	public WebElementFacade btn_viewAssessment;
	@FindBy(xpath = ".//*[@id='assessment_edit0']")
	public WebElementFacade btn_editAssessment;
	@FindBy(xpath = ".//*[@id='assessment_delete0']")
	public WebElementFacade btn_deleteAssessment;
	@FindBy(xpath = "//button[contains(.,'Back')]")
	public WebElementFacade btn_backAssessment;
    @FindBy(xpath = ".//*[@id='myModal']/div/div/div[3]/button[2]") 
	WebElementFacade txt_popup;
	@FindBy(xpath = "//button[contains(text(),'Ok')]") 
	WebElementFacade btn_ok;
	
	public void clickAddAssessmentBtn() {
		btn_addAssessment.click();
		waitABit(1000);
	}
	
	@FindBy(xpath = "//h2[contains(.,'VIEW Assessment')]")
	public WebElementFacade txt_viewAssessment;
	
	public void clickAssessmentViewBtn() {
		//System.out.println(btn_viewAssessment.getAttribute("innerHTML"));
		if (btn_viewAssessment.isCurrentlyVisible()) {
			btn_viewAssessment.click();
			waitABit(1000);
		} else {
			System.out.println("Assessment is not available on ui");
		}

	}
	
	public void clickDeleteAssessmentBtn() {
		if (btn_deleteAssessment.isCurrentlyVisible()) {
			waitABit(2000);
			btn_deleteAssessment.click();
			waitABit(1000);
			btn_ok.click();
			waitABit(2000);
		} else
			System.out.println("Assessment is not available on ui");
	}

	@SuppressWarnings("deprecation")
	public void verifyDeleteAssessment() {
		Assert.assertTrue("Assessment is not deleted", btn_deleteAssessment.isCurrentlyVisible());
	}
	
	public void clickEditAssessmentBtn() {

		btn_editAssessment.click();
		waitABit(1000);
	}
	
	
	public void clickBackAssessmentBtn() {

		btn_backAssessment.click();
		waitABit(1000);
	}
	 //Label verification on View Assessment
	
	@FindBy(xpath = "//div[@id='label_assessmentTypeId']")
	public WebElementFacade lbl_viewAssessmentType;
	@FindBy(xpath = "//div[@id='label_assessmentDate']")
	public WebElementFacade lbl_viewAssessmentDate;
	@FindBy(xpath = "//div[@id='label_assessmentOutcomeId']")
	public WebElementFacade lbl_viewAssessmentOutcome;
	@FindBy(xpath = "//div[@id='label_assessmentScore']")
	public WebElementFacade lbl_viewAssessmentScore;
	@FindBy(xpath = "//div[@id='label_note']")
	public WebElementFacade lbl_viewAssessmentNote;
	@FindBy(xpath = "//div[@id='label_offenderAttendedYesNoId']")
	public WebElementFacade lbl_viewAssessmentSU;
	@FindBy(xpath = "//div[@id='label_offenderRequiredToAttendYesNoId']")
	public WebElementFacade lbl_viewAssessmentRequiredAttend;
	@FindBy(xpath = "//h2[contains(.,'VIEW Assessment')]")
	public WebElementFacade txt_viewAssessmentheader;
	
	@FindBy(xpath = "//div[@id='label_durationInMinutes']")
	public WebElementFacade lbl_viewAssessmentDuration;
	@FindBy(xpath = "//div[@id='label_offenderAgreementYesNoId']")
	public WebElementFacade lbl_viewAssessmentAgreement;
	
	// Value verification on View Assessment
	
	@FindBy(xpath = "//p[@id='assessmentTypeId']")
	public WebElementFacade val_viewAssessmentType;
	@FindBy(xpath = "//p[@id='assessmentDate']")
	public WebElementFacade val_viewAssessmentDate;
	@FindBy(xpath = "//p[@id='assessmentOutcomeId']")
	public WebElementFacade val_assensmentoutcome;
	@FindBy(xpath = "//p[@id='assessmentScore']")
	public WebElementFacade val_score;
	@FindBy(xpath = "//p[@id='note']")
	public WebElementFacade val_viewAssessmentNote;
	
	@FindBy(xpath = "//p[@id='offenderRequiredToAttendYesNoId']")
	public WebElementFacade val_RequiredToAttend;
	@FindBy(xpath = "//p[@id='offenderAttendedYesNoId']")
	public WebElementFacade val_SUAttended;
	@FindBy(xpath = "//p[@id='offenderAgreementYesNoId']")
	public WebElementFacade val_viewSUAgreement;
	@FindBy(xpath = "//p[@id='durationInMinutes']")
	public WebElementFacade val_viewDuration;
	
	
	// Verify Column name on List of view Assessment screen
	
	@FindBy(xpath ="//span[contains(.,'Assessment Type')]")
	private WebElementFacade col_assessmentType;
	
	@FindBy(xpath = "//span[contains(.,'Assessment Date')]")
	private WebElementFacade col_assessmentDate;
	
	@FindBy(xpath = "//span[contains(.,'Assessment Outcome')]")
	private WebElementFacade col_assessmentOutcome;
	
	
	public void validateAssessmentList() {
	
		//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		
		verifyBreadCrumbs("My Service Users Profile Events Referral View Referral");

     	// Verify Column name 
		
		if (col_assessmentDate.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for Assessment Date does not match", col_assessmentDate.getText().trim().equals("ASSESSMENT DATE"));
		if (col_assessmentOutcome.isCurrentlyVisible())
			Assert.assertTrue("Table header for Assessment Outcome does not match", col_assessmentOutcome.getText().trim().equals("ASSESSMENT OUTCOME"));
		if (col_assessmentType.isCurrentlyVisible())
			Assert.assertTrue("Table header for Assessment Type does not match", col_assessmentType.getText().trim().equals("ASSESSMENT TYPE"));
	}
	
	public void validateViewAssessmentDetails() {
		waitABit(500);
		
		 String assessmentType =  GetSRD_or_NSRDValue.getUIValue_from_NSRD20("ASSESSMENT TYPE",
					ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./AssessmentType"));
		 String assessmentDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./AssessmentDate"));
		 String assessmentDuration = ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./DurationMinutes");
		 String assessmentScore = ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./AssessmentScore");
		 String notes = ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./Notes");
		 String assessmentOutcome =  GetSRD_or_NSRDValue.getUIValue_from_NSRD20("ASSESSMENT OUTCOME",
			        ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./AssessmentOutcome"));
		    
		 String offenderRequiredtoAttend =  GetSRD_or_NSRDValue.getUIValue_from_SRD20(" ",
				   ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./OffenderRequiredtoAttend"));
		 String offenderAttended =  GetSRD_or_NSRDValue.getUIValue_from_SRD20(" ",
			        ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./OffenderAttended"));
		 String offenderAgreement =  GetSRD_or_NSRDValue.getUIValue_from_SRD20(" ",
			        ReadXMLData.getXMLData("inboundXML/AE.xml", "//Assessment", "./OffenderAgreement"));
		
		
		System.out.println(txt_viewAssessment);
    	//Assert.assertTrue("View Assessment text is not available",
    		//	txt_viewAssessment.getText().trim().equals("View Assessment"));
		Assert.assertTrue("Assessment Type label is not available",
				lbl_viewAssessmentType.getText().trim().equals("Assessment Type"));
		Assert.assertTrue("Assessment Date label is not available",
				lbl_viewAssessmentDate.getText().trim().equals("Assessment Date"));
		Assert.assertTrue("Assessment Outcome label is not available",
				lbl_viewAssessmentOutcome.getText().trim().equals("Assessment Outcome"));
		Assert.assertTrue("Assessment Score label is not available",
				lbl_viewAssessmentScore.getText().trim().equals("Assessment Score"));
		Assert.assertTrue("Notes label is not available",
				lbl_viewAssessmentNote.getText().trim().equals("Notes"));
		Assert.assertTrue("SU Attended label is not available",
				lbl_viewAssessmentSU.getText().trim().equals("SU Attended?"));
		System.out.println(lbl_viewAssessmentRequiredAttend);
		Assert.assertTrue("SU Required to Attend label is not available",
				lbl_viewAssessmentRequiredAttend.getText().trim().equals("SU Required To Attend?"));
		Assert.assertTrue("Notes label is not available",
				lbl_viewAssessmentNote.getText().trim().equals("Notes"));
		Assert.assertTrue("Assessment Duration label is not available",
				lbl_viewAssessmentDuration.getText().trim().equals("Assessment Duration(HH:MM)"));
		
		
		
		System.out.println(assessmentType);
     	System.out.println(assessmentDate);
		System.out.println(assessmentDuration);
		System.out.println(assessmentScore);
		System.out.println(notes);
	    System.out.println(assessmentOutcome);
	    System.out.println(offenderRequiredtoAttend);
		System.out.println(offenderAgreement);
	    System.out.println(offenderAttended);
	    
		Assert.assertTrue("Assessment type value not matched",
			val_viewAssessmentType.getText().trim().equals(assessmentType));
		Assert.assertTrue("Assessment Date value not matched",
				val_viewAssessmentDate.getText().trim().equals(assessmentDate));
		Assert.assertTrue("Assessment Outcome value not matched", 
				val_assensmentoutcome.getText().trim().equals(assessmentOutcome));
	    Assert.assertTrue("Assessment Score value not matched", 
				val_score.getText().trim().equals(assessmentScore));
        Assert.assertTrue("Notes value not matched",
        		val_viewAssessmentNote.getText().trim().equals(notes));
		Assert.assertTrue("Assessment Duration value not matched", 
				val_viewDuration.getText().trim().equals(assessmentDuration));
		
		Assert.assertTrue("Assessment Required to Attend value not matched",
				val_RequiredToAttend.getText().trim().equals(offenderRequiredtoAttend));
		Assert.assertTrue("SU Attended Date sub type value not matched",
				val_SUAttended.getText().trim().equals(offenderAttended));
		Assert.assertTrue("Assessment Agreement value not matched", 
				val_viewSUAgreement.getText().trim().equals(offenderAgreement));
			  //System.out.println(hdr_Assessment);
		Assert.assertTrue("Assessment Header is not available",
				hdr_Assessment.getText().trim().equals("Assessment"));
	}
	
	//Add Page Labels Locators
		@FindBy(xpath = "//h2[text()='Add Assessment']")
		private WebElementFacade hdr_addAssessment;
		@FindBy(xpath = "//a[contains(text(),'Assessment')]")
		private WebElementFacade lnk_Assessment;
		@FindBy(xpath = "//label[@for='assessmentTypeId']")
		private WebElementFacade lbl_assessmentType;
		@FindBy(xpath = "//label[@for='assessmentDate']")
		private WebElementFacade lbl_assessmentDate;
		@FindBy(xpath = "//label[@for='offenderRequiredToAttendYesNoId']")
		private WebElementFacade lbl_SUreqdToAttend;
		@FindBy(xpath = "//label[@for='offenderAttendedYesNoId']")
		private WebElementFacade lbl_SUattended;
		@FindBy(xpath = "//label[@for='note']")
		private WebElementFacade lbl_Notes;
		@FindBy(xpath = "//label[@for='assessmentOutcomeId']")
		private WebElementFacade lbl_assessmentOutcome;
		@FindBy(xpath = "//label[@for='offenderAgreementYesNoId']")
		private WebElementFacade lbl_assessmentAgreement;
		@FindBy(xpath = ".//*[@id='cancelButton']")
		private WebElementFacade btn_cancel;
		@FindBy(xpath = ".//*[@id='saveButton']")
		private WebElementFacade btn_submit;
			    
  public void addAssessmentPageLabelVerification(){
			
			waitABit(4000);
			Assert.assertTrue("Assessment Type label is not available ", lbl_assessmentType.getText().trim().equals("ASSESSMENT TYPE *"));
			Assert.assertTrue("Assessment Date label is not available ", lbl_assessmentDate.getText().trim().equals("ASSESSMENT DATE *"));

			Assert.assertTrue("SU Required To attend label is not available ", lbl_SUreqdToAttend.getText().trim().equals("SU REQUIRED TO ATTEND? *"));

			Assert.assertTrue("SU Attended label is not available ", lbl_SUattended.getText().trim().equals("SU ATTENDED?"));

			Assert.assertTrue("Note label is not available ", lbl_Notes.getText().trim().equals("NOTES"));
			//Assert.assertTrue("Outcome label is not available ", lbl_assessmentOutcome.getText().trim().equals("ASSESSMENT OUTCOME"));
			//Assert.assertTrue("SU Agreement label is not available ", lbl_assessmentAgreement.getText().trim().equals("SU AGREEMENT *"));


		}
		
		//Add Page Field value Locators

		@FindBy(xpath = ".//*[@id='assessmentTypeId']")
		private WebElementFacade value_assessmentType;
		@FindBy(xpath = ".//*[@id='assessmentDate']")
		private WebElementFacade value_assessmentDate;
		@FindBy(xpath = ".//*[@id='offenderRequiredToAttendYesNoId']")
		private WebElementFacade value_SUreqdToAttend;
		@FindBy(xpath = ".//*[@id='offenderAttendedYesNoId']")
		private WebElementFacade value_SUattended;
		@FindBy(xpath = ".//*[@id='note']")
		private WebElementFacade value_notes;
		@FindBy(xpath = ".//*[@id='assessmentOutcomeId']")
		private WebElementFacade value_assessmentOutcome;
		@FindBy(xpath = ".//*[@id='offenderAgreementYesNoId']")
		private WebElementFacade value_SUagreement;
		
			public void addAssessmentValidDetails() {

				value_assessmentType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./assessmentType"));	
				value_assessmentDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./assessmentDate"));
				value_SUreqdToAttend.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./SURequiredToattend"));
				value_SUattended.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./SUAttended"));
				value_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./notes"));
				value_assessmentOutcome.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./assessmentOutcome"));
				value_SUagreement.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_ADD", "./SUAgreement"));

				
				waitABit(2000);
				if (btn_submit.isCurrentlyVisible()) {
					btn_submit.click();
					waitABit(3000);

				} else
					System.out.println("Assessment Submit button is not available");
				waitABit(2000);
			}
			
			//Negative Scenario for error message validation on Add page
			
			
			//Error Message Locators
			@FindBy(xpath = "//label[@for='assessmentTypeId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_assessmentType;
			@FindBy(xpath = "//label[@for='assessmentDate']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_assessmentDate;
			@FindBy(xpath = "//label[@for='offenderRequiredToAttendYesNoId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_SUreqdToAttend;
			@FindBy(xpath = "//label[@for='assessmentOutcomeId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_assessmentOutcome;
			

			public void addAssessmentInvalidDetails() {

               //Leave all fields blank 
				waitABit(2000);
				if (btn_submit.isCurrentlyVisible()) {
					btn_submit.click();
					waitABit(3000);

				} else
					System.out.println("Assessment Submit button is not available");
				waitABit(2000);
			}
		
			public void addAssessmentErrorMessageValidation(){

				Assert.assertTrue("Required Assessment Type field is not selected", errmsg_assessmentType.getText().trim().equals("Required field"));
				Assert.assertTrue("Required Assessment Date is not entered", errmsg_assessmentDate.getText().trim().equals("Required field"));
				Assert.assertTrue("Required Assessment SU Required to attend field is not selected", errmsg_SUreqdToAttend.getText().trim().equals("Required field"));
			    waitABit(4000);
				
			}
			
  
			public void CancelBtnFunctionality(){
		
					 btn_cancel.click();
					    
						waitABit(4000);
						//Assert.assertTrue("Message in Confirm Pop-up box not available",txt_popup.getText().trim().equals("Do you want to leave this page without saving?"));
					
						btn_ok.click();
						waitABit(9000);

			}

			public void editAssessmentPageLabelVerification(){
				
				waitABit(4000);
				Assert.assertTrue("Assessment Type label is not available ", lbl_assessmentType.getText().trim().equals("ASSESSMENT TYPE *"));
				Assert.assertTrue("Assessment Date label is not available ", lbl_assessmentDate.getText().trim().equals("ASSESSMENT DATE *"));

				Assert.assertTrue("SU Required To attend label is not available ", lbl_SUreqdToAttend.getText().trim().equals("SU REQUIRED TO ATTEND? *"));

				Assert.assertTrue("SU Attended label is not available ", lbl_SUattended.getText().trim().equals("SU ATTENDED?"));

				Assert.assertTrue("Note label is not available ", lbl_Notes.getText().trim().equals("NOTES"));
			}
			
			
			public void editAssessmentValidDetails() {

				value_notes.clear();
		        waitABit(1000);
				value_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Assessment_EDIT", "./notes"));
				 waitABit(1000);
    			value_assessmentOutcome.clear();
		        waitABit(1000);
				value_assessmentOutcome.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_EDIT", "./assessmentOutcome"));

			waitABit(2000);
			if (btn_submit.isCurrentlyVisible()) {
				btn_submit.click();
				waitABit(3000);

			} else
					System.out.println("Assessment Submit button is not available");
				waitABit(2000);
			}
			
			public void editAssessmentInvalidDetails() {
               
				  waitABit(1000);
				value_assessmentDate.clear();
		        waitABit(1000);
		        //value_SUreqdToAttend.clear();
		       // waitABit(1000);
		        value_SUreqdToAttend.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Assessment_InvalidEDIT", "./SURequiredToattend"));

					waitABit(2000);
					if (btn_submit.isCurrentlyVisible()) {
						btn_submit.click();
						waitABit(3000);

					} else
						System.out.println("Assessment Submit button is not available");
					waitABit(2000);
				}
        		
			public void editAssessmentErrorMessageValidation(){

				Assert.assertTrue("SU Required to attend field is not selected", errmsg_SUreqdToAttend.getText().trim().equals("Required field"));
				Assert.assertTrue("Required Assessment Date is not entered", errmsg_assessmentDate.getText().trim().equals("Required field"));
			    waitABit(4000);
				
			}	
			
	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_assessment;
	}

}


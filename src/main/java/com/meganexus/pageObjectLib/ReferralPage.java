package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DatabaseConnection;
import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class ReferralPage extends NeoTR_Page{
	
	String referralType =  GetSRD_or_NSRDValue.getUIValue_from_NSRD20("REFERRAL TYPE",
			ReadXMLData.getXMLData("inboundXML/AE.xml", "//Referral", "./ReferralType"));
	String referralDate = DateFormatter.changeDateFormat(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Referral", "./ReferralDate"));
    String referralSource =  GetSRD_or_NSRDValue.getUIValue_from_NSRD20("REFERRAL SOURCE",
			ReadXMLData.getXMLData("inboundXML/AE.xml", "//Referral", "./ReferralSource"));
    String referralOutcome =  GetSRD_or_NSRDValue.getUIValue_from_NSRD20("REFERRAL OUTCOME",
	        ReadXMLData.getXMLData("inboundXML/AE.xml", "//Referral", "./ReferralOutcome"));
	String notes = ReadXMLData.getXMLData("inboundXML/AE.xml", "//Referral", "./Notes");
	
	@FindBy(xpath = "//h2[text()='Referral']")
	public WebElementFacade hdr_Referral;
	@FindBy(xpath = "//a[contains(text(),'Referral')]")
	public WebElementFacade lnk_referral;
	@FindBy(xpath = "//a[@id='filter']")
	public WebElementFacade lnk_filter;
	@FindBy(xpath = "//button[@id='referral_addButton']")
	public WebElementFacade btn_addReferral;
	@FindBy(xpath = "//button[@id='referral_view0']")
	public WebElementFacade btn_viewReferral;
	@FindBy(xpath = "//button[@id='referral_edit0']")
	public WebElementFacade btn_editReferral;
	@FindBy(xpath = "//button[@id='referral_delete0']")
	public WebElementFacade btn_deleteReferral;
	@FindBy(xpath = "//button[contains(.,'Back')]")
	public WebElementFacade btn_backReferral;
    @FindBy(xpath = ".//*[@id='myModal']/div/div/div[3]/button[2]") 
	WebElementFacade txt_popup;
	@FindBy(xpath = "//button[contains(text(),'Ok')]") 
	WebElementFacade btn_ok;
	
	@FindBy(xpath = "//a[contains(.,'Assessment')]") 
	WebElementFacade link_assessment;
	
	public void clickAddReferralBtn() {
		btn_addReferral.click();
		waitABit(1000);
	}
	
	public void clickLinkAssessmentBtn() {
		link_assessment.click();
		waitABit(1000);
	}
	@FindBy(xpath = "//h2[contains(.,'VIEW Referral')]")
	public WebElementFacade txt_viewReferral;
	
	public void clickReferralViewBtn() {
	
		  waitABit(3000);
		if (btn_viewReferral.isCurrentlyVisible()) {
			btn_viewReferral.click();
			waitABit(3000);
		} else {
			System.out.println("Referral is not available on ui");
		}

	}
	
	public void clickDeleteReferralBtn() {
		if (btn_deleteReferral.isCurrentlyVisible()) {
			btn_deleteReferral.click();
			waitABit(1000);
			//DatabaseConnection.executeSQLQuery("select * from tr_referral_spg");
		} else
			System.out.println("Referral is not available on ui");
	}

	@SuppressWarnings("deprecation")
	public void verifyDeleteReferral() {
		Assert.assertTrue("Referral is not deleted", btn_deleteReferral.isCurrentlyVisible());
	}
	
	public void clickEditReferralBtn() {
        
		waitABit(3000);
		btn_editReferral.click();
		waitABit(1000);
	}
	
	public void clickBackReferralBtn() {

		btn_backReferral.click();
		waitABit(1000);
	}
	public void verifyReferralTabHeader() {
		if (hdr_Referral.isCurrentlyVisible()) {
			System.out.println("Back button on screen is working as expected");
		}
		else { 
			System.out.println("Back button on screen is not working as expected"); 
		}
		
	}
	// Label verification on View Referral
	
	@FindBy(xpath = "//div[@title='Referral Type']")
	public WebElementFacade lbl_viewReferralType;
	@FindBy(xpath = "//div[@id='label_referralDate']")
	public WebElementFacade lbl_viewReferralDate;
	@FindBy(xpath = "//div[@id='label_referralOutcomeId']")
	public WebElementFacade lbl_viewReferralOutcome;
	@FindBy(xpath = "//div[@id='label_referralSourceId']")
	public WebElementFacade lbl_viewReferralSource;
	@FindBy(xpath = "//div[@id='label_note']")
	public WebElementFacade lbl_viewReferralNote;
	
	// Value verification on View Referral
	
	@FindBy(xpath = ".//*[@id='referralTypeId']/tr-list-label")
	public WebElementFacade val_viewReferralType;
	@FindBy(xpath = ".//*[@id='referralDate']")
	public WebElementFacade val_viewReferralDate;
	@FindBy(xpath = ".//*[@id='referralOutcomeId']/tr-list-label")
	public WebElementFacade val_viewReferralOutcome;
	@FindBy(xpath = ".//*[@id='referralSourceId']/tr-list-label")
	public WebElementFacade val_viewReferralSource;
	@FindBy(xpath = "//*[@id='label_note']")
	public WebElementFacade val_viewReferralNote;
	
	//Verify column name and value of the view referral screen
	
	public void validateViewReferralDetails() {
		waitABit(1000);
    	//Assert.assertTrue("View Referral text is not available",
		//	txt_viewReferral.getText().trim().equals("VIEW REFERRAL"));
		Assert.assertTrue("Referral Type label is not available",
				lbl_viewReferralType.getText().trim().equals("REFERRAL TYPE :"));
		Assert.assertTrue("Referral Date label is not available",
				lbl_viewReferralDate.getText().trim().equals("REFERRAL DATE :"));
		Assert.assertTrue("Referral Outcome label is not available",
				lbl_viewReferralOutcome.getText().trim().equals("REFERRAL OUTCOME :"));
		Assert.assertTrue("Referral Source label is not available",
				lbl_viewReferralSource.getText().trim().equals("REFERRAL SOURCE :"));
		Assert.assertTrue("Notes label is not available",
				lbl_viewReferralNote.getText().trim().equals("NOTES :"));
			
		System.out.println(referralType);
		System.out.println(referralDate);
		System.out.println(referralSource);
		System.out.println(referralOutcome);
		System.out.println(notes);
//		
		Assert.assertTrue("Referral type value not matched",
				val_viewReferralType.getText().trim().equals(referralType));
		Assert.assertTrue("Referral Date sub type value not matched",
				val_viewReferralDate.getText().trim().equals(referralDate));
		Assert.assertTrue("Referral Outcome value not matched", 
				val_viewReferralOutcome.getText().trim().equals(referralOutcome));
		Assert.assertTrue("Referral Source value not matched", 
				val_viewReferralSource.getText().trim().equals(referralSource));
        Assert.assertTrue("Notes value not matched",
        		val_viewReferralNote.getText().trim().equals(notes));
	                                                                                                                                                                                  
	}
	
	// Verify Column name on List of view Referral screen
	
	@FindBy(xpath ="//span[contains(.,'Referral Type')]")
	private WebElementFacade col_referralType;
	
	@FindBy(xpath = "//span[contains(.,'Referral Date')]")
	private WebElementFacade col_referralDate;
	
	@FindBy(xpath = "//span[contains(.,'Referral Outcome')]")
	private WebElementFacade col_referralOutcome;
	
	
	public void validateReferralList() {
		//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		verifyBreadCrumbs("My Service Users Profile Events Referral");

		//clicking on the Referral collapsible to view Referral table
		System.out.println(waitFor(lnk_referral));
		if (!btn_addReferral.isCurrentlyVisible()) {
			waitFor(lnk_referral);
			lnk_referral.click();
			waitABit(1000);
		}

		//verifying the Referral table now
		System.out.println(col_referralType.getText().trim());
		System.out.println(col_referralDate.getText().trim());
		System.out.println(col_referralOutcome.getText().trim());
		
     	if (col_referralType.isCurrentlyVisible())
			Assert.assertTrue("Table header for Referral Type does not match", col_referralType.getText().trim().equals("REFERRAL TYPE"));
		if (col_referralDate.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for Referral Date does not match", col_referralDate.getText().trim().equals("REFERRAL DATE"));
		if (col_referralOutcome.isCurrentlyVisible())
			Assert.assertTrue("Table header for Referral Outcome does not match", col_referralOutcome.getText().trim().equals("REFERRAL OUTCOME"));
	
	}
	
	//Add Page Labels Locators
			@FindBy(xpath = "//h2[text()='Add Referral']")
			private WebElementFacade hdr_addReferral;
			@FindBy(xpath = "//a[contains(text(),'Referral')]")
			private WebElementFacade lnk_Referral;
			@FindBy(xpath = "//label[@for='referralTypeId']")
			private WebElementFacade lbl_referralType;
			@FindBy(xpath = "//label[@for='referralDate']")
			private WebElementFacade lbl_referralDate;
			@FindBy(xpath = "//label[@for='referralOutcomeId']")
			private WebElementFacade lbl_referralOutcome;
			@FindBy(xpath = "//label[@for='referralSourceId']")
			private WebElementFacade lbl_referralSource;
			@FindBy(xpath = "//label[@for='note']")
			private WebElementFacade lbl_Notes;
			@FindBy(xpath = ".//*[@id='cancelButton']")
			private WebElementFacade btn_cancel;
			@FindBy(xpath = ".//*[@id='saveButton']")
			private WebElementFacade btn_submit;
				    
			public void addeditReferralPageLabelVerification(){
				
				waitABit(4000);
				
				Assert.assertTrue("Referral Type label is not available ", lbl_referralType.getText().trim().equals("REFERRAL TYPE *"));
				Assert.assertTrue("Referral Date label is not available ", lbl_referralDate.getText().trim().equals("REFERRAL DATE *"));

				Assert.assertTrue("Referral Outcome label is not available ", lbl_referralOutcome.getText().trim().equals("REFERRAL OUTCOME *"));

				Assert.assertTrue("Referral Source label is not available ", lbl_referralSource.getText().trim().equals("REFERRAL SOURCE *"));

				Assert.assertTrue("Note label is not available ", lbl_Notes.getText().trim().equals("NOTES"));
			}
			
			//Add Page Field value Locators

			@FindBy(xpath = ".//*[@id='referralTypeId']")
			private WebElementFacade ddl_referralType;
			@FindBy(xpath = ".//*[@id='referralDate']")
			private WebElementFacade value_referralDate;
			@FindBy(xpath = ".//*[@id='referralOutcomeId']")
			private WebElementFacade ddl_referralOutcome;
			@FindBy(xpath = ".//*[@id='referralSourceId']")
			private WebElementFacade ddl_referralSource;
			@FindBy(xpath = ".//*[@id='note']")
			private WebElementFacade value_notes;
			
				public void addReferralValidDetails() {
	                
					waitABit(2000);
					ddl_referralType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_ADD", "./referralType"));	
					value_referralDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Referral_ADD", "./referralDate"));
					ddl_referralOutcome.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_ADD", "./referralOutcome"));
					ddl_referralSource.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_ADD", "./referralSource"));
					value_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Referral_ADD", "./notes"));
					
					waitABit(2000);
					if (btn_submit.isCurrentlyVisible()) {
						btn_submit.click();
						waitABit(3000);

					} else
						System.out.println("Referral Submit button is not available");
					waitABit(2000);
				}
				
				//Negative Scenario for error message validation on Add page
				
				//Error Message Locators
				
				@FindBy(xpath = "//label[@for='referralTypeId']/following-sibling::control-messages//div[@class='error-msg']")
				private WebElementFacade errmsg_referralType;
				@FindBy(xpath = "//label[@for='referralDate']/following-sibling::control-messages//div[@class='error-msg']")
				private WebElementFacade errmsg_referralDate;
				@FindBy(xpath = "//label[@for='referralOutcomeId']/following-sibling::control-messages//div[@class='error-msg']")
				private WebElementFacade errmsg_referralOutcome;
				@FindBy(xpath = "//label[@for='referralSourceId']/following-sibling::control-messages//div[@class='error-msg']")
				private WebElementFacade errmsg_referralSource;
				
				public void addReferralInvalidDetails() {
	                
	               //Leave all fields blank 
					waitABit(2000);
					if (btn_submit.isCurrentlyVisible()) {
						btn_submit.click();
						waitABit(3000);

					} else
						System.out.println("Referral Submit button is not available");
					waitABit(2000);
				}
			
	     
				public void addReferralErrorMessageValidation(){
				
					waitABit(4000);
					Assert.assertTrue("Required Referral Type field is not selected", errmsg_referralType.getText().equals("Required field"));
					Assert.assertTrue("Required Referral Date is not entered", errmsg_referralDate.getText().equals("Required field"));
					Assert.assertTrue("Required Referral Outcome field is not selected", errmsg_referralOutcome.getText().equals("Required field"));
	    			Assert.assertTrue("Required Referral Source field is not selected", errmsg_referralSource.getText().equals("Required field"));
				    waitABit(5000);
					
				}
				
				
				public void CancelBtnFunctionality(){
					
					 btn_cancel.click();
					    
						waitABit(4000);
						//Assert.assertTrue("Message in Confirm Pop-up box not available",txt_popup.getText().trim().equals("Do you want to leave this page without saving?"));
						
						//waitABit(2000);
						btn_ok.click();
						waitABit(9000);
					/*if (btn_cancel.isCurrentlyVisible()) {
						//waitABit(4000);
				        btn_cancel.click();
				    
						waitABit(4000);
						//Assert.assertTrue("Message in Confirm Pop-up box not available",txt_popup.getText().trim().equals("Do you want to leave this page without saving?"));
						
						//waitABit(2000);
						btn_ok.click();
						waitABit(9000);
						//Assert.assertTrue("Directory Of Services page title not available after Canceling on Add Page",hdr_ServiceProviderTitle.getText().trim().equals("Directory Of Services"));

					} else
						System.out.println("Service Provider cancel button is not available");*/

				}

			
				
				public void editReferralInvalidDetails() {

//					ddl_referralType.clear();
//			        waitABit(3000);
//					ddl_referralType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_InvalidEDIT", "./referralType"));	
					waitABit(3000);
					
					value_referralDate.clear();
			        waitABit(1000);
					value_referralDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Referral_InvalidEDIT", "./referralDate"));
					waitABit(1000);
//					ddl_referralOutcome.clear();
//			        waitABit(1000);
//					ddl_referralOutcome.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_InvalidEDIT", "./referralOutcome"));
//					waitABit(1000);
//					ddl_referralSource.clear();
//			        waitABit(1000);
//					ddl_referralSource.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_InvalidEDIT", "./referralSource"));
						waitABit(3000);
						if (btn_submit.isCurrentlyVisible()) {
							btn_submit.click();
							waitABit(3000);

						} else
							System.out.println("Referral Submit button is not available");
						waitABit(5000);
					}
				
				
				
				public void editReferralErrorMessageValidation(){
	               
					System.out.println(errmsg_referralDate.getText());
					waitABit(2000);
					Assert.assertTrue("Future date selected for Referral date field ",errmsg_referralDate.getText().equals("Date cannot be in future."));

					/*Assert.assertTrue("Incorrect value selected for Referral Type field ",errmsg_referralType.getText().equals("Required field "));
					Assert.assertTrue("Incorrect value selected for Referral Outcome field ",errmsg_referralOutcome.getText().equals("Required field "));
	    			Assert.assertTrue("Incorrect value selected for Referral Source field ",errmsg_referralSource.getText().equals("Required field "));*/
				    waitABit(3000);
					
				}
				
		  		public void editReferralValidDetails() {
	                
					//ddl_referralType.clear();
			        //waitABit(100);
					ddl_referralType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_EDIT", "./referralType"));	
					waitABit(1000);
					value_referralDate.clear();
			        waitABit(1000);
					value_referralDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Referral_EDIT", "./referralDate"));
					waitABit(1000);
					//ddl_referralOutcome.clear();
			        waitABit(1000);
					ddl_referralOutcome.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_EDIT", "./referralOutcome"));
					waitABit(1000);
					//ddl_referralSource.clear();
			        waitABit(1000);
			        
					ddl_referralSource.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Referral_EDIT", "./referralSource"));
					waitABit(1000);
					value_notes.clear();
			        waitABit(1000);
					value_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Referral_EDIT", "./notes"));

					waitABit(2000);
					if (btn_submit.isCurrentlyVisible()) {
						btn_submit.click();
						waitABit(3000);

					} else
							System.out.println("Referral Submit button is not available");
						waitABit(2000);
					}
			
	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_referral;
	}

}

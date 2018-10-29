package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class EventViewPage extends NeoTR_Page {
	
	@FindBy(xpath = "//h2[contains(text(),'VIEW event')]")
	private WebElementFacade lbl_viewEvent;
	
	//for License
	@FindBy(xpath = "//button[text()='Add']")
	private WebElementFacade btn_add;
	@FindBy(xpath = "//a[contains(text(),'Licence Condition')]")
	private WebElementFacade lnk_lcHeaderlink;
	
	@FindBy(xpath = "//button[contains(.,'Referral')]")
	private WebElementFacade tab_referralHeaderlink;
	
	// For Referral -Amar
	
	public void clickOnReferralLnk() {
		//waitForPresenceOf("//button[contains(.,'Referral')]");
		waitABit(1000);
		tab_referralHeaderlink.click();
		waitABit(1000);

	}
	
	//for Cohort #Ankita
			@FindBy(xpath = "//a[contains(text(),'Cohort')]")
			private WebElementFacade lnk_cohort;

			public void clickOnCohortLnk() {
				waitForPresenceOf("//a[contains(text(),'Cohort')]");
				lnk_cohort.click();
				waitABit(1000);

			}
			@FindBy(xpath = "//th[contains(@ng-reflect-sort-by-field,'cohortCode')]")
			private WebElementFacade col_CohortCode;
			
			@FindBy(xpath = "//th[contains(@ng-reflect-sort-by-field,'cohortProviderId')]")
			private WebElementFacade col_cohortProvider;
			
			@FindBy(xpath = "//th[contains(@ng-reflect-sort-by-field,'sentenceReleaseDate')]")
			private WebElementFacade col_sentenceReleaseDate;
			
			@FindBy(xpath = "//th[contains(@ng-reflect-sort-by-field,'startDate')]")
			private WebElementFacade col_startDate;
			
			@FindBy(xpath = "(//a[contains(@ng-reflect-router-link,'cohort')]/button)")
			private WebElementFacade btn_viewCohort;
			
			@SuppressWarnings("deprecation")
			public void validateCohortList() {
				if (!btn_viewCohort.isCurrentlyVisible()) {
					lnk_cohort.click();
					waitABit(500);
				}
				if (!btn_viewCohort.isCurrentlyVisible())
				{
					System.out.println("Either View button is not present or there is no record");
				}
				else
				{
				Assert.assertTrue("COHORT link is not available", lnk_cohort.getText().equals("COHORT"));
				Assert.assertTrue("Cohort Code Column heading is not available", col_CohortCode.getText().equals("Cohort Code"));
				Assert.assertTrue("Cohort Provider Column heading is not available", col_cohortProvider.getText().equals("Cohort Provider"));
				Assert.assertTrue("Sentence or Release Date Column heading is not available", col_sentenceReleaseDate.getText().equals("sentence or Release Date"));
				Assert.assertTrue("Start Date Column heading is not available", col_startDate.getText().equals("Start Date"));
				
				
				//Assert.assertTrue("View Column heading is not available", col_view.getText().equals("View"));
				}
			}
			
			
			
			
			public void clickViewCohortBtn() {
				waitFor(lnk_cohort);
				if (!btn_viewCohort.isCurrentlyVisible()) {
					waitABit(500);
					clickOnCohortLnk();

					if (btn_viewCohort.isCurrentlyVisible()) {
						btn_viewCohort.click();
						waitABit(500);
					} else
						System.out.println("no record for cohort is available add cohort first then click on view");
				}
			}
          
			public void clickOnLicenseConditionLink() {
				if(!btn_add.isCurrentlyVisible()){
					lnk_lcHeaderlink.click();
					waitABit(2000);
				}
				btn_add.click();
				waitABit(2000);
			}
			@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[1]")
			public WebElementFacade btn_viewLicenceCondition;
			
			public void clickViewLicenseCondition() {
				
				waitForTextToAppear(lnk_lcHeaderlink.getText(),20000);
				if (!btn_viewLicenceCondition.isCurrentlyVisible()) {
					waitABit(500);
					clickOnLicenseConditionLink();

					if (btn_viewLicenceCondition.isCurrentlyVisible()) {
						btn_viewLicenceCondition.click();
						waitABit(500);
					} else
						System.out.println("no record for Licence Condition is available ... add Licence Condition record first then click on view button");
				}
			}
			
			public void clickLicenceAddBtn(){
				if(!btn_add.isCurrentlyVisible()){
					lnk_lcHeaderlink.click();
					waitABit(2000);
				}
				btn_add.click();
				waitABit(2000);
			}
			
			@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[2]")
			public WebElementFacade btn_editLicenceCondition;
			
			
			public void clickEditLicenseConditionBtn() {
				waitForTextToAppear(lnk_lcHeaderlink.getText(),20000);
				if (!btn_editLicenceCondition.isCurrentlyVisible()) {
					waitABit(500);
					lnk_lcHeaderlink();

					if (btn_editLicenceCondition.isCurrentlyVisible()) {
						lnk_lcHeaderlink.click();
						waitABit(500);
					} else
						System.out.println("no record for registration is available ... add registration record first then click on edit button");
				}
			}
			
			private void lnk_lcHeaderlink() {
				// TODO Auto-generated method stub
				
			}

			@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[3]")
			public WebElementFacade btn_deleteLicenceCondition;
			
			public void clickDeleteLicenseConditionnBtn() {
				waitForTextToAppear(lnk_lcHeaderlink.getText(),20000);
				if (!btn_deleteLicenceCondition.isCurrentlyVisible()) {
					waitABit(500);
					clickOnLicenseConditionLink();

					if (btn_deleteLicenceCondition.isCurrentlyVisible()) {
						btn_deleteLicenceCondition.click();
						waitABit(500);
					} else
						System.out.println("no record for registration is available ... add registration record first then click on delete button");
				}
			}
			@FindBy(xpath = "//a[contains(text(),'Release')]")
			private WebElementFacade lnk_release;


			//table labels xpaths	
			@FindBy(xpath = "(//span[text()='release Date'])")
			private  WebElementFacade lbl_releaseDate;
			@FindBy(xpath = "(//span[text()='release Type'])")
			private  WebElementFacade lbl_releaseType;
			@FindBy(xpath = "//th[contains(text(),'View')]")
			private  WebElementFacade lbl_View;
			
			//Table cell values xpaths 
			@FindBy(xpath = "//th[contains(text(),'View')]") 
			private  WebElementFacade value_releaseDate;  
			@FindBy(xpath = "(//span[text()='release Type'])")
			private  WebElementFacade value_releaseType;
			
			
			public String releaseDetails(){
				return value_releaseDate.getText().trim();
			}
			public void clickOnReleaseLnk() {
				lnk_release.click();
				waitABit(500);

			}

			@FindBy(xpath = "(//a[contains(@ng-reflect-router-link , 'Community Requirement')]/button)[1]")
			private WebElementFacade btn_viewRelease;

			public void clickViewReleaseBtn() {
				if (!btn_viewRelease.isCurrentlyVisible()) {
					lnk_release.click();
					waitABit(500);
				}
				try {
					btn_viewRelease.click();
					waitABit(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			//----------------------Community Requirement-----------------------------------------
				@FindBy(xpath = "//a[contains(text(),'Community Requirement')]")
				private WebElementFacade lnk_CommunityRequirement;


				//Community Requirement table labels xpaths	
				@FindBy(xpath = "(//span[text()='imposed Date'])")
				private  WebElementFacade lbl_imposedDate;
				@FindBy(xpath = "(//span[text()='Requirement Type Main Category'])")
				private  WebElementFacade lbl_additionalRequirementTypeMainCategory;
				@FindBy(xpath = "(//span[text()='Requirement Type Sub Category'])")
				private  WebElementFacade lbl_additionalRequirementTypeSubCategory;
				@FindBy(xpath = "(//span[text()='Provider'])")
				private  WebElementFacade lbl_Provider;
				@FindBy(xpath = "(//span[text()='Team'])")
				private  WebElementFacade lbl_Team;
				@FindBy(xpath = "(//span[text()='Officer'])")
				private  WebElementFacade lbl_Officer;
				@FindBy(xpath = "//th[contains(text(),'Edit')]")
				private  WebElementFacade lbl_Edit;
				
				//Community Requirement Table cell values xpaths 
			/*	@FindBy(xpath = "//th[contains(text(),'View')]") 
				private  WebElementFacade value_releaseDate;  
				@FindBy(xpath = "(//span[text()='release Type'])")
				private  WebElementFacade value_releaseType;
				
				
				public String communityRequirementDetails(){
					return value_releaseDate.getText().trim();
				}*/
				
				public void clickOncommunityRequirementLnk() {
					lnk_CommunityRequirement.click();
					waitABit(500);

				}

				@FindBy(xpath = "(//a[contains(@ng-reflect-router-link , 'release')]/button)[1]")
				private WebElementFacade btn_viewCommunityRequirement;

				public void clickViewCommunityRqmntBtn() {
					if (!btn_viewCommunityRequirement.isCurrentlyVisible()) {
						lnk_CommunityRequirement.click();
						waitABit(500);
					}
					try {
						btn_viewCommunityRequirement.click();
						waitABit(1000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}	
					@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[2]")
					private WebElementFacade btn_updateCommunityRequirement;
					
					public void clickUpdateCommunityRqmntBtn() {
						if (!btn_viewCommunityRequirement.isCurrentlyVisible()) {
							waitFor(lnk_CommunityRequirement);

							lnk_CommunityRequirement.click();
							waitABit(500);

							if (btn_updateCommunityRequirement.isPresent()) {
								btn_updateCommunityRequirement.click();
								waitABit(1000);
							} else
								System.out.println("allias update is locked");
						}
					
				
			}

					
						
							//----------------------Community Requirement Manager-----------------------------------------
							@FindBy(xpath = "//a[contains(text(),'Community Requirement Manager')]")
							private WebElementFacade lnk_CommReqtManager;


							//Community Requirement Manager table labels xpaths	
							@FindBy(xpath = "(//span[text()='responsible Officer'])")
							private  WebElementFacade lbl_responsibleOfficer;
							@FindBy(xpath = "(//span[text()='allocation Reason'])")
							private  WebElementFacade lbl_allocationReason;
							@FindBy(xpath = "(//span[text()='allocation Date'])")
							private  WebElementFacade lbl_allocationDate;
						
						
		//<<<<<<< HEAD
							public void clickOnCommReqtManagerLnk() {
								lnk_CommReqtManager.click();
								waitABit(1000);

							}
							@FindBy(xpath ="(//button[contains(@ng-reflect-router-link ,'requirementmanager,135')])")
							private WebElementFacade btn_viewCommReqtManager;
							
							public void clickViewCommReqtManagerBtn() {
								if (!btn_viewCommReqtManager.isCurrentlyVisible()) {
									lnk_CommReqtManager.click();
									waitABit(500);
								}
								try {
									btn_viewCommReqtManager.click();
									waitABit(1000);
								} catch (Exception e) {
									System.out.println(e);
								}
					
				}
					
				       //-------- Start Order Manager -----//
							
					@FindBy(xpath="//a[contains(text(),'Order Manager')]")
					private WebElementFacade lnk_orderManager;
						
					@FindBy(xpath = "//span[contains(text(),'responsible Officer')]")
					private  WebElementFacade col_ResponsibleOfficer;
					
					@FindBy(xpath = "//span[contains(text(),'provider')]")
					private  WebElementFacade col_Provider;
					
					@FindBy(xpath = "//span[contains(text(),'allocation Date')]")
					private  WebElementFacade col_AllocationDate;
					
					@FindBy(xpath = "(//th[contains(text(),'View')])[7]")
					private  WebElementFacade col_viewForOrderManager;
					
					@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'ordermanager')]")
					private WebElementFacade btn_viewOrderManager;
					
					  //------------ END Order Manager----------//
					
					//For Additional Sentence
					@FindBy(xpath = "//a[contains(text(),'Offender Additional Sentence')]")
					private WebElementFacade lnk_additionalSentence;


					//Additional Sentence table labels xpaths	
					@FindBy(xpath = "(//th[text()='additional Sentence'])")
					private  WebElementFacade col_additionalSentence;
					
					@FindBy(xpath = "(//th[contains(text(),'View')])[5]")
					private  WebElementFacade col_view;
					
					
				
					@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'offender-additional-sentence')]")
					private WebElementFacade btn_viewAdditionalSentence;

					public void clickViewAdditionalSentenceBtn() {
						if (!btn_viewAdditionalSentence.isCurrentlyVisible()) {
							lnk_additionalSentence.click();
							waitABit(500);
						}
						try {
							btn_viewAdditionalSentence.click();
							waitABit(3000);
						} catch (Exception e) {
							System.out.println(e);
						}
					}
					
					//forPSSContact
					@FindBy(xpath = "//a[contains(text(),'PSS Contact')]")
					private WebElementFacade lnk_pssContact;
					
					@FindBy(xpath = "//th[contains(@ng-reflect-sort-by-field,'pssDate')]")
					private  WebElementFacade col_pssDate;
					
					@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'psscontact')]")
					private WebElementFacade btn_viewPSSContact;
					
					public void validatePSSContactList() {
						if (!btn_viewPSSContact.isCurrentlyVisible()) {
							lnk_pssContact.click();
							waitABit(500);
						}
						if (!btn_viewPSSContact.isCurrentlyVisible())
						{
							System.out.println("Either View button is not present or there is no record");
						}
						else
						{
						Assert.assertTrue("PSS CONTACT link is not available", lnk_pssContact.getText().equals("PSS CONTACT"));
						Assert.assertTrue("Pss Date Column heading is not available", col_pssDate.getText().equals("Pss Date"));
						//Assert.assertTrue("View Column heading is not available", col_view.getText().equals("View"));
						}
					}
						
						public void clickViewPSSContactBtn(){
							
							if (!btn_viewPSSContact.isCurrentlyVisible()) {
								lnk_pssContact.click();
								waitABit(500);
							}
							try {
								btn_viewPSSContact.click();
								waitABit(3000);
							} catch (Exception e) {
								System.out.println(e);
							}
						}
					


					
					
					
					public void verifyEventHeader() {
						if (lbl_viewEvent.isCurrentlyVisible()) {
							System.out.println("Back button on screen is working as expected");
						}
						else { 
							System.out.println("Back button on screen is not working as expected"); 
						}
					}
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

}

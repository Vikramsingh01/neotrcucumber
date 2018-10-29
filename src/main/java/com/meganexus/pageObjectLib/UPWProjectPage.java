	package com.meganexus.pageObjectLib;

	import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

	@SuppressWarnings("deprecation")
	public class UPWProjectPage extends NeoTR_Page {
		
		//Add Project Page label
		
		@FindBy(xpath="//h2[contains(text(),'ADD UPW PROJECT')]")
		private WebElementFacade lblHdr_addUPWProjet;
		@FindBy(xpath = "//a[@id='Project Details']")
		private WebElementFacade lnk_projectDetails;
		@FindBy(xpath = "//label[@for='projectStatusId']")
		private WebElementFacade lbl_add_projectStatus;
		@FindBy(xpath = "//label[@for='projectCode']")
		private WebElementFacade lbl_add_projectCode;
		@FindBy(xpath = "//label[@for='teamId']")
		private WebElementFacade lbl_CRC;
		@FindBy(xpath = "//label[@for='projectName']")
		private WebElementFacade lbl_projectName;
		@FindBy(xpath = "//label[@for='officeTeamId']")
		private WebElementFacade lbl_team;
		@FindBy(xpath = "//label[@for='highVisibilityYesNoId']")
		private WebElementFacade lbl_highVisibilityYesNoId;
		@FindBy(xpath = "//label[@for='projectTypeId']")
		private WebElementFacade lbl_projectTypeId;
		@FindBy(xpath = "//label[@for='startDate']")
		private WebElementFacade lbl_startDate;
		@FindBy(xpath = "//label[@for='endDate']")
		private WebElementFacade lbl_endDate;
		
		
		//For Provider details label on Add Project page 
		@FindBy(xpath = ".//a[@id='Provider Details']")
		private WebElementFacade lnk_providerDetails;
		@FindBy(xpath = "//label[@for='provider']")  // for view project label //div[@id='label_provider']
		private WebElementFacade lbl_provider;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//label[@for='street Name']")
		private WebElementFacade lbl_PD_streetName;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//label[@for='telephoneNumber']")
		private WebElementFacade lbl_PD_telephoneNumber;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//label[@for='townCity']")
		private WebElementFacade lbl_PD_townCity;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//label[@for='buildingname']")
		private WebElementFacade lbl_PD_buildingname;
		@FindBy(xpath = "//label[@for='country']")
		private WebElementFacade lbl_PD_county;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//label[@for='houseNumber']")
		private WebElementFacade lbl_PD_houseNumber;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//label[@for='postcode']")
		private WebElementFacade lbl_PD_postcode;
         
		
		//For Beneficiary Details  label on Add Project page 
		@FindBy(xpath = "//a[@id='Beneficiary Details']")
		private WebElementFacade lnk_beneficiaryDetails;
		@FindBy(xpath = "//label[@for='beneficiaryName']")
		private WebElementFacade lbl_beneficiaryName;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='street Name']")
		private WebElementFacade lbl_BD_streetName;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='telephoneNumber']")
		private WebElementFacade lbl_BD_telephoneNumber;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='townCity']")
		private WebElementFacade lbl_BD_townCity;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='buildingname']")
		private WebElementFacade lbl_BD_buildingname;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='country']")
		private WebElementFacade lbl_BD_county;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='houseNumber']")
		private WebElementFacade lbl_BD_houseNumber;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//label[@for='postcode']")
		private WebElementFacade lbl_BD_postcode;
		
		
		//For Placement Details  label on Add Project page 
		@FindBy(xpath = "//a[@id='Placement Details']")
		private WebElementFacade lnk_placementDetails;
		@FindBy(xpath = "//label[@for='placementName']")
		private WebElementFacade lbl_placementName;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='street Name']")
		private WebElementFacade lbl_PPD_streetName;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='telephoneNumber']")
		private WebElementFacade lbl_PPD_telephoneNumber;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='townCity']")
		private WebElementFacade lbl_PPD_townCity;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='buildingname']")
		private WebElementFacade lbl_PPD_buildingname;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='country']")
		private WebElementFacade lbl_PPD_county;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='houseNumber']")
		private WebElementFacade lbl_PPD_houseNumber;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//label[@for='postcode']")
		private WebElementFacade lbl_PPD_postcode;
		@FindBy(xpath = "//label[@for='placementNotes']")
        private WebElementFacade lbl_PPD_placementNotes;
		
		
		
		//For Project Availability & Information label on Add Project page 
		@FindBy(xpath = "//a[@id='Project Availability & Information']")
		private WebElementFacade lnk_projectAvailabilityInformation;
		@FindBy(xpath = "//label[@for='dateRequested']")
		private WebElementFacade lbl_dateRequested;
		@FindBy(xpath = "//label[@for='dateJobEvaluted']")
		private WebElementFacade lbl_dateJobEvaluted;
		@FindBy(xpath = "//label[@for='plannedStartDate']")
		private WebElementFacade lbl_plannedStartDate;
		@FindBy(xpath = "//label[@for='minimumAge']")
		private WebElementFacade lbl_minimumAge;
		@FindBy(xpath = "//label[@for='maximumAge']")
		private WebElementFacade lbl_maximumAge;
		@FindBy(xpath = "//label[@for='minimumNoInGroup']")
		private WebElementFacade lbl_minimumNoInGroup;
		@FindBy(xpath = "//label[@for='maximumNoInGroup']")
		private WebElementFacade lbl_maximumNoInGroup;
		@FindBy(xpath = "//label[@for='genderSuitabilityId']")
		private WebElementFacade lbl_genderSuitabilityId;
		@FindBy(xpath = "//label[@for='visibileToPublicYesNoId']")
		private WebElementFacade lbl_visibileToPublicYesNoId;
		@FindBy(xpath = "//label[@for='projectNotSuitableForNotes']")
		private WebElementFacade lbl_projectNotSuitableForNotes;
		
		@FindBy(xpath = "//div[contains(@class,'sub-title')]")//For Project Availability
		private WebElementFacade subTitle_ProjectAvailability;
		@FindBy(xpath = "//button[text()='ADD']")
		private WebElementFacade btn_Add;
		@FindBy(xpath = "//th[contains(.,'Day')]")
		private WebElementFacade col_Day;
		@FindBy(xpath = "//th[contains(.,'Start')]")
		private WebElementFacade col_Start;
		@FindBy(xpath = "//th[contains(.,'End')]")
		private WebElementFacade col_end;
		@FindBy(xpath = "//button[contains(.,'Remove')]")//after adding a project availability Remove button will appear
		private WebElementFacade btn_Remove;
		
		
		@FindBy(xpath = "//a[@id='Nature of Work & Qualifications']")
		private WebElementFacade lnk_natureofWorkQualifications;
		@FindBy(xpath = "//label[@for='selectNatureOfWorkId']")
		private WebElementFacade lbl_selectNatureOfWorkId;
		@FindBy(xpath = "//label[@for='qualificationOpportunitieId']")
		private WebElementFacade lbl_qualificationOpportunitieId;
		@FindBy(xpath = "//label[@for='natureOfWorkNotes']")
		private WebElementFacade lbl_natureOfWorkNotes;
		
		//For Save and Cancel button
		@FindBy(xpath = "//button[@id='saveButton']")
		private WebElementFacade btn_Save;
		@FindBy(xpath = "//button[@id='cancelButton']")
		private WebElementFacade btn_Cancel;

		public void clickSaveBtn() {
			btn_Save.click();
			waitABit(1000);
		}

		public void clickCancelBtn() {
			btn_Cancel.click();
			waitABit(1000);
		}
	
		
		public void checkProjectDetailsCollapsible() {
			if (lbl_add_projectStatus.isCurrentlyVisible()) {
				System.out.println("PROEJCT DETAILS Link is already clicked");
		}
			else {
				lnk_projectDetails.click();
				waitABit(1000);
			}	
		}
		
		public void validatelabelsOnAdd(){
			
			Assert.assertTrue("PROEJCT DETAILS link label not Matched", lnk_projectDetails.getText().trim()
					.equals("PROJECT DETAILS"));
			Assert.assertTrue("Project Status* label not Matched", lbl_add_projectStatus.getText().trim()
					.equals("STATUS*"));
			Assert.assertTrue("Project Code label not Matched", lbl_add_projectCode.getText().trim()
					.equals("PROJECT CODE*"));
			Assert.assertTrue("Office Team* label not Matched", lbl_CRC.getText().trim()
					.equals("CRC*"));
			Assert.assertTrue("Project Name* label not Matched", lbl_projectName.getText().trim()
					.equals("PROJECT NAME*"));
			Assert.assertTrue("Team label not Matched", lbl_team.getText().trim()
					.equals("TEAM*"));
			Assert.assertTrue("High Visibility label not Matched", lbl_highVisibilityYesNoId.getText().trim()
					.equals("HIGH VISIBILITY REQ"));
			Assert.assertTrue("Project Type* label not Matched", lbl_projectTypeId.getText().trim()
					.equals("PROJECT TYPE*"));
			Assert.assertTrue("Start Date label not Matched", lbl_startDate.getText().trim()
					.equals("START DATE"));
			Assert.assertTrue("End Date label not Matched", lbl_endDate.getText().trim()
					.equals("END DATE"));
			
		}
		public void checkProviderDetailCollapsible() {
			if (lbl_PD_streetName.isCurrentlyVisible()) {
				System.out.println("PROVIDER DETAILS Link is already clicked");
		}
			else {
				lnk_providerDetails.click();
				waitABit(1000);
			}
		}
		
			public void validatelabelsOfProviderDetails(){
				
				System.out.println(lbl_provider.getText());
			Assert.assertTrue("PROVIDER DETAILS link label not Matched", lnk_providerDetails.getText().trim()
					.equals("PROVIDER DETAILS"));
			Assert.assertTrue("Provider label not Matched", lbl_provider.getText().trim()
					.equals("PROVIDER"));
			Assert.assertTrue("Street Name label not Matched", lbl_PD_streetName.getText().trim()
					.equals("STREET NAME"));
			Assert.assertTrue("Telephone Number label not Matched", lbl_PD_telephoneNumber.getText().trim()
					.equals("TELEPHONE NUMBER"));
			Assert.assertTrue("Building Name label not Matched", lbl_PD_buildingname.getText().trim()
					.equals("BUILDING NAME"));
			Assert.assertTrue("Building Number label not Matched", lbl_PD_houseNumber.getText().trim()
					.equals("BUILDING NUMBER"));
			Assert.assertTrue("Town/City label not Matched", lbl_PD_townCity.getText().trim()
					.equals("TOWN/CITY"));
			Assert.assertTrue("County label not Matched", lbl_PD_county.getText().trim()
					.equals("COUNTY"));
			Assert.assertTrue("Post Code label not Matched", lbl_PD_postcode.getText().trim()
					.equals("POSTCODE"));
			
			}
			
			public void  checkBeneficiaryCollapsible() {
				if (lbl_BD_streetName.isCurrentlyVisible()) {
					System.out.println("BENEFICIARY DETAILS Link is already clicked");
			}
				else {
					lnk_beneficiaryDetails.click();
					waitABit(1000);
				}
			}
			
			public void validatelabelsOfBeneficiaryDetails(){
				
			Assert.assertTrue("BENEFICIARY DETAILS linl label not Matched", lnk_beneficiaryDetails.getText().trim()
					.equals("BENEFICIARY DETAILS"));
			Assert.assertTrue("Beneficiary Name label not Matched", lbl_beneficiaryName.getText().trim()
					.equals("NAME"));
			Assert.assertTrue("Street Name label not Matched", lbl_BD_streetName.getText().trim()
					.equals("STREET NAME"));
			Assert.assertTrue("Telephone Number label not Matched", lbl_BD_telephoneNumber.getText().trim()
					.equals("TELEPHONE NUMBER"));
			Assert.assertTrue("Building Name label not Matched", lbl_BD_buildingname.getText().trim()
					.equals("BUILDING NAME"));
			Assert.assertTrue("Building Number label not Matched", lbl_BD_houseNumber.getText().trim()
					.equals("BUILDING NUMBER"));
			Assert.assertTrue("Town/City label not Matched", lbl_BD_townCity.getText().trim()
					.equals("TOWN/CITY"));
			Assert.assertTrue("County label not Matched", lbl_BD_county.getText().trim()
					.equals("COUNTY"));
			Assert.assertTrue("Post Code label not Matched", lbl_BD_postcode.getText().trim()
					.equals("POSTCODE"));
			
			}
			
			public void checkPlacementCollapsible(){
				if (lbl_PPD_streetName.isCurrentlyVisible()) {
					System.out.println("PLACEMENT DETAILS Link is already clicked");
				}
				else {
					lnk_placementDetails.click();
					waitABit(1000);
					}
				}
			
			public void validatelabelsOfPlacementDetails(){
				
			Assert.assertTrue("PLACEMENT DETAILS label not Matched", lnk_placementDetails.getText().trim()
					.equals("PLACEMENT DETAILS"));
			Assert.assertTrue("Placement Name label not Matched", lbl_placementName.getText().trim()
					.equals("NAME"));
			Assert.assertTrue("Street Name label not Matched", lbl_PPD_streetName.getText().trim()
					.equals("STREET NAME"));
			Assert.assertTrue("Telephone Number label not Matched", lbl_PPD_telephoneNumber.getText().trim()
					.equals("TELEPHONE NUMBER"));
			Assert.assertTrue("Building Name label not Matched", lbl_PPD_buildingname.getText().trim()
					.equals("BUILDING NAME"));
			 Assert.assertTrue("Building Number label not Matched", lbl_PPD_houseNumber.getText().trim()
						.equals("BUILDING NUMBER"));
			Assert.assertTrue("Town/City label not Matched", lbl_PPD_townCity.getText().trim()
					.equals("TOWN/CITY"));
		    Assert.assertTrue("County label not Matched", lbl_PPD_county.getText().trim()
				.equals("COUNTY"));
		    Assert.assertTrue("Post Code label not Matched", lbl_PPD_postcode.getText().trim()
					.equals("POSTCODE"));
		    Assert.assertTrue("Placement Notes label not Matched", lbl_PPD_placementNotes.getText().trim()
					.equals("PLACEMENT NOTES"));
		    
			}
			
			public void  checkProjectAvailabilityCollapsible() {
				if (lbl_plannedStartDate.isCurrentlyVisible()) {
					System.out.println("PROJECT AVAILABILITY & INFORMATION Link is already clicked");
			}
				else {
					lnk_projectAvailabilityInformation.click();
					waitABit(1000);
				}
			}
			
			public void validatelabelsOfProjectAvailabilityInfo(){
				
		    Assert.assertTrue("PROJECT AVAILABILITY & INFORMATION link label not Matched", lnk_projectAvailabilityInformation.getText().trim()
					.equals("PROJECT AVAILABILITY & INFORMATION"));
		    Assert.assertTrue("Date Requested label not Matched", lbl_dateRequested.getText().trim()
					.equals("DATE REQUESTED*"));
		    Assert.assertTrue("Date Job Evaluted* label not Matched", lbl_dateJobEvaluted.getText().trim()
					.equals("DATE JOB EVALUTED*"));
		    Assert.assertTrue("Planned Start Date* label not Matched", lbl_plannedStartDate.getText().trim()
					.equals("PLANNED START DATE*"));
		    Assert.assertTrue("Minimum Age label not Matched", lbl_minimumAge.getText().trim()
					.equals("MINIMUM AGE"));
		    Assert.assertTrue("Maximum Age label not Matched", lbl_maximumAge.getText().trim()
					.equals("MAXIMUM AGE"));
		    Assert.assertTrue("Minimum No In Group* label not Matched", lbl_minimumNoInGroup.getText().trim()
					.equals("MINIMUM NO. IN GROUP*"));
		    Assert.assertTrue("Maximum No In Group* label not Matched", lbl_maximumNoInGroup.getText().trim()
					.equals("MAXIMUM NO. IN GROUP*"));
		    Assert.assertTrue("Gender Suitability label not Matched", lbl_genderSuitabilityId.getText().trim()
					.equals("GENDER SUITABILITY"));
		    Assert.assertTrue("Visibile To Public label not Matched", lbl_visibileToPublicYesNoId.getText().trim()
					.equals("VISIBILE TO PUBLIC?"));
		    Assert.assertTrue("Project Not Suitable For Notes label not Matched", lbl_projectNotSuitableForNotes.getText().trim()
					.equals("NOTES / PROJECT NOT SUITABLE FOR"));
			
		    
		   Assert.assertTrue("PROJECT AVAILABILITY subtitle label not Matched", subTitle_ProjectAvailability.getText().trim()
					.equals("PROJECT AVAILABILITY"));
		   Assert.assertTrue("Day column label not Matched", col_Day.getText().trim()
					.equals("DAY"));
		   Assert.assertTrue("Start column label not Matched", col_Start.getText().trim()
					.equals("START"));
		   Assert.assertTrue("End column label not Matched", col_end.getText().trim()
					.equals("END"));
			}
		   
			public void checkNatureOfWorkCollapsible() {
				if (lbl_natureOfWorkNotes.isCurrentlyVisible()) {
					System.out.println("NATURE OF WORK & QUALIFICATIONS link is already clicked");
			}
				else {
					lnk_natureofWorkQualifications.click();
					waitABit(1000);
				}
			}
			
			public void validatelabelsOfNatureOfWorkQualification(){
				
		    Assert.assertTrue("NATURE OF WORK & QUALIFICATIONS link label not Matched", lnk_natureofWorkQualifications.getText().trim()
					.equals("NATURE OF WORK & QUALIFICATIONS"));
		    Assert.assertTrue("Nature Of Work label not Matched", lbl_selectNatureOfWorkId.getText().trim()
					.equals("NATURE OF WORK"));
		    Assert.assertTrue("Qualification Opportunities label not Matched", lbl_qualificationOpportunitieId.getText().trim()
					.equals("OPPORTUNITY FOR SKILLS / QUALIFICATIONS"));
		    Assert.assertTrue("Nature Of Work Notes label not Matched", lbl_natureOfWorkNotes.getText().trim()
					.equals("NOTES"));
		    Assert.assertTrue("Submit label not Matched", btn_Save.getText().trim()
					.equals("SUBMIT"));
		    Assert.assertTrue("Cancel label not Matched", btn_Cancel.getText().trim()
					.equals("CANCEL"));
		    
		}
			private static double num=0;
			double projectCode = Math.random()*num++;
			String code = Double.toString(projectCode);
			
		
		//For entering text value in Add upw project page
		
		@FindBy(xpath = "//select[@id='projectStatusId']")
		private WebElementFacade txt_add_projectStatus;
		@FindBy(xpath = "//input[@id='projectCode']")
		private WebElementFacade txt_add_projectCode;
		@FindBy(xpath = "//select[@id='teamId']")
		private WebElementFacade txt_CRC;
		@FindBy(xpath = "//input[@id='projectName']")
		private WebElementFacade txt_projectName;
		@FindBy(xpath = "//select[@id='officeTeamId']")
		private WebElementFacade txt_team;
		@FindBy(xpath = "//select[@id='highVisibilityYesNoId']")
		private WebElementFacade txt_highVisibilityYesNo;
		@FindBy(xpath = "//select[@id='projectTypeId']")
		private WebElementFacade txt_projectType;
		@FindBy(xpath = "//input[@id='startDate']")
		private WebElementFacade txt_startDate;
		@FindBy(xpath = "//input[@id='endDate']")
		private WebElementFacade txt_endDate;
		
		public void enterProjectDetails()
		{
			System.out.println(code);
			txt_add_projectStatus.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Status"));
			txt_add_projectCode.sendKeys(code);
		
			txt_CRC.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Team"));
			txt_projectName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Name"));
			txt_team.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Office_Team"));
			txt_highVisibilityYesNo.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./High_Visibility"));
			txt_projectType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Type"));
			txt_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Start_Date"));
			txt_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./End_Date"));	
			
		}
		
		//for provider label values 
		@FindBy(xpath = "//input[@id='provider']")
		private WebElementFacade txt_provider;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='telephoneNumber']")
		private WebElementFacade txt_PD_telephoneNumber;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='streetName']")
		private WebElementFacade txt_PD_streetName;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='buildingname']")
		private WebElementFacade txt_PD_buildingname;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='houseNumber']")
		private WebElementFacade txt_PD_buildingNumber;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='townCity']")
		private WebElementFacade txt_PD_townCity;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='country']")
		private WebElementFacade txt_PD_county;
		@FindBy(xpath = "//a[@id='Provider Details']/parent::div/following-sibling::div//input [@id='postcode']")
		private WebElementFacade txt_PD_postcode;
		
		public void enterProviderDetails() {
			txt_provider.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Provider"));
			txt_PD_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Telephone_Number"));
			txt_PD_streetName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Street_Name"));
			txt_PD_buildingname.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Building_Name"));
			txt_PD_buildingNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Building_Number"));
			txt_PD_townCity.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Town_City"));
			txt_PD_county.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./County"));
			txt_PD_postcode.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Postcode"));
			
		}
		//For Beneficiary details (label values)
		@FindBy(xpath = "//input[@id='beneficiaryName']")
		private WebElementFacade txt_beneficiaryName;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='streetName']")
		private WebElementFacade txt_BD_streetName;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='telephoneNumber']")
		private WebElementFacade txt_BD_telephoneNumber;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='townCity']")
		private WebElementFacade txt_BD_townCity;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='buildingname']")
		private WebElementFacade txt_BD_buildingname;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='country']")
		private WebElementFacade txt_BD_county;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='houseNumber']")
		private WebElementFacade txt_BD_buildingNumber;
		@FindBy(xpath = "//a[@id='Beneficiary Details']/parent::div/following-sibling::div//input [@id='postcode']")
		private WebElementFacade txt_BD_postcode;
		
		public void enterBeneficiaryDetails() {
			txt_beneficiaryName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Beneficiary_Name"));
			txt_BD_streetName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Street_Name"));
			txt_BD_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Telephone_Number"));
			txt_BD_townCity.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Town_City"));
			txt_BD_buildingname.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Building_Name"));
			txt_BD_buildingNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Building_Number"));
			txt_BD_postcode.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Postcode"));
			txt_BD_county.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./County"));
			
		}
		
		
		//For entering Placement details value
		@FindBy(xpath = "//input[@id='placementName']")
		private WebElementFacade txt_placementName;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='streetName']")
		private WebElementFacade txt_PPD_streetName;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='telephoneNumber']")
		private WebElementFacade txt_PPD_telephoneNumber;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='townCity']")
		private WebElementFacade txt_PPD_townCity;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='buildingname']")
		private WebElementFacade txt_PPD_buildingname;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='country']")
		private WebElementFacade txt_PPD_county;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='houseNumber']")
		private WebElementFacade txt_PPD_buildingNumber;
		@FindBy(xpath = "//a[@id='Placement Details']/parent::div/following-sibling::div//input [@id='postcode']")
		private WebElementFacade txt_PPD_postcode;
		
		public void enterPlacementDetails() {
			txt_placementName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Placement_Name"));
			txt_PPD_streetName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Street_Name"));
			txt_PPD_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Telephone_Number"));
			txt_PPD_townCity.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Town_City"));
			txt_PPD_buildingname.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Building_Name"));
			txt_PPD_buildingNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Building_Number"));
			txt_PPD_postcode.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Postcode"));
			txt_PPD_county.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./County"));
		}
		
		//For entering Project Availability & Information details
		@FindBy(xpath = "//input[@id='dateRequested']")
		private WebElementFacade txt_dateRequested;
		@FindBy(xpath = "//input[@id='dateJobEvaluted']")
		private WebElementFacade txt_dateJobEvaluted;
		@FindBy(xpath = "//input[@id='plannedStartDate']")
		private WebElementFacade txt_plannedStartDate;
		@FindBy(xpath = "//input[@id='minimumAge']")
		private WebElementFacade txt_minimumAge;
		@FindBy(xpath = "//input[@id='maximumAge']")
		private WebElementFacade txt_maximumAge;
		@FindBy(xpath = "//input[@id='minimumNoInGroup']")
		private WebElementFacade txt_minimumNoInGroup;
		@FindBy(xpath = "//input[@id='maximumNoInGroup']")
		private WebElementFacade txt_maximumNoInGroup;
		@FindBy(xpath = "//select[@id='genderSuitabilityId']")
		private WebElementFacade txt_genderSuitability;
		@FindBy(xpath = "//select[@id='visibileToPublicYesNoId']")
		private WebElementFacade txt_visibileToPublicYesNo;
		@FindBy(xpath = "//textarea[@id='projectNotSuitableForNotes']")
		private WebElementFacade txt_projectNotSuitableForNotes;
		
		public void enterProjectAvailabilityAndInfo () {
			
			txt_dateRequested.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_Requested"));
			txt_dateJobEvaluted.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_Job_Evaluted"));
			txt_plannedStartDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Planned_Start_Date"));
			txt_minimumAge.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Minimum_Age"));
			txt_maximumAge.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Maximum_Age"));
			txt_minimumNoInGroup.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Minimum_No_In_Group"));
			txt_maximumNoInGroup.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Maximum_No_In_Group"));
			txt_genderSuitability.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Gender_Suitability"));
			txt_visibileToPublicYesNo.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Visibile_To_Public"));
			txt_projectNotSuitableForNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Project_Not_Suitable_For_Notes"));
			
		}
	//For Project Availability Add
		@FindBy(xpath="//button[text()='ADD']")
		private WebElementFacade btn_Add_ProjectAvailabilty;
		@FindBy(xpath=".//*[@id='dayOfWeekId']")
		private WebElementFacade day_ProjectAvailability;
		@FindBy(xpath="//input[@ng-reflect-name='start']")
		private WebElementFacade start_ProjectAvailability;
		@FindBy(xpath="//input[@ng-reflect-name='end']")
		private WebElementFacade end_ProjectAvailability;


		public void enterProjectAvailability() {
			btn_Add.click();
			day_ProjectAvailability.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_ProjectAvailability"));
			start_ProjectAvailability.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Start_ProjectAvailability"));
			end_ProjectAvailability.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./End_ProjectAvailability"));
		}
		
		
		//For entering Nature of Work & Qualifications details
		@FindBy(xpath = "//select[@id='selectNatureOfWorkId']")
		private WebElementFacade txt_selectNatureOfWork;
		@FindBy(xpath = "//select[@id='qualificationOpportunitieId']")
		private WebElementFacade txt_qualificationOpportunities;
		@FindBy(xpath = "//textarea[@id='natureOfWorkNotes']")
		private WebElementFacade txt_natureOfWorkNotes;
		
		public void enterNatureOfWorkQualification() {
			txt_selectNatureOfWork.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_ADD", "./Nature_Of_Work"));
			txt_qualificationOpportunities.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_ADD", "./Qualification_Opportunities"));
			txt_natureOfWorkNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_ADD", "./Nature_Of_Work_Notes"));
			
		}
		
		//For Update(EDIT) UPW project
		//For label validation on Edit page
		
				@FindBy(xpath="//h2[contains(text(),'EDIT UPW PROJECT')]")
				private WebElementFacade lblHdr_editUPWProjet;
				
				public void validatelabelsOnEdit(){
					if (lbl_add_projectStatus.isCurrentlyVisible()) {
						System.out.println("PROEJCT DETAILS Link is already clicked");
				}
					else {
						lnk_projectDetails.click();
						waitABit(1000);
					}			
				Assert.assertTrue("PROEJCT DETAILS link label not Matched", lnk_projectDetails.getText().trim()
						.equals("PROJECT DETAILS"));
				Assert.assertTrue("Project Status* label not Matched", lbl_add_projectStatus.getText().trim()
						.equals("STATUS*"));
				Assert.assertTrue("Project Code label not Matched", lbl_add_projectCode.getText().trim()
						.equals("PROJECT CODE*"));
				Assert.assertTrue("Office Team* label not Matched", lbl_CRC.getText().trim()
						.equals("CRC*"));
				Assert.assertTrue("Project Name* label not Matched", lbl_projectName.getText().trim()
						.equals("PROJECT NAME*"));
				Assert.assertTrue("Team label not Matched", lbl_team.getText().trim()
						.equals("TEAM*"));
				Assert.assertTrue("High Visibility label not Matched", lbl_highVisibilityYesNoId.getText().trim()
						.equals("HIGH VISIBILITY REQ"));
				Assert.assertTrue("Project Type* label not Matched", lbl_projectTypeId.getText().trim()
						.equals("PROJECT TYPE*"));
				Assert.assertTrue("Start Date label not Matched", lbl_startDate.getText().trim()
						.equals("START DATE"));
				Assert.assertTrue("End Date label not Matched", lbl_endDate.getText().trim()
						.equals("END DATE"));
				}
		
		//For Project details 
		public void editProjectDetails()
		{
			if (lbl_add_projectStatus.isCurrentlyVisible()) {
				System.out.println("PROEJCT DETAILS Link is already clicked");
		}
			else {
				lnk_projectDetails.click();
				waitABit(1000);
			}

			txt_highVisibilityYesNo.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_EDIT", "./High_Visibility"));
			txt_endDate.clear();
			txt_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_EDIT", "./End_Date"));	
			
		}
		public void editProviderDetails() {
			if (lbl_PD_streetName.isCurrentlyVisible()) {
				System.out.println("PROVIDER DETAILS Link is already clicked");
		}
			else {
				lnk_providerDetails.click();
				waitABit(1000);
			}
			txt_provider.clear();
			txt_provider.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Provider"));
			txt_PD_telephoneNumber.clear();
			txt_PD_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Telephone_Number"));
			txt_PD_streetName.clear();
			txt_PD_streetName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Street_Name"));
			txt_PD_townCity.clear();
			txt_PD_townCity.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Town_City"));
		
		}
		public void editPlacementDetails() {
			if (lbl_PPD_streetName.isCurrentlyVisible()) {
				System.out.println("PLACEMENT DETAILS Link is already clicked");
		}
			else {
				lnk_placementDetails.click();
				waitABit(1000);
			}
			txt_placementName.clear();
			txt_placementName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Placement_Name"));
			txt_PPD_telephoneNumber.clear();
			txt_PPD_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Telephone_Number"));
			txt_PPD_townCity.clear();
			txt_PPD_townCity.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Town_City"));
			txt_PlacementD_notes.clear();
			   txt_PlacementD_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Placement_Notes"));
			
		}
		
		public void editProjectAvailabilityInformation() {
			   txt_ProjectAvaInformation_genderSuitability.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_EDIT", "./Gender_Suitability"));
			   txt_ProjectAvaInformation_visibileToPublicYesNo.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_EDIT", "./Visibile_To_Public"));
			   txt_projectNotSuitabelForNotes.clear();
			   txt_projectNotSuitabelForNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_EDIT", "./Project_Not_Suitable_For_Notes"));
			  }
	
		public void editNatureOfWorkQualification() {
			if (lbl_natureOfWorkNotes.isCurrentlyVisible()) {
				System.out.println("NATURE OF WORK & QUALIFICATIONS link is already clicked");
		}
			else {
				lnk_natureofWorkQualifications.click();
				waitABit(1000);
			}
			txt_natureOfWorkNotes.clear();
			txt_natureOfWorkNotes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_EDIT", "./Nature_Of_Work_Notes"));
			
		}
		
		//For View page (Ankita)

		@FindBy(xpath = "//div[@id='projectStatusId']")
		private WebElementFacade txt_PD_projectStatus;
		@FindBy(xpath = "//p[contains(@id,'projectCode')]")
		private WebElementFacade txt_PD_projectCode;
		@FindBy(xpath = ".//*[@id='teamId']")
		private WebElementFacade txt_PD_teamId ;
		@FindBy(xpath = ".//*[@id='officeTeamId']")
		private WebElementFacade txt_PD_officeTeamId ;
		@FindBy(xpath = ".//*[@id='projectName']")
		private WebElementFacade txt_PD_projectName;
		@FindBy(xpath = ".//*[@id='highVisibilityYesNoId']")
		private WebElementFacade txt_PD_highVisibilityYesNoId;
		@FindBy(xpath = ".//*[@id='projectTypeId']")
		private WebElementFacade txt_PD_projectTypeId;
		@FindBy(xpath = ".//*[@id='startDate']")
		private WebElementFacade txt_PD_startDate;
		@FindBy(xpath = ".//*[@id='endDate']")
		private WebElementFacade txt_PD_endDate;
		
		
		@FindBy(xpath = ".//*[@id='beneficiaryName']")
		private WebElementFacade txt_BeneficiaryD_beneficiaryName;
		@FindBy(xpath = "(//div[contains(text(),'Telephone Number')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_TelephoneNumber;
		@FindBy(xpath = "(//div[contains(text(),'Building Name')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_Building_Name;
		@FindBy(xpath = "(//div[contains(text(),'Building Number')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_Building_Number;
		@FindBy(xpath = "(//div[contains(text(),'Street Name')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_Street_Name;
		@FindBy(xpath = "(//div[contains(text(),'Town/City')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_Town_City;
		@FindBy(xpath = "(//div[contains(text(),'County')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_County;
		@FindBy(xpath = "(//div[contains(text(),'Postcode')]/following-sibling::div)[2]")
		private WebElementFacade txt_BeneficiaryD_Postcode;
		
		public void  expandCollapsible() {
			
				if (lbl_PD_streetName.isCurrentlyVisible()) {
					System.out.println("PROVIDER DETAILS Link is already clicked");
				}
				else {
					lnk_providerDetails.click();
					waitABit(1000);
					}
				
			
		}
		
		public void viewProjectDetails() {
			
			System.out.println(txt_PD_projectStatus.getText());
			System.out.println(txt_PD_startDate.getText().trim());
			System.out.println(txt_PD_teamId.getText());
			System.out.println(code);
			Assert.assertTrue("Status value of Project Details section is incorrect", txt_PD_projectStatus.getText().trim().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Status")));
//			Assert.assertTrue("Project Code value of Project Details section is incorrect", txt_PD_projectCode.getText().trim().equals(code));
			Assert.assertTrue("CRC value of Project Details section is incorrect", txt_PD_teamId.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Team")));
			Assert.assertTrue("Team value of Project Details section is incorrect", txt_PD_officeTeamId.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Office_Team")));
//			Assert.assertTrue("Project Name value of Project Details section is incorrect", txt_PD_projectName.getText().
//					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Name")));
			Assert.assertTrue("High Visibility Req value of Project Details section is incorrect", txt_PD_highVisibilityYesNoId.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./High_Visibility")));
			Assert.assertTrue("Project Type value of Project Details section is incorrect", txt_PD_projectTypeId.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Type")));
			Assert.assertTrue("Start Date value of Project Details section is incorrect", txt_PD_startDate.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Start_Date")));
			Assert.assertTrue("End Date value of Project Details section is incorrect", txt_PD_endDate.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./End_Date")));
		}
		
		//For provider view 

		@FindBy(xpath = ".//*[@id='provider']")
		private WebElementFacade txt_ProviderD_provider;
		@FindBy(xpath = "(//div[contains(text(),'Telephone Number')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_TelephoneNumber;
		@FindBy(xpath = "(//div[contains(text(),'Building Name')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_Building_Name;
		@FindBy(xpath = "(//div[contains(text(),'Building Number')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_Building_Number;
		@FindBy(xpath = "(//div[contains(text(),'Street Name')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_Street_Name;
		@FindBy(xpath = "(//div[contains(text(),'Town/City')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_Town_City;
		@FindBy(xpath = "(//div[contains(text(),'County')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_County;
		@FindBy(xpath = "(//div[contains(text(),'Postcode')]/following-sibling::div)[1]")
		private WebElementFacade txt_ProviderD_Postcode;
		
		
		public void viewProviderDetails() {
			
			Assert.assertTrue("Provider value of Provider Details section is incorrect", txt_ProviderD_provider.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Provider")));
			Assert.assertTrue("Telephone Number value of Provider Details section is incorrect", txt_ProviderD_TelephoneNumber.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Telephone_Number")));
			Assert.assertTrue("Building Name value of Provider Details section is incorrect", txt_ProviderD_Building_Name.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Building_Name")));
			Assert.assertTrue("Building Number value of Provider Details section is incorrect", txt_ProviderD_Building_Number.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Building_Number")));
			Assert.assertTrue("Street Name value of Provider Details section is incorrect", txt_ProviderD_Street_Name.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Street_Name")));
			Assert.assertTrue("Town/City value of Provider Details section is incorrect", txt_ProviderD_Town_City.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Town_City")));
			Assert.assertTrue("County value of Provider Details section is incorrect", txt_ProviderD_County.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./County")));
			Assert.assertTrue("Postcode value of Provider Details section is incorrect", txt_ProviderD_Postcode.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Postcode")));
		}
		public void viewBeneficiaryDetails(){
			
			Assert.assertTrue("Name value of Beneficiary Details section is incorrect", txt_BeneficiaryD_beneficiaryName.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Beneficiary_Name")));
			Assert.assertTrue("Telephone Number value of Beneficiary Details section is incorrect", txt_BeneficiaryD_TelephoneNumber.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Telephone_Number")));
			Assert.assertTrue("Building Name value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Building_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Building_Name")));
			Assert.assertTrue("Building Number value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Building_Number.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Building_Number")));
			Assert.assertTrue("Street Name value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Street_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Street_Name")));
			Assert.assertTrue("Town/City value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Town_City.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Town_City")));
			Assert.assertTrue("County value of Beneficiary Details section is incorrect", txt_BeneficiaryD_County.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./County")));
			Assert.assertTrue("Postcode value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Postcode.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Postcode")));
		}
		
		//For Placement View
		
		@FindBy(xpath = ".//*[@id='placementName']")
		private WebElementFacade txt_PlacementD_placementName;
		@FindBy(xpath = "(//div[contains(text(),'Telephone Number')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_TelephoneNumber;
		@FindBy(xpath = "(//div[contains(text(),'Building Name')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_Building_Name;
		@FindBy(xpath = "(//div[contains(text(),'Building Number')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_Building_Number;
		@FindBy(xpath = "(//div[contains(text(),'Street Name')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_Street_Name;
		@FindBy(xpath = "(//div[contains(text(),'Town/City')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_Town_City;
		@FindBy(xpath = "(//div[contains(text(),'County')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_County;
		@FindBy(xpath = "(//div[contains(text(),'Postcode')]/following-sibling::div)[3]")
		private WebElementFacade txt_PlacementD_Postcode;
		@FindBy(xpath = ".//*[@id='placementNotes']")
		private WebElementFacade txt_PlacementD_placementNotes;
		
		public void viewPlacementDetails() {
			Assert.assertTrue("Name value of Placement Details section is incorrect", txt_PlacementD_placementName.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Placement_Name")));
			Assert.assertTrue("Telephone Number value of Placement Details section is incorrect", txt_PlacementD_TelephoneNumber.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Telephone_Number")));
			Assert.assertTrue("Building Name value of Placement Details section is incorrect", txt_PlacementD_Building_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Building_Name")));
			Assert.assertTrue("Building Number value of Placement Details section is incorrect", txt_PlacementD_Building_Number.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Building_Number")));
			Assert.assertTrue("Street Name value of Placement Details section is incorrect", txt_PlacementD_Street_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Street_Name")));
			Assert.assertTrue("Town/City value of Placement Details section is incorrect", txt_PlacementD_Town_City.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Town_City")));
			Assert.assertTrue("County value of Placement Details section is incorrect", txt_PlacementD_County.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./County")));
			Assert.assertTrue("Postcode value of Placement Details section is incorrect", txt_PlacementD_Postcode.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Postcode")));
		}
		
		//for project availability and information on VIEW page
		
		@FindBy(xpath = ".//*[@id='dateRequested']")
		private WebElementFacade txt_ProjectAvaInformation_dateRequested;
		@FindBy(xpath = ".//*[@id='dateJobEvaluted']")
		private WebElementFacade txt_ProjectAvaInformation_dateJobEvaluted;
		@FindBy(xpath = ".//*[@id='plannedStartDate']")
		private WebElementFacade txt_ProjectAvaInformation_plannedStartDate;
		@FindBy(xpath = ".//*[@id='minimumAge']")
		private WebElementFacade txt_ProjectAvaInformation_minimumAge;
		@FindBy(xpath = ".//*[@id='maximumAge']")
		private WebElementFacade txt_ProjectAvaInformation_maximumAge;
		@FindBy(xpath = ".//*[@id='minimumNoInGroup']")
		private WebElementFacade txt_ProjectAvaInformation_minimumNoInGroup;
		@FindBy(xpath = ".//*[@id='maximumNoInGroup']")
		private WebElementFacade txt_ProjectAvaInformation_maximumNoInGroup;
		@FindBy(xpath = ".//*[@id='genderSuitabilityId']")
		private WebElementFacade txt_ProjectAvaInformation_genderSuitability;
		@FindBy(xpath = ".//*[@id='visibileToPublicYesNoId']")
		private WebElementFacade txt_ProjectAvaInformation_visibileToPublicYesNo;
		@FindBy(xpath=".//*[@id='projectNotSuitableForNotes']")
		private WebElementFacade txt_projectNotSuitabelForNotes;
		
		@FindBy(xpath="//tr/td[1]")
		private WebElementFacade txt_Day_ProjectAvailability;
		@FindBy(xpath="//tr/td[2]")
		private WebElementFacade txt_Start_ProjectAvailability;
		@FindBy(xpath="//tr/td[3]")
		private WebElementFacade txt_End_ProjectAvailability;
		
		
		public void viewProjectAvailabilityAndInfo() {
			
			Assert.assertTrue("Date Requested value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_dateRequested.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_Requested")));
			Assert.assertTrue("Date Job Evaluted value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_dateJobEvaluted.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_Job_Evaluted")));
			Assert.assertTrue("Planned Start Date value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_plannedStartDate.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Planned_Start_Date")));
			Assert.assertTrue("Minimum Age value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_minimumAge.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Minimum_Age")));
			Assert.assertTrue("Maximum Age value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_maximumAge.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Maximum_Age")));
			Assert.assertTrue("Minimum no. in Group value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_minimumNoInGroup.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Minimum_No_In_Group")));
			Assert.assertTrue("Maximum no. in Group value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_maximumNoInGroup.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Maximum_No_In_Group")));
			Assert.assertTrue("Gender Suitability value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_genderSuitability.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Gender_Suitability")));
			Assert.assertTrue("Visibile to the public value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_visibileToPublicYesNo.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Visibile_To_Public")));
			Assert.assertTrue("Project Not Suitable For Notes of Project Availability & Information section is incorrect", txt_projectNotSuitabelForNotes.getText()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Project_Not_Suitable_For_Notes")));
			Assert.assertTrue("Day of Project Availability & Information section is incorrect", txt_Day_ProjectAvailability.getText()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_ProjectAvailability")));	
			Assert.assertTrue("Start Time of Project Availability & Information section is incorrect", txt_Start_ProjectAvailability.getText()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Start_ProjectAvailability")));	
			Assert.assertTrue("End Time of Project Availability & Information section is incorrect", txt_End_ProjectAvailability.getText()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./End_ProjectAvailability")));	
			
		}
		
		@FindBy(xpath = ".//*[@id='selectNatureOfWorkId']")
		private WebElementFacade txt_NatureOfWork_selectNatureOfWork;
		@FindBy(xpath = ".//*[@id='qualificationOpportunitieId']")
		private WebElementFacade txt_NatureOfWork_qualificationOpportunities;
		@FindBy(xpath = ".//*[@id='natureOfWorkNotes']")
		private WebElementFacade txt_NatureOfWork_natureOfWorkNotes;
		
		public void viewNatureOfWorkQualification() {
			Assert.assertTrue("Nature of work value of Project Availability & Information section is incorrect", txt_NatureOfWork_selectNatureOfWork.getText().trim()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_ADD", "./Nature_Of_Work")));
			Assert.assertTrue("Opportunity for Skills / Qualification value of Project Availability & Information section is incorrect", txt_NatureOfWork_qualificationOpportunities.getText().trim()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_ADD", "./Qualification_Opportunities")));
			Assert.assertTrue("Notes / Project NOT suitable for: value of Project Availability & Information section is incorrect", txt_NatureOfWork_natureOfWorkNotes.getText().trim()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_ADD", "./Project_Not_Suitable_For_Notes")));
			
		}
		
public void viewEditProjectDetails() {
			
			System.out.println(txt_PD_projectStatus.getText());
			System.out.println(txt_PD_projectCode.getText().trim());
			System.out.println(txt_PD_teamId.getText());
			Assert.assertTrue("Status value of Project Details section is incorrect", txt_PD_projectStatus.getText().trim().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Status")));
			//Assert.assertTrue("Project Code value of Project Details section is incorrect", txt_PD_projectCode.getText().trim().equals(code));
			Assert.assertTrue("CRC value of Project Details section is incorrect", txt_PD_teamId.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Team")));
			Assert.assertTrue("Team value of Project Details section is incorrect", txt_PD_officeTeamId.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Office_Team")));
			Assert.assertTrue("Project Name value of Project Details section is incorrect", txt_PD_projectName.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Name")));
			Assert.assertTrue("High Visibility Req value of Project Details section is incorrect", txt_PD_highVisibilityYesNoId.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_EDIT", "./High_Visibility")));
			Assert.assertTrue("Project Type value of Project Details section is incorrect", txt_PD_projectTypeId.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Type")));
			Assert.assertTrue("Start Date value of Project Details section is incorrect", txt_PD_startDate.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Start_Date")));
			Assert.assertTrue("End Date value of Project Details section is incorrect", txt_PD_endDate.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_EDIT", "./End_Date")));
		}
		
		public void viewEditProviderDetails() {
			
			Assert.assertTrue("Provider value of Provider Details section is incorrect", txt_ProviderD_provider.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Provider")));
			Assert.assertTrue("Telephone Number value of Provider Details section is incorrect", txt_ProviderD_TelephoneNumber.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Telephone_Number")));
			Assert.assertTrue("Building Name value of Provider Details section is incorrect", txt_ProviderD_Building_Name.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Building_Name")));
			Assert.assertTrue("Building Number value of Provider Details section is incorrect", txt_ProviderD_Building_Number.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Building_Number")));
			Assert.assertTrue("Street Name value of Provider Details section is incorrect", txt_ProviderD_Street_Name.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Street_Name")));
			Assert.assertTrue("Town/City value of Provider Details section is incorrect", txt_ProviderD_Town_City.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_EDIT", "./Town_City")));
			Assert.assertTrue("County value of Provider Details section is incorrect", txt_ProviderD_County.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./County")));
			Assert.assertTrue("Postcode value of Provider Details section is incorrect", txt_ProviderD_Postcode.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProviderDetails_ADD", "./Postcode")));
		}
		public void viewEditBeneficiaryDetails(){
			
			Assert.assertTrue("Name value of Beneficiary Details section is incorrect", txt_BeneficiaryD_beneficiaryName.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Beneficiary_Name")));
			Assert.assertTrue("Telephone Number value of Beneficiary Details section is incorrect", txt_BeneficiaryD_TelephoneNumber.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Telephone_Number")));
			Assert.assertTrue("Building Name value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Building_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Building_Name")));
			Assert.assertTrue("Building Number value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Building_Number.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Building_Number")));
			Assert.assertTrue("Street Name value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Street_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Street_Name")));
			Assert.assertTrue("Town/City value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Town_City.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Town_City")));
			Assert.assertTrue("County value of Beneficiary Details section is incorrect", txt_BeneficiaryD_County.getText().
					equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./County")));
			Assert.assertTrue("Postcode value of Beneficiary Details section is incorrect", txt_BeneficiaryD_Postcode.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_BeneficiaryDetails_ADD", "./Postcode")));
		}
		
		@FindBy(xpath=".//*[@id='placementNotes']")
		private WebElementFacade txt_PlacementD_notes;
		
		public void viewEditPlacementDetails() {
			Assert.assertTrue("Name value of Placement Details section is incorrect", txt_PlacementD_placementName.getText().trim()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Placement_Name")));
			Assert.assertTrue("Telephone Number value of Placement Details section is incorrect", txt_PlacementD_TelephoneNumber.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Telephone_Number")));
			Assert.assertTrue("Building Name value of Placement Details section is incorrect", txt_PlacementD_Building_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Building_Name")));
			Assert.assertTrue("Building Number value of Placement Details section is incorrect", txt_PlacementD_Building_Number.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Building_Number")));
			Assert.assertTrue("Street Name value of Placement Details section is incorrect", txt_PlacementD_Street_Name.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Street_Name")));
			Assert.assertTrue("Town/City value of Placement Details section is incorrect", txt_PlacementD_Town_City.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Town_City")));
			Assert.assertTrue("County value of Placement Details section is incorrect", txt_PlacementD_County.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./County")));
			Assert.assertTrue("Postcode value of Placement Details section is incorrect", txt_PlacementD_Postcode.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_ADD", "./Postcode")));
	Assert.assertTrue("Notes value of Placement Details section is incorrect", txt_PlacementD_notes.getText()
			.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_PlacementDetails_EDIT", "./Placement_Notes")));
		}
		
		public void viewEditProjectAvailabilityAndInfo() {
			
			Assert.assertTrue("Date Requested value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_dateRequested.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_Requested")));
			Assert.assertTrue("Date Job Evaluted value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_dateJobEvaluted.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Date_Job_Evaluted")));
			Assert.assertTrue("Planned Start Date value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_plannedStartDate.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Planned_Start_Date")));
			Assert.assertTrue("Minimum Age value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_minimumAge.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Minimum_Age")));
			Assert.assertTrue("Maximum Age value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_maximumAge.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Maximum_Age")));
			Assert.assertTrue("Minimum no. in Group value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_minimumNoInGroup.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Minimum_No_In_Group")));
			Assert.assertTrue("Maximum no. in Group value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_maximumNoInGroup.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_ADD", "./Maximum_No_In_Group")));
			Assert.assertTrue("Gender Suitability value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_genderSuitability.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_EDIT", "./Gender_Suitability")));
			Assert.assertTrue("Visibile to the public value of Project Availability & Information section is incorrect", txt_ProjectAvaInformation_visibileToPublicYesNo.getText()
					.equals(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_EDIT", "./Visibile_To_Public")));
			Assert.assertTrue("Project Not Suitable For Notes of Project Availability & Information section is incorrect", txt_projectNotSuitabelForNotes.getText()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectAvailabilityInformation_EDIT", "./Project_Not_Suitable_For_Notes")));
					
		}
		
		public void viewEditNatureOfWorkQualification() {
			Assert.assertTrue("Notes / Project NOT suitable for: value of Project Availability & Information section is incorrect", txt_NatureOfWork_natureOfWorkNotes.getText().trim()
					.contains(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_NatureOfWorkQualification_EDIT", "./Project_Not_Suitable_For_Notes")));
			
		}
				
		@Override
		public WebElementFacade getUniqueElement() {
			// TODO Auto-generated method stub
			return null;
		}
}

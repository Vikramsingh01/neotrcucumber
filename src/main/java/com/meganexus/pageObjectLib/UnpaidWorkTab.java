	package com.meganexus.pageObjectLib;

	import com.meganexus.genericLib.ReadXMLData;

import org.hamcrest.Factory;

import com.meganexus.genericLib.DateFormatter;

	import junit.framework.Assert;
	import net.serenitybdd.core.annotations.findby.FindBy;
	import net.serenitybdd.core.pages.WebElementFacade;

	@SuppressWarnings("deprecation")
	public class UnpaidWorkTab extends NeoTR_Page {

		//Unpaid Work
	
		
		//filters
			@FindBy(xpath="//label[@for='projectStatusId']")
			private WebElementFacade filter_lbl_status;
			@FindBy(xpath="//label[@for='officeTeamId']")
			private WebElementFacade filter_lbl_team;
			
			@FindBy(xpath = "//label[@for='projectName']")
			private WebElementFacade filter_lbl_projectName;
			
			@FindBy(xpath="//label[@for='projectTypeId']")
			private WebElementFacade filter_lbl_projectType;
			@FindBy(xpath="//label[@for='teamId']")
			private WebElementFacade filter_lbl_CRC;
			
			@FindBy(xpath = "//button[contains(.,'Search')]")
			private WebElementFacade button_search;
			@FindBy(xpath = "//a[@id='filter']")
			private WebElementFacade lnk_filter;
			@FindBy(xpath = "//a[contains(.,'Upw Project ')]")
			private WebElementFacade lnk_upwProject;
			@FindBy(xpath = "//button[@id='upwProject_addButton']")
			private WebElementFacade button_add;
			@FindBy(xpath = "//h2[contains(.,'Upw Project')]")
			private WebElementFacade hdr_upwProject;
			
			@FindBy(xpath = "//span[contains(.,'Project Name')]")
			private WebElementFacade col_lbl_ProjectName;
			@FindBy(xpath = "//span[contains(.,'Project Code')]")
			private WebElementFacade col_lbl_ProjectCode;
			@FindBy(xpath = "//span[contains(.,'Start Date')]")
			private WebElementFacade col_lbl_StartDate;
			@FindBy(xpath = "//span[contains(.,'Expected End Date')]")
			private WebElementFacade col_lbl_ExpectedEndDate;
			@FindBy(xpath = "//span[contains(.,'Provider')]")
			private WebElementFacade col_lbl_Provider;
			@FindBy(xpath = "//th[contains(.,'View')]")
			private WebElementFacade col_lbl_View;
			@FindBy(xpath = "//th[contains(.,'Edit')]")
			private WebElementFacade col_lbl_Edit;
			
			// Buttons for displayed rows
			@FindBy(xpath = "//button[@id='upwProject_view0']")
			private WebElementFacade button_View;
			@FindBy(xpath = "//button[@id='upwProject_edit0']")
			private WebElementFacade button_Edit;
			
			 
			  @FindBy(xpath = "//button[contains(text(),'UNPAID WORK')]") // or //li[@title='UNPAID WORK']
			  private WebElementFacade tab_UnpaidWork;
			
			public void clickOnUnpaidTab(){
			     if (tab_UnpaidWork.isPresent()) {
			       tab_UnpaidWork.click();
			       waitABit(1000);
			      } else
			       System.out.println("UNPAID WORK Tab is not present");
			     }
			//Click on filter link for search fields
				public void clickOnFilter(){
					if (button_search.isPresent()) {
						System.out.println("Filter link is already clicked");
				}
					else {
						lnk_filter.click();
						waitABit(1000);
					}
			}
				// Verify list of UPW project
				@FindBy(xpath = "//tbody/tr[1]")
				private WebElementFacade firstRowUPWProject;

				public void verifyFirstRowUPWProject() {
					if (firstRowUPWProject.isVisible())
						System.out.println("UPWProject is available in list");
					else
						System.out.println("UPW Project is not available");
				}
				
				public void clickViewButton(){
				    if (button_View.isPresent()) {
				     button_View.click();
				    }else
						System.out.println("View Button is not present");
				    
				   }
				
				public void clickOnAddButton(){
					if (button_add.isPresent()) {
						button_add.click();
						waitABit(1000);
					} else
						System.out.println("Add Button is not present");
				}
				
				public void clickOnEditButton(){
					if (button_Edit.isPresent()) {
						button_Edit.click();
						waitABit(1000);
					} else
						System.out.println("Edit Button is not present");
				}
	//First Select the options and Click on Search 
		@FindBy(xpath="//select[@id='projectStatusId']")
		private WebElementFacade ddl_selectStatus;
		@FindBy(xpath="//select[@id='officeTeamId']")
		private WebElementFacade ddl_selectTeam;
		@FindBy(xpath="//input[@id='projectName']")
		private WebElementFacade tbx_projectName;
		@FindBy(xpath="//select[@id='projectTypeId']")
		private WebElementFacade ddl_selectProjectType;
		@FindBy(xpath="//select[@id='teamId']")
		private WebElementFacade ddl_selectCRC;
		
				
		public void searchProjectList()
		{
			ddl_selectStatus.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Status"));
			ddl_selectCRC.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Team"));
			ddl_selectTeam.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Office_Team"));
			//Because we are not adding every time project, clicking on cancel (For view project )
			tbx_projectName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Project_Name")); 
			button_search.click();
			
		}
		
				public void VerifyFilterLabel(){
//					System.out.println(filter_lbl_status.getText());
					//Assert.assertTrue("UPW PROJECT header not Matched", hdr_upwProject.getText().trim()
							//.equals("UPW PROJECT"));
					Assert.assertTrue("UPW PROJECT link not Matched", lnk_upwProject.getText().trim()
							.equals("UPW PROJECT"));
					Assert.assertTrue("Add button not Matched", button_add.getText().trim()
							.equals("ADD NEW PROJECT"));
					Assert.assertTrue("Project Status Filter not Matched",filter_lbl_status.getText().trim().contains("Status"));
					Assert.assertTrue("Team Filter not Matched",filter_lbl_team.getText().trim().contains("Team"));
					
					Assert.assertTrue("Project Name Filter not Matched", filter_lbl_projectName.getText().trim()
							.equals("Project Name"));
					
					Assert.assertTrue("Project Type Filter not Matched", filter_lbl_projectType.getText().trim()
							.equals("Project Type"));
					Assert.assertTrue("CRC Filter not Matched", filter_lbl_CRC.getText().trim().contains("CRC"));
					
					Assert.assertTrue("Search button not matched", button_search.getText().trim()
							.equals("SEARCH"));
				}
				
				public void checkUPWlist(){
					Assert.assertTrue("PROJECT NAME Column heading not Matched", col_lbl_ProjectName.getText().trim()
							.equals("PROJECT NAME"));
					Assert.assertTrue("PROJECT CODE Column heading not Matched", col_lbl_ProjectCode.getText().trim()
							.equals("PROJECT CODE"));
					Assert.assertTrue("START DATE Column heading not Matched", col_lbl_StartDate.getText().trim()
							.equals("START DATE"));
					Assert.assertTrue("EXPECTED END DATE Column heading not Matched", col_lbl_ExpectedEndDate.getText().trim()
							.equals("EXPECTED END DATE"));
					Assert.assertTrue("PROVIDER Column heading not Matched", col_lbl_Provider.getText().trim()
							.equals("PROVIDER"));
				}
				
				@Override
				public WebElementFacade getUniqueElement() {
					// TODO Auto-generated method stub
					return null;
				}

}

package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class UPWAppointmentPage extends NeoTR_Page {

	UPWSummaryPage upwPage;
	
	//Validate labels on Add Recurring UPWAppointment
	
		@FindBy(xpath="//h2[contains(text(),'Schedule Recurring UPW Appointment')]")
		private WebElementFacade heading_recurringAppointment;
		@FindBy(xpath="//label[@for='startDate']")
		private WebElementFacade lblAR_startDate;
		@FindBy(xpath="//label[@for='dayOfWeekId']")
		private WebElementFacade lblAR_selectionDay;
		@FindBy(xpath="//label[@for='teamId']")
		private WebElementFacade lblAR_CRC;
		@FindBy(xpath="//label[@for='officeTeamId']")
		private WebElementFacade lblAR_team;
		@FindBy(xpath="//label[@for='projectTypeId']")
		private WebElementFacade lblAR_projectType;
		
		
		@FindBy(xpath="//button[@id='searchButton']")  //for Search button
		private WebElementFacade btn_Search;
		
		@FindBy(xpath="(//label[@for='projectName'])[1]")
		private WebElementFacade lblAR_projectName;
		@FindBy(xpath="//label[contains(text(),'Project Availibility')]")
		private WebElementFacade lblAR_projectAvailability;
		@FindBy(xpath="//label[@for='startTime']")
		private WebElementFacade lblAR_startTime;
		@FindBy(xpath="//label[@for='endTime']")
		private WebElementFacade lblAR_endTime;
		@FindBy(xpath="//label[@for='endDate']")
		private WebElementFacade lblAR_endDate;
		
		@FindBy(xpath="//button[@id='addAppointmentButton']")//Add button in Add Recurring UPWAppointment
		private WebElementFacade btnAR_Add;
		
		//=============For Allocation table header in Add Recurring page
		@FindBy(xpath="//thead//th[text()='Day']")
		private WebElementFacade tblHdr_day;
		@FindBy(xpath="//thead//th[text()='Project']")
		private WebElementFacade tblHdrAR_project;
		@FindBy(xpath="//thead//th[text()='Start Date']")
		private WebElementFacade tblHdr_startDate;
		@FindBy(xpath="//thead//th[text()='End Date']")
		private WebElementFacade tblHdr_endDate;
		@FindBy(xpath="//thead//th[text()='Start Time']")
		private WebElementFacade tblHdr_startTime;
		@FindBy(xpath="//thead//th[text()='End Time']")
		private WebElementFacade tblHdr_endTime;
		@FindBy(xpath="//thead//th[text()='Hours']")
		private WebElementFacade tblHdr_hours;
		
		//Use from UPW summary page
//		@FindBy(xpath="//button[@id='saveButton']")
//		private WebElementFacade btn_Submit;
//		@FindBy(xpath="//button[@id='cancelButton']")
//		private WebElementFacade btn_Cancel;	

		  //=========== ADD Recurring UPW Appointment=======
		@FindBy(xpath=".//*[@id='startDate']")
		private WebElementFacade input_startDate;
		@FindBy(xpath="//button[text()='Today']")
		private WebElementFacade button_Today;
		
		@FindBy(xpath=".//*[@id='dayOfWeekId']")
		private WebElementFacade input_selectionDay;
		@FindBy(xpath=".//*[@id='teamId']")
		private WebElementFacade input_CRC;
		@FindBy(xpath=".//*[@id='officeTeamId']")
		private WebElementFacade input_team;
		@FindBy(xpath=".//*[@id='projectTypeId']")
		private WebElementFacade input_projectType;
		@FindBy(xpath=".//*[@id='searchButton']")
		private WebElementFacade button_search;
		@FindBy(xpath=".//*[@id='projectName']")
		private WebElementFacade input_projectName;
		@FindBy(xpath=".//*[@id='projectAvailibility']")
		private WebElementFacade input_projectAvailibility;
		@FindBy(xpath=".//*[@id='startTime']")
		private WebElementFacade input_startTime;
		@FindBy(xpath=".//*[@id='endTime']")
		private WebElementFacade input_endTime;
		@FindBy(xpath=".//*[@id='endDate']")
		private WebElementFacade input_endDate;
		@FindBy(xpath=".//*[@id='addAppointmentButton']")
		private WebElementFacade button_addAppointmentButton;
		@FindBy(xpath=".//*[@id='saveButton']")
		private WebElementFacade button_submit;
		
		
		public void verifyAddRecurringUpwAppointmentLabel(){
			
			System.out.println(heading_recurringAppointment.getText());
			Assert.assertTrue("Add Recurring Upw Appointment heading is not displayed" , heading_recurringAppointment.getText().equals("SCHEDULE RECURRING UPW APPOINTMENT"));
			Assert.assertTrue("Start Date label did not display" , lblAR_startDate.getText().equals("START DATE*"));
			Assert.assertTrue("Selection Day label did not display" , lblAR_selectionDay.getText().equals("SELECTION DAY*"));
			Assert.assertTrue("CRC label did not display" , lblAR_CRC.getText().equals("CRC*"));
			Assert.assertTrue("Team label did not display" , lblAR_team.getText().equals("TEAM"));
			Assert.assertTrue("Project Type label did not display" , lblAR_projectType.getText().equals("PROJECT TYPE"));
			Assert.assertTrue("Search label did not display" , btn_Search.getText().equals("SEARCH"));
			
			Assert.assertTrue("Project Name label did not display" , lblAR_projectName.getText().equals("PROJECT NAME*"));
			Assert.assertTrue("Project Availability label did not display" , lblAR_projectAvailability.getText().equals("PROJECT AVAILIBILITY*"));
			Assert.assertTrue("Start Time label did not display" , lblAR_startTime.getText().equals("START TIME*"));
			Assert.assertTrue("End Time label did not display" , lblAR_endTime.getText().equals("END TIME*"));
			//For Allocation table header
			Assert.assertTrue("Day label did not display" , tblHdr_day.getText().equals("DAY"));
			Assert.assertTrue("Project label did not display" , tblHdr_project.getText().equals("PROJECT"));
			Assert.assertTrue("Start Date label did not display" , tblHdr_startDate.getText().equals("START DATE"));
			Assert.assertTrue("Start Time label did not display" , tblHdr_startTime.getText().equals("START TIME"));
			Assert.assertTrue("End Time label did not display" , tblHdr_endTime.getText().equals("END TIME"));
			Assert.assertTrue("Hours label did not display" , tblHdr_hours.getText().equals("HOURS"));
			
		}
		
		  public void CreateADDRecurringAppointment() {
			  input_startDate.click();
			  button_Today.click();
			  waitABit(100);
			  input_selectionDay.selectByVisibleText("Friday");
	      		waitABit(100);
	           input_CRC.selectByVisibleText("West Yorkshire CRC");
	   		   waitABit(100);
	   		   input_team.selectByVisibleText("Flex Team 17");   		
	   		   waitABit(200);
	   		   input_projectType.selectByVisibleText("ETE (Agency)");
	   		    waitABit(100);
	   		    button_search.click();
	   		    waitABit(300);
	   		     input_projectName.selectByVisibleText("new_12");
	   		    waitABit(100);
	   		    input_projectAvailibility.selectByVisibleText("Friday (15:48 - 15:50)"); 
	   		    button_addAppointmentButton.click();
	   		    button_submit.click();
	       }
		public void clickOnSearch(){
			btn_Search.click();
		}
		public void clickOnAdd(){
			btnAR_Add.click();
		}

		//For Appointment List table

		@FindBy(xpath="//a[contains(text(),' Upw Appointment')]")
		private WebElementFacade lnkHdr_upwAppointment;
		
		@FindBy(xpath="//button[@id='upwAppointment_addButton'][1]")
		private WebElementFacade btn_AddSingle;
		@FindBy(xpath=".//*[@id='upwAppointment_addRecButton']")
		private WebElementFacade btn_AddRecurring;
		
		@FindBy(xpath="//th[@id='appointmentDate']")
		private WebElementFacade tblHdr_date;
		@FindBy(xpath="//h2[@class='page-title']")
		private WebElementFacade tblHdr_project;
		@FindBy(xpath="//th[@id='minutesOffered']")
		private WebElementFacade tblHdr_hrsOffered;
		@FindBy(xpath="//th[@id='minutesCredited']")
		private WebElementFacade tblHdr_hrsCredited;
		@FindBy(xpath="//th[@id='behaviourId']")
		private WebElementFacade tblHdr_behaviour;
		@FindBy(xpath="//th[@id='workQualityId']")
		private WebElementFacade tblHdr_workQuality;
		@FindBy(xpath="//th[@id='upwOutcomeTypeId']")
		private WebElementFacade tblHdr_outcome;
		
		@FindBy(xpath="//th[contains(text(),'View')]")
		private WebElementFacade tblHdr_apmtView;
		@FindBy(xpath="//th[@class='text-center'][2]")
		private WebElementFacade tblHdr_apmtEdit;
		
		@FindBy(xpath="//tr[1]/td[1]")
		private WebElementFacade firstRowValue_Date;
		@FindBy(xpath="//tr[1]/td[2]")
		private WebElementFacade firstRowValue_Project;
		@FindBy(xpath="//tr[1]/td[3]")
		private WebElementFacade firstRowValue_HourOffered;
		@FindBy(xpath="//tr[1]/td[4]")
		private WebElementFacade firstRowValue_HourCredited;
		@FindBy(xpath="//tr[1]/td[5]")
		private WebElementFacade firstRowValue_Behaviour;
		@FindBy(xpath="//tr[1]/td[6]")
		private WebElementFacade firstRowValue_WorkQuality;
		@FindBy(xpath="//tr[1]/td[7]")
		private WebElementFacade firstRowValue_Outcome;
		@FindBy(xpath=".//*[@id='upwAppointment_view0']")
		private WebElementFacade viewAppointment_button;
		@FindBy(xpath=".//*[@id='upwAppointment_edit0']")
		private WebElementFacade editAppointment_button;
		
		//====== Appointment table ==========#Anuja
		
		
		public void validateUPWAppointmentListLabel(){
		
			System.out.println(tblHdr_apmtView.getText());
			System.out.println(tblHdr_apmtEdit.getText());
	
			Assert.assertTrue("Upw Appointment header link did not display" , lnkHdr_upwAppointment.getText().equals("UPW APPOINTMENTS"));
			Assert.assertTrue("Add Single button label did not display" , btn_AddSingle.getText().equals("ADD SINGLE"));
			Assert.assertTrue("Add Recurring button label did not display" , btn_AddRecurring.getText().equals("ADD RECURRING"));
			
			Assert.assertTrue("Date header label did not display" , tblHdr_date.getText().equals("DATE"));
			Assert.assertTrue("PROJECT header label did not display" , tblHdr_project.getText().equals("PROJECT"));
			Assert.assertTrue("Hours Offered header label did not display" , tblHdr_hrsOffered.getText().equals("HOURS OFFERED"));
			Assert.assertTrue("Hours Credited header label did not display" , tblHdr_hrsCredited.getText().equals("HOURS CREDITED"));
			Assert.assertTrue("Behaviour header label did not display" , tblHdr_behaviour.getText().equals("BEHAVIOUR"));
			Assert.assertTrue("Work Quality header label did not display" , tblHdr_workQuality.getText().equals("WORK QUALITY"));
			Assert.assertTrue("Outcome header label did not display" , tblHdr_outcome.getText().equals("OUTCOME"));
			Assert.assertTrue("View header label did not display" , tblHdr_apmtView.getText().equals("VIEW"));
			Assert.assertTrue("Edit header label did not display" , tblHdr_apmtEdit.getText().equals("EDIT"));
		
		}
		//IC-2759 Add Recurring UPWAppointment
		
		public void clickOnAddRecurring(){
			waitABit(1000);
			btn_AddRecurring.click();
		}
		
		
		//IC-3264 Schedule Single UPW Appointment
		public void clickOnAddSingle(){
			btn_AddSingle.click();
		}
		
		// ==============UPW Appointment Filter========================#Anuja

		@FindBy(xpath="//a[@id='filter']")
		private WebElementFacade upw_filter;
		@FindBy(xpath="//input[@id='startDate']")
		private WebElementFacade filter_from;
		@FindBy(xpath="//input[@id='endDate']")
		private WebElementFacade filter_to;
		@FindBy(xpath="//input[@id='endDate']")
		private WebElementFacade filter_search;
		@FindBy(xpath="//button[contains(text(),'Reset')]")
		private WebElementFacade filter_reset;
		
		
		
		public void clickOnUpwAppointments () {
			waitForPresenceOf("//a[contains(text(),'Upw Appointments')]");
			lnkHdr_upwAppointment.click();
			waitABit(1000);
			if (lnkHdr_upwAppointment.isCurrentlyVisible()) {
				lnkHdr_upwAppointment.click();
				waitABit(1000);
			} else
				System.out.println("lnk Upw Appointments is not available upw details page");
		}
		
		public void clickOnAppointmentsfilter () {
			waitForPresenceOf("//a[@id='filter']");
		//	upw_filter.click();
			waitABit(100);
			if (upw_filter.isCurrentlyVisible()) {
				upw_filter.click();
				waitABit(1000);
			} else
				System.out.println("UPW filter is not available upw details page");
		}
		
		public void VerifyAppointmentFilterSearch() {
			
			filter_from.sendKeys("01/07/2017");
			filter_to.sendKeys("06/07/2017");
		
			filter_search.click();
			waitABit(1000);
			waitForCondition();
		}
		
		public void validateUpwAppointmentWithInboundXML() {
			
		}
		
		public void validateUPWAppointmentBreadcrumb() {

			verifyBreadCrumbs("Service User Summary Plan UPW Summary View UPW Detail");
		
	}
		
		//=========== ADD Single UPW Appointment=======
		
		@FindBy(xpath="//button[@id='upwAppointment_addButton'][1]")
		private WebElementFacade btn_ADDSingle;
		@FindBy(xpath="//input[@id='appointmentDate']")
		private WebElementFacade lbl_Date;
		@FindBy(xpath="//select[@formcontrolname='teamId']")
		private WebElementFacade lbl_CRC;
		@FindBy(xpath="//select[@formcontrolname='officeTeamId']")
		private WebElementFacade lbl_Team;
		@FindBy(xpath="//select[@formcontrolname='projectTypeId']")
		private WebElementFacade lbl_projecttype;
		@FindBy(xpath="//select[@formcontrolname='projectId']")
		private WebElementFacade lbl_projectName;
		@FindBy(xpath="//select[@id='highVisibilityVest']")
		private WebElementFacade lbl_HighVisibility;
		@FindBy(xpath="//select[@id='workQualityId']")
		private WebElementFacade lbl_workedintensively;
		@FindBy(xpath="//input[@ng-reflect-name='startTime']")
		private WebElementFacade lbl_startTime;
		@FindBy(xpath="//input[@ng-reflect-name='endTime']")
		private WebElementFacade lbl_EndTime;
		@FindBy(xpath="//input[@id='penaltyTime']")
		private WebElementFacade lbl_penalty;
		@FindBy(xpath="//input[@id='minutesCredited']")
		private WebElementFacade lbl_huourscrediated;
		@FindBy(xpath="//select[@id='intensive']")
		private WebElementFacade lbl_workquality;
		@FindBy(xpath="//select[@id='behaviourId']")
		private WebElementFacade lbl_behaviour;
		@FindBy(xpath="//textarea[@id='note']")
		private WebElementFacade lbl_notes;
		@FindBy(xpath="//input[@id='upwTeam']")
		private WebElementFacade lbl_supervisorTeam;
		@FindBy(xpath="//input[@id='upwContactOfficer']")
		private WebElementFacade lbl_supervisor;
		@FindBy(xpath="//select[@id='upwOutcomeTypeId']")
		private WebElementFacade lbl_outcome;
		@FindBy(xpath="//button[@id='saveButton']")
		private WebElementFacade btn_submit;
		@FindBy(xpath="//button[@id='cancelButton']")
		private WebElementFacade btn_cancel;
		
		public void clickOnUpwADDSingleAppointment () {
			waitForPresenceOf("//button[@id='upwAppointment_addButton'][1]");
			btn_ADDSingle.click();
			waitABit(1000);
			if (btn_ADDSingle.isCurrentlyVisible()) {
				btn_ADDSingle.click();
				waitABit(1000);
			} else
				System.out.println("ADD SINGLE button is not available upw details page");
		}
		
		
		public void validateUPWADDSingleAppointmentlabels() {

			verifyBreadCrumbs("Service User > Summary > Plan > UPW Summary > View UPW Details > Schedule UPW appointment");
			Assert.assertTrue("date is not not matched for Date",lbl_Date.getText().trim().equals("Date"));
			Assert.assertTrue("CRC does not match",lbl_CRC.getText().trim().equals("CRC"));
			Assert.assertTrue("Team does not match", lbl_Team.getText().trim().equals("Team"));
			Assert.assertTrue("Project Type does not match",lbl_projecttype.getText().trim().equals("Project Type"));
			Assert.assertTrue("Project Name does not match",lbl_projectName.getText().trim().equals("Project Name"));
			Assert.assertTrue("High Visibility  does not match",lbl_HighVisibility.getText().trim().equals("High Visibility Vest Worn?"));
			Assert.assertTrue("Worked Intensively does not match",lbl_workedintensively.getText().trim().equals("Worked Intensively"));
			Assert.assertTrue("Start Time does not match",lbl_startTime.getText().trim().equals("Start Time "));
			Assert.assertTrue("End Time does not match",lbl_EndTime.getText().trim().equals("End Time"));
			Assert.assertTrue("Penalty Time does not match",lbl_penalty.getText().trim().equals("Penalty Time"));
			Assert.assertTrue("Hours Credited does not match",lbl_huourscrediated.getText().trim().equals("Hours Credited"));
			Assert.assertTrue("Work Quality does not match",lbl_workquality.getText().trim().equals("Work Quality"));
			Assert.assertTrue("Behaviour does not match",lbl_behaviour.getText().trim().equals("Behaviour"));
			Assert.assertTrue("Notes does not match",lbl_notes.getText().trim().equals("Notes"));
			Assert.assertTrue("Supervisior Team does not match",lbl_supervisorTeam.getText().trim().equals("Supervisior Team"));
			Assert.assertTrue("Supervisior does not match",lbl_supervisor.getText().trim().equals("Supervisior"));
			// System.out.println(ReadXMLData.getXMLData("inboundXML/AO.xml",
			// "//Provision", "./StartDate"));
	}
		
		
       public void CreateADDSingle() {
    	   lbl_Date.sendKeys();
      		waitABit(100);
    	   lbl_CRC.selectByVisibleText("West Yorkshire CRC");
   		   waitABit(100);
   		   lbl_Team.selectByVisibleText("");   		
   		   waitABit(100);
   		    lbl_projecttype.selectByVisibleText("");
   		    waitABit(100);
   		    lbl_projectName.sendKeys();
   		    waitABit(100);
   		    lbl_startTime.sendKeys();
   		    waitABit(100);
   		    lbl_EndTime.sendKeys(); 
   		    lbl_supervisorTeam.sendKeys();
		    waitABit(100);
		    lbl_supervisor.sendKeys();
   		    waitABit(100);	
       }
       
       public void clickonsubmitADDSingle() {
   		 btn_submit.click();
			waitABit(1000);
			waitForCondition();
		}
       
    public void validateUpwDetailsWithInboundXMLs() {
   		
   		
   	}
   	public void validateLabelsOnViewUPWDetails() {
   		
   		
   		
   		
   	}
		
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

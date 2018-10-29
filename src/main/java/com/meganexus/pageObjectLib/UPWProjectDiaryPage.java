package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class UPWProjectDiaryPage extends NeoTR_Page{

	
	@FindBy(xpath="//a[@id='Upw Project Diary']")
	private WebElementFacade lnkHdr_UpwProjectDiary;
	
	//Click on Upw Project Diary collapsible link
	public void clickOnUpwProjectDiary(){
	     if (lnkHdr_UpwProjectDiary.isPresent()) {
	    	 lnkHdr_UpwProjectDiary.click();
	       waitABit(500);
	      } else
	       System.out.println("Upw Project Diary link is not present");
	     }
	
	
	@FindBy(xpath="(//label[@for='teamId'])[2]")
	private WebElementFacade lbl_ProjectDiaryCRC;
	@FindBy(xpath="(//label[@for='appointmentDate'])[1]") //or //label[text()='Date']
	private WebElementFacade lbl_ProDiaryDate;
	@FindBy(xpath="(//label[@for='officeTeamId'])[2]")
	private WebElementFacade lbl_ProDiaryTeam;
	@FindBy(xpath="//th[@id='projectName']")
	private WebElementFacade tblHdrProjectName;
	@FindBy(xpath="//th[@id='projectCode']")
	private WebElementFacade tblHdrProjectCode;
	@FindBy(xpath=".//*[@id='startTime']")
	private WebElementFacade tblHdrStartTime;
	@FindBy(xpath=".//*[@id='endTime']")
	private WebElementFacade tblHdrEndTime;
	@FindBy(xpath="(.//*[@id='appointmentDate'])[2]")
	private WebElementFacade tblHdrDate;
	@FindBy(xpath=".//*[@id='numberOfServiceUsers']")
	private WebElementFacade tblHdrnumberOfSUs;
	
	
	//For entering value in Search fields
	@FindBy(xpath="(//select[@id='teamId'])[2]")
	private WebElementFacade ddl_ProjectDiaryCRC;
	@FindBy(xpath="//input[@id='appointmentDate']")
	private WebElementFacade value_ProjectDiaryDate;
	@FindBy(xpath="(//select[@id='officeTeamId'])[2]")
	private WebElementFacade ddl_ProjectDiaryTeam;
	
		
	@FindBy(xpath = "(//button[contains(.,'Search')])[3]")
	private WebElementFacade button_search;
	
	public void enterValueForSearch() {
		
		ddl_ProjectDiaryCRC.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Team"));
		value_ProjectDiaryDate.sendKeys("20/07/2017");
		ddl_ProjectDiaryTeam.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//UPWProject_ProjectDetails_ADD", "./Office_Team"));
		button_search.click();
	}
	
	//Upw Project Diary label 
	public void validateUPWProjectDiaryLabels() {
		
		Assert.assertTrue("UPW Project Diary link header is not correct" , lnkHdr_UpwProjectDiary.getText().trim().equals("UPW PROJECT DIARY"));
		Assert.assertTrue("Project Diary CRC label is not correct" , lbl_ProjectDiaryCRC.getText().trim().equals("CRC*"));
		Assert.assertTrue("Project Diary Date label is not correct" , lbl_ProDiaryDate.getText().trim().equals("Date*"));
		Assert.assertTrue("Project Diary Team label is not correct" , lbl_ProDiaryTeam.getText().trim().equals("Team*"));
		
		Assert.assertTrue("Project Name table label is not correct" , tblHdrProjectName.getText().trim().equals("PROJECT NAME"));
		Assert.assertTrue("Project Code table label is not correct" , tblHdrProjectCode.getText().trim().equals("PROJECT CODE"));
		Assert.assertTrue("Start time table label is not correct" , tblHdrStartTime.getText().trim().equals("START TIME"));
		Assert.assertTrue("End time table label is not correct" , tblHdrEndTime.getText().trim().equals("END TIME"));
		Assert.assertTrue("Date table label is not correct" , tblHdrDate.getText().trim().equals("DATE"));
		Assert.assertTrue("Number Of SUs table label is not correct" , tblHdrnumberOfSUs.getText().trim().equals("NUMBER OF SUS"));
		
	}
	// Verify list Upw appointment in Project diary page
	@FindBy(xpath = "//tbody/tr[1]")
	private WebElementFacade firstRowProjectAttendecedList;

	public void verifyFirstRowAttendenceList() {
		if (firstRowProjectAttendecedList.isVisible())
			System.out.println("Attendence list is available in list");
		else
			System.out.println("Attendence list is not available");
	}
	
	//Click on View button of an appointment  Project diary page 
	@FindBy(xpath="//button[@id='upwProjectDiary_view0']")
	private WebElementFacade viewButton;
	
	public void clickOnViewButton() {
		if(firstRowProjectAttendecedList.isVisible())
			viewButton.click();
		else
			System.out.println("Appointment list is not displayed");
	}
	//Click on Edit button of an appointment  Project diary page
	@FindBy(xpath="//button[@id='upwProjectDiary_edit0']")
	private WebElementFacade editButton;
	
	public void clickOnEditButton() {
		if(firstRowProjectAttendecedList.isVisible())
			editButton.click();
		else
			System.out.println("Appointment list is not displayed");
	}
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
}

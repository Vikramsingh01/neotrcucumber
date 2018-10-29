package com.meganexus.stepsLib;
import com.meganexus.pageObjectLib.PlanTabPage;
import com.meganexus.pageObjectLib.ProfilesPage;

import com.meganexus.pageObjectLib.UPWAppointmentPage;

import net.thucydides.core.annotations.Step;
import com.meganexus.pageObjectLib.UPWSummaryPage;
import com.meganexus.pageObjectLib.UnpaidWorkTab;

public class UpwSummarySteps extends NeoTR_Steps {
	ProfilesPage profilePage;
    UnpaidWorkTab unpaidWorkTab;
    PlanTabPage plnTab;
    UPWSummaryPage upwSum;
    UPWAppointmentPage upwApmt;
	UPWAppointmentPage UPWApp;
	
    String expectedBreadcrumb = null;
    
	
	
	@Step
	public void navigateToUnpaidWorkTab() {
		unpaidWorkTab.clickOnUnpaidTab();
		
	}
	
	@Step
	public void clickUPWTab()
	{
		plnTab.clickOnUPWtab();
	}
	
	@Step
	public void validateSummaryLabels()
	{
		upwSum.validateUPWSummaryLabels();
		upwSum.validateUPWDetailListLabel();
		//upwSum.validateUPWAppointmentListLabel();
	}
	@Step
	public void verifyUPWDetailsList()
	{
		upwSum.verifyFirstRowUPWDetail();
	}
	
	@Step
	public void verifyUpwSummaryInboundxml()
	{
		upwSum.validateUpwSummaryWithInboundXML();
	}
	

	@Step
	public void clickViewUPWSummaryButton()
	{
		upwSum.clickOnView();
	}
	
	@Step
	public void clickEditUPWSummaryButton()
	{
		upwSum.clickOnEdit();
	}
	
	@Step
	public void validateEditUPWSummaryPageLabels()
	{
		upwSum.validateLabelOnEditUPWDetail();
	}
	
	@Step
	public void enterValueEditUPWSummaryPage()
	{
		upwSum.enterValueInEditUPWDetail();
	}
	@Step
	public void clickOnSubmitButton()
	{
		upwSum.clickOnSubmit();
	}
	
	@Step
	public void clickViewUPWSummary()
	{
		upwSum.clickOnView();
	}
	
	@Step
	public void validateUPWDetailRecord()
	{
		upwSum.validateEditedUPWDetails();
	}
	@Step
	public void clickAddRecurringButton()
	{
		upwApmt.clickOnAddRecurring();
	}
	
	
	
	@Step
	public void UPWAppointmentpage()
	{
		UPWApp.clickOnUpwAppointments();
		
	}
	@Step
	public void UPWAppointmentFilter()
	{
		UPWApp.clickOnAppointmentsfilter();
			
	}
	@Step
	public void ValidateUPWAppointmentFilter()
	{
		UPWApp.clickOnAppointmentsfilter();
	}
	
	@Step
	public void clickOnAppointmenFilterSearch()
	{
		UPWApp. VerifyAppointmentFilterSearch();
	}
	@Step
	public void UPWAppointmentListTable()
	{
		UPWApp.validateUPWAppointmentListLabel();
		UPWApp.validateUPWAppointmentBreadcrumb();
		
	}
	@Step
	public void verifyUpwAppointmentInboundXML()
	{
		UPWApp.validateUpwAppointmentWithInboundXML();
	}
	
	@Step	
	public void clickAddButton()
	{
		upwApmt.clickOnSearch();
		//upwApmt.clickOnAdd();
	}
	//==================== ADD Single====================
	@Step
	
	public void clickAddSingleButton()
	{
		upwApmt.clickOnUpwADDSingleAppointment();
	}

	public void validateUpwDetailsWithInboundXMLs() {
		upwApmt.validateUpwDetailsWithInboundXMLs();
		
	}

	public void validateLabelsOnViewUPWDetails() {
		upwApmt.validateLabelsOnViewUPWDetails();
		
	}

	
	
	
}


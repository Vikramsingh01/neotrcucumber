package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.UPWAppointmentPage;

import net.thucydides.core.annotations.Step;

public class UpwAppointmentSteps  extends NeoTR_Steps{

	UPWAppointmentPage upwApmt;


	@Step
	public void validateADDSingleAppointmentPage() {
		upwApmt.validateUPWADDSingleAppointmentlabels();
	}

	@Step
	public void valuesADDSingleAppointmentPage() {
		upwApmt.CreateADDSingle();
	}
	
	@Step
	public void CreateADDRecurringAppointment() {
		upwApmt.CreateADDRecurringAppointment();
	}


	@Step
	public void clickonsubmitbutton() {
		upwApmt.clickonsubmitADDSingle();
	}

	@Step
	public void validateAddRecurringAppointmentLabels() {
		System.out.println("test again");
		upwApmt.verifyAddRecurringUpwAppointmentLabel();
	}

}

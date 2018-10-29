package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CourtWorkPage;
import com.meganexus.pageObjectLib.EventPage;

import net.thucydides.core.annotations.Step;

public class CourtWorkSteps extends NeoTR_Steps {
	EventPage event;
	CourtWorkPage courtWorkPage;

	@Step
	public void clickOnCourtWorkTab() {
		event.courtWorkTab();
	}

	@Step
	public void sentCourtWorkRequestToPSCAdmin() {
		courtWorkPage.sentCourtWorkRequest();

	}

	@Step
	public void clickOnCourtWorkTabInPSC_AdminPage() {
		courtWorkTabForPSC_AdminPage();

	}

	@Step
	public void courtWorkListViewValidation() {
		courtWorkPage.filterCourtWorkRequest();

	}

	@Step
	public void searchCourtWorkPSC_Admin() {

		courtWorkPage.filterCourtWorkRequest();
	}

}

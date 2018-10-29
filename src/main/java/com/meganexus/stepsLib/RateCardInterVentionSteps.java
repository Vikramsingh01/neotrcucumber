package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.OffenderDetailsPage;
import com.meganexus.pageObjectLib.RateCardInterVentionPage;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("deprecation")
public class RateCardInterVentionSteps extends NeoTR_Steps {
	OffenderDetailsPage offPage;
	RateCardInterVentionPage rateCardIntVenPage;

	@Step
	public void viewRateCardList()
	{
		offPage.clickOnRateCardInterventionLnk();  //Click on rate card intervention table header link
		System.out.println("clicked on rate card link");
		offPage.validateRateCardList();
		System.out.println("Rate card list is verified");
	}
	
	
	
	@Step   				//For add button xpath check in offender details page
	public void addRateCardIntervention() {
		offPage.clickAddRateCardInterVentionBtn();
		rateCardIntVenPage.enterRateCardInterVentionDetails();
		clickSubmitBtn();

	}

	@Step
	public void editRateCardIntervention() {
		offPage.clickEditRateCardInterVentionBtn();
		rateCardIntVenPage.updateRateCardInterVentionDetails();
		clickSubmitBtn();

	}

	@Step
	public void viewRateCardIntervention() {
		offPage.clickOnViewRateCardInterventionButton();

	}

	@Step
	public void deleteRateCardIntervention() {
		offPage.clickDeleteRateCardInterVentionBtn();

	}

	@Step

	public void rateCardInterventionDeleteReview() {

		Assert.assertTrue("rate card is not deleted or record deleted but does not match with existing record",
				offPage.ratecardDetails().equals("NPS London"));
	}

}

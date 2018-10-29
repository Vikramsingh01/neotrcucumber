package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class InductionLetterPage extends NeoTR_Page {
	@FindBy(id = "dateOfAppointment")
	private WebElementFacade tbx_dateOfAppointment;
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-time']")
	private WebElementFacade tbx_timeOfAppointment;
	@FindBy(xpath = "//input[@ng-reflect-name='location']")
	private WebElementFacade tbx_location;
	@FindBy(xpath = "//textarea[@ng-reflect-name='notes']")
	private WebElementFacade tbx_notes;
	@FindBy(xpath = "//button[text()='Finish']")
	private WebElementFacade btn_finish;

	public void enetrDataInductionLetter() {
		if(tbx_dateOfAppointment.isCurrentlyVisible()){
		tbx_dateOfAppointment.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//InductionLetter", "./DateOfAppt"));
		waitABit(1000);
		tbx_timeOfAppointment.click();
		waitABit(1000);
		tbx_location.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//InductionLetter", "./Location"));
		waitABit(1000);
		tbx_notes.sendKeys((ReadXMLData.getXMLData("TestData.xml", "//InductionLetter", "./Notes")));
		waitABit(1000);
		btn_finish.click();
		waitABit(1000);
		}
		else
			System.out.println("induction letter is not available");

	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return btn_finish;
	}

}

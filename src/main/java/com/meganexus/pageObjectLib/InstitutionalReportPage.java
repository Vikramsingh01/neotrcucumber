package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import sun.net.www.content.audio.x_aiff;

public class InstitutionalReportPage extends NeoTR_Page {

	@FindBy(xpath = "//button[text()='Throughcare']")
	private WebElementFacade btn_Throughcare;

	@FindBy(xpath = "//button[@ng-reflect-router-link='institutional-report']")
	private WebElementFacade btn_InstitutionalReportTab;

	@FindBy(xpath = "//button[text()='institutional report']")
	private WebElementFacade breadcrumb_InstitutionalReport;

	@FindBy(xpath = "//span[contains(text(),'View Institutional Report')]")
	private WebElementFacade breadcrumb_ViewInstitutionalReport;

	@FindBy(xpath = "//button[@id='institutionalReport_addButton']")
	private WebElementFacade btn_AddInstitutionalReport;

	@FindBy(xpath = "//button[@id='institutionalReport_view']")
	private WebElementFacade btn_ViewInstitutioanlReport;

	@FindBy(xpath = "//button[@title='Delete record is locked.']")
	private WebElementFacade btn_deleteinstitutionalReportLocked;

	@FindBy(xpath = "//button[@title='Delete record']")
	private WebElementFacade btn_deleteInstitutionalReportUnlock;

	@FindBy(xpath = "//h2[text()='VIEW Institutional Report']")
	private WebElementFacade tbx_VIEWInstitutionalReport;

	@FindBy(xpath = "//button[@id='institutionalReport_edit']")
	private WebElementFacade btn_editInstitutionalReport;

	@FindBy(xpath = "//a[text()='Institutional Report']")
	private WebElementFacade lnk_InstitutionalReport;

	@FindBy(xpath = "//input[@id='requestedDate']")
	private WebElementFacade tbx_requestedDate;

	@FindBy(xpath = "//input[@id='requiredByDate']")
	private WebElementFacade tbx_requiredByDate;

	@FindBy(xpath = "//select[@id='requestedReportTypeId']")
	private WebElementFacade ddl_requestedReportType;

	@FindBy(xpath = "//input[@id='allocatedDate']")
	private WebElementFacade tbx_allocatedDate;

	@FindBy(xpath = "//select[@id='videoLink']")
	private WebElementFacade ddl_videoLink;

	@FindBy(xpath = "//input[@id='completedDate']")
	private WebElementFacade tbx_completedDate;

	@FindBy(xpath = "//select[@id='institutionId']")
	private WebElementFacade ddl_institution;

	@FindBy(xpath = "//input[@id='deliveredToEstablishment']")
	private WebElementFacade tbx_deliveredToEstablishment;

	@FindBy(xpath = "//input[@id='dateAbandoned']")
	private WebElementFacade tbx_dateAbandoned;

	@FindBy(xpath = "//select[@id='institutionalReportProviderId']")
	private WebElementFacade ddl_institutionalReportProviderId;

	@FindBy(xpath = "//input[@id='institutionalReportTeam']")
	private WebElementFacade tbx_institutionalReportTeam;

	@FindBy(xpath = "//input[@id='institutionalReportOfficer']")
	private WebElementFacade tbx_institutionalReportOfficer;

	@FindBy(xpath = "//textarea[@id='note']")
	private WebElementFacade tbx_note;

	@FindBy(xpath = "//select[@ng-reflect-name='institutionalReportProviderId']")
	private WebElementFacade ddl_provider;

	@FindBy(xpath = "//select[@ng-reflect-name='institutionalReportTeam']")
	private WebElementFacade ddl_team;

	@FindBy(xpath = "//select[@ng-reflect-name='institutionalReportOfficer']")
	private WebElementFacade ddl_officer;

	String requestedDate = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./RequestedDate"));
	String requiredByDate = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./RequiredByDate"));
	String requestedReportType = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./RequestedReportType"));
	String instReportProvider = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./InstReportProvider"));
	String instReportTeam = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./InstReportTeam"));
	String instReportOfficer = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./InstReportOfficer"));
	String institution = DateFormatter.changeDateFormat(
			ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_add", "./Institution"));

	public void addInstitutionalReportwithAllTheMandatoryFields() {

		/*
		 * btn_AddInstitutionalReport.click();
		 * tbx_requestedDate.sendKeys("08/04/2017");
		 * tbx_requiredByDate.sendKeys("10/04/2017");
		 * ddl_requestedReportType.selectByVisibleText("Recall Report");
		 * ddl_provider.selectByVisibleText("CPA Cheshire and Gtr Manchester");
		 * ddl_team.selectByVisibleText("Flex Team 2");
		 * ddl_officer.selectByVisibleText("CaseManager CGMTest");
		 * tbx_allocatedDate.sendKeys("10/04/2017");
		 * ddl_videoLink.selectByVisibleText("Yes");
		 * tbx_completedDate.sendKeys("10/04/2017");
		 * ddl_institution.selectByVisibleText("Thameside");
		 * tbx_deliveredToEstablishment.sendKeys("10/04/2017");
		 * tbx_dateAbandoned.sendKeys("10/04/2017");
		 * ddl_institutionalReportProviderId.selectByVisibleText(
		 * "NPS North West"); tbx_institutionalReportTeam.sendKeys(
		 * "N01T01/OMU A"); tbx_institutionalReportOfficer.sendKeys(
		 * "N01P013/Polus, Oliver, ZZ"); tbx_note.sendKeys(
		 * "Institutional Report added");
		 */

		tbx_requestedDate.sendKeys(requestedDate);
		tbx_requiredByDate.sendKeys(requiredByDate);
		ddl_requestedReportType.selectByVisibleText(requestedReportType);
		ddl_institutionalReportProviderId.selectByVisibleText(instReportProvider);
		ddl_team.selectByVisibleText(instReportTeam);
		ddl_officer.selectByVisibleText(instReportOfficer);
		ddl_institutionalReportProviderId.selectByVisibleText(institution);
	}

	public void clickViewInstitutionalReportBtn() {
		if (btn_ViewInstitutioanlReport.isCurrentlyVisible()) {
			btn_ViewInstitutioanlReport.click();
			waitForTextToAppear(breadcrumb_ViewInstitutionalReport.getText(), 20000);
			breadcrumb_InstitutionalReport.click();

		} else
			System.out.println("View Institutional Report is locked for this offender");

	}

	public void editInstitutionalReportDetails() {

		String requestedDate = DateFormatter.changeDateFormat(
				ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_edit", "./RequestedDate"));
		String requiredByDate = DateFormatter.changeDateFormat(
				ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_edit", "./RequiredByDate"));
		String notes = DateFormatter.changeDateFormat(
				ReadXMLData.getXMLData("TestData.xml", "//InstitutionalReport_valid_edit", "./Notes"));

		tbx_requestedDate.clear();
		waitABit(1000);
		tbx_requestedDate.sendKeys(requestedDate);
		waitABit(1000);
		tbx_requiredByDate.sendKeys(requiredByDate);
		waitABit(1000);
		ddl_institution.selectByVisibleText("Barlinnie Special Unit");
		waitABit(1000);
		tbx_note.clear();
		tbx_note.sendKeys(notes);

	}

	@Override
	public WebElementFacade getUniqueElement() {
		// ....
		return tbx_VIEWInstitutionalReport;
	}

	public void clickOnThroughcareTab() {
		btn_Throughcare.click();

	}

	public void clickOnInstitutionalReportTab() {
		btn_InstitutionalReportTab.click();
		waitABit(1000);
	}

	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[4]/tr-institutional-report/div/div[2]/tr-accordion/div/tr-accordiontab/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]")
	private WebElementFacade value_requested_date;
	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[4]/tr-institutional-report/div/div[2]/tr-accordion/div/tr-accordiontab/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[2]")
	private WebElementFacade value_required_date;
	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[4]/tr-institutional-report/div/div[2]/tr-accordion/div/tr-accordiontab/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]")
	private WebElementFacade value_report_type;
	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[4]/tr-institutional-report/div/div[2]/tr-accordion/div/tr-accordiontab/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]")
	private WebElementFacade value_officer;

	@SuppressWarnings("deprecation")
	public void validateListView() {
		Assert.assertEquals("requested date not matched on list view", value_requested_date.getText().trim(),
				requestedDate);
		Assert.assertEquals("requested date not matched on list view", value_requested_date.getText().trim(),
				requiredByDate);
		Assert.assertEquals("requested date not matched on list view", value_requested_date.getText().trim(),
				requestedReportType);
		Assert.assertEquals("requested date not matched on list view", value_requested_date.getText().trim(),
				instReportOfficer);

	}

	public void clickEditInstitutionalReportBtn() {

		btn_editInstitutionalReport.click();
	}

	public void verifyViewInstitutionalReportDetails() {
		// ....
		// ..........
		breadcrumb_InstitutionalReport.click();
	}

	public void verifyUpdatedViewInstitutionalReportDetails() {
		// TODO Auto-generated method stub

	}

	public void clickDeleteInstitutionalReportBtn() {
		if (!btn_deleteInstitutionalReportUnlock.isCurrentlyVisible()) {
			waitABit(500);
			getDriver().navigate().refresh();
			btn_deleteInstitutionalReportUnlock.click();

		} else
			System.out.println(
					"no record for Institutional Report is available ... add Institutional Report record first then click on delete button");
	}

	public void validationDeleteInstitutionalReportOnUI() {
		// TODO Auto-generated method stub

	}
}

package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class PendingTransferViewPage extends NeoTR_Page {

	@FindBy(xpath = "//a[text()='Offender Manager Transfer Request']")
	private WebElementFacade lnk_OffManTransferRequest;
	@FindBy(xpath = "//a[text()='OM Transfer Request']")
	private WebElementFacade lnk_OMTransferRequest;

	@FindBy(xpath = "//a[text()='licence Condition Transfer Request']")
	private WebElementFacade lnk_LicCodCTransferRequest;
	@FindBy(xpath = "//a[text()='LC Transfer Request']")
	private WebElementFacade lnk_LCTransferRequest;

	@FindBy(xpath = "//a[text()='Requirement Transfer Request']")
	private WebElementFacade lnk_ReqTransferRequest;
	@FindBy(xpath = "//a[text()='RQ Transfer Request']")
	private WebElementFacade lnk_RQTransferRequest;

	@FindBy(xpath = "//a[text()='Institutional Report Transfer Request']")
	private WebElementFacade lnk_InsRptTransferRequest;
	@FindBy(xpath = "//a[text()='IR Transfer Request']")
	private WebElementFacade lnk_IRTransferRequest;

	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElementFacade btn_saveOMTra;

	public void clickSaveBtn() {
		btn_saveOMTra.waitUntilClickable();
		try {
			btn_saveOMTra.click();
			waitABit(1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Save button is not displayed due team and user not selected");
		}

	}

	public void clickOnOMTransferRequest() {
		try {
			lnk_OffManTransferRequest.click();
			waitABit(1000);
			lnk_OMTransferRequest.click();
			waitABit(1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("OM Transfer Request is not availble");
		}

	}

	public void clickOnLCTransferRequest() {
		try {
			lnk_LicCodCTransferRequest.click();
			waitABit(10000);
			lnk_LCTransferRequest.click();
			waitABit(1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("LC Transfer Request is not availble");
		}

	}

	public void clickOnRQTransferRequest() {
		if (lnk_ReqTransferRequest.isCurrentlyVisible()) {
			try {

				Thread.sleep(3000);
				lnk_ReqTransferRequest.click();
				waitABit(1000);
				lnk_RQTransferRequest.click();
				waitABit(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else
			System.out.println("RQ Transfer Request is not availble");
	}

	public void clickOnIRTransferRequest() {
		if (lnk_IRTransferRequest.isCurrentlyVisible()) {
			try {

				Thread.sleep(3000);
				lnk_IRTransferRequest.click();
				waitABit(1000);
				lnk_IRTransferRequest.click();
				waitABit(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else
			System.out.println("IR Transfer Request is not availble");
	}

	@FindBy(xpath = "//button[text()='Save']")
	private WebElementFacade btn_Save;

	public void clickOnSaveBtn() {
		if (btn_Save.isCurrentlyEnabled()) {
			btn_Save.click();
			waitABit(1000);
		} else
			System.out.println("save btn is not enabled");
	}

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElementFacade rbn_reject;
	@FindBy(xpath = "(//select)[1]")
	private WebElementFacade ddl_rejectReason;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElementFacade btn_ok;

	public void reject() {
		if (rbn_reject.isCurrentlyEnabled()) {
			rbn_reject.click();
			waitABit(1000);
			ddl_rejectReason.selectByVisibleText("Risk to Victim");
			waitABit(1000);
			btn_Save.click();
			waitABit(1000);
			btn_ok.click();
			waitABit(1000);
		} else
			System.out.println("reject radio btn is not enabled");
	}

	// verify on view pending transfer elements
	@FindBy(xpath = "//span[contains(text(),'pending transfer')]")
	private WebElementFacade txt_PendingTransfer;

	@FindBy(xpath = "//button[contains(text(),'Engagement History')]")
	private WebElementFacade btn_EngagementHistory;
	@FindBy(xpath = "//a[text()='//h2[@class='page-title']")
	private WebElementFacade txt_ViewPendingTransfer;

	// WebElements xpath for OM Transfer Request page labels and values

	@FindBy(xpath = "//div[contains(text(),'OM Transfer Reason')]")
	private WebElementFacade lbl_OMReason;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer Reason')]/following::p[1]")
	private WebElementFacade val_OMReason;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer Status')]")
	private WebElementFacade lbl_OMStatus;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer Status')]/following::p[1]")
	private WebElementFacade val_OMStatus;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer Withdrawn Reason')]")
	private WebElementFacade lbl_OMWithdrawn;

	/*
	 * @FindBy(xpath=
	 * "//div[contains(text(),'OM Transfer Withdrawn Reason')]/following::p[1]")
	 * private WebElementFacade val_OMWithdrawReason;
	 */

	@FindBy(xpath = "//div[contains(text(),'OM Transfer From Provider')]")
	private WebElementFacade lbl_OMFromProvider;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer From Provider')]/following::p[1]")
	private WebElementFacade val_OMFromProvider;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer From Responsible Team')]")
	private WebElementFacade lbl_OMFromTeam;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer From Responsible Team')]/following::p[1]")
	private WebElementFacade val_OMFromTeam;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer From Responsible Officer')]")
	private WebElementFacade lbl_OMFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer From Responsible Officer')]/following::p[1]")
	private WebElementFacade val_OMFromOfficer;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer To Provider')]")
	private WebElementFacade lbl_OMToProvider;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer To Provider')]/following::p[1]")
	private WebElementFacade val_OMToProvider;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer To Responsible Team')]")
	private WebElementFacade lbl_OMToTeam;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer To Responsible Team')]/following::p[1]")
	private WebElementFacade val_OMToTeam;

	@FindBy(xpath = "//div[contains(text(),'OM Transfer To Responsible Officer')]")
	private WebElementFacade lbl_OMToOfficer;
	@FindBy(xpath = "//div[contains(text(),'OM Transfer To Responsible Officer')]/following::p[1]")
	private WebElementFacade val_OMToOfficer;
	// xpath Order Supervisor Transfer Request header and click collapsable
	// section

	@FindBy(xpath = "//a[text()='Order Supervisor Transfer Request']")
	private WebElementFacade lnk_OrderSupervisorTransferRequest;
	@FindBy(xpath = "//a[text()='OS Transfer Request']")
	private WebElementFacade lnk_OSTransferRequest;

	public void clickOnOSTransferRequest() {
		if (lnk_OrderSupervisorTransferRequest.isCurrentlyVisible()) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lnk_OrderSupervisorTransferRequest.click();
			waitABit(10000);
			lnk_OSTransferRequest.click();
			waitABit(10000);
		} else
			System.out.println("OS Transfer Request is not availble");
	}
	// Identifying xpath on OS Request for label and values

	@FindBy(xpath = "//div[contains(text(),'OS Transfer Reason')]")
	private WebElementFacade lbl_OsReason;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer Reason')]/following::div[1]")
	private WebElementFacade val_OsReason;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer Status')]")
	private WebElementFacade lbl_OsStatus;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer Status')]/following::div[1]")
	private WebElementFacade val_OsStatus;

	@FindBy(xpath = "//div[contains(text(),'Transfer Withdrawn Reason')]")
	private WebElementFacade lbl_OsWithdrawn;
	// value not present
	/*
	 * @FindBy(xpath=
	 * "//div[contains(text(),'Transfer Withdrawn Reason')]/following::div[1]")
	 * private WebElementFacade val_OsWithdrawn;
	 */

	@FindBy(xpath = "//div[contains(text(),'OS Transfer From Provider')]")
	private WebElementFacade lbl_OsFromProvider;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer From Provider')]/following::div[1]")
	private WebElementFacade val_OsFromProvider;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer From Responsible Team')]")
	private WebElementFacade lbl_OsFromTeam;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer From Responsible Team')]/following::div[1]")
	private WebElementFacade val_OsFromTeam;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer From Responsible Officer')]")
	private WebElementFacade lbl_OsFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer From Responsible Officer')]/following::div[1]")
	private WebElementFacade val_OsFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer To Provider')]")
	private WebElementFacade lbl_OsToProvider;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer To Provider')]/following::div[1]")
	private WebElementFacade val_OsToProvider;

	@FindBy(xpath = "//div[contains(text(),'OS Transfer To Responsible Team')]")
	private WebElementFacade lbl_OsToTeam;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer To Responsible Team')]/following::div[1]")
	private WebElementFacade val_OsToTeam;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer To Responsible Officer')]")
	private WebElementFacade lbl_OsToOfficer;
	@FindBy(xpath = "//div[contains(text(),'OS Transfer To Responsible Team')]/following::div[1]")
	private WebElementFacade val_OsToOfficer;

	// View LCtransferRequest Xpaths

	@FindBy(xpath = "//div[contains(text(),'LC Transfer Reason')]")
	private WebElementFacade lbl_LCReason;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer Reason')]/following::div[1]")
	private WebElementFacade val_LCReason;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer Status')]")
	private WebElementFacade lbl_LCStatus;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer Status')]/following::div[1]")
	private WebElementFacade val_LCStatus;

	@FindBy(xpath = "//div[contains(text(),'LC Transfer Withdrawn Reason ')]")
	private WebElementFacade lbl_LCWithdrawn;
	// value not present
	/*
	 * @FindBy(xpath=
	 * "//div[contains(text(),'Transfer Withdrawn Reason')]/following::div[1]")
	 * private WebElementFacade val_LCWithdrawn;
	 */

	@FindBy(xpath = "//div[contains(text(),'LC Transfer From Provider')]")
	private WebElementFacade lbl_LCFromProvider;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer From Provider')]/following::div[1]")
	private WebElementFacade val_LCFromProvider;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer From Responsible Team')]")
	private WebElementFacade lbl_LCFromTeam;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer From Responsible Team')]/following::div[1]")
	private WebElementFacade val_LCFromTeam;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer From Respsonsible Officer ')]")
	private WebElementFacade lbl_LCFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer From Respsonsible Officer ')]/following::div[1]")
	private WebElementFacade val_LCFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer To Provider')]")
	private WebElementFacade lbl_LCToProvider;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer To Provider')]/following::div[1]")
	private WebElementFacade val_LCToProvider;

	@FindBy(xpath = "//div[contains(text(),'LC Transfer To Responsible Team')]")
	private WebElementFacade lbl_LCToTeam;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer To Responsible Team')]/following::div[1]")
	private WebElementFacade val_LCToTeam;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer To Responsible Officer')]")
	private WebElementFacade lbl_LCToOfficer;
	@FindBy(xpath = "//div[contains(text(),'LC Transfer To Responsible Officer')]/following::div[1]")
	private WebElementFacade val_LCToOfficer;

	// String LCTransferReason = "Offender Moved" ;
	// String LCTransferStatus = "Pending" ;
	// String LCTransferFromProvider = "NPS North West";
	// String LCTransferFromResponsibleTeam = "N01UAT/Unallocated Team(N01)";
	// String LCTransferFromRespsonsibleOfficer = "C05P005/Anyld, Annette, ZZ";
	// String LCTransferToProvider = "CPA West Yorkshire";
	// String LCTransferToResponsibleTeam = "C05T01/OMU A";
	// String LCTransferToResponsibleOfficer = "N01UATU/Staff, Unallocated
	// Staff(N01)";

	// View RQtransferRequest Xpaths
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer Reason')]")
	private WebElementFacade lbl_RQReason;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer Reason')]/following::div[1]")
	private WebElementFacade val_RQReason;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer Status')]")
	private WebElementFacade lbl_RQStatus;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer Status')]/following::div[1]")
	private WebElementFacade val_RQStatus;

	@FindBy(xpath = "//div[contains(text(),'RQ Transfer Withdrawn Reason ')]")
	private WebElementFacade lbl_RQWithdrawn;
	// value not present
	/*
	 * @FindBy(xpath=
	 * "//div[contains(text(),'Transfer Withdrawn Reason')]/following::div[1]")
	 * private WebElementFacade val_RQWithdrawn;
	 */

	@FindBy(xpath = "//div[contains(text(),'RQ Transfer From Provider')]")
	private WebElementFacade lbl_RQFromProvider;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer From Provider')]/following::div[1]")
	private WebElementFacade val_RQFromProvider;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer From Responsible Team')]")
	private WebElementFacade lbl_RQFromTeam;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer From Responsible Team')]/following::div[1]")
	private WebElementFacade val_RQFromTeam;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer From Responsible Officer ')]")
	private WebElementFacade lbl_RQFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer From Responsible Officer ')]/following::div[1]")
	private WebElementFacade val_RQFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer To Provider')]")
	private WebElementFacade lbl_RQToProvider;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer To Provider')]/following::div[1]")
	private WebElementFacade val_RQToProvider;

	@FindBy(xpath = "//div[contains(text(),'RQ Transfer To Responsible Team')]")
	private WebElementFacade lbl_RQToTeam;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer To Responsible Team')]/following::div[1]")
	private WebElementFacade val_RQToTeam;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer To Responsible Officer')]")
	private WebElementFacade lbl_RQToOfficer;
	@FindBy(xpath = "//div[contains(text(),'RQ Transfer To Responsible Officer')]/following::div[1]")
	private WebElementFacade val_RQToOfficer;

	// View IRtransferRequest Xpaths

	@FindBy(xpath = "//div[contains(text(),'IR Transfer Reason')]")
	private WebElementFacade lbl_IRTransferReason;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer Reason')]/following::div[1]")
	private WebElementFacade val_IRTransferReason;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer Status')]")
	private WebElementFacade lbl_IRTransferStatus;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer Status')]/following::div[1]")
	private WebElementFacade val_IRTransferStatus;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer Withdrawn Reason')]")
	private WebElementFacade lbl_IRTransferWithdrawnReason;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer Withdrawn Reason')]/following::div[1]")
	private WebElementFacade val_IRTransferWithdrawnReason;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer From Provider')]")
	private WebElementFacade lbl_IRTransferFromProvider;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer From Provider')]/following::div[1]")
	private WebElementFacade val_IRTransferFromProvider;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer From Team')]")
	private WebElementFacade lbl_IRTransferFromTeam;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer From Team')]/following::div[1]")
	private WebElementFacade val_IRTransferFromTeam;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer From Officer')]")
	private WebElementFacade lbl_IRTransferFromOfficer;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer From Officer')]/following::div[1]")
	private WebElementFacade val_IRTransferFromOfficer;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer To Provider')]")
	private WebElementFacade lbl_IRTransferToProvider;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer To Provider')]/following::div[1]")
	private WebElementFacade val_IRTransferToProvider;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer To Team')]")
	private WebElementFacade lbl_IRTransferToTeam;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer To Team')]/following::div[1]")
	private WebElementFacade val_IRTransferToTeam;

	@FindBy(xpath = "//div[contains(text(),'IR Transfer To Officer')]")
	private WebElementFacade lbl_IRTransferToOfficer;
	@FindBy(xpath = "//div[contains(text(),'IR Transfer To Officer')]/following::div[1]")
	private WebElementFacade val_IRTransferToOfficer;

	public void validateOMTransferRequest() {

		Assert.assertTrue("OM Transfer Reason label not matched",
				lbl_OMReason.getText().trim().equals("OM Transfer Reason"));
		Assert.assertTrue("OM Transfer Status label not matched",
				lbl_OMStatus.getText().trim().equals("OM Transfer Status"));
		Assert.assertTrue("OM Transfer Withdrawn Reason label not matched",
				lbl_OMWithdrawn.getText().trim().equals("OM Transfer Withdrawn Reason"));
		Assert.assertTrue("OM Transfer From Provider label not matched",
				lbl_OMFromProvider.getText().trim().equals("OM Transfer From Provider"));
		Assert.assertTrue("OM Transfer From Responsible Team label not matched",
				lbl_OMFromTeam.getText().trim().equals("OM Transfer From Responsible Team"));
		Assert.assertTrue("OM Transfer From Respsonsible Officer label not matched",
				lbl_OMFromOfficer.getText().trim().equals("OM Transfer From Responsible Officer"));
		Assert.assertTrue("OM Transfer To Provider label not matched",
				lbl_OMToProvider.getText().trim().equals("OM Transfer To Provider"));
		Assert.assertTrue("OM Transfer To Responsible Team label not matched",
				lbl_OMToTeam.getText().trim().equals("OM Transfer To Responsible Team"));
		Assert.assertTrue("OM Transfer To Responsible Officer label not matched",
				lbl_OMToOfficer.getText().trim().equals("OM Transfer To Responsible Officer"));

		Assert.assertTrue("OM Transfer Reason value not matched",
				val_OMReason.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20(
						"INTER AREA TRANSFER REASON", ReadXMLData.getXMLData("inboundXML/ctr.xml",
								"//OMTransferRequest", "./OMTransferReason"))));
		Assert.assertTrue("OMTransferStatus value not matched",

				val_OMStatus.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("TRANSFER STATUS",
						ReadXMLData.getXMLData("inboundXML/ctr.xml", "//OMTransferRequest", "./OMTransferStatus"))));

		Assert.assertTrue("OMTransferFromProvider value not matched",
				val_OMFromProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//OMTransferRequest", "./OMTransferFromProvider"))));
		;

		Assert.assertTrue("OMTransferFromResponsibleTeam value not matched",
				val_OMFromTeam.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//OMTransferRequest", "./OMTransferFromResponsibleTeam")));

		Assert.assertTrue("OMTransferFromRespsonsibleOfficer value not matched",
				val_OMFromOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//OMTransferRequest", "./OMTransferFromResponsibleOfficer")));

		Assert.assertTrue("OMTransferToProvider value not matched",
				val_OMToProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//OMTransferRequest", "./OMTransferToProvider"))));

		Assert.assertTrue("OMTransferToResponsibleTeam value not matched", val_OMToTeam.getText().trim().equals(
				ReadXMLData.getXMLData("inboundXML/ctr.xml", "//OMTransferRequest", "./OMTransferToResponsibleTeam")));

		Assert.assertTrue("OMTransferToResponsibleOfficer value not matched",
				val_OMToOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//OMTransferRequest", "./OMTransferToResponsibleOfficer")));
	}

	public void validateLCTransferRequest() {

		Assert.assertTrue("LC Transfer Reason label not matched",
				lbl_LCReason.getText().trim().equals("LC Transfer Reason"));
		Assert.assertTrue("LC Transfer Status label not matched",
				lbl_LCStatus.getText().trim().equals("LC Transfer Status"));
		Assert.assertTrue("LC Transfer Withdrawn Reason label not matched",
				lbl_LCWithdrawn.getText().trim().equals("LC Transfer Withdrawn Reason"));
		Assert.assertTrue("LC Transfer From Provider label not matched",
				lbl_LCFromProvider.getText().trim().equals("LC Transfer From Provider"));
		Assert.assertTrue("LC Transfer From Responsible Team label not matched",
				lbl_LCFromTeam.getText().trim().equals("LC Transfer From Responsible Team"));
		Assert.assertTrue("LC Transfer From Respsonsible Officer label not matched",
				lbl_LCFromOfficer.getText().trim().equals("LC Transfer From Respsonsible Officer"));
		Assert.assertTrue("LC Transfer To Provider label not matched",
				lbl_LCToProvider.getText().trim().equals("LC Transfer To Provider"));
		Assert.assertTrue("LC Transfer To Responsible Team label not matched",
				lbl_LCToTeam.getText().trim().equals("LC Transfer To Responsible Team"));
		Assert.assertTrue("LC Transfer To Responsible Officer label not matched",
				lbl_LCToOfficer.getText().trim().equals("LC Transfer To Responsible Officer"));

		Assert.assertTrue("LC Transfer Reason value not matched",
				val_LCReason.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20(
						"INTER AREA LICENCE TRANSFER REASON", ReadXMLData.getXMLData("inboundXML/ctr.xml",
								"//LCTransferRequest", "./LCTransferReason"))));
		Assert.assertTrue("LCTransferStatus value not matched",

				val_LCStatus.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("TRANSFER STATUS",
						ReadXMLData.getXMLData("inboundXML/ctr.xml", "//LCTransferRequest", "./LCTransferStatus"))));

		Assert.assertTrue("LCTransferFromProvider value not matched",
				val_LCFromProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//LCTransferRequest", "./LCTransferFromProvider"))));
		;

		Assert.assertTrue("LCTransferFromResponsibleTeam value not matched",
				val_LCFromTeam.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//LCTransferRequest", "./LCTransferFromResponsibleTeam")));

		Assert.assertTrue("LCTransferFromRespsonsibleOfficer value not matched",
				val_LCFromOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//LCTransferRequest", "./LCTransferFromResponsibleOfficer")));

		Assert.assertTrue("LCTransferToProvider value not matched",
				val_LCToProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//LCTransferRequest", "./LCTransferToProvider"))));

		Assert.assertTrue("LCTransferToResponsibleTeam value not matched", val_LCToTeam.getText().trim().equals(
				ReadXMLData.getXMLData("inboundXML/ctr.xml", "//LCTransferRequest", "./LCTransferToResponsibleTeam")));

		Assert.assertTrue("LCTransferToResponsibleOfficer value not matched",
				val_LCToOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//LCTransferRequest", "./LCTransferToResponsibleOfficer")));
	}

	public void validateRQTransferRequest() {

		Assert.assertTrue("RQ Transfer Reason label not matched",
				lbl_RQReason.getText().trim().equals("RQ Transfer Reason"));
		Assert.assertTrue("RQ Transfer Status label not matched",
				lbl_RQStatus.getText().trim().equals("RQ Transfer Status"));
		Assert.assertTrue("RQ Transfer Withdrawn Reason label not matched",
				lbl_RQWithdrawn.getText().trim().equals("RQ Transfer Withdrawn Reason"));
		Assert.assertTrue("RQ Transfer From Provider label not matched",
				lbl_RQFromProvider.getText().trim().equals("RQ Transfer From Provider"));
		Assert.assertTrue("RQ Transfer From Responsible Team label not matched",
				lbl_RQFromTeam.getText().trim().equals("RQ Transfer From Responsible Team"));
		Assert.assertTrue("RQ Transfer From Responsible Officer label not matched",
				lbl_RQFromOfficer.getText().trim().equals("RQ Transfer From Responsible Officer"));
		Assert.assertTrue("RQ Transfer To Provider label not matched",
				lbl_RQToProvider.getText().trim().equals("RQ Transfer To Provider"));
		Assert.assertTrue("RQ Transfer To Responsible Team label not matched",
				lbl_RQToTeam.getText().trim().equals("RQ Transfer To Responsible Team"));
		Assert.assertTrue("RQ Transfer To Responsible Officer label not matched",
				lbl_RQToOfficer.getText().trim().equals("RQ Transfer To Responsible Officer"));

		Assert.assertTrue("RQ Transfer Reason value not matched",
				val_RQReason.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20(
						"INTER AREA REQUIREMENT TRANSFER REASON", ReadXMLData.getXMLData("inboundXML/ctr.xml",
								"//RQTransferRequest", "./RQTransferReason"))));
		Assert.assertTrue("RQTransferStatus value not matched",

				val_RQStatus.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("TRANSFER STATUS",
						ReadXMLData.getXMLData("inboundXML/ctr.xml", "//RQTransferRequest", "./RQTransferStatus"))));

		Assert.assertTrue("RQTransferFromProvider value not matched",
				val_RQFromProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//RQTransferRequest", "./RQTransferFromProvider"))));
		;

		Assert.assertTrue("RQTransferFromResponsibleTeam value not matched",
				val_RQFromTeam.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//RQTransferRequest", "./RQTransferFromResponsibleTeam")));

		Assert.assertTrue("RQTransferFromRespsonsibleOfficer value not matched",
				val_RQFromOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//RQTransferRequest", "./RQTransferFromResponsibleOfficer")));

		Assert.assertTrue("RQTransferToProvider value not matched",
				val_RQToProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//RQTransferRequest", "./RQTransferToProvider"))));

		Assert.assertTrue("RQTransferToResponsibleTeam value not matched", val_RQToTeam.getText().trim().equals(
				ReadXMLData.getXMLData("inboundXML/ctr.xml", "//RQTransferRequest", "./RQTransferToResponsibleTeam")));

		Assert.assertTrue("RQTransferToResponsibleOfficer value not matched",
				val_RQToOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//RQTransferRequest", "./RQTransferToResponsibleOfficer")));
	}

	public void validateIRTransferRequest() {

		Assert.assertTrue("IR Transfer Reason value not matched",
				val_IRTransferReason.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20(
						"INTER AREA REQUIREMENT TRANSFER REASON", ReadXMLData.getXMLData("inboundXML/ctr.xml",
								"//IRTransferRequest", "./IRTransferReason"))));

		Assert.assertTrue("IR Transfer Status value not matched",
				val_IRTransferStatus.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20(
						"TRANSFER STATUS", ReadXMLData.getXMLData("inboundXML/ctr.xml", "//IRTransferRequest",
								"./IRTransferStatus"))));

		Assert.assertTrue("IR Transfer Withdrawn Reason label not matched",
				lbl_IRTransferWithdrawnReason.getText().trim().equals("IR Transfer Withdrawn Reason"));

		Assert.assertTrue("IR Transfer From Provider value not matched",
				val_IRTransferFromProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//IRTransferRequest", "./IRTransferFromProvider"))));
		;

		Assert.assertTrue("IR Transfer From Team label not matched",
				lbl_IRTransferFromTeam.getText().trim().equals("IR Transfer From Responsible Team"));

		Assert.assertTrue("IR Transfer From Officer value not matched",
				val_IRTransferFromOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//IRTransferRequest", "./IRTransferFromResponsibleOfficer")));

		Assert.assertTrue("IR Transfer To Provider value not matched",
				val_IRTransferToProvider.getText().trim()
						.equals(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("PROVIDER", ReadXMLData
								.getXMLData("inboundXML/ctr.xml", "//IRTransferRequest", "./IRTransferToProvider"))));

		Assert.assertTrue("IR Transfer To Responsible Team value not matched",
				val_IRTransferToTeam.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//IRTransferRequest", "./IRTransferToResponsibleTeam")));

		Assert.assertTrue("IR Transfer To Responsible Officer value not matched",
				val_IRTransferToOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/ctr.xml",
						"//IRTransferRequest", "./IRTransferToResponsibleOfficer")));
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_OffManTransferRequest;
	}

}

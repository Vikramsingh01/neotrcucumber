package com.meganexus.pageObjectLib;

	import com.meganexus.genericLib.GetSRD_or_NSRDValue;
	import com.meganexus.genericLib.ReadXMLData;

	import junit.framework.Assert;
	import net.serenitybdd.core.annotations.findby.FindBy;
	import net.serenitybdd.core.pages.WebElementFacade;

	@SuppressWarnings("deprecation")
	public class ReleasePage extends EventViewPage {
		
		@FindBy(xpath = "//h2[text()='VIEW release']")
		private WebElementFacade txt_ReleaseTitle;
	   @FindBy(xpath = "//a[contains(text(),'Release')]")
		private WebElementFacade lnk_Release;
	   
	   @FindBy(xpath = "//button[text()='Back']")
		private WebElementFacade btn_back;
	   
	   @FindBy(xpath = "//div[contains(text(),'release Date ')]")
	   private WebElementFacade label_identifierType;
		
	   @FindBy(xpath = "//div[contains(text(),'release Type')]")
	   private WebElementFacade label_identifier;
		
	   @FindBy(xpath = "//div[contains(text(),'release Date ')]//following-sibling::*")
	   private WebElementFacade value_releaseDate;
		
	   @FindBy(xpath = "//div[contains(text(),'release Type')]//following-sibling::*")
	   private WebElementFacade value_releaseType;
	   
	   
		public void releaseViewFieldVerification() {
			Assert.assertTrue("View release text is not available", txt_ReleaseTitle.getText().equals("VIEW release"));
			Assert.assertTrue("back btn is not available", btn_back.getText().equals("BACK"));
			Assert.assertTrue("release Date not matched", value_releaseDate.getText().trim()
					.equals(ReadXMLData.getXMLData("inboundXML/AO.xml", "//Release", "./ReleaseDate")));
			Assert.assertTrue("Release Type not matched",value_releaseType.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("RELEASE TYPE",ReadXMLData.getXMLData("inboundXML/AO.xml", "//Release", "./ReleaseType"))));

		}
		
		//Function to check flow after clicking on Back button
		public void clickBackBtn(){
			
			btn_back.click();
			waitABit(1000);
			Assert.assertTrue("View Release Page Title is not available", txt_ReleaseTitle.getText().equals("VIEW release"));
		}

		@Override
		public WebElementFacade getUniqueElement() {
			
			return lnk_Release;
		}
	
}

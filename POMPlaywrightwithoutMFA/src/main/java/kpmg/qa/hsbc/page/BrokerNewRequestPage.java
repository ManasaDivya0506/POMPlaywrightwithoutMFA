package kpmg.qa.hsbc.page;

import java.util.HashMap;
import java.util.Map;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator.SelectTextOptions;
import com.microsoft.playwright.Page;

import kpmg.qa.hsbc.excelutil.GetInputDataFromExcel;


public class BrokerNewRequestPage {


	private Page page;
  //*********Locator****************
	//private String BNewRequestbutton ="//button[text()='New request']";
	private String BNewReqframe ="xpath=//iframe";
	private String Requesttype ="#reqtypesel";
	private String Requestsubtype ="#reqsubtypesel";
	private String AppExists ="#appExists";
	private String ProspectName ="#prosp1";
	private String AddSecuritybutton = "//div[@id='securitysection']/div/div/button";
	private String SecPropertytype = "#securityType";
	private String SecValue = "#securityvalue";
	private String SecPurpose ="#primaryPurpose";
	private String SecSubmitbutton ="//div[@id='myModalSecurity']/div/div/div[@class='modal-item-button']/button[@class='primaryButton']";
	private String AddLoansbutton = "xpath=//div[@id='loannew']/button";
	private String Loanlimit = "#loanlimit";
	private String ProductNameselect = "#productinfo";
	private String LoanFixedRateLock = "#fixedrate";
	private String LoanSubmitbutton = "//div[@id='myModalLoanInfo']/div/div/div[@class='modal-item-button']/button[@class='primaryButton']";
	private String CalculateTotalbutton = "#calcBtn";
	private String AddLoansforpricingbutton = "//div[@id='loanprice']/button";
	private String loanselectionforpricing = "#loanSelSearch";
	private String loanselection ="#loan1";
	private String loanselectbutton = "//div[@id='myModalSelectLoan']/div/div/button[contains(text(),'Select')]";
			//"//div[@id='myModalSelectLoan']/div/div[@class='modal-item-button']/button[contains(text(),'Select')]"
	private String loansCompoff = "#competitoroffer";
	private String RequestEndrate = "#reqendrate";
	private String Addloansforpricingsubmitbutton ="//div[@id='myModalLoanPricing']/div/div[@class='modal-item-button']/button[@class='primaryButton']";
	private String RequestOfferbutton = "//div[@id='requestOffer']/button[@class='secButton']";
	private String LoanRequestorActionselection ="#tdval1";
	private String CusAckcheckbox ="#check";
	private String finalSRsubmitbutton = "//button[@id='finalsubmit']";
	private String SRNumber = "#generatedNum";
	private String Backtohome = "//div[@class='xrm-attribute-value']/div[@id='submitModal']/div/div/div[@class='submitbutton-modal']/button";
	

	//******** Page Construction***********
	public BrokerNewRequestPage(Page page ) {
        this.page = page;
	}
	//****** Page Actions *********//
	//New Deal No SR creation
	public MySRRequestpage newdealNoSRCreation(Map data)
	{
		page.frameLocator(BNewReqframe).locator(Requesttype).selectOption((String) data.get("Reqtype"));
	    page.frameLocator(BNewReqframe).locator(Requestsubtype).selectOption((String) data.get("Reqsubtype"));
	    page.frameLocator(BNewReqframe).locator(AppExists).selectOption((String) data.get("ApplicationExists"));
	     page.frameLocator(BNewReqframe).locator(ProspectName).click();
	     page.frameLocator(BNewReqframe).locator(ProspectName).fill((String) data.get("ProspName"));
	     page.frameLocator(BNewReqframe).locator(ProspectName).press("Tab");
	     //****************** Adding Security details *******************************//
	     page.frameLocator(BNewReqframe).locator(AddSecuritybutton).click();
	     page.frameLocator(BNewReqframe).locator(SecPropertytype).selectOption((String) data.get("Propertytype"));
	     page.frameLocator(BNewReqframe).locator(SecValue).fill((String) data.get("Value"));
	     page.frameLocator(BNewReqframe).locator(SecPurpose).selectOption((String) data.get("Purpose"));
	     page.frameLocator("xpath=//iframe").locator(SecSubmitbutton).click();
	     //****************** Adding Loan details *******************************//
	     page.frameLocator(BNewReqframe).locator(AddLoansbutton).click();
	     
	 	page.frameLocator(BNewReqframe).locator(Loanlimit).fill((String) data.get("limit"));
	     page.frameLocator(BNewReqframe).locator(ProductNameselect).selectOption((String) data.get("ProductName"));

	 	page.frameLocator(BNewReqframe).locator(LoanFixedRateLock).selectOption((String) data.get("FixedRateLock"));
	     page.frameLocator(BNewReqframe).locator(LoanSubmitbutton).click();
	     //************* Calculate offer ************************************//
	     page.frameLocator(BNewReqframe).locator(CalculateTotalbutton).click();
	     //************* Adding loans for Pricing Offer section***************************//
	     page.frameLocator(BNewReqframe).locator(AddLoansforpricingbutton).click();
	     page.frameLocator(BNewReqframe).locator(loanselectionforpricing).click();
	     page.frameLocator(BNewReqframe).locator(loanselection).check();
	     page.frameLocator(BNewReqframe).locator(loanselectbutton).click();
	     page.frameLocator(BNewReqframe).locator(loansCompoff).selectOption((String) data.get("CompOff"));
	     page.frameLocator(BNewReqframe).locator(RequestEndrate).fill((String) data.get("RequestedEndrate"));
	     page.frameLocator(BNewReqframe).locator(RequestEndrate).press("Tab");
	     page.frameLocator(BNewReqframe).locator(Addloansforpricingsubmitbutton).click();
	     //**************** Clicking Request offer **********************//
	     page.frameLocator(BNewReqframe).locator(RequestOfferbutton).click();
	     page.frameLocator(BNewReqframe).locator(LoanRequestorActionselection).selectOption((String) data.get("RequestorAction"));
	     page.frameLocator(BNewReqframe).locator(CusAckcheckbox).check();

		    page.frameLocator(BNewReqframe).locator(finalSRsubmitbutton).click();
		    page.waitForTimeout(20000);
		   // page.waitForSelector(SRNumber);
		    String SR = page.frameLocator(BNewReqframe).locator(SRNumber).textContent();
		    System.out.println("Service Requested created and number is " +SR);
		    page.frameLocator(BNewReqframe).locator(Backtohome).click();
		    

		
		return new MySRRequestpage(page);
	}

	
	
    

}
	
	
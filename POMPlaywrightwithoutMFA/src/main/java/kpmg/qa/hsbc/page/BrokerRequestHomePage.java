package kpmg.qa.hsbc.page;

import java.util.HashMap;

import com.microsoft.playwright.Page;

public class BrokerRequestHomePage {

	private Page page;
	   HashMap<String, String> testdata;
	//*********Locator****************
		private String BNewRequestbutton ="//button[text()='New request']";
		private String BReqframe ="xpath=//iframe";
		//private String BSettleLoans ="//span[text()='Settled Loans']";
		
		//******** Page Construction***********
	public BrokerRequestHomePage(Page page) {
		// TODO Auto-generated constructor stub
		this.page = page;
	}
	//****** Page Actions *********//
	public BrokerNewRequestPage NewRequestbuttonclick()
	{
		page.frameLocator(BReqframe).locator(BNewRequestbutton).click();
        System.out.println("Opened Request tab");
     
		return new BrokerNewRequestPage(page);
	}
}

package kpmg.qa.hsbc.page;

import com.microsoft.playwright.Page;

public class BrokerHomePage {
	Page page;
	//*********Locator****************
	private String BRequests ="//span[text()='Requests']";
	private String BApplications ="//span[text()='Applications']";
	private String BSettleLoans ="//span[text()='Settled Loans']";
	
	//******** Page Construction***********
	public BrokerHomePage(Page page) {
		// TODO Auto-generated constructor stub
	this.page=page;
	}
	//****** Page Actions *********//
	public BrokerRequestHomePage BRequestClick()
	{
		page.click(BRequests);
		return new BrokerRequestHomePage(page);
	}
	
	public BrokerApplicationsHomePage BApplicationClick()
	{
		page.click(BApplications);
		return new BrokerApplicationsHomePage(page);
	}

	public BrokerSettledLoansHomePage BSettledLoansClick()
	{
		page.click(BSettleLoans);
		return new BrokerSettledLoansHomePage(page);
	}

}

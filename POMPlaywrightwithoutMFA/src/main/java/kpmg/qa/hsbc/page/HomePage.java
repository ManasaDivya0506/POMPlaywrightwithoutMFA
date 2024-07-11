package kpmg.qa.hsbc.page;

import com.microsoft.playwright.Page;

public class HomePage {
private Page page;
//*********Locator****************
private String brokerselection = "text=Broker log on";
//private String brokerpage = ".heading";

//*********** Page Construction*************
public  HomePage(Page page)
{
	this.page=page;
}

//****** Page Actions *********//
public String getHomePagetitle()
{
	
	String title = page.title();
	System.out.println("page title is " +title);
	return title;
}
public String getHomeURL()
{
	String urls =  page.url();
	System.out.println("page url is" +urls );
	return urls;
}
public LoginPage selectBrokerpage()
{
	page.click(brokerselection);
	//String pconent = page.textContent(brokerpage);
	//System.out.println("Page content" +pconent);
	//return pconent;
	return new LoginPage(page);
}

}

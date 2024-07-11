package kpmg.qa.hsbc.test;

import org.testng.annotations.Test;

import kpmg.qa.hsbc.base.BaseTest;

public class BrokerHomePageTest extends BaseTest {
	@Test(priority=1)
	public void BHomePageRequestClick()
	{
	
		loginpage = homepage.selectBrokerpage();
		//**************Unhide this after MFA activation
		//mfpage = loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		//bhomepage = mfpage.MFAContinueclick();
		//********* hide this after MFA activation
		bhomepage = loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		bhomepage.BRequestClick();
		bhomepage.BRequestClick();
		
	}
	//@Test(priority=2)
	

}

package kpmg.qa.hsbc.test;

import org.testng.annotations.Test;

import kpmg.qa.hsbc.base.BaseTest;

public class BrokerRequesthomepageTest extends BaseTest {
	
	@Test
	public void NewRequestpageopen()
	{
		/*
		loginpage = homepage.selectBrokerpage();
		//mfpage = loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		bhomepage = mfpage.MFAContinueclick();
		brequesthomepage = bhomepage.BRequestClick();
		brequesthomepage.NewRequestbuttonclick();
		*/
		loginpage = homepage.selectBrokerpage();
		//**************Unhide this after MFA activation
		//mfpage = loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		//bhomepage = mfpage.MFAContinueclick();
		//********* hide this after MFA activation
		bhomepage = loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		bhomepage.BRequestClick();
		brequesthomepage= bhomepage.BRequestClick();
		brequesthomepage.NewRequestbuttonclick();
	}
	

}

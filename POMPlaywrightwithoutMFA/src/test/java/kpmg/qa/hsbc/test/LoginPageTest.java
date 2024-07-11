package kpmg.qa.hsbc.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import kpmg.qa.hsbc.base.BaseTest;
import kpmg.qa.hsbc.constants.AppConstants;

public class LoginPageTest extends BaseTest {
	@Test(priority=1)
	public void BrokerselectionPageTest()
	{
		loginpage = homepage.selectBrokerpage();
		String BrokerLogintitle = loginpage.getBrokerLoginPageTitle();
		System.out.println("Broker page title :" +BrokerLogintitle);
		Assert.assertEquals(BrokerLogintitle, AppConstants.BLOGIN_PAGE_TITLE);
	}
	@Test(priority=2)
	public void forgotpwdlinkexists()
	{
		Assert.assertTrue(loginpage.isForgotPasswordlinkExists());
	}
	@Test(priority=3)
	public void BrokerLoginTest()
	{
		loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		
	}

}

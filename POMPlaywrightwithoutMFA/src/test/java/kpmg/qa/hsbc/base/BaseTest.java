package kpmg.qa.hsbc.base;

import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;

import kpmg.qa.hsbc.excelutil.GetInputDataFromExcel;
import kpmg.qa.hsbc.factory.playwrightFactory;
import kpmg.qa.hsbc.page.BrokerApplicationsHomePage;
import kpmg.qa.hsbc.page.BrokerHomePage;
import kpmg.qa.hsbc.page.BrokerNewRequestPage;
import kpmg.qa.hsbc.page.BrokerRequestHomePage;
import kpmg.qa.hsbc.page.BrokerSettledLoansHomePage;
import kpmg.qa.hsbc.page.HomePage;
import kpmg.qa.hsbc.page.LoginPage;
import kpmg.qa.hsbc.page.MySRRequestpage;


public class BaseTest {
	playwrightFactory pf;
    private Page page;
	protected HomePage homepage;
	protected Properties prop;
	protected LoginPage loginpage;
	//protected MFAscreenPage mfpage;
	protected BrokerHomePage bhomepage;
	protected BrokerRequestHomePage brequesthomepage;
	protected BrokerApplicationsHomePage bapphomepage;
	protected BrokerSettledLoansHomePage bsetloanshomepage;
	protected BrokerNewRequestPage BNewReqPage;
	protected GetInputDataFromExcel inputdata;
	protected MySRRequestpage mySRpage;
	@BeforeClass
	public void setup()
	{
	pf= new playwrightFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop);
		homepage = new HomePage(page);	
	}	
	@AfterClass
	public void teardown()
	{
		page.context().browser().close();
	}
}

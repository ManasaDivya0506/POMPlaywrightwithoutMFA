package kpmg.qa.hsbc.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import jdk.internal.util.xml.impl.Input;
import kpmg.qa.hsbc.base.BaseTest;
import kpmg.qa.hsbc.excelutil.GetInputDataFromExcel;
import kpmg.qa.hsbc.page.BrokerNewRequestPage;

public class BrokerNewRequestPageTest extends BaseTest {
	@Test(priority =1)
	public void pagenavigation()
	{
		loginpage = homepage.selectBrokerpage();
		bhomepage = loginpage.BrokerLogin(prop.getProperty("username").trim(), prop.getProperty("Password").trim());
		bhomepage.BRequestClick();
		brequesthomepage= bhomepage.BRequestClick();
		BNewReqPage = brequesthomepage.NewRequestbuttonclick();
		
	}
	
	@Test(priority =2 ,dataProvider = "exceldata123", dataProviderClass = GetInputDataFromExcel.class)
	public void NewSRCreation(Map data)

	{	
		BNewReqPage.newdealNoSRCreation(data);
	}
	}
		
	


 
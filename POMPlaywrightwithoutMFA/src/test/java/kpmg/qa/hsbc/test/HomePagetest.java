package kpmg.qa.hsbc.test;



import org.testng.Assert;
import org.testng.annotations.Test;

import kpmg.qa.hsbc.base.BaseTest;
import kpmg.qa.hsbc.constants.AppConstants;

public class HomePagetest extends BaseTest{

	
	@Test
	public void homePageTitleTest() {
		String actualTitle = homepage.getHomePagetitle();
		Assert.assertEquals(actualTitle, AppConstants.HOME_PAGE_TITLE);
	}

	@Test
	public void homePageURLTest() {
		String actualURL = homepage.getHomeURL();
		Assert.assertEquals(actualURL, AppConstants.LOGIN_URL);
	}

/*removed content check */

}

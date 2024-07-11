package kpmg.qa.hsbc.page;

import com.microsoft.playwright.Page;

public class LoginPage {
	Page page;
	//****************************** Locator***************//
   private String email = "#email";
   private String password = "#password";
   private String logonbutton = "#next";
   private String forgotpassword = "a:text('Forgot password')";
   
   //******* Page Construction **********//
   public LoginPage(Page page)
   {
	   this.page = page;
   }
   
   //********* Page Actions *********//
   // To check Log in Title
   public String getBrokerLoginPageTitle()
   {
	   return page.title();
   }
   //To verify forgot password link
   public boolean isForgotPasswordlinkExists()
   {
	  System.out.println("Checked forgot link:" +page.textContent(forgotpassword)); 
	  return page.isVisible(forgotpassword);
   }
   
   //Enter log in details
   public BrokerHomePage BrokerLogin(String BrokerUSername, String BrokerPassword)
   {
   	page.fill(email, BrokerUSername);
   	page.fill(password, BrokerPassword);
   	page.click(logonbutton);	
   	//unhide after MFA activation
   	//return new MFAscreenPage(page);
   	//hide it after MFA activation
   	return new BrokerHomePage(page);
   }
   public Passwordsetup forgotpasswordlink()
   {
	   page.click(forgotpassword);
	   return new Passwordsetup();
   }
}
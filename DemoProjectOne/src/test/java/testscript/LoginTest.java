package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test
	public void loginValidCrendentials() throws IOException
	{
		//String user="admin";
		//String pass="admin";
String user=ExcelUtility.getStringData(1,0,"Loginpage");
String pass=ExcelUtility.getStringData(1, 1, "Loginpage");
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUsername(user);
loginpage.enterPassword(pass);
loginpage.signin();
boolean isdashboarddisplay=loginpage.isHomePageLoaded();
Assert.assertTrue(isdashboarddisplay);
		
	}
	@Test(retryAnalyzer=retry.Retry.class)
public void loginInvalidCrendentialsPass() throws IOException
	{
		//String user="admin";
		//String pass="123";
		String user=ExcelUtility.getStringData(2,0,"Loginpage");
		String pass=ExcelUtility.getStringData(2, 1, "Loginpage");		
		
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUsername(user);
loginpage.enterPassword(pass);
loginpage.signin();
boolean isAlertMessageDisplayed=loginpage.isAlertDisplayed();
Assert.assertTrue(isAlertMessageDisplayed);

	
	}	
	@Test
	public void loginInvalidCrendentialsUser() throws IOException
	{
		//String user="123";
		//String pass="admin";
		
		String user=ExcelUtility.getStringData(3,0,"Loginpage");
		String pass=ExcelUtility.getStringData(3, 1, "Loginpage");		
				
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUsername(user);
loginpage.enterPassword(pass);
loginpage.signin();
boolean isAlertMessageDisplayed=loginpage.isAlertDisplayed();
Assert.assertTrue(isAlertMessageDisplayed);

	
	}	
	@Test
	public void loginInvalidCrendentialsBoth() throws IOException
	{
		//String user="123";
		//String pass="123";
		String user=ExcelUtility.getStringData(4,0,"Loginpage");
		String pass=ExcelUtility.getStringData(4, 1, "Loginpage");		
			
		
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUsername(user);
loginpage.enterPassword(pass);
loginpage.signin();
boolean isAlertMessageDisplayed=loginpage.isAlertDisplayed();
Assert.assertTrue(isAlertMessageDisplayed);

	
	}	

}







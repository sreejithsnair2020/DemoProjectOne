package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

@Test
public void manageNews() throws IOException
{
	//String news="No name";
	//String user="admin";
	//String pass="admin";
	String user=ExcelUtility.getStringData(1,0,"Loginpage");
	String pass=ExcelUtility.getStringData(1, 1, "Loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsername(user);
	loginpage.enterPassword(pass);
	loginpage.signin();
	
	ManageNewsPage managenews=new ManageNewsPage(driver);
	managenews.clickMoreInfo();
	managenews.clickNewButton();
	String news=ExcelUtility.getStringData(0,0,"Managenews");
	managenews.enterTheNews(news);
	
	
	managenews.clickSaveButton();
	boolean alertdisplayed=managenews.isAlertDisplayed();
	Assert.assertTrue(alertdisplayed);
}
	public void newsUpdate() throws IOException
	{
	
		String user=ExcelUtility.getStringData(1,0,"Loginpage");
		String pass=ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user);
		loginpage.enterPassword(pass);
		loginpage.signin();
		String news=ExcelUtility.getStringData(0, 1, "Managenews");
		ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews.clickMoreInfo();
		
	managenews.updatebutton();
	managenews.textarea(news);
	managenews.updateicon();
}
}


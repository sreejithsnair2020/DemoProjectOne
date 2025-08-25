package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	@Test
	public void loginBothCorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="admin";
		username.sendKeys(user);
		 
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="admin";
		password.sendKeys(pass);
		
		WebElement sigin=driver.findElement(By.xpath("//button[@type='submit']"));
		sigin.click();
		
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageloaded=dashboard.isDisplayed();
		Assert.assertTrue(ishomepageloaded);
	
	}
@Test
	public void usernameCorrectPasswordIncorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="admin";
		username.sendKeys(user);
		 
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="123";
		password.sendKeys(pass);
		
		WebElement sigin=driver.findElement(By.xpath("//button[@type='submit']"));
		sigin.click();
		
		WebElement dashboard=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isalertdisplayed=dashboard.isDisplayed();
		Assert.assertTrue(isalertdisplayed);
		
	}
@Test
public void usernameIncorrectPasswordCorrect()
{
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	String user="123";
	username.sendKeys(user);
	 
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	String pass="admin";
	password.sendKeys(pass);
	
	WebElement sigin=driver.findElement(By.xpath("//button[@type='submit']"));
	sigin.click();
	
	WebElement dashboard=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean isalertdisplayed=dashboard.isDisplayed();
	Assert.assertTrue(isalertdisplayed);
}	 
@Test
public void usernameIncorrectPasswordInCorrect()
{
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	String user="123";
	username.sendKeys(user);
	 
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	String pass="123";
	password.sendKeys(pass);
	
	WebElement sigin=driver.findElement(By.xpath("//button[@type='submit']"));
	sigin.click();
	
	WebElement dashboard=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean isalertdisplayed=dashboard.isDisplayed();
	Assert.assertTrue(isalertdisplayed);
}	 
@Test
public void loginWithNoCredentials()
{
	WebElement sigin=driver.findElement(By.xpath("//button[@type='submit']"));
	sigin.click();
}
}


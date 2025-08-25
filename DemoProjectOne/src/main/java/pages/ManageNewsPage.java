package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement newstext ;
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=7119&page_ad=1']")WebElement updatebutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement textarea ;
	@FindBy(xpath="//button[@type='submit']")WebElement updateicon;

	public WebDriver driver;
 public ManageNewsPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
public void clickMoreInfo()
{
	moreinfo.click();
}
public void clickNewButton()
{
	newbutton.click();
}
public void enterTheNews(String news)
{
	newstext.sendKeys(news);
}
public void clickSaveButton()
{
	savebutton.click();
}
public boolean isAlertDisplayed()
{
	return alert.isDisplayed();
}
public void updatebutton()
{
	updatebutton.click();
}
public void textarea(String text)
{
	textarea.clear();
	textarea.sendKeys(text);
}

public void updateicon()
{
	updateicon.click();
}
}
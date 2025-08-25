package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
public static final int IMPLICITWAIT=5;
public static final int EXPLICITWAIT=10;

public void waitForElementToBeClickable(WebDriver driver,WebElement element)
{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
wait.until(ExpectedConditions.elementToBeClickable(element));
}
}
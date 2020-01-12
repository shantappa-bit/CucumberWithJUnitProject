package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper 
{
	WebDriver driver;
	
    public WaitHelper(WebDriver driver)
    {
    	//re intialization 
    	//instaed of thread.sleeep every time we can call this we nvr we need to wait for the webelement 
    	//to display in the web page 
    	this.driver=driver;
    }
    
    public void WaitforElement(WebElement element,long timeOutInSeconds)
    {
    	WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
    	wait.until(ExpectedConditions.visibilityOf(element));
    	
    }
}	

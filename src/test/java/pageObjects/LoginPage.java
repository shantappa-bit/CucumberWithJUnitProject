package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="Email")
	private WebElement Email_txt;
	
	@FindBy(id="Password")
	private WebElement password_txt;
		
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout_link;
	
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }
    public void setUserName(String email)
    {
    	Email_txt.clear();
    	Email_txt.sendKeys(email);
    }
    public void setPassword(String password)
    {
    	password_txt.clear();
    	password_txt.sendKeys(password);
    }
    public void click_login(){
    	login_btn.click();
    }
    public void click_logout()
    {
    	try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	logout_link.click();
    }
    
}

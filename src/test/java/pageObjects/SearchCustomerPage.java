package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage
{
	WaitHelper waithelper;
	
	@FindBy(id="SearchEmail")
	private WebElement email_search;
	
	@FindBy(id="search-customers")
	private WebElement Search_button;
	@FindBy(xpath="(//table[@id='customers-grid']//tr//td[2])[1]")
	private WebElement Email_found;
	
	@FindBy(id="SearchFirstName")
	private WebElement firstname;
	
	@FindBy(id="SearchLastName")
	private WebElement lastname;
	
	public SearchCustomerPage(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
		waithelper=new WaitHelper(driver);
	}
	public void setEmailID(String email)
	{
		waithelper.WaitforElement(email_search, 30);
		email_search.sendKeys(email);
	}
	public void Click_searchbtn()
	{
		waithelper.WaitforElement(Search_button, 30);
		Search_button.click();
	}
	public String Get_Email(){
		waithelper.WaitforElement(Email_found, 30);
		return Email_found.getText();
	}
	public void setFirstName(String namefirst){
		firstname.sendKeys(namefirst);
	}
	public void setLastname(String lasname){
		lastname.sendKeys(lasname);
		
	}
	

}

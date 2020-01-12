package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AddnewCustomerPage 
{
	
	WebDriver driver;
	//declaration
	@FindBy(xpath="(//span[.='Customers'])[1]")
	private WebElement customer_menu;
	
	@FindBy(xpath="(//span[.='Customers'])[2]")
	private WebElement customer_item;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/Create']")
	private WebElement addbutton;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="FirstName")
	private WebElement first_Name;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(xpath="//button[@name='save']")
	private WebElement savebutton;
	//intialization 
	public AddnewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//actions methods or utilization methods
	
	public String getpageTitle(){
	String	result=driver.getTitle();
	return result;
	}
	
	public void click_customer_menu(){
		customer_menu.click();
	}
	public void click_customer_item(){
		customer_item.click();
	}
	public void click_addbutton(){
		addbutton.click();
	}
	public void SetEmail(String email){
		Email.sendKeys(email);
	}
	public void Setpassword(String pwd){
		password.sendKeys(pwd);
	}
	public void first_Name(String firstname){
		first_Name.sendKeys(firstname);
	}
	public void last_Name(String lstname1){
		lastname.sendKeys(lstname1);
	}
	public void click_savebtn(){
		savebutton.click();
	}
	
	
	
	
	
	

}

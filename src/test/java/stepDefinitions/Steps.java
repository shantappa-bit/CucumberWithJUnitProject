package stepDefinitions;



import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.AddnewCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;
//for every steps in login feature we have to write corresponding method here 
//stepdef class using the methods from page object class here so oly we are calling inside a method instead of identifying and perfomring actions in the stepdef class
public class Steps extends BaseClass
{
	//create a global so that we can use within any method 
	
	//cz to use/interact with the page object class we have created a reference type so that all actions method can be utilisez with the help of RV

	@Before
	public void setup() throws FileNotFoundException, IOException
	{
		configprop=new Properties();
		configprop.load(new FileInputStream("./config.properties"));
		
		
		
		if(configprop.getProperty("browser").equals("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver",configprop.getProperty("chromepath"));
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();	
		}
		else if(configprop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",configprop.getProperty("Mozillapath"));
			  driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("plz specfy the browser name properly");
		}
	}
	
	
	
	@Given("User launch chromebrowser")
	//login steps implementation
	public void user_launch_chromebrowser()
	{
	  
	  //instantiate or reintialize , it will be point towards application and constructor get invoked in poclass and all the page objects will be reintialsez to webelement addres instead of null value 
	  lp=new LoginPage(driver);
	  
	}

	@When("User opens the url {string}")
	public void user_opens_the_url(String url) 
	{//recived from feature file as a parameter and stored inside a url 
		driver.get(url);
	    
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password)
	{
		lp.setUserName(username);
		lp.setPassword(password);
	    
	}

	@When("Click on login button")
	public void click_on_login_button()
	{
		lp.click_login();
	   
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) 
	{
	    if(driver.getPageSource().contains("Login was unsuccessful"))
	    {
	    driver.close();
	    Assert.assertTrue(false);
	    }
	    else
	    {
	    	Assert.assertEquals(title,driver.getTitle());
	    }
	}

	@When("User clicks on logout link")
	public void user_clicks_on_logout_link()
	{
		lp.click_logout();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
@Then("Close the browser")
	public void close_the_browser()
	{
	    driver.close();
	}
//implenetation or steps fro adding a new customer
@Then("User can view the dashboard")
public void user_can_view_the_dashboard() 
{
	addcust=new AddnewCustomerPage(driver);
	Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getpageTitle());
    
}

@When("user clicks on customer menu")
public void user_clicks_on_customer_menu() throws InterruptedException 
{
	Thread.sleep(4000);
	addcust.click_customer_menu();
	Thread.sleep(4000);
   
}

@When("click on customers menu item")
public void click_on_customers_menu_item() {
	addcust.click_customer_item();
}

@When("Click on Add new button")
public void click_on_Add_new_button() throws InterruptedException 
{
	Thread.sleep(4000);
	addcust.click_addbutton();
	Thread.sleep(4000);
}

@Then("User can view add new customer page")
public void user_can_view_add_new_customer_page() throws InterruptedException 
{
	Thread.sleep(4000);
	Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getpageTitle());
	
}

@When("user enter customer info")
public void user_enter_customer_info() throws InterruptedException
{
	Thread.sleep(4000);
	//it will generate unique email id everytime we call 
	//append with @gmail so that it will match the expectation
	String email=randomString()+"@gmail.com";
	addcust.SetEmail(email);
	addcust.Setpassword("admin456");
	addcust.first_Name("demo123");
	addcust.last_Name("demo");
    
}

@When("click on save button")
public void click_on_save_button() throws InterruptedException
{
addcust.click_savebtn();
Thread.sleep(4000);
    
}
//regular expresseion
@Then("User can view confimation message {string}")
public void user_can_view_confimation_message(String mesg)
{
	Assert.assertTrue(driver.findElement(By.xpath("//button[@class='close']/..")).getText().contains("successfully"));
   
}
//Search customer by email ID............
@When("Enter customer email")
public void enter_customer_email() 
{
 searchcust=new SearchCustomerPage(driver);
 searchcust.setEmailID("victoria_victoria@nopCommerce.com");
}

@When("Click on search button")
public void click_on_search_button() throws InterruptedException 
{
	searchcust.Click_searchbtn();   
	Thread.sleep(8000);
}

@Then("user should found email in search table")
public void user_should_found_email_in_search_table() 
{
	String result=searchcust.Get_Email();
	Assert.assertEquals("victoria_victoria@nopCommerce.com", result);
}
//searching a customer by using first name and last name 

@When("Enter customer first name")
public void enter_customer_first_name() throws InterruptedException
{
	Thread.sleep(4000);
	searchcust=new SearchCustomerPage(driver);
	searchcust.setFirstName("Victoria");
   
}

@When("customer last name")
public void customer_last_name()
{
	searchcust.setLastname("Terces");
   
}

@Then("user should find name in search table")
public void user_should_find_name_in_search_table() throws InterruptedException 
{
	Thread.sleep(4000);
	String result=searchcust.Get_Email();
	Assert.assertEquals("victoria_victoria@nopCommerce.com", result);

   
}


}

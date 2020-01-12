package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddnewCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass 
{
	//here all the actions are common so we are taken off from step class so that thease 
	// can be utilizsed anywr within the project
	
	public WebDriver driver;
	public LoginPage lp;
	public AddnewCustomerPage addcust;
	public SearchCustomerPage  searchcust;
	//the reason we created vz it will be difficult manage later so all common actions we are creating here and 
	//can intiate in the steps class
	public Properties configprop;
	//used to create random data 
	//it will create a random data of size 5 character within A-Z and returns in the form of string 
	//to generate unique email id 
	public static String  randomString(){
	String	generatedstring=RandomStringUtils.randomAlphabetic(5);
	return generatedstring;
	}

}

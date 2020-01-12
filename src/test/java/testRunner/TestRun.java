package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
//this class is used to run the feature file ,it will interact with feature file and 
//it will interact with stepdef clas ,intern step def class will talk to page object class thats how test runner class
//will execute
//to run this class we need to specify some options like 
//features option is mandatory ,soem of them are not manadatory

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Features/", glue = "stepDefinitions", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:test-output" }, 
		tags={"@smoke"}

)
public class TestRun 
{

}

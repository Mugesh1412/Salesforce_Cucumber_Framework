package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

		features = "src/test/java/Salesforce_Feature",

		glue = {"stepDefinition", "Hooks"},

		dryRun = !true,

		plugin = {"pretty","html:target/htmlreport.htm", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		//tags = "@account" 

		)
   
public class testRunner extends AbstractTestNGCucumberTests {
          
	                                                                                                                                                                                                                                           
	                                                
	         
}                                                              
    
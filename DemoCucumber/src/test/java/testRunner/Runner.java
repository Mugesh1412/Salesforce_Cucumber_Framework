package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/java/Features/parameterized.feature",

		glue = "stepDefinition",

		dryRun = !true,

		//snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE,

		plugin = {"pretty","html:target/htmlreport.html"}                   
   
		)    

public class Runner extends AbstractTestNGCucumberTests{              

	     
	                                                                  
	                                                                                                            
	                                                                                                 
	     
	      
}                          

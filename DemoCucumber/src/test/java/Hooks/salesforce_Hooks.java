package Hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utilities.commonUtils;
import Webdriver_manager.driverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class salesforce_Hooks {

	@Before
	public void brforceScenario() {

		try {
			
			commonUtils.getInstance().loadProperties();

			if (driverManager.getDriver()==null) {
				driverManager.lunchBroswer();
				driverManager.getDriver().manage().window().maximize();
				driverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
				commonUtils.getInstance(). initwebElements();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	
	 @After
	    public static void afterScenario(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
			/* driverManager.getDriver().close(); */

	 }
}

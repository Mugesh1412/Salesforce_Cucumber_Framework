package Webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Constants.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager {

	private static WebDriver driver=null;
	
	
	public static void lunchBroswer() {
		
		System.out.println(constants.broswer);
		switch (constants.broswer) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		default:
			/*
			 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
			 */
			
			System.out.println("we are not support this broswer");
			break;
		}
		
		
	}


	public static WebDriver getDriver() {
		return driver;
	}
	
	

}

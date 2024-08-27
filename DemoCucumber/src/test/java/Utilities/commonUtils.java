package Utilities;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import Page_objects.Account_page;
import Page_objects.Contact_page;
import Page_objects.login_page;
import Page_objects.related_contact_section_page;
import Webdriver_manager.driverManager;

public class commonUtils {

	public static commonUtils commonUtils=null;      

	private commonUtils() {

	}

	public static commonUtils getInstance() {

		if (commonUtils==null) {
			commonUtils = new commonUtils();
		}
		return commonUtils;

	}                                                                          


	public void loadProperties() {

		Properties properties = new Properties();
		try {

			properties.load(getClass().getResourceAsStream("/commanData.properties")); 

		} catch (Exception e) {
			e.printStackTrace();
		}


		constants.broswer=properties.getProperty("broswer");
		constants.App_Url=properties.getProperty("App_Url");



	}  


	public void initwebElements() {
		PageFactory.initElements(driverManager.getDriver(), login_page.getInstance()); 

		PageFactory.initElements(driverManager.getDriver(), Account_page.getInstance()); 

		PageFactory.initElements(driverManager.getDriver(), Contact_page.getInstance());

		PageFactory.initElements(driverManager.getDriver(), related_contact_section_page.getInstance());

	}


	public void javaScriptClick(WebElement Element) {

		JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
		js.executeScript("arguments[0].click();", Element);
	}


	public void moveToElementActions(WebElement element) {

		Actions Actions = new Actions(driverManager.getDriver());
		Actions.moveToElement(element).perform();

	}

	public void mouseClickActions(WebElement element) {
		Actions Actions = new Actions(driverManager.getDriver());
		Actions.click(element);

	}


	public void scroolByPixelValue(Integer x, Integer y) {

		JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();                                                                                                                                                                                                                                          
		//js.executeScript("arguments[0].scrollIntoView();", element);                                                          
		//js.executeScript("arguments[0].scrollIntoView(false);", element); 
		//int one = Integer.parseInt(x);  
		//int two = Integer.parseInt(y);  
		js.executeScript("window.scrollTo("+x+","+y+")", "");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		//js.executeScript("window.scrollTo(0,800)");

	}                                                                                                                





}

package stepDefinition;

import static org.testng.Assert.assertTrue;

import Constants.constants;
import Page_objects.login_page;
import Webdriver_manager.driverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class salesforce_Login_Steps {

	
	@Given("User should navigate to the Salesforce Application")
	public void user_should_navigate_to_the_salesforce_application() {
		
		driverManager.getDriver().get(constants.App_Url);
		
	    
	}

	@Given("The User should login as {string} and {string}")
	public void the_user_should_login_as_and(String username, String password) {
	  
		/*
		 * login_page.getInstance().getUsernameBox().sendKeys(username);
		 * login_page.getInstance().getPasswordBox().sendKeys(password);;
		 * login_page.getInstance().getLoginButton().click();
		 */
		
		try {
			login_page.getInstance().loginIntoApp(username, password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   
	    
	}

	@Then("User should verify the login page logo")
	public void user_should_verify_the_login_page_logo() {
	   
		boolean result = login_page.getInstance().logo();
		assertTrue(result);
	   
	}                                              

	@And("user shold logout the Application")
	public void user_shold_logout_the_application() {
	   try {
		login_page.getInstance().logoutIntoApp();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
	}

	@Given("User should navigate to the Salseforce Application")
	public void user_should_navigate_to_the_salseforce_application() {
	   
		driverManager.getDriver().get(constants.App_Url);
	   
	}

	@Then("User should the error Message")
	public void user_should_the_error_message() {
	   
		String result = login_page.getInstance().errMsg();
		if (result.contains("Please check your username and password")) {
			assertTrue(true);                                                                                                                                                                        
			
		}
		else {
			assertTrue(false); 
	}
		



	
	}	
}

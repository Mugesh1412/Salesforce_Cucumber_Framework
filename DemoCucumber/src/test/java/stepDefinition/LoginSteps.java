package stepDefinition;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;                                                                                                                                                           
import io.cucumber.java.en.When;

public class LoginSteps {       

	static WebDriver driver;
	
	
	
	public LoginSteps() {
		
	}

	@Given("User should navigate to the OrangeHrm Application")
	public void user_should_navigate_to_the_orange_hrm_application() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	/*
	 * @Given("User enter the username as Admin") public void
	 * user_enter_the_username_as_admin() {
	 * driver.findElement(By.name("username")).sendKeys("Admin");
	 * 
	 * }
	 * 
	 * @Given("User enter the password as admin123") public void
	 * user_enter_the_password_as_admin123() {
	 * driver.findElement(By.name("password")).sendKeys("admin123");
	 * 
	 * }
	 */

	@When("User cliks on the login button")
	public void user_cliks_on_the_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@Then("User should be navigate to homepage")
	public void user_should_be_navigate_to_homepage() {

		boolean result = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertTrue(result);
		driver.close();

	}


	@Given("User enter the username as {string}")
	public void user_enter_the_username_as(String username) {
		driver.findElement(By.name("username")).sendKeys(username);


	}
	@Given("User enter the password as {string}")
	public void user_enter_the_password_as(String password) {
		driver.findElement(By.name("password")).sendKeys(password);  
	}           

	

	@When("User should not be navigate to homepage")
	public void user_should_not_be_navigate_to_homepage() {
		
		String error = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(error, "Invalid credentials");
		driver.close();
	}

       

}

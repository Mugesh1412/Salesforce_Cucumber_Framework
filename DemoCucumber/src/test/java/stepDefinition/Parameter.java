package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;              
import io.cucumber.java.en.Then;                                                                           
import io.cucumber.java.en.When;                                                                                               

public class Parameter {

	static WebDriver driver;

	@Given("User should navigate to the OrangeHrm App")
	public void user_should_navigate_to_the_orange_hrm_app() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");                                

	}

	@Given("User should login as {string} and {string}")
	public void user_should_login_as_and(String Username, String Password) {                                                                                              
		driver.findElement(By.name("username")).sendKeys(Username);                       
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			

	} 
 
	@When("User should Enter {string} in the search box")
	public void user_should_enter_in_the_search_box(String value) {
		driver.findElement(By.xpath("//div[@class='oxd-main-menu-search']//input[1]")).sendKeys(value);

	}

	@Then("the value should same")
	public void the_value_should_same() {
    driver.findElement(By.xpath("//div[@class='oxd-main-menu-search']//input[1]/../../..//ul")).click();
    driver.close();
                                                                    
	}                                                          
         
	
}    

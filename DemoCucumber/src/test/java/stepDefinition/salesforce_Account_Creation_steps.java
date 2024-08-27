package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import Page_objects.Account_page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class salesforce_Account_Creation_steps {

	private String accountname;

	@When("User should clik on the App luncher Button")
	public void user_should_clik_on_the_app_luncher_button() {
		Account_page.getInstance().ClickAppLauncher();

	}

	@When("User should click on the service App")
	public void user_should_click_on_the_service_app() {
		Account_page.getInstance().ClickOnTheServiceApp();

	}

	@When("User should navigate to the Account Tab")
	public void user_should_navigate_to_the_account_tab() {
		Account_page.getInstance().navigateToAccountTab();

	}

	@When("User should click on the  New button")
	public void user_should_click_on_the_new_button() {
		Account_page.getInstance().clickOnTheAccountNewButton();

	}

	@When("User should enter the necessary details to create the account- Use Below Cretancials")
	public void user_should_enter_the_necessary_details_to_create_the_account_use_below_cretancials(DataTable dataTable) {
		List<Map<String, String>> value = dataTable.asMaps(String.class,String.class);

		String accountName = value.get(0).get("Account Name");
		this.accountname=accountName;
		Account_page.getInstance().newAccount(accountName);


	}


	@Then("check the details which are entered during the account creation")
	public void check_the_details_which_are_entered_during_the_account_creation() {
		String actualResult = Account_page.getInstance().verifyAccountName();

		String expectedResult = accountname.trim();

		if (actualResult.equals(expectedResult)) {
			assertTrue(true);

		}
		else {
			assertTrue(false);
		}

	}

	@When("User should click on the save button with out entring the necessary details")
	public void user_should_click_on_the_save_button_with_out_entring_the_necessary_details() throws InterruptedException {

		Account_page.getInstance().clickOnTheSaveButton();
	}

	@Then("check the validation error")
	public void check_the_validation_error() throws IOException, InterruptedException {

		String ActualResult = Account_page.getInstance().validate_the_Error_On_Account();
		if (ActualResult.contains("We hit a snag.")) {
			assertTrue(true);
		} 
		else {
			assertTrue(false);
		}


	}

}

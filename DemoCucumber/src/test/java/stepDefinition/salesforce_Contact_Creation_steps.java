package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import Page_objects.Contact_page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class salesforce_Contact_Creation_steps {

	public String firstname;
	public String lastname;

	@When("User should navigate to the Contact Tab")
	public void user_should_navigate_to_the_contact_tab() {
		Contact_page.getInstance().navigateToContactTab();

	}

	@When("User should click on the  Contact New button")
	public void user_should_click_on_the_contact_new_button() {
		Contact_page.getInstance().clickOnTheContactNewButton();

	}    

	@When("User should enter the necessary details to create the contact- Use Below Cretancials")
	public void user_should_enter_the_necessary_details_to_create_the_contact_use_below_cretancials(DataTable dataTable) {

		List<Map<String, String>> value = dataTable.asMaps(String.class,String.class);

		firstname = value.get(0).get("First Name");
		lastname = value.get(0).get("Last Name");

		Contact_page.getInstance().NewContact(firstname, lastname);



	}

	@Then("check the details which are entered during the contact creation")
	public void check_the_details_which_are_entered_during_the_contact_creation() {
		String ActualResult = Contact_page.getInstance().verifyContactName();
		String ExpectedResult = lastname.trim();

		if (ActualResult.contains(ExpectedResult)) {
			assertTrue(true);
		} 
		else {
			assertTrue(false);
		}

	}
	
	
	@When("User should click on the Contact save button with out entring the necessary details")
	public void user_should_click_on_the_contact_save_button_with_out_entring_the_necessary_details() throws InterruptedException {
	   Contact_page.getInstance().clickOnTheSaveButton();
	    
	}

	@Then("check the Contact validation error")
	public void check_the_contact_validation_error() {
	   String  ActualResult= Contact_page.getInstance().validate_the_Error_On_Contact();
	   if (ActualResult.contains("We hit a snag.")) {
			assertTrue(true);
		} 
		else {
			assertTrue(false);
		}

	    
	}



}

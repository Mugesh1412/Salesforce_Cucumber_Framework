package stepDefinition;

import Page_objects.related_contact_section_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforce_related_Contact_steps {

	@When("User should scroll to the related contacts section")
	public void user_should_scrool_to_the_related_contacts_section() throws InterruptedException {
	    
	    related_contact_section_page.getInstance().scroolTORelatedContact();
	}

	@When("User should click on the Related Contact section New button")
	public void user_should_click_on_the_related_contact_section_new_button() {
	    related_contact_section_page.getInstance().ClickOnRelatedContactNewButton();
	    
	}

	@Then("check the details which are entered during the contact creation on the related section")
	public void check_the_details_which_are_entered_during_the_contact_creation_on_the_related_section() {
	    
	    
	}                                                                                                                                                                                                                                                                             
  
}                                       
                 
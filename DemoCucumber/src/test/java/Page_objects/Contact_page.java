package Page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.commonUtils;

public class Contact_page {
	
	
	private static Contact_page contactInstance;
	
	private Contact_page() {
		
	}
	
	public static Contact_page getInstance() {
		
		if (contactInstance==null) {
			contactInstance=new Contact_page();
		}
		return contactInstance;
	}
	
	@FindBy(xpath = "//a[@title='Contacts']")
	public WebElement contactSection;

	@FindBy(xpath = "//div[text()='New']")
	public WebElement contactNewButton;

	@FindBy(xpath = "(//div[@role='none']//button)[1]")
	public WebElement SalutationButton;

	@FindBy(xpath = "//label[text()='First Name']/..//input")
	public WebElement FirstNameBox;

	@FindBy(xpath = "//label[text()='Last Name']/..//input")
	public WebElement LastNameBox;

	@FindBy(xpath = "//ul[@class='slds-button-group-row']//li[3]")
	public WebElement ConSaveButton;

	@FindBy(xpath = "(//span[@class='test-id__field-label'])[3]/../../..//lightning-formatted-name")
	public WebElement ActualContactName;

	@FindBy(xpath = "//h2[text()='We hit a snag.']")
	public WebElement ConError;
	
	@FindBy(xpath = "//span[text()='Close this window']")
	public WebElement closewindow;

	
	public void navigateToContactTab() {
		
		commonUtils.getInstance().javaScriptClick(contactSection);
	}
	
	public void clickOnTheContactNewButton() {
		contactNewButton.click();
	}
	
	
	public void NewContact(String Firstname, String Lastname) {
		FirstNameBox.sendKeys(Firstname);
		LastNameBox.sendKeys(Lastname);
		ConSaveButton.click();
	}

	public String verifyContactName() {
		return ActualContactName.getText();
	}
	
	public void clickOnTheSaveButton() throws InterruptedException {
		
		commonUtils.getInstance().moveToElementActions(ConSaveButton);
		Thread.sleep(3000);
		ConSaveButton.click();
		
	}
	


	
	  public String validate_the_Error_On_Contact(){
		  String result = ConError.getText();
		  commonUtils.getInstance().javaScriptClick(closewindow);
		  return result;
		  
		  
	  }
	 

	  
}

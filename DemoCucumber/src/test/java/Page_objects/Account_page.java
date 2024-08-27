package Page_objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.commonUtils;

public class Account_page {
	
	
	private static Account_page accountInstance;
	
	private Account_page() {


	}
	
	public static Account_page getInstance() {
		
		if (accountInstance==null) {
			accountInstance=new Account_page();
		}
		
		return accountInstance;
		
	}

	
	@FindBy(xpath = "//button[@title='App Launcher']")
	public WebElement AppLauncher;
	
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchApp;
	
	@FindBy(xpath = "//p[text()='Service']")
	public WebElement serviceApp;
	
	@FindBy(xpath = "//a[@title='Accounts']")
	public WebElement AccountsSection;
	
	@FindBy(xpath = "//div[text()='New']")
	public WebElement AccountNewButton;
	
	@FindBy(xpath = "(//label[contains(.,'*Account Name')]/following::input)[1]")
	public WebElement AccountNameBox;
	
	@FindBy(xpath = "//ul[@class='slds-button-group-row']//li[3]")
	public WebElement AccSaveButton;
	
	@FindBy(xpath = "//h2[text()='We hit a snag.']")
	public WebElement AccError;
	
	@FindBy(xpath = "(//span[@class='test-id__field-label'])[3]/../../..//lightning-formatted-text")
	public WebElement ActualAccountName;
	
	@FindBy(xpath = "//span[text()='Close this window']")
	public WebElement closeWindow;
	
	
	
	public void ClickAppLauncher() {
		//AppLauncher.click();
		commonUtils.getInstance().javaScriptClick(AppLauncher);
		
	}
	
	
	public void ClickOnTheServiceApp() {
		serviceApp.click();
	}
	
	
	public void navigateToAccountTab() {
		commonUtils.getInstance().javaScriptClick(AccountsSection);
		
	}
	
	public void clickOnTheAccountNewButton() {
		
		//commonUtils.getInstance().moveToElementActions(AccountNewButton);
		AccountNewButton.click();
		//commonUtils.getInstance().mouseClickActions(AccountNewButton);
		
	}
	
	public void newAccount(String Accountname) {
		AccountNameBox.sendKeys(Accountname);
		AccSaveButton.click();
		
	}
	
	
	
	public String verifyAccountName() {
		
		return ActualAccountName.getText();
	}
	
	
	public void clickOnTheSaveButton() throws InterruptedException {
		
		commonUtils.getInstance().moveToElementActions(AccSaveButton);
		Thread.sleep(3000);
		AccSaveButton.click();
	}
	
	public String validate_the_Error_On_Account() throws IOException, InterruptedException {
		//AccSaveButton.click();
		String result = AccError.getText();
		commonUtils.getInstance().javaScriptClick(closeWindow);
		return result;
		
	}
	
	
	
}

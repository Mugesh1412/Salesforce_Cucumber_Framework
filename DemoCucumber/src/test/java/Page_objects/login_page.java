package Page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.commonUtils;

public class login_page {

	private static login_page loginInstance;

	private login_page() {

	}

	public static login_page getInstance() {

		if (loginInstance==null) {
			loginInstance = new login_page();
		} 
		return loginInstance;

	}    
 
	@FindBy(id = "username")
	private   WebElement usernameBox;                                                                                                                       

	@FindBy(id = "password")
	private  WebElement passwordBox;

	@FindBy(id = "Login")                                                                                                                                      
	private  WebElement loginButton;                                                                      

	@FindBy(xpath = "(//span[@class='uiImage'])[1]")
	private  WebElement down;

	@FindBy(xpath = "//a[text()='Log Out']")
	private   WebElement logoutButton;

	@FindBy(xpath = "//lightning-icon[contains(@class,'slds-icon-standard-home setup-icon')]")
	private  WebElement HomeLogo;

	@FindBy(id = "error")
	private  WebElement errorMsg;

	/*
	 * public WebElement getUsernameBox() { return usernameBox; }
	 * 
	 * public WebElement getPasswordBox() { return passwordBox; }
	 * 
	 * public WebElement getLoginButton() { return loginButton; }
	 * 
	 * public WebElement getDown() { return down; }
	 *  
	 * public WebElement getLogoutButton() { return logoutButton; }
	 * 
	 * public WebElement getHomeLogo() { return HomeLogo; }
	 * 
	 * public WebElement getErrorMsg() { return errorMsg; }  
	 */	

	public void loginIntoApp(String username, String password) throws InterruptedException {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();
		Thread.sleep(2000);
	}

	public boolean logo() {

		return HomeLogo.isDisplayed();
	}

	public void logoutIntoApp() throws InterruptedException {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
		 * js.executeScript("arguments[0].click();", down);*/
		Thread.sleep(2000);
	  	 down.click();
		 Thread.sleep(2000);
		 commonUtils.getInstance().javaScriptClick(logoutButton);
		 
		//logoutButton.click();
		
	}
	
	public String errMsg() {
		return errorMsg.getText();                                                                                                                                         
		                                                                                                                
	}
	 
	                 

}

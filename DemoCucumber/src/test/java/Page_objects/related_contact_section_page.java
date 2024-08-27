package Page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.commonUtils;

public class related_contact_section_page {
	
	
	
	private  static related_contact_section_page relatedConatctInstance;
	
	private  related_contact_section_page() {
		
	}
	
	public static related_contact_section_page getInstance() {
		
		if (relatedConatctInstance==null) {
			relatedConatctInstance=new related_contact_section_page();
		}
		return relatedConatctInstance;
	}
	
	

	@FindBy(xpath = "(//span[text()='Contacts'])[2]")
	public WebElement relatedContact;

	@FindBy(xpath = "(//button[@name='NewContact'])[1]")
	public WebElement RelatedConNewButton;
	
	
	/*
	 * public void related_Contact() throws InterruptedException {
	 * 
	 * Thread.sleep(10000); js.executeScript("window.scrollTo(0,800)");
	 * Thread.sleep(2000); js.executeScript("arguments[0].click();",
	 * RelatedConNewButton); }
	 */
	
	
	public void scroolTORelatedContact() throws InterruptedException {
		
		Thread.sleep(10000);
		
		commonUtils.getInstance().scroolByPixelValue(0, 800);
		
	}
	
	public void ClickOnRelatedContactNewButton() {
		
		commonUtils.getInstance().javaScriptClick(RelatedConNewButton);
		
	}
}

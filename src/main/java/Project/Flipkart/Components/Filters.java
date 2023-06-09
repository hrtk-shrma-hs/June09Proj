package Project.Flipkart.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Filters {
	
	
	
	WebDriver driver;
	
	
	public Filters(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	     @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
	     public WebElement samFilter;
	     
	     @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
	 	public WebElement realmeFilter;
	     
	 	@FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
	 	public WebElement appleFilter;
	 	
	
	
	     @FindBy(xpath="//div[text()='SAMSUNG']")
	     WebElement samsung;
	     
	     @FindBy(xpath="//div[text()='APPLE']")
	     WebElement apple;
	     
	     @FindBy(xpath="//div[text()='realme']")
	     WebElement realme;
	     
	     @FindBy(xpath="//div[text()='Clear all'")
	     WebElement clearAll;
	     
	     public void checkbox() {
	    	 
	    	 
	    	 samsung.click();
	    	 apple.click();
	    	 realme.click();
	    	 
	    	 
	    	 
	     }
	     public void filterCheck() {
	 		Assert.assertTrue(samFilter.isDisplayed(), "NO Samsung Filter");
	 		Assert.assertTrue(realmeFilter.isDisplayed(), "NO realme Filter");
	 		Assert.assertTrue(appleFilter.isDisplayed(), "NO Apple Filter");
	 	}
	 	
	 	public void filterRemove() throws InterruptedException {
	 		Thread.sleep(2000);
	 		samFilter.click();
	 		Thread.sleep(2000);
	 		realmeFilter.click();
	 		Thread.sleep(2000);
	 		appleFilter.click();
	 	}
	
	

}

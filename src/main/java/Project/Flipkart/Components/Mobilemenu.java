package Project.Flipkart.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobilemenu {
	
	WebDriver driver;
	
	public Mobilemenu(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement cross;
	
	@FindBy(xpath="(//*[text()='Mobiles'])[1]")
	WebElement mobiles;
	
	public void click() {
		
		cross.click();
		
		mobiles.click();
		
	}
	

}

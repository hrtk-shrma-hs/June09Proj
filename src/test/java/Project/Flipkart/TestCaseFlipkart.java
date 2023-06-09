package Project.Flipkart;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Project.Flipkart.Components.Filters;
import Project.Flipkart.Components.Mobilemenu;

public class TestCaseFlipkart extends BaseConfigFlipkart {
	
	
	
	
	
	
	        public Mobilemenu mobObj;
	        public Filters filterObj;
	        WebDriver driver;
	        
	        @Parameters({"Port"})
	        @BeforeClass
	        public void setup(String Port) throws MalformedURLException {
	        	   
	        	   driver=setUp(Port);
	        	   mobObj = new Mobilemenu(driver);
	        	   filterObj= new Filters(driver);
	        	  
	           }
             
	        @Test
	        public void Scenario() throws InterruptedException {
	        	
	        	mobObj.click();
	            filterObj.checkbox();
	            filterObj.filterCheck();
	            filterObj.filterRemove();
	        	
	        }
	
	
	
	
	
	

}

package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	
	
	@Before
	public void driverOptionsBefore() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Silk\\Silk WebDriver\\ng\\WebDriversSWD\\Windows\\Gecko\\0.23.0\\geckodriver.exe"); 
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Silk\\Silk WebDriver\\ng\\WebDriversSWD\\Windows\\Chrome\\2.43\\chromedriver.exe");
		
	}
	
	@After
	public void driverOptionsAfter() {
		
		   
	}   
	
	
}

package stepDefinition;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.deps.com.google.gson.annotations.Until;

public class BaseTests {

	WebDriver driver =new ChromeDriver();
	 
	public WebElement FindElement(By by) {

        WebDriverWait wait=new WebDriverWait(driver,5);
        return driver.findElement(by);		
		
	} 
	
	public void SendKeys(By by, String text)
    {
		MoveToElement(by);
        FindElement(by).clear();
        FindElement(by).sendKeys(text); 
    }  
	
      public void ClickButton(By by) {
    	  
    	    MoveToElement(by);
    		FindElement(by).click(); 
    		 
      }
          
      public void MoveToElement(By by) {
    	      	  
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("javascript:window.scrollBy(250,350)",FindElement(by));
         
      }    
      
        
     
      
       
     

}
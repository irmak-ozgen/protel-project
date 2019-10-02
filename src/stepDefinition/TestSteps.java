package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.bytebuddy.utility.RandomString;
import cucumber.api.java.en.And;

public class TestSteps extends BaseTests {

	 String email_defined;
	
	 @Given("I open the web page")
	 public void OpenHomePage() throws Throwable {
		      
		  String url="http://automationpractice.com";
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.get(url);
		  
	 } 
	
	 @And("I click the sign in button")
	 public void ClickButton() {
		 ClickButton(By.className("login"));
	 } 
	   
	 @And("I click Create New Account button")
	 public void ClickCreateNewAccountButton() {
		 
		 ClickButton(By.id("SubmitCreate"));
	 }
	 
	 @And("I select gender")
	 public void ClickTitleRadio() {
		 
		 ClickButton(By.id("id_gender2")); 
	 }
	 @And("I click the Submit Button")
	 public void ClickButtonSubmit() {
		 
		 ClickButton(By.id("submitAccount")); 
	 }
	 @And("I click the Sign out Button")
	 public void ClickButtonSignout() {
		 ClickButton(By.className("logout"));
	 }
	  
	 
	 @And("I select the '(.*)' options '(.*)'")
	 public void SelectText(String name,String text) {
		 
		 if(name.equals("days"))
		 {
			 Select selectElement = new Select(FindElement(By.id("days")));
	         selectElement.selectByValue(text); 
		 }	
		 else if(name.equals("months"))	 {
			 Select selectElement = new Select(FindElement(By.id("months")));
	         selectElement.selectByValue(text); 
		 } 
		 else if(name.equals("years"))
		 {
			 Select selectElement = new Select(FindElement(By.id("years")));
	         selectElement.selectByValue(text); 
		 }
		 else if(name.equals("state"))
		 {
			 Select selectElement = new Select(FindElement(By.id("id_state")));
	         selectElement.selectByValue(text); 
		 }
		 else if(name.equals("country"))
		 {
			 Select selectElement = new Select(FindElement(By.id("id_country")));
	         selectElement.selectByValue(text); 
		 }
		 		
	 }
	 @And("I write my email")
	 public void SetTextMail() {
		 int length = 5;
		 String generatedString = RandomString.make(length);
		 String email=generatedString+"@gmail.com";
		 SendKeys(By.id("email_create"),email);
		 email_defined=email;
		 
	 }
	 @And("I set the name textbox '(.*)'")
	 public void SetTextName(String name) {
		SendKeys(By.id("customer_firstname"),name);
	 }
	 @And("I set the surname textbox '(.*)'")
	 public void SetTextSurName(String surname) {
		 SendKeys(By.id("customer_lastname"),surname);
	 }
	 @And("I set the password textbox '(.*)'")
	 public void SetTextPassword(String password) {
		SendKeys(By.id("passwd"),password);
	 }
	 @And("I set the alias textbox '(.*)'")
	 public void SetTextAlias(String alias) {
		 SendKeys(By.id("alias"),alias);
	 }
	 @And("I set the address textbox '(.*)'")
	 public void SetTextAddress(String address) {
		 SendKeys(By.id("address1"),address);
	 }
	 @And("I set the city textbox '(.*)'")
	 public void SetTextCity(String city) {
		SendKeys(By.id("city"),city);
	 }
	 @And("I set the postcode textbox '(.*)'")
	 public void SetTextPostcode(String postcode) {
		 SendKeys((By.id("postcode")),postcode);
	 }
	 @And("I set the mobile phone textbox '(.*)'")
	 public void SetTextMobilephone(String mobile) {
		 SendKeys((By.id("phone_mobile")),mobile);
	 }
	 @And("I write my generated email to sign in")
	 public void SetTextGeneratedEmail() {
		 SendKeys(By.id("email"),email_defined);
	 } 
	 @And("I set the existing password textbox '(.*)'")
	 public void SetTextExistingPassword(String password) {
			SendKeys(By.id("passwd"),password);
		 }
	 @And("I click the submit login button")
	 public void ClickSubmitLoginButton() {
		 ClickButton(By.id("SubmitLogin"));
	 }  
	 @And("I set the search textbox '(.*)'")
	 public void SetSeachText(String faded) {
   	SendKeys(By.id("search_query_top"),faded);
		  
	 } 
	 @And("I click Submit Search")
	 public void ClickSubmitSearchButton() {
		 
		 ClickButton(By.name("submit_search")); 
	 }
	 @And("I click Add To Card")
	 public void ClickAddToCardButton() {
		 
		 MoveToElement(By.className("product-image-container"));
		 ClickButton(By.className("product-container"));
		 
		
		                            
		    
		        
	      }     
	  
	 
	 
}
	  
	 
	 
	           
	  



package ProtelTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"stepDefinition"})

public class TestRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
	}    
 
}

package stepDefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver; 
	
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	    
		driver.get("https://www.facebook.com/");
	}

	@Then("^User should be login sucessfully$")
	public void user_should_be_login_sucessfully() throws Throwable {
	   
	}
	
	@When("^I enter valid username and invalid password$")
	public void i_enter_valid_username_and_invalid_password() throws Throwable {
	   
	}

	@Then("^User should be mot login sucessfully$")
	public void user_should_be_mot_login_sucessfully() throws Throwable {
	    
	}

}
	
	

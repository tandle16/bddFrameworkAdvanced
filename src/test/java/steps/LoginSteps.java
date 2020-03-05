package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	
	WebDriver driver ;
	String username = " ";
	String password = " ";
	
	@Given("^a valid user$")
	public void a_valid_user()  {
	  
		String username = "techfiosdemo@gmail.com";
		String password = "abc123";
	}

	
	@When("^user goes to techfios site$")
	public void user_goes_to_techfios_site()  {
		//browser will go and open the site for this we need browser factory which is in util package
	driver = BrowserFactory.startBrowser();
	
	  	}

	@Then("^techfios site should display$")
	public void techfios_site_should_display()  {
		String expectedTitle = "Login - TechFios Test Application - Billing";
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    	String actualTitle = loginPage.getPageTitle();
	   Assert.assertEquals("Title did not Match ", expectedTitle, actualTitle);
	}

	@When("^user logs in with valid credentials$")
	public void user_logs_in_with_valid_credentials() {
	  
	}

	@Then("^Dashboard page should be displayed$")
	public void dashboard_page_should_be_displayed()  {
	 
	}

	@Then("^username should match$")
	public void username_should_match()  {
	 
	}


}

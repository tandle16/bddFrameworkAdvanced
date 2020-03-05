package steps;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import page.NewAccountPage;
import page.SideNavigation;
import util.BrowserFactory;

public class NewAccountSteps {
	
	//declaring globally
	
	WebDriver driver;
	//class and reference name
	LoginPage loginPage;
	SideNavigation sideNavigation;
	NewAccountPage newAccountPage;
	
	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		sideNavigation = PageFactory.initElements(driver,SideNavigation.class);
	    newAccountPage = PageFactory.initElements(driver,  NewAccountPage.class);
	} 
	// this will connect user name from feature file and pull it in

	@Given("^a user with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_with_username_and_password(String userName, String password) {
		loginPage.login(userName, password);
	}
	
	@When("^user navigates to New Account Page$")
	public void user_navigates_to_New_Account_Page() throws Throwable {
	   sideNavigation.goToNewAccountPage();
	}
	
	@Then("^New Account page should display$")
	public void new_Account_page_should_display() {
    Assert.assertTrue("Page not found",  newAccountPage.isPanelHeaderDisplayed());
	}
	
	@When("^user creates a new account using \"([^\"]*)\" Description \"([^\"]*)\" Amount \"([^\"]*)\"$")
	public void user_creates_a_new_account_using_Description_Amount(String title, String description, String amount) throws InterruptedException {
		Random rnd = new Random();
		int x = rnd.nextInt(999)	;	
		newAccountPage.inputAccountTitle(title+x);
	    Thread.sleep(1000);
	    newAccountPage.descriptionText(description);
	    newAccountPage.inputAmount(amount);
	    newAccountPage.clickOnSubmitButton(amount);
	    Thread.sleep(3000);
	       }
	
	@After
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
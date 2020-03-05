package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {
	
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public SideNavigation(WebDriver driver) {
		this.driver = driver;
	}

//	Bank&Cash    //span[text()='Bank & Cash']
//	New Account  linkText    New Account
//	List Account LinkText  List Accounts
	
	// Element Library of modules(Bank & cash,crm(add contact, list contact),transaction..these r modules) 
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankCashModule;
	@FindBy(how = How.LINK_TEXT, using = "New Account")
	WebElement NewAccountPage;
	@FindBy(how = How.LINK_TEXT, using = "List Accounts")
	WebElement ListAccountPage;
	//span[text()='Sales']
	@FindBy(how = How.XPATH, using = "//span[text()='Sales']")
	WebElement SalesModule;
	@FindBy(how = How.LINK_TEXT, using = "New Invoice")
	WebElement NewInvoicePage;
	@FindBy(how = How.LINK_TEXT, using = "Invoice")
	WebElement InvoicePage;
	
	
	public void goToNewAccountPage() throws InterruptedException {
		BankCashModule.click();
		Thread.sleep(2000);
		NewAccountPage.click();
	}
	
	public void goToListAccountPage() throws InterruptedException {
		ListAccountPage.click();
	}

	public void goToNewInvoicePage() throws InterruptedException {
		SalesModule.click();
		Thread.sleep(2000);
		 NewInvoicePage.click();
	}
	
	public void goToinvoicesPageWithoutClickingOnModule() {
		InvoicePage.click();
	}
	
	
}

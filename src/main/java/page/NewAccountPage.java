package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	Account title     ID      account
//	Description      ID       description
//	Initial Balance    ID      balance
//	Submit Button      //label[text()='Initial Balance']/../following-sibling::button

	// Element Library
	@FindBy(how = How.ID, using = "account")
	WebElement AccountTitleField;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add New Account')]")
	WebElement PanelHeaderElement;
	@FindBy(how = How.ID, using = "description")
	WebElement DescriptionField;
	@FindBy(how = How.ID, using = "balance")
	WebElement InitialBalanceField;
	@FindBy(how = How.XPATH, using = "//label[text()='Initial Balance']/../following-sibling::button")
	WebElement SubmitButton;
	
	public void fillInTheNewAccountForm(String accountTitle, String description, String balance) throws InterruptedException {
		AccountTitleField.sendKeys(accountTitle);
		DescriptionField.sendKeys(description);
		InitialBalanceField.sendKeys(balance);
		Thread.sleep(2000);
		SubmitButton.click();
	}

	public boolean isPanelHeaderDisplayed() {
//		handling exception by try catch.,.,when we purposely fail the element locator ,.,.
//		try {
//		return PanelHeaderElement.isDisplayed();
//              }
//		catch(NoSuchElemnetException e) { 
//		return false;
//		}
		return PanelHeaderElement.isDisplayed();
	}

	public void inputAccountTitle(String title) {
		AccountTitleField.sendKeys(title);
		
	}

	public void descriptionText(String description) {
		DescriptionField.sendKeys(description);
		
	}

	public void inputAmount(String amount) {
		InitialBalanceField.sendKeys(amount);
		
	
}

	public void clickOnSubmitButton(String amount) {

		SubmitButton.click();
		
	}
}

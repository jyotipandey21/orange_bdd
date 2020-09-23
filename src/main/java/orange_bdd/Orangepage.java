package orange_bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Orangepage {

	WebDriver driver;

	public Orangepage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"txtUsername\"]")
	WebElement EmailAddress_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"txtPassword\"]")
	WebElement PassWord_Locator;
	@FindBy(how = How.XPATH, using = "//input[@name='Submit']")	//input[@name='Submit']")
	
	WebElement Login_Locator;
	@FindBy(how = How.XPATH, using = "//a[@id='menu_leave_viewLeaveModule']")
	WebElement Leave_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='calFromDate']")
	WebElement From_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='calToDate']")
	WebElement To_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"btnSearch\"]")
	WebElement Search_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")
	WebElement calendar_close_Locator;
	
	boolean data = false;

	public void address(String email) {
		EmailAddress_Locator.sendKeys(email);
		if (EmailAddress_Locator.isDisplayed()) {
			data = true;
		}
		Assert.assertTrue(EmailAddress_Locator.isDisplayed());

	}

	public void password(String password) {
		PassWord_Locator.sendKeys(password);
	}

	public void login_Element() {
		Login_Locator.click();
	}

	public void leave_Element() {
		Leave_Locator.click();
		if (Leave_Locator.isDisplayed()) {
			data = true;
		}
		Assert.assertTrue(data, " its not valid");
	}

	public void from(String date) {
		From_Locator.sendKeys(date);
	}

	public void to(String dateto) {
		To_Locator.sendKeys(dateto);
	}
	public void calander() {
		calendar_close_Locator.click();
	}

	public void searchbutton() {
		Search_Locator.click();
		if (Search_Locator.isEnabled()) {
			System.out.println("passed");
		}
	}

	

}

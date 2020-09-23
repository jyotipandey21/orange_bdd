package Test_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orange_bdd.Orangepage;
import util.Browser;

public class Orange_test {
	WebDriver driver;
	Orangepage orange;

	@Before
	public void orangetest() {
		driver = Browser.launchbrowser();
		orange = PageFactory.initElements(driver, Orangepage.class);
	}

	@Given("^a valid user$")
	public void a_valid_user() throws Throwable {
		System.out.println("valid user is on home page");
	}

	@When("^user goes to the site$")
	public void user_goes_to_the_site() throws Throwable {
		System.out.println("user is on site");

	}

	@Then("^login page should display$")
	public void login_page_should_display() throws Throwable {
		System.out.println("Login page displayed");

	}

	@When("^user enters valid user name \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_user_name_and_password(String email, String password) throws Throwable {
		orange = PageFactory.initElements(driver, Orangepage.class);
		orange.address("Admin");
		orange.password("admin123");
		orange.login_Element();

	}

	@Then("^viewLeaveList page should display$")
	public void viewleavelist_page_should_display() throws Throwable {
		orange.leave_Element();
		String actual = driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveList\"]")).getText();
		System.out.println(actual);
		String expected = "Leave List";
		Assert.assertEquals(actual, expected);

	}

	@When("^I as user  click on Leave tab$")
	public void i_as_user_click_on_Leave_tab() throws Throwable {
		orange = PageFactory.initElements(driver, Orangepage.class);
		orange.address("Admin");
		orange.password("admin123");
		orange.login_Element();
		System.out.println("click on leave list");
	}

	@Then("^Leave Form  must display$")
	public void leave_Form_must_display() throws Throwable {
		orange.leave_Element();
		List<WebElement> formvalidation = driver.findElements(By.xpath("//form[@id='frmFilterLeave']/fieldset/ol/li"));
		for (WebElement forms : formvalidation) {
			System.out.println(forms.getSize());
			System.out.println(forms);
		}
	}

	@When("^I passed  valid input From date \"([^\"]*)\" and To date \"([^\"]*)\"$")
	public void i_passed_valid_input_From_date_and_To_date(String arg1, String arg2) throws Throwable {
		orange.from("2020-10-29");
		orange.to("2020-10-30");
		orange.calander();
	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		orange.searchbutton();

	}

}

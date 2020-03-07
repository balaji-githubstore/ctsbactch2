package com.cts.stepdefintions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.MainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion {
	WebDriver driver;

	@Given("I have browser with magentopage")
	public void i_have_browser_with_magentopage() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
	}

	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String username, String password) {
		HomePage.clickOnMyAccountIcon(driver);
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.clickOnLogin(driver);
	}

	@Then("I should access to the portal with title as {string}")
	public void i_should_access_to_the_portal_with_title_as(String expectedTitle) {
		MainPage.waitForLogOutPresence(driver);
		String actutalTitle = MainPage.getCurrentTitle(driver);
		Assert.assertEquals(expectedTitle, actutalTitle);
		MainPage.clickOnLogOut(driver);
	}

	@Then("I should not get access to the portal")
	public void i_should_not_get_access_to_the_portal() {

		String actualText = LoginPage.getInvalidErrorMessage(driver);

		Assert.assertEquals("Invalid username", actualText);

	}

	@Then("I should access to the portal with id as {string}")
	public void i_should_access_to_the_portal_with_id_as(String expectedId) 
	{
		//
	}
}













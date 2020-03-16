package com.cts.steps;

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

public class StepDefintion3 {
	@Then("I should access to the portal with title as {string}")
	public void i_should_access_to_the_portal_with_title_as(String expectedTitle) {
		MainPage.waitForLogOutPresence(LaunchWebDriver.driver);
		String actutalTitle = MainPage.getCurrentTitle(LaunchWebDriver.driver);
		Assert.assertEquals(expectedTitle, actutalTitle);
		MainPage.clickOnLogOut(LaunchWebDriver.driver);
	}
}

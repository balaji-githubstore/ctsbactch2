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

public class StepDefintion2 {
	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String username, String password) {
		HomePage.clickOnMyAccountIcon(LaunchWebDriver.driver);
		LoginPage.enterUsername(LaunchWebDriver.driver, username);
		LoginPage.enterPassword(LaunchWebDriver.driver, password);
		LoginPage.clickOnLogin(LaunchWebDriver.driver);
	}

	
}













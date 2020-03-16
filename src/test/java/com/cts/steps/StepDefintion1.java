package com.cts.steps;

import java.io.IOException;
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

public class StepDefintion1 {
	@Given("I have {string} browser with magentopage")
	public void i_have_browser_with_magentopage(String browser) throws IOException {
		LaunchWebDriver.setUp(browser);
		LaunchWebDriver.driver.get("https://magento.com/");
	}

}

package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private static By userLocator= By.id("email");
	private static By passLocator=By.id("pass");
	private static By loginLocator=By.id("send2");
	private static By errorLocator=By.xpath("//span[contains(text(),'Invalid')]");
	private static By registerLocator=By.xpath("//span[text()='Register']");
	
	
	public static void enterUsername(WebDriver driver,String username)
	{
		driver.findElement(userLocator).sendKeys(username);
	}
	
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(passLocator).sendKeys(password);
	}
	//clickonlogin
	public static void clickOnLogin(WebDriver driver)
	{
		driver.findElement(loginLocator).click();
	}
	
	public static String getInvalidErrorMessage(WebDriver driver)
	{
		WebElement errorEle = driver.findElement(errorLocator);
		String actualErrorMessage = errorEle.getText();
		
		return actualErrorMessage;
	}
	
	public static void clickOnRegister(WebDriver driver)
	{
		driver.findElement(registerLocator).click();
	}
	
}





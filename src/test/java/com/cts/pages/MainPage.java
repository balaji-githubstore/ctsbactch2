package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
private static By logOutLocator=By.partialLinkText("Out");


	public static void waitForLogOutPresence(WebDriver driver)
	{
		WebDriverWait driverWait = new WebDriverWait(driver, 50);
		driverWait.until
		(ExpectedConditions.presenceOfElementLocated(logOutLocator));
	}
	
	public static String getCurrentTitle(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public static void clickOnLogOut(WebDriver driver)
	{
		driver.findElement(logOutLocator).click();
	}
	
}





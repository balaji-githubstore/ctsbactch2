package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	private static By firstNameLocator=By.id("firstname");
	private static By lastNameLocator =By.id("lastname");
	private static By emailAddressLocator =By.id("lastname");
	private static By countryLocator =By.id("country");
	private static By companyLocator=By.id("customer_company_type");
	private static By roleLocator =By.id("customer_individual_role");
	private static By termsLocator= By.id("agree_terms");
	private static By passwordLocator=By.id("password");
	private static By confirmPasswordLocator=By.id("confirmation");
	private static By submitLocator=By.id("confirmation");
			
	public static void enterFirstName(WebDriver driver,String firstName)
	{
		driver.findElement(firstNameLocator).sendKeys(firstName);
	}
	public static void enterLastName(WebDriver driver,String lastName)
	{
		driver.findElement(lastNameLocator).sendKeys(lastName);
	}
	public static void enterEmailAddress(WebDriver driver,String emailAddress)
	{
		driver.findElement(emailAddressLocator).sendKeys(emailAddress);
	}
	public static void selectCountry(WebDriver driver,String country)
	{
		Select selectCountry=new Select(driver.findElement(countryLocator));
		selectCountry.selectByVisibleText(country);
	}
	
	public static void selectCompanyPrimary(WebDriver driver,String company)
	{
		Select selectCompany=new Select(driver.findElement(companyLocator));
	//	selectCompany.selectByIndex(Integer.parseInt(company));
		selectCompany.selectByVisibleText(company);
	}
	
	public static void selectRole(WebDriver driver,String role)
	{
		Select selectRole=new Select(driver.findElement(roleLocator));
		selectRole.selectByVisibleText(role);
	}
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(passwordLocator).sendKeys(password);
	}
	public static void enterConfirmPassword(WebDriver driver,String password)
	{
		driver.findElement(confirmPasswordLocator).sendKeys(password);
	}
	public static void checkTermsAndConditions(WebDriver driver)
	{
		WebElement checkEle=driver.findElement(termsLocator);
	    if(!checkEle.isSelected())
	    {
	    	checkEle.click();
	    }
	}
	
	public static void clickOnSubmit(WebDriver driver)
	{
		driver.findElement(submitLocator).click();
	}
}



















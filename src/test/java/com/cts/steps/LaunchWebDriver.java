package com.cts.steps;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class LaunchWebDriver {
public static WebDriver driver;

	public static void setUp(String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/driver/iedriverserver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		
		Date date=new Date();	
		String dateStr=date.toString().replace(":", "-");
		
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File file= screenshot.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image"+dateStr+".png"));
		
		driver.quit();
	}
	
}

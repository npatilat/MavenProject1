package com.facebook.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {

	private WebDriver driver;
	String URL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		// Setting webdriver.gecko.driver property
		System.setProperty("webdriver.gecko.driver",
				"C:\\hi-skillit\\HiSkillSelenium\\newLibrary\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	}

	@Test
	public void verifyGooglePageTittle() {
		
		driver.navigate().to(URL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

package com.practice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manpreesingh\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void sumTest() {
		System.out.println("TESTING SUMMATION");
		int a = 20;
		int b = 30;
		int sum = a + b;
		Assert.assertEquals(sum, 50);
	}

	@Test
	public void subTest() {
		System.out.println("TESTING SUBTRACTION");
		int a = 50;
		int b = 30;
		int sub = a - b;
		Assert.assertEquals(sub, 20);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

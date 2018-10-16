package com.qa.DemoSite;

import org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
	public ChromeDriver driver = null; 
	String url; 
	
	@Before 
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
}
	
	@After 
	public void teardown() {
		driver.quit();
	}
	
	@Test 
	public void demoTest() throws Exception {
		driver.manage().window().maximize();
		url = "http://thedemosite.co.uk/login.php";
		driver.get(url);
		
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("TestUser");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("FormsButton2")).click();
		//driver.findElement(By.linkText("4. Login")).click();
		
	}
	
	
	
	
}

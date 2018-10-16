package com.qa.DemoSite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NamePaint {
	private ChromeDriver driver = null; 
	String url; 
	
	@Before 
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After 
	public void teardown() {
		//driver.quit();
	}
	
	@Test 
	public void demoTest() throws Exception {
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		url = "https://www.youidraw.com/apps/painter/";
		
		driver.get(url);
		driver.findElement(By.id("brush")).click();
		
		// R
		action.moveByOffset(500,100).clickAndHold().moveByOffset(0,500).release().perform();
		action.moveByOffset(0, -500).clickAndHold().moveByOffset(300,0).release().perform(); 
		//action.moveByOffset(0, -500).clickAndHold().moveByOffset(-300,0).release().perform();
	}
}
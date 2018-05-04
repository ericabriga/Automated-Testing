package com.qa.actionsTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;

import DemoQa.DroppablePage;

public class Actions {
	
	private static WebDriver driver = null;

	Actions action = null;

	@BeforeClass

	public static void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Erica/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();

	}

	@Test

	public void dragTest() throws InterruptedException {
		driver.get("http://demoqa.com/");
		driver.get("http://demoqa.com/droppable/");

		DroppablePage droppablePage = PageFactory.initElements(driver, DroppablePage.class);
    	droppablePage.dragToBox(driver);
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p"));    	
    	assertEquals("Dropped!", element.getText());
    }

	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
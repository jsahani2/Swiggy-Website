package com.listeners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListenersTestsCasess {
  
  WebDriver driver;
	@Test
	public void open_swiggy_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsahani\\install\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
	}
	@Test(dependsOnMethods = "open_swiggy_website")
	public void Search_Location() {
		driver.findElement(By.xpath("//*[@class='LukWG']")).click();
	}
	@Test(dependsOnMethods = "Search_Location")
	public void SearchDishes() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("BIRYANI");
	}
	@Test(dependsOnMethods = "SearchDishes")
	public void SelectingDishes() {
		driver.findElement(By.xpath("//*[contains(@class, '_3sbqM')]/div/div/img")).click();
		driver.findElement(By.xpath("//button[text()='Dishes']")).click();
		driver.findElement(By.xpath("//*[@aria-label='See more information about Paneer Tikka Biryani']")).click();	

	}
	@Test(dependsOnMethods = "SelectingDishes")
	public void Add_Dish_to_Cart() {
		driver.findElement(By.xpath("//*[contains(@class, 'styles_addBtnDwebReset__3-z94')]//div[text()='ADD']")).click();
		driver.findElement(By.xpath("//*[contains(@class, '_3coNr')]")).click();
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();	
	}
}

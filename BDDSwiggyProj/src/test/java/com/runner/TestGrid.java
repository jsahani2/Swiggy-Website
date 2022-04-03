package com.runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {

	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsahani\\install\\Selenium\\chromedriver\\chromedriver.exe");
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		driver = new RemoteWebDriver(url,capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		//Locate me
		driver.findElement(By.xpath("//*[@class='LukWG']")).click();
		//Search
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
		//Enter item name
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("BIRYANI");
		//click on item	 
		driver.findElement(By.xpath("//*[contains(@class, '_3sbqM')]/div/div/img")).click();
		//selecting options
		driver.findElement(By.xpath("//button[text()='Dishes']")).click();
		//click on image
		driver.findElement(By.xpath("//*[@aria-label='See more information about Paneer Tikka Biryani']")).click();	
		//add to cart
		driver.findElement(By.xpath("//*[contains(@class, 'styles_addBtnDwebReset__3-z94')]//div[text()='ADD']")).click();	
		//opening cart
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();
	}


}

package com.listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@Test
public class extentreportswiggy {

	ExtentTest logger;
	ExtentReports Report;
	WebDriver driver;

  @BeforeTest
  public void startReport() {
	  DateTimeFormatter datetime = DateTimeFormatter.ISO_LOCAL_DATE;
	  LocalDateTime now = LocalDateTime.now();
	  String cTime = datetime.format(now);
	  String project = "SwiggyBDD";
	  String reportPath = "C:\\Users\\jsahani\\Pracs Automation\\Reports\\"+project+"_"+cTime+".html";
	  Report = new ExtentReports(reportPath,false);
  
  }
  @Test
	public void open_swiggy_website() {
	  	logger = Report.startTest("Open Url");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsahani\\install\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		logger.log(LogStatus.PASS, "Open URL Has Been Passed");
		Report.endTest(logger);

	}
	@Test(dependsOnMethods = "open_swiggy_website")
	public void Search_Location() {
		logger = Report.startTest(" Search Location");
		driver.findElement(By.xpath("//*[@class='LukWG']")).click();
		logger.log(LogStatus.PASS, "Location Has Been Passed");
		Report.endTest(logger);

	}
	@Test(dependsOnMethods = "Search_Location")
	public void SearchDishes() {
		logger = Report.startTest("Search Dishes");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("BIRYANI");
		logger.log(LogStatus.PASS, "Search Dishes Has Been Passed");
		Report.endTest(logger);

	}
	@Test(dependsOnMethods = "SearchDishes")
	public void SelectingDishes() {
		logger = Report.startTest("Selecting Dishes From Options");
		driver.findElement(By.xpath("//*[contains(@class, '_3sbqM')]/div/div/img")).click();
		driver.findElement(By.xpath("//button[text()='Dishes']")).click();
		driver.findElement(By.xpath("//*[@aria-label='See more information about Paneer Tikka Biryani']")).click();	
		logger.log(LogStatus.PASS, "Selecting Dishes From Options has been Passed");
		Report.endTest(logger);

	}
	@Test(dependsOnMethods = "SelectingDishes")
	public void Add_Dish_to_Cart() {
		logger =  Report.startTest("Adding Dishes to Cart");
		driver.findElement(By.xpath("//*[contains(@class, 'styles_addBtnDwebReset__3-z94')]//div[text()='ADD']")).click();
		driver.findElement(By.xpath("//*[contains(@class, '_3coNr')]")).click();
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();
		logger.log(LogStatus.PASS, "Adding Dishes to Cart has been Passed");
		Report.endTest(logger);
	}

  @AfterClass
  public void stopReporting() {
	  Report.flush();
	  Report.close();
	  
  }

}

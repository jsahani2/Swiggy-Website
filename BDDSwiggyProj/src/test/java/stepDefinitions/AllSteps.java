package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllSteps {
	
	public static WebDriver driver;

	@Given("Jash is on swiggy page")
	public void jash_is_on_swiggy_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsahani\\install\\Selenium\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swiggy.com/");
		System.out.println("Jash is on the swiggy website");
	}
	@Given("Jash is able to enter valid location or locate me")
	public void jash_is_able_to_enter_valid_location_or_locate_me() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@class='LukWG']")).click();
	
	}
	@When("Jash clicks Locates me")
	public void jash_clicks_locates_me() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Jash Location is located ");
	}
	@Then("Jash is navigated to restaurants page")
	public void jash_is_navigated_to_restaurants_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Jash is navigated to Restaurant page");
	}
	@Given("Jash clicks on Search Button")
	public void jash_clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
		System.out.println("Jash clicks on Search Button");

	}
	@When("Jash searches for {string}")
	public void jash_searches_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("BIRYANI");
		System.out.println("Jash searches for "+string);
		
	}
	@Then("Jash clicks on Dish")
	public void jash_clicks_on_dish() {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.xpath("//*[contains(@class, '_3sbqM')]/div/div/img")).click();
	//	driver.findElement(By.xpath("//i[@class='icon-magnifier _1F77L']")).click();
		System.out.println("Jash clicks on Dish");

	}
	
	@Given("Jash is on search page")
	public void jash_is_on_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Jash is on search page");
		
	}
	@Given("Jash select dish from options")
	public void jash_select_dish_from_options() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()='Dishes']")).click();
		System.out.println("Jash select dish from options");
		
		
	}
	@When("Jash clicks on image")
	public void jash_clicks_on_image() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@aria-label='See more information about Paneer Tikka Biryani']")).click();	
		System.out.println("Jash clicks on image");	
		
	}
	@When("Jash adds dish into the cart")
	public void jash_adds_dish_into_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[contains(@class, 'styles_addBtnDwebReset__3-z94')]//div[text()='ADD']")).click();	
		System.out.println("Jash adds dish into the cart");

		
	}
	@Then("Jash open the cart")
	public void jash_open_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();
		System.out.println("Jash open the cart");

		
	}

}

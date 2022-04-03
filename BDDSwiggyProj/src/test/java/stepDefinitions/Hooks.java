package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before 
	public void beforeAnyScenario() {
		System.out.println("Open browser \nOpen Url");
	}
	
	@After
	public void afterEachScenario() {
		System.out.println("Close Browser");
	}

	

}

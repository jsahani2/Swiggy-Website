package com.runner;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue =  "stepDefinitions" ,
		tags = "@taglocation or @tagRestaurant"
		)
public class TestRunner {

	

}

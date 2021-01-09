package TestRunner;

import org.junit.runner.RunWith;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(

features="G:\\SeleniumCucumberFramework\\BDDSelenium\\src\\test\\resources\\Features\\Login.feature",
glue= {"StepDefinitions"},
monochrome=true

//dryRun= true

)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}

package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/resources/Feature"},
glue= {"stepdefinition"},plugin= {"pretty","html:/absolute/path/to/Reports/htmlreport.html"})

public class Testrunner extends AbstractTestNGCucumberTests {

}

package scenarioexecution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\login.feature",glue="stepdefinition")
public class TestRunner {

}

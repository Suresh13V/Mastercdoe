package stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\stepDefinition",glue = {"stepDefinition"}
, monochrome = true)

public class runnerclass {

}

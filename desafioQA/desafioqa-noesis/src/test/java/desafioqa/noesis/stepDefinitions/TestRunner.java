package desafioqa.noesis.stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "desafioqa.noesis.stepDefinitions" })
public class TestRunner {

}

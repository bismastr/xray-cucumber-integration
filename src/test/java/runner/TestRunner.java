package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/xray-features"},
        glue = "steps",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" })
public class TestRunner extends AbstractTestNGCucumberTests {
}

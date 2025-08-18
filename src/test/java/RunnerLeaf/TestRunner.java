package RunnerLeaf;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Practice/leafground.feature",
                name = "datadriven",glue = "stepLeaf")
public class TestRunner extends AbstractTestNGCucumberTests {
}

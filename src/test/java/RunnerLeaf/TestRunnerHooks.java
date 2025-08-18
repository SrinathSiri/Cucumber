package RunnerLeaf;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Practice/LeafHooks.feature",
                glue = "stepLeaf")
public class TestRunnerHooks extends AbstractTestNGCucumberTests {
}

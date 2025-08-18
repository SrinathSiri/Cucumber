package RunnerLeaf;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Practice/LeafBackground.feature",
glue="stepLeaf")
public class TestRunnerBackground extends AbstractTestNGCucumberTests {
}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Practice/leafground.feature",
        name = "Launch LeafGround Application and get current page url",
        glue = "stepLeaf"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

package RunnerLeaf;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Practice/LeafTags.feature",
                glue = "stepLeaf",
                tags = "not @regression",
                monochrome = true)
public class TestTags extends AbstractTestNGCucumberTests {
}

package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Hooks/HRMHooks.feature",
                glue = "step")
public class TestRunnerHooks extends AbstractTestNGCucumberTests {
}

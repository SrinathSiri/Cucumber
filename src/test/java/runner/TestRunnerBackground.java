package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Background/background.feature",
        name = "Login Appl and click Admin button",
        glue = "step"
)
public class TestRunnerBackground extends AbstractTestNGCucumberTests{
}

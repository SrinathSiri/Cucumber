package stepLeaf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefintion {
    WebDriver driver = null;
    @Given("Launch the chrome browser")
    public void launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @When("Load leafground Application")
    public void load_leafground_application() {
        driver.get("https://leafground.com/");
    }
    @Then("Take current page title")
    public void take_current_page_title() {
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}

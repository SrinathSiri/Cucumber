package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver = null;

    @Given("Open browser and enter application url")
    public void open_browser_and_enter_application_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.manage().deleteAllCookies();
        driver.get("https://accounts3.shutterfly.com/");
    }

    @When("Enter username, password and click on login")
    public void enter_username_password_and_click_on_login() throws Exception {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john.sample@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gudeat18@");
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(15000);
    }

    @Then("Verification for HomePage")
    public void verification_for_home_page() {
        String homeurl = driver.getCurrentUrl();
        if (homeurl.equalsIgnoreCase("https://accounts3.shutterfly.com/")) {
            System.out.println("Home URL Verified");
        }
    }

    @When("Click on Profile icon and logout")
    public void click_on_profile_icon_and_logout() throws Exception {
        driver.findElement(By.xpath("(//div[@class='lg:sfly-lib-flex sfly-lib-items-center sfly-lib-justify-between sfly-lib-hidden'])[1]")).click();
        Thread.sleep(3000);
    }

    @When("Close Browser")
    public void close_browser() {
        driver.close();
    }
}

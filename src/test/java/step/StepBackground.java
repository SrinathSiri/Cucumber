package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepBackground {
    WebDriver driver = null;

    @Given("login by providing username password")
    public void login_by_providing_username_password() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
    }

    @When("On homepage click on Admin")
    public void on_homepage_click_on_admin(){
        driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
    }

    @Then("get the adminpage url")
    public void get_the_adminpage_url() throws Exception{
        Thread.sleep(5000);
        String adminurl = driver.getCurrentUrl();
        System.out.println("Admin page url is : "+adminurl);
    }

    @When("on homepage click on myinfo")
    public void on_homepage_click_on_myinfo() {
        driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[6]")).click();
    }

    @Then("get the myinfopage url")
    public void get_the_myinfopage_url() throws Exception{
        Thread.sleep(5000);
        String myinfourl = driver.getCurrentUrl();
        System.out.println("MyInfo page url is : "+myinfourl);
    }


    @When("on homepage click on performance")
    public void on_homepage_click_on_performance() {
        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[7]")).click();
    }

    @Then("get the performancepage url")
    public void get_the_performancepage_url() throws Exception{
        Thread.sleep(5000);
        String perforurl = driver.getCurrentUrl();
        System.out.println("Performance page url is : "+perforurl);
    }

    @Then("browser close")
    public void browser_close() throws Exception{
        Thread.sleep(3000);
        driver.close();
    }
}

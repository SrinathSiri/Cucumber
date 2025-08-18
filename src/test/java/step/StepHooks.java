package step;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepHooks {

    private WebDriver driver =  null;

    @Before
    public void open_browser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
    }

    @BeforeStep
    public void loginOrangeHRMApp() throws Exception{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @When("add employee")
    public void add_employee() {
        System.out.println("Add Employee");
    }
    @When("edit employee")
    public void edit_employee() {
        System.out.println("Edit Employee");
    }

    @When("delete employee")
    public void delete_employee() {
        System.out.println("Delete Employee");
    }

    @AfterStep
    public void logoutHRM() throws Exception{
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(4000);
    }

    @After
    public void close_browser(){
        driver.close();
    }
}

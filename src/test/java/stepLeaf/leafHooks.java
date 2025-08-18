package stepLeaf;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;

public class leafHooks {

    @Before
    public void browserLaunch(){
        System.out.println("Browser  Launched");
    }

    @BeforeStep
    public void ApplicationLoaded(){
        System.out.println("Application loaded");
    }

    @Given("EmployeeAdd")
    public void employee_add() {
        System.out.println("Employee Added");
    }
    @Given("EmployeeEdit")
    public void employee_edit() {
        System.out.println("Employee Edited");
    }
    @Given("EmployeeDelete")
    public void employee_delete() {
       System.out.println("Employee Deleted");
    }

    @AfterStep
    public void ApplicationLogout(){
        System.out.println("Application logout successfully");
    }

    @After
    public void browserClose(){
        System.out.println("Browser closed");
    }

}

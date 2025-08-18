package stepLeaf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeafParameter {

    @Given("User name {string}")
    public void user_name(String name) {
        System.out.println("Username is : "+name);
    }
    @When("Tech Architech {string}")
    public void tech_architech(String pname) {
        System.out.println("Tech Architech : "+pname);
    }
    @Then("Business Person {string}")
    public void business_person(String yname) {
        System.out.println("Business Person : "+yname);
    }
}

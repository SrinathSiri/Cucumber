package stepLeaf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LeafBackground {
    @Given("LaunchBrowser and load Application url")
    public void launch_browser_and_load_application_url() {
        System.out.println("Launch Chrome Browser & load SFLY Production Application");
    }
    @When("Mug thumbnail page")
    public void mug_thumbnail_page() {
        System.out.println("Moving to Mug thumbnail page");
    }
    @When("Card thumbnail page")
    public void card_thumbnail_page() {
        System.out.println("Moving to Card thumbnail page");
    }
}

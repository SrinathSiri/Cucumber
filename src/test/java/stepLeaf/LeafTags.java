package stepLeaf;

import io.cucumber.java.en.Given;

public class LeafTags {

    @Given("smoketesting")
    public void smoketesting() {
        System.out.println("Smoke Testing");
    }

    @Given("regressiontesting")
    public void regressiontesting() {
        System.out.println("Regression Testing");
    }

    @Given("sanitytesting")
    public void sanitytesting() {
        System.out.println("Sanity Testing");
    }
}

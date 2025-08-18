package stepLeaf;

import io.cucumber.java.en.Given;

public class LeafDataDriven {
    @Given("username {string} password {string}")
    public void username_password(String user1, String pw1) {
        System.out.println("Username is : "+user1+" Password is : "+pw1);
    }
    }

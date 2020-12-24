package com.myapp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on the landing page");

    }

    @When("user enters credentials")
    public void user_enter_credentials() {
        System.out.println("user enters credentials");
     //   throw new io.cucumber.java.PendingException();
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("user clicks login button");
       // throw new io.cucumber.java.PendingException();
    }

    @Then("user is supposed to see the Welcome Message")
    public void user_suppose_to_see_welcome_message() {
        System.out.println("user is supposed to see The Welcome message");
       // throw new io.cucumber.java.PendingException();
    }

}

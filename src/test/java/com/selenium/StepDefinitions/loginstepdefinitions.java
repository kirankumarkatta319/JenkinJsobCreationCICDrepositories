package com.selenium.StepDefinitions;

import com.selenium.Steps.Basesteps;
import com.selenium.Steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinitions {



    @Given("the user login to amazon")
    public void the_user_login_to_amazon() {
        Basesteps.browserInitialization();
        LoginSteps.login();
    }

    @When("the user selects the mobile in search")
    public void the_user_selects_the_mobile_in_search() {
        System.out.println("Second Step");
    }
    @Then("the user successfully login")
    public void the_user_successfully_login() {
        System.out.println("third Step");
    }
}

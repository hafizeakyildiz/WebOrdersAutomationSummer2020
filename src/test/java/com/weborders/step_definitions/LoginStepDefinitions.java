package com.weborders.step_definitions;

import com.weborders.pages.LoginPage;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.URL;

public class LoginStepDefinitions {
    LoginPage loginpage = new LoginPage();
    //instance = object

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user logs in")
    public void user_logs_in() {
        loginpage.login();

    }

    @Then("user should see {string} page title")
    public void user_should_see_page_title(String string) {

    }

}

package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginsteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept all cookies$")
    public void iAcceptAllCookies() {
        new HomePage().acceptCookies();
    }

    @And("^I accept all on How we use cookies$")
    public void iAcceptAllOnHowWeUseCookies() {
        new HomePage().acceptAll();
    }

    @Then("^I click on Online Bingo$")
    public void iClickOnOnlineBingo() {
        new HomePage().clickonOnlineBingo();
    }
}

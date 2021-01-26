package com.facebook.stepDefinitions;

import com.facebook.pageObjects.LoginPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends LoginPageObject {

	LoginPageObject lpo = new LoginPageObject();

	@Given("^I am a user of facebook application\\.$")
	public void i_am_a_user_of_facebook_application() throws Throwable {
		lpo.openURL();
	}
	
	@When("^I enter valid Shammi$")
	public void i_enter_valid_Shammi() throws Throwable {
		lpo.enterUsername();
	}

	@When("^I enter valid username\\.$")
	public void i_enter_valid_username() throws Throwable {
		lpo.enterUsername();
	}

	@When("^I enter valid Password\\.$")
	public void i_enter_valid_Password() throws Throwable {
		lpo.enterPassword();
	}

	@When("^I click on Login button\\.$")
	public void i_click_on_Login_button() throws Throwable {
		lpo.clickLoginButton();
	}

	@Then("^user should be able to log in successfully\\.$")
	public void user_should_be_able_to_log_in_successfully() throws Throwable {
		lpo.verifyLogin();
	}

	@When("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
		lpo.enterFirstName();
	}
	
}

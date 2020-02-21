package com.qa.stepDefinitions;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginSteps() {
		super();
	}

	@Given("^User launches the browser$")
	public void user_launches_the_browser() {
		initialization();
	}

	@When("^Title is demoaut$")
	public void title_is_demoaut() throws Throwable {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginTitle();
		Assert.assertEquals("Welcome: Mercury Tours", title);
	}

	@Then("^user logs into app$")
	public void user_enters_userid_and_password() {

		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));

	}

//@Then("^homepage is displayed$")
//public void homepage_is_displayed() throws Throwable {
//}
//
//@Then("^user checks for home page title$")
//public void user_checks_for_home_page_title() throws Throwable {
//}

}

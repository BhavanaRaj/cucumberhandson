package CaseStudy.cucmber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDemo {
	@Given("^user not logged in$")
	public void user_not_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("user not logged in");
	}

	@When("^user performs login mercury and mercury$")
	public void user_performs_login_mercury_and_mercury() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("user performs login mercury and mercury");
	}

	@Then("^logged in successfully$")
	public void logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("logged in successfully");
	}

	@When("^user performs login tutorial and tutorial$")
	public void user_performs_login_tutorial_and_tutorial() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("user performs login tutorial and tutorial");
	}

}

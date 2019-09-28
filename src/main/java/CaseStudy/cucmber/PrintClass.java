package CaseStudy.cucmber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintClass {
	String str;
	@When("^user enters hello world$")
	public void user_enters_hello_world() throws Throwable {
	    str="hello world";
	}

	@Then("^console displays the same$")
	public void console_displays_the_same() throws Throwable {
	    System.out.println(str);
	}

}

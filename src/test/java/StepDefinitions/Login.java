package StepDefinitions;

import BaseClass.Base;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;

public class Login {
	
	
	LoginPage page=new LoginPage(Base.driver);
	
	@Given("^User tries to login to the application$")
		public void user_tries_to_login_to_the_application() {
		    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful");
		page.login();
		    //throw new io.cucumber.java.PendingException();
		}




}

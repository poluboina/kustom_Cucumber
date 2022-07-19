package bg;

import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonTest {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		Reporter.log("user is on login page",true);
	}

	@When("user enter username")
	public void user_enter_username() {
		Reporter.log("user enter username",true);
	}

	@And("user enter password")
	public void user_enter_password() {
		Reporter.log("user enter password",true);
	}

	

	
}

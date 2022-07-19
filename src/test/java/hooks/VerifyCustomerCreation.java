package hooks;

import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCustomerCreation {
	
	@Before
	public void login()
	{
		Reporter.log("Login",true);
	}

	@After
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	@Given("user on customer page")
	public void user_on_customer_page() {
		Reporter.log("user on customer page",true);
	}

	@When("user enters customer data")
	public void user_enters_customer_data() {
		Reporter.log("user enters customer data",true);
	}

	@And("clicks create button")
	public void clicks_create_button() {
		Reporter.log("clicks create button",true);
	}

	@Then("customer should be created")
	public void customer_should_be_created() {
		Reporter.log("customer should be created",true);
	}
	
	
}

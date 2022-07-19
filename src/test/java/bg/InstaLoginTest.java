package bg;

import org.testng.Reporter;

import io.cucumber.java.en.Then;

public class InstaLoginTest {
	@Then("Insta home page should be displayed")
	public void insta_home_page_should_be_displayed() {
		Reporter.log("Insta home page is displayed",true);
	}
}

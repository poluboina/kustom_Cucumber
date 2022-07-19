package bg;

import org.testng.Reporter;

import io.cucumber.java.en.Then;

public class FBLoginTest {
	@Then("FB home page should be displayed")
	public void fb_home_page_should_be_displayed() {
		Reporter.log("FB home page is displayed",true);
	}
}

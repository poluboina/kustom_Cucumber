package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginTest {
	WebDriver driver;
	
	@Given("^user on facebook page$")
	public void user_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikr\\eclipse-workspace\\KustomCucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		Reporter.log("Facebook Login Page is Displayed, PASS",true);
	}

	@When("^user enters invalid username as (.*)$")
	public void user_enters_invalid_username_as_raghav(String un) {
		
		driver.findElement(By.id("email")).sendKeys(un);
	}

	@And("^user enters invalid password as (.*)$")
	public void user_enters_invalid_password_as_abcd(String pw) {
		driver.findElement(By.id("pass")).sendKeys(pw);
	}

	@And("^user clicks on loginButton$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("^Error Message should be displayed$")
	public void error_message_should_be_displayed() {
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		if(errorMsg.isDisplayed())
		{
			Assert.assertTrue(true);
			Reporter.log("Error Message is Displayed, PASS",true);
		}
		else
		{
			Reporter.log("Error Message is not Displayed, FAIL",true);
			Assert.assertTrue(false);
		}
	}
	
	
}

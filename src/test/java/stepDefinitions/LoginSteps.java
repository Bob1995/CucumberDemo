package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver webdriver;

	@Given("Navigate to url")
	public void NaviagateToURL() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
		webdriver.get("https://practicetestautomation.com/practice-test-login/");
		webdriver.manage().window().maximize();
	}

	@When("Enter username")
	public void enterUsername() {
		webdriver.findElement(By.id("username")).sendKeys("student");
	}

	@When("Enter password")
	public void enterPassword() {
		webdriver.findElement(By.name("password")).sendKeys("Password123");
	}

	@Then("Click on Login Button")
	public void clickOnLoginButton() {
		webdriver.findElement(By.id("submit")).click();
	}

	@Then("Close browser")
	public void closeBrowser() {
		webdriver.quit();
	}

}

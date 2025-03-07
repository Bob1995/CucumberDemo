package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver webdriver;
	
	@When("navigate to amazon url")
	public void enterUserName() {
		WebDriverManager.chromedriver().setup();
		webdriver=new ChromeDriver();
		webdriver.get("https://www.amazon.in/");
		webdriver.manage().window().maximize();
		webdriver.close();
		
	}

}

package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SuccessfullLogin {
	public WebDriver driver;

	@Given("User should be logged into application")
	public void user_should_be_logged_into_application() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("Valid detailed entered")
	public void valid_detailed_entered() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manipal822@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("manipal123");
	}

	@When("Clicked on Login")
	public void clicked_on_login() {
		driver.findElement(By.xpath("//input[@type= 'submit' and @value='Log in']")).click();
	}

	@Then("Home screen should be displayed")
	public void home_screen_should_be_displayed() {
		String pageTitle1 = driver.getTitle();
		System.out.println(pageTitle1);
	}
}

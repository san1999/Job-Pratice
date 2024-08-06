package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	WebDriver driver = new ChromeDriver();
	@Given("user is in login page.")
	public void user_is_in_login_page() {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Your Account')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']")).click();
	}

	@When("user enters username and password.")
	public void user_enters_username_and_password() {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9182942447");
		driver.findElement(By.xpath("//input[@aria-labelledby='continue-announce']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("San@13121999");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	@And("clicks login button.")
	public void clicks_login_button() {
		driver.findElement(By.id("continue"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("user enters to login page.")
	public void user_enters_to_login_page() {
	  
	}

	@And("closed browser.")
	public void closed_browser() {
		driver.close();
	   
	}




}

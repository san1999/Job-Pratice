//Automated by Sandeep

package Sandeep.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Sandeep.pageobjects.CartPage;
import Sandeep.pageobjects.CheckoutPage;
import Sandeep.pageobjects.Confirmationpage;
import Sandeep.pageobjects.Landingpage;
import Sandeep.pageobjects.ProductCatalouge;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Errorvalidation{

	@Test
	public void submitOrder() throws InterruptedException{
	
	
		String productname= "ZARA COAT 3";
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\gooth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Landingpage landingPage = new Landingpage(driver);
		landingPage.goTO();
		
		landingPage.loginApplication("goothysandeep@gmail.com","Sa@123456");
		
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
		
		
		
	}

}

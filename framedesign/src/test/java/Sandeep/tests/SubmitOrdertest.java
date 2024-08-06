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

public class SubmitOrdertest{

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
		
		landingPage.loginApplication("goothysandeep@gmail.com","San@123456");
		
		ProductCatalouge productcatalouge = new ProductCatalouge(driver);
		List<WebElement>products = productcatalouge.getProductLists();
		productcatalouge.addProductToCart(productname);
		productcatalouge.goToCartPage();
		
		CartPage cartPage = new CartPage(driver);
		Boolean match = cartPage.VerifyProductDisplay(productname);
		Assert.assertTrue(match);
		cartPage.goToCheckout();
		
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		checkoutpage.selectcountry("India");
		checkoutpage.submitOrder();
		
		Confirmationpage confiramationpage = new Confirmationpage(driver);
		String confirmMessage = confiramationpage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
		
		
	}

}

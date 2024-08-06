package Sandeep.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Sandeep.pageobjects.Landingpage;

public class SeleniumTesting {

    public static void main(String[] args) {
        String productname = "ZARA COAT 3";
        
      System.setProperty("webdriver.chrome.driver" , "C:\\Users\\gooth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      		//WebDriverManager.chromedriver().setup();
      		ChromeOptions options = new ChromeOptions();
      		
      		options.addArguments("--remote-allow-origins=*");
      		WebDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/client");
        
        Landingpage landingpage = new Landingpage(driver);
        
        driver.findElement(By.xpath("//input[@placeholder='email@example.com']")).sendKeys("goothysandeep@gmail.com");
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("San@123456");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        
        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
        
        WebElement prod = products.stream().filter(product -> 
        product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
        
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
        
        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
        
        List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
        
        Boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productname));
        Assert.assertTrue(match);
        
        driver.findElement(By.cssSelector(".totalRow button")).click();
        
        Actions a = new Actions(driver);
        a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
        
        driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
        driver.findElement(By.cssSelector(".action__submit")).click();
        
        System.out.println(driver.findElement(By.cssSelector(".hero-primary")).getText());
        driver.close();
    }
}

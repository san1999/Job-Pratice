import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Selenium {
	
	public static void main(String []args) throws IOException{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement cross = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@role='button']")));
		//cross.click();

		Actions act = new Actions(driver);
		
		  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
		  
		  act.moveToElement(driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"))).build().perform();
		  
		  driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']")).click();		  
		  
		  
		  String text = driver.findElement(By.xpath("//h1[text()='DSLR & Mirrorless']")).getText();
		  
		  
		  TakesScreenshot shot = (TakesScreenshot)driver;
		  File file = shot.getScreenshotAs(OutputType.FILE);
		  
		  File obj= new File("screenshot.png");
		  
		  FileUtils.copyFile(file,obj);
		 
		  Assert.assertEquals("DSLR & Mirrorless",text);
		  driver.close();
	}

}

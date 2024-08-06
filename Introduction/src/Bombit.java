import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bombit {

	public static void main(String[] args) throws InterruptedException{
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\GOOTY SAINATH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  ChromeOptions options = new ChromeOptions(); options.addExtensions(new
		  File("C:\\Users\\GOOTY SAINATH\\Downloads\\Adblocker.crx"));
		  options.addArguments("--remote-allow-origins=*"); WebDriver driver = new
		  ChromeDriver(options);
		  
		  
		  driver.manage().window().maximize();
		  
		  
		  
		  driver.get("https://mytoolstown.com/smsbomber");
		  
		  
		  Thread.sleep(5000); Set<String> handles=driver.getWindowHandles();
		  
		  Iterator it=handles.iterator();
		  
		  String parentid = (String) it.next(); String childid = (String) it.next();
		  
		  driver.switchTo().window(childid); driver.close();
		  driver.switchTo().window(parentid);
		  
		  
		  driver.findElement(By.xpath("//div[@class='col-sm-4'] //a[@class='btn btn-success btn-lg']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Friend Mobile No.']")).sendKeys("8978326417");
		  driver.findElement(By.xpath("//input[@id='count']")).sendKeys("2");
		  driver.findElement(By.xpath("//label[@for='mediumSpeed']")).click();
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		 
		
		
		
	}

}

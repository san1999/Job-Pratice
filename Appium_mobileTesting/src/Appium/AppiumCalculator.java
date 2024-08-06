package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumCalculator {



		public static void main(String[] args) throws MalformedURLException {
			
			DesiredCapabilities obj = new DesiredCapabilities();
			obj.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			obj.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			obj.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			obj.setCapability(MobileCapabilityType.VERSION,"14.0");
			
			obj.setCapability("appPackage", "com.google.android.calculator");
			obj.setCapability("appActivity","com.android.calculator2.Calculator");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,obj);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
			
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"9\"]")).click();
			
			//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]")).click();
			
		String result =	driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_preview\"]")).getText();
			
			
			Assert.assertEquals(result, "16");
			//driver.quit();
		}
}

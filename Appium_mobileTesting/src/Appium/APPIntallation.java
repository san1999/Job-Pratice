package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class APPIntallation {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities obj = new DesiredCapabilities();
		obj.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		obj.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		obj.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		obj.setCapability(MobileCapabilityType.PLATFORM_VERSION,"14.0");
		obj.setCapability(MobileCapabilityType.APP,"C:\\Users\\GOOTY SAINATH\\Downloads\\com.wt.apkinfo-2.4.9-free-www.apksum.com.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,obj);
		
		
	}

}

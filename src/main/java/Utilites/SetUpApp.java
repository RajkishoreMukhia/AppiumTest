package Utilites;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetUpApp {
	
	//Initialize the appium driver
	public static AppiumDriver<MobileElement> driver;
	
	// Set capabilites for android app
	public void startApp() {
	
		DesiredCapabilities capabilites =  new DesiredCapabilities();
		capabilites.setCapability("isHeadless", true);
		capabilites.setCapability("platformVersion", "8.1");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("appPackage", "io.appium.android.apis");
		capabilites.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabilites.setCapability("app", "./Application/ApiDemos-debug.apk");
		capabilites.setCapability("deviceName", "Android");
		
		try {
			
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilites);
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	
	}

}

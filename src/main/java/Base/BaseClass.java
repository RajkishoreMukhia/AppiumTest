package Base;

import org.apache.log4j.PropertyConfigurator;
import Utilites.SetUpApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	
	//Intialise driver
	public static AppiumDriver<MobileElement> wd ;
	
	//For Appium local servise  
	AppiumDriverLocalService service;
	
		
	
	//Start appium driver localy
	public void startAppium() {
		
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	
	//Setup and lounch application
	public void setupApp() {
		SetUpApp set = new SetUpApp();
		set.startApp();
		wd = SetUpApp.driver;
	}
	
	
	//set path for logging
	public void logging() {
		
		PropertyConfigurator.configure("./src/test/resources/log4j.properties");		
	}
	
	
	//method for stop the driver
	public void stopDriver() {
		wd.quit();
//		wd.close();
	}
	
	//Close the appium
	public void closeAppium() {
		service.stop();
	}
	
}
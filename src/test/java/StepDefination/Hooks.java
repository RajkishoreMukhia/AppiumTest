package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Base.BaseClass;
import Utilites.Loger;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends BaseClass{

	Loger log = new Loger("Hooks");
	
	//start the server by using hokes
	@Before
	public void startServer() {
		
		log.loger.info("Start Appium ");
		startAppium();
		
	}
	
	//stop the driver by using after hokes
	@After
	public void stopWebDeriver() {
		log.loger.info("Stop the Driver");
		stopDriver();
		
	}
	
	//close the server by using after hokes
	@After
	public void cloesServer() throws InterruptedException {
		
		log.loger.info("Close the Server");
		Thread.sleep(3000);
		closeAppium();
		
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}
}

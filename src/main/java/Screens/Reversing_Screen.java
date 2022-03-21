package Screens;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Reversing_Screen {

	//Initialize the appium driver
	public AppiumDriver<MobileElement> driver;
	
	//create constructor for page factory
	public Reversing_Screen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	//Find Locators by AndroidFindBy
	@AndroidFindBy(accessibility = "Animation")
	public AndroidElement animation_btn;
	
	@AndroidFindBy(accessibility = "Reversing")
	public AndroidElement reversing_btn;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/startButton")
	public AndroidElement plya_btn;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/reverseButton")
	public AndroidElement revers_btn;
	
	//Create method for touch action 
	public void clickOnAniamtion() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(animation_btn))).perform();
    }
	
	//Create method for touch action 
	public void clickReversing() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(reversing_btn))).perform();
    }
	
	//Create method for touch action 
	public void clickPlay() throws Throwable {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(plya_btn))).perform();
		Thread.sleep(3000);
    }
	
	//Create method for touch action 
	public void clickRevers() throws Throwable {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(revers_btn))).perform();
		Thread.sleep(2000);
    }
	
	
}

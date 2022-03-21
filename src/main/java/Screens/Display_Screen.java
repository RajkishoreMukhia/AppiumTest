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

public class Display_Screen {

	//Initialize the appium driver
	public AppiumDriver<MobileElement> driver;
	
	//create constructor for page factory
	public Display_Screen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	//Find Locators by AndroidFindBy
	@AndroidFindBy(accessibility = "App")
	public AndroidElement app_btn;
	
	@AndroidFindBy(accessibility = "Action Bar")
	public AndroidElement actionBar_btn;
	
	@AndroidFindBy(accessibility = "Display Options")
	public AndroidElement display_btn;
	
	
	@AndroidFindBy(id = "io.appium.android.apis:id/toggle_show_home")
	public AndroidElement showHome_btn;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/toggle_show_title")
	public AndroidElement showTtile_btn;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/toggle_show_custom")
	public AndroidElement showCustom_btn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")
	public AndroidElement ShowHomeImg;
	
	@AndroidFindBy(id = "android:id/action_bar")
	public AndroidElement ShowTitle;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Custom View!\"]")
	public AndroidElement ShowCustom;
	
	
	//Create method for touch action 
	public void clickAppBar() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(app_btn))).perform();
	}
	
	//Create method for touch action 
	public void clickActionBar() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(actionBar_btn))).perform();
	}
	
	//Create method for touch action 
	public void clickDisplayBar() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(display_btn))).perform();
	}
	
	//Create method for touch action 
	public void clickShowHomeBtn() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(showHome_btn))).perform();
	}
	
	//Create method for touch action 
	public void clickShowTitleBtn() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(showTtile_btn))).perform();
	}
	
	//Create method for touch action 
	public void clickShowCustomBtn() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(showCustom_btn))).perform();
	}
	
}

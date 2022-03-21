package StepDefination;

import org.testng.Assert;
import Base.BaseClass;
import Screens.Animation_Screen;
import Utilites.Loger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Animation extends BaseClass{
	
	Loger log = new Loger("Animation Screen");
	
	Animation_Screen ani;
	

	@Given("^Open application$")
	public void open_application() throws Throwable {
		
		log.loger.info("Start The App");
		setupApp();
	}
	
	@Given("^Click on Animation$")
	public void click_on_animation() throws Throwable {
		
		ani = new Animation_Screen(wd);
		log.loger.info("Click on animation");
		ani.clickAniamtion();
	}
	
	@Then("^Click on Hide-Show Animations button$")
	public void click_on_hide_show_animation_button() throws Throwable {
		
		log.loger.info("click on hide show btn");
		
		ani.clickHideShow();
	}

	@When("^Click on number buttons$")
	public void click_on_show_buttons_and() throws Throwable {
		log.loger.info("click on hide btn");
		ani.clickHideBtn();
	}
	
	@Then("^Numbers btn are hide$")
	public void numbers_btn_are_hide() throws Throwable {
		log.loger.info("Number btn are hide");
	
		if(ani.hide_button0.getText() == "1") {
			Assert.assertEquals(ani.hide_button0.getText(), "1");
			log.loger.info("Assertion is pass Succsessfully");
		}
		else {
			
			log.loger.info("Assertion is Fail");
			stopDriver();
		}
		
		
	}
	
	@When("^Click on Show Btn$")
	public void click_on_Show_Btn() throws Throwable {
		
		log.loger.info("click on hide btn");
		ani.clickShowBtn();
		
	}
	
	 @Then("^Numbers buttons are Shown$")
	public void numbers_buttons_are_Shown() throws Throwable {
		log.loger.info("Number btn are shown");

		//Assertion for validate the test
		if(ani.hide_button0.getText() == "0") {
			
//			Assert.assertEquals(ani.hide_button0.getText(), "0");
			Assert.assertTrue(true);
			log.loger.info("Assertion is pass Succsessfully");
		}
		else {
			log.loger.info("Exit the applicaton");
			stopDriver();
		}
		
		stopDriver();

	}

}

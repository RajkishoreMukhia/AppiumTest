package StepDefination;

import org.testng.Assert;

import Base.BaseClass;
import Screens.Display_Screen;
import Utilites.Loger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Display extends BaseClass {
	
	Loger log = new Loger("Display");
	Display_Screen dis ;
	

	@Given("^Click on App Tab$")
	public void click_on_App() throws Throwable {
		dis = new Display_Screen(wd);
		dis.clickAppBar();
	    
	}

	@Then("^Click on Action Bar Tab$")
	public void click_on_Action_Bar_Button() throws Throwable {
		dis.clickActionBar();
	}

	@Then("^Click on Display option Tab$")
	public void click_on_Display_option() throws Throwable {
		dis.clickDisplayBar();
	}

	@When("^Click on DISPLAY_SHOW_HOME button$")
	public void click_on_DISPLAY_SHOW_HOME() throws Throwable {
		dis.clickShowHomeBtn();
	}

	@Then("^The File Logo appear in manu bar$")
	public void the_File_Logo_appear_in_manu_bar() throws Throwable {
		Thread.sleep(2000);
		
		boolean isShow = dis.ShowHomeImg.isDisplayed();
		if(isShow == true) {
			Assert.assertEquals(isShow, true);
			log.loger.info("Assertion Show Home Logo apper successfully");
		}
		else {
			stopDriver();
		}

		
		stopDriver();
	}

	@When("^Click on DISPLAY_SHOW_TITLE button$")
	public void click_on_DISPLAY_SHOW_TITLE() throws Throwable {
		dis.clickShowTitleBtn();
	}

	@Then("^The Title appear in manu bar$")
	public void the_Title_appear_in_manu_bar() throws Throwable {
		Thread.sleep(2000);
		
		String isShow = dis.ShowTitle.getText();
		
		if(isShow == null) {
			Assert.assertEquals(isShow, null);
			log.loger.info("Assertion Show Title hide pass successfully");
		}
		else {
			stopDriver();
		}
		
		
		
		stopDriver();
	}

	@When("^Click on DISPLAY_SHOW_CUSTOM button$")
	public void click_on_DISPLAY_SHOW_CUSTOM() throws Throwable {
		dis.clickShowCustomBtn();
	}

	@Then("^The Custom View  appear in manu bar$")
	public void the_Custom_View_appear_in_manu_bar() throws Throwable {
		Thread.sleep(2000);
	
		boolean isShow = dis.ShowCustom.isDisplayed();
		if(isShow == true) {
			Assert.assertEquals(isShow, true);
			log.loger.info("Assertion Show Custom view pass successfully");
		}
		else {
			stopDriver();
		}
		
		stopDriver();
	}
}

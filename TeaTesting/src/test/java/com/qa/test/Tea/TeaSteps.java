package com.qa.test.Tea;
	
	import static org.junit.Assert.assertTrue;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

import com.qa.Tea.TeaTest;

import cucumber.api.PendingException;
	import cucumber.api.java.After;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import junit.framework.Test;
	import junit.framework.TestCase;
	import junit.framework.TestSuite;


	public class TeaSteps {
	WebDriver driver;

	String url = "http://www.practiceselenium.com/welcome.html";

	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:/Development/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.get(url);

	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	TeaTest page = PageFactory.initElements(driver, TeaTest.class);
	page.menuClick();
	   
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	assertTrue(!url.equals(driver.getCurrentUrl()));
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	TeaTest page = PageFactory.initElements(driver, TeaTest.class);
	page.checkoutClick();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	assertTrue(!url.equals(driver.getCurrentUrl()));
	}
	@After
	public void tearDown() {
	driver.close();
	driver.quit();
	}
	   
}


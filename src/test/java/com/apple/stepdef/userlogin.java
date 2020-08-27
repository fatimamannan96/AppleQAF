package com.apple.stepdef;

import com.apple.common.applesbase;
import com.apple.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userlogin extends applesbase {
	
	
	
	@Given("^I Am apples website$")
	public void i_Am_apples_website() {
	    LaunchBrowser();
	}

	@Given("^click on the bag icon$")
	public void click_on_the_bag_icon() {
	 
	}

	@Given("^click on sign in$")
	public void click_on_sign_in() {
	   
	}

	@When("^I type in my email ID and password$")
	public void i_type_in_my_email_ID_and_password(){
	   
	}

	@Then("^i can see a succesfully logged in message$")
	public void i_can_see_a_succesfully_logged_in_message() {
	   
	}


}

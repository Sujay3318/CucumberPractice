package com.org.gluecode;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginGlueCode {
	
	
	WebDriver driver;
	LoginPage lp;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	     driver=new ChromeDriver();
	     lp=new LoginPage(driver);
	     lp.navigateToLoginPage("https://crio-qkart-frontend-qa.vercel.app/login");
	}

	@When("enter username for login")
	public void enter_username_for_login() {
	    // Write code here that turns the phrase above into concrete actions
	   lp.enterUsername("sujay06");
	}

	@When("enter password for login")
	public void enter_password_for_login(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    lp.enterPassword("sujay06");
	}


	

@When("Click on login btn")
public void click_on_login_btn() {
    // Write code here that turns the phrase above into concrete actions
   lp.clickonLogin();
}
@Then("verfiy user name in page")
public void verfiy_user_name_in_page() {
    // Write code here that turns the phrase above into concrete actions
    
}

	
	
	@Given("enter username of user for registartion name1")
	public void enter_username_of_user_for_registartion_name1() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("enter passwrod of user for registationabc")
	public void enter_passwrod_of_user_for_registationabc() {
	    // Write code here that turns the phrase above into concrete actions

	}

	

	@Given("enter username of user for registartion name2")
	public void enter_username_of_user_for_registartion_name2() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("enter passwrod of user for registationxyz")
	public void enter_passwrod_of_user_for_registationxyz() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	


}

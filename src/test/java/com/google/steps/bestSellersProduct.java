package com.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.testbase;
import com.google.pages.bestsellersProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bestSellersProduct extends testbase {


	
	@Given("I am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		launchBrowser();
		
	    
	}
	@When("I click on the all button")
	public void i_click_on_the_all_button() {
	
	}

	@When("I click on the best seller button")
	public void i_click_on_the_best_seller_button() {
	  
		bestsellersProductPage bp = new bestsellersProductPage(driver);
		bp.clickBestseller();
		
	}

	@Then("I can see the list of best selling products successfully")
	public void i_can_see_the_list_of_best_selling_products_successfully() {
	    
		bestsellersProductPage bp = new bestsellersProductPage(driver);
		bp.gettingbestsellerText();
		
		
		
		
	}
	
	
}

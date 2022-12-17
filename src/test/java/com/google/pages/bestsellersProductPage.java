package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestsellersProductPage {

		WebDriver driver;
		
		public bestsellersProductPage (WebDriver dr)  {
		
			this.driver = dr;
			PageFactory.initElements(dr, this);		
	}
	
		@FindBy(xpath = "(//a[@class='hmenu-item' and contains (text(), 'Best Sellers')])[1]")
		WebElement bestseller;
		
		public void clickBestseller() {
		bestseller.click();
}
		@FindBy(xpath= "//span[@class='a-size-extra-large a-color-base _p13n-zg-banner-landing-page-header_style_zgLandingPageBannerText__3HlJo']")
		WebElement bestsellerText;
		
		public void gettingbestsellerText() {
		
		System.out.println(bestsellerText.getText());	
			
			
}
}
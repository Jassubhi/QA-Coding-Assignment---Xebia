package Aspiration.PagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Aspiration.ConfigurationClass.xpathConfiguration;


public class productPage {
	WebDriver driver;
	
	xpathConfiguration xp = new xpathConfiguration();
	//Locating web elements of ProductPage.
	By aspiration_card = By.className("card-original");
	By aspiration_card_plus = By.className("card-plus");
	By aspiration = By.xpath(xp.getAspirationButton());
	By aspiration_plus = By.xpath(xp.getAspirationPlusButton());
	
	//Initializing the driver
	public productPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
		
	//Method to verify both Aspiration_card and Aspiration_plus_card Card Visibility
	public void cardVisiblity() {
		System.out.println("Aspiration_card display:" +driver.findElement(aspiration_card).isDisplayed());
		System.out.println("Aspiration_card_plus display:" +driver.findElement(aspiration_card_plus).isDisplayed());
	}	
	
	//Perform the click operation in Aspiration card
	public void getAspiration() {
		driver.findElement(aspiration).click();
		System.out.println("aspiration_card got clicked.");
	}

	//Perform the click operation in Aspiration Plus card
	public void getAspirationPlus() {
		driver.findElement(aspiration_plus).click();
		System.out.println("aspiration_plus_card got clicked.");
	}
		
	               
}

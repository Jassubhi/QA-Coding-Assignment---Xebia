package Aspiration.PagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Aspiration.ConfigurationClass.xpathConfiguration;


public class aspirationPlusPlan {
	WebDriver driver;
	
	xpathConfiguration xp = new xpathConfiguration();
	//Locating all AspirationPlus web elements
	By aspiration_plus = By.xpath(xp.getAspirationButton());
	By yearly = By.xpath(xp.getYearlyPlan());
	By monthly = By.xpath(xp.getMonthlyPlan());
	
	//Initializing the web driver
	public aspirationPlusPlan(WebDriver driver) {
		this.driver = driver;
	}
	
	//Retrieving the text from Aspiration Plus Plan pop-up window 
	public void getAspirationPlusPlan() {
		System.out.println("Aspiration Plus Plan: " + driver.findElement(By.className("modal-dialog")).getText());
	}
	
	//Verifying the Aspiration Plus Plan yearly plan
	public void verifyYearlyPlan() {
		System.out.println("Yearly plan verification " +driver.findElement(yearly).getText().equalsIgnoreCase("$71.88 paid once yearly"));
	}
	
	//Verifying the Aspiration Plus Plan monthly plan
	public void verifyMonthlyPlan() {
		System.out.println("Monthly plan verification " +driver.findElement(monthly).getText().equalsIgnoreCase("$7.99 paid monthly"));
	}
}

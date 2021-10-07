package Aspiration.PagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Aspiration.ConfigurationClass.xpathConfiguration;



public class homePage {
	WebDriver driver;
	
	xpathConfiguration xp = new xpathConfiguration();
	//Initializing the web driver
	public homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	//Locating SPEND&SAVE link in Aspiration.com landing page.
	By spendsave =By.xpath(xp.getSpendAndSaveLink());         
		
	//Performing click operation of SPENT&SAVE link.
	public void spendAndSaveClick() {
		driver.findElement(spendsave).click();
	}

}

package Aspiration.TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Aspiration.ConfigurationClass.configReader;
import Aspiration.PagesClass.aspirationPlan;
import Aspiration.PagesClass.aspirationPlusPlan;
import Aspiration.PagesClass.homePage;
import Aspiration.PagesClass.productPage;

public class testcaseSpendAndSave {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//configReader file is reading data from the data.properties
		configReader cr = new configReader();
		
		System.setProperty("webdriver.chrome.driver",cr.getDriverPath() );
		
		//Initializing ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get(cr.getUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Creating instance of homePage, productPage, aspirationPlan, aspirationPlanPlus classes
		homePage home = new homePage(driver);
		productPage product = new productPage(driver);
		aspirationPlan ap =new aspirationPlan(driver);
		aspirationPlusPlan app =new aspirationPlusPlan(driver);
		
		//Navigating ?Spend & Save? link from Home Page
		home.spendAndSaveClick();
		
		//Verifying both card visibility
		product.cardVisiblity();
		
		//Verifying Get Aspiration Plan with sign-up window.
		product.getAspiration();
		
		//Putting wait time to load the page.
		Thread.sleep(2000);
		
		//Verifying the Email Signup field
		ap.getAspirationEmailSignUp();
		
		//Closing the Sign up pop-up
		ap.closeAspirationSignup();
		Thread.sleep(2000);
		
		//Navigating to Get Aspiration Plus Plan.
		product.getAspirationPlus();
		Thread.sleep(1000);
		//Verifying Aspiration Plus Plan and its Yearly and Monthly Plan.
		app.getAspirationPlusPlan();
		app.verifyYearlyPlan();
		app.verifyMonthlyPlan();
		
		//Closing the current opened window.
		driver.close();
	}
			
}

package pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import lib.selenium.PreAndPost;

public class HomePageSF extends PreAndPost{

	public HomePageSF(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;	
		driver.switchTo().defaultContent();
		PageFactory.initElements(driver, this);
	}		

	public HomePageSF searchUsingFilter(String value) {	
		type(locateElement("filter"),value);
		return this; 
	}	
	
	
	@FindBy(linkText="Create New")
	WebElement eleCreateNew;	
	public CreateNewIncident clickCreateNew() {		
		try {
			Thread.sleep(5000);
		click(eleCreateNew);
		} catch (InterruptedException e) {
		}
		return new CreateNewIncident(driver, test); 
	}	
	

	@FindBy(linkText="Open")
	WebElement eleOpen;	
	public ListIncidents clickOpen() {		
		click(eleOpen);
		return new ListIncidents(driver, test); 
	}	
	
}











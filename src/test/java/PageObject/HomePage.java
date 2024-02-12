package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='shadowHandlerBox']/i[@class='icon-bg homeIconsBg icon-bg-new ti']")
	WebElement Travel;
	
	
	@FindBy(xpath="//div[@class=\"shadowHandlerBox\"]/i[contains(@class, 'car-insurance')]")
	WebElement Car;
	
	
	@FindBy(xpath="//div[@class='prd-icon add shadowHandler short']//p[contains(text(),'Health')]")
	WebElement Health;
	
	

	
	
	public void TravelInsurance_click()
	{
		Travel.click();
	}
	
	public void CarInsurance_click()
	{
		Car.click();
	}
	
	
	public void HealthInsurance_click()
	{
		Health.click();
	}
	
	
}

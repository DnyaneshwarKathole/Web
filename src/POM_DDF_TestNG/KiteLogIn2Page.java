package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn2Page {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement Continue;
	
	
	public KiteLogIn2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    public void setKiteLogIn2PagePIN(String pin)
    {
    	PIN.sendKeys(pin);
    }
    
    public  void continueKiteLogIn2Page()
    {
    	Continue.click();
    }
    
    
    
    
    
    
}

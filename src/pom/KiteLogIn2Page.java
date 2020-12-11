package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn2Page {
	
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement Continue;
	
	public KiteLogIn2Page(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public void setKiteLogIn2PagePIN()
	{
		PIN.sendKeys("959594");
	}
	public void continueKiteLogIn2PageCon() 
	{
		Continue.click();
	}
	
	}
	



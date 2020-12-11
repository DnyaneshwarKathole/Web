package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn1Page {
	
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement LOG;
	
	
	
	public KiteLogIn1Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
		
	}
	public void setKiteLogIn1PageUN() {
		UN.sendKeys("DV1510");
	}
	public void setKiteLogIn1PagePWD() {
		PWD.sendKeys("Vijay@123");
	}
	public void setKiteLogIn1PageLOG() {
		LOG.click();
	}
	
	
	
	
}

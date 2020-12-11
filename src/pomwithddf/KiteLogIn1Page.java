package pomwithddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn1Page {
	
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement LOGIN;
	
	
	public KiteLogIn1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteLogIn1PageUN(String un)
	{
		UN.sendKeys(un);
	}
	public void setKiteLogIn1PagePWD(String pwd)
	{
		PWD.sendKeys(pwd);
	}
	public void setKiteLogIn1PageLOGIN()
	{
		LOGIN.click();
	}
}

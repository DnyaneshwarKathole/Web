package POM_DDF_TestNg_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement PN;
	
	public KiteHomePage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	}
	
	public void verifyKiteHomePagePN()
	{
		boolean result = PN.isDisplayed();
		if(result)
		{
			System.out.println("Pass POM_DDF_TestNg_BaseClass_Utility ");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

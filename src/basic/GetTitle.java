package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		String Exp="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		String St=driver.getTitle();
	if(St.equals(Exp))
	{
		System.out.println("home page is open Dk");
	}
	else
	{
		System.out.println("home page is not open Dk");
	}
		
		
		
	}

}

package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTwoWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","G:\\Program\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","G:\\Program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bseindia.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.nseindia.com");
		driver.navigate().back();
		
		driver.navigate().back();
		
		
		
		
		
		
	}

}

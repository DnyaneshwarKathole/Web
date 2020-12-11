package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https:www.facebook.com");
	    WebElement elc=	driver.findElement((By.tagName("input"));
	    System.out.println(elc);
		
		
		

	}

}

package linksOnwebPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chromr.driver","G:\\Program\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","G:\\Program\\chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.get("https:www.facebook.com");
		
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(5000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//select"));
		
		System.out.println(dropdown.size());
		
		
		
	}

}

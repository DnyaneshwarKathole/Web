package linksOnwebPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxesOnWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.get("https:www.facebook.com");
	     List<WebElement> inputFild = driver.findElements(By.xpath("//input"));
		
	     
	     System.out.println(inputFild.size());
		
		
		
		
		
		
		
		
	}

}

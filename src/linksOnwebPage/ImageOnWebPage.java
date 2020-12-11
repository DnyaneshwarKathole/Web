
package linksOnwebPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageOnWebPage {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chromr.driver","G:\\Program\\ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver","G:\\Program\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> img = driver.findElements(By.xpath("//img"));
		System.out.println(img.size());
		for(WebElement elc :  img)
			System.out.println(elc);
		
	}

}

package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isDisplayed: this method is use to verify element is present on not.
//return type of isDisplayed function boolean
//if element is present then it returns true otherwise it returns exception



public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\Program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
	    WebElement	abc=driver.findElement(By.xpath("//input[@id='email']"));
		boolean st=abc.isDisplayed();
		System.out.println(st);
		
		if(st==true) {
			System.out.println("element displayed on webpage");
		}else {
			System.out.println("element not-displayed on webpage");
		}
		
		
		
	}

}

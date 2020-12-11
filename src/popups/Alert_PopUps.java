package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","G:\\Program\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		//alt.dismiss();
	}

}

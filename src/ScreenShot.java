import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
         WebDriver driver=new ChromeDriver();		
		 driver.get("https:www.facebook.com");
		
		File soure=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		
		
		
		
		
		
		//File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
	//	System.out.println(source);
		//File F =new File("G:\\Program\\Screenshot\\Abc.jpg");
		//FileHandler.copy(source, F);
		
		
		//driver.close();
	}

}

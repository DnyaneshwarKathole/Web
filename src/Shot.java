import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Shot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();		
		 driver.get("https:www.facebook.com");
		 
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		String str = RandomString.make(4);
		File d = new File("G:\\Program\\Screenshot\\"+str+".jpg");
		FileHandler.copy(s, d);
		
		
	}

}

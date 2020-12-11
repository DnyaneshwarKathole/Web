package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver d =new ChromeDriver(option);
		
		d.get("https://kite.zerodha.com");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		KiteLogIn1Page Log1 =new KiteLogIn1Page(d);
		
		Log1.setKiteLogIn1PageUN();
		Log1.setKiteLogIn1PagePWD();
		Log1.setKiteLogIn1PageLOG();
		
		KiteLogIn2Page Log2 =new  KiteLogIn2Page(d);
		Log2.setKiteLogIn2PagePIN();
		Log2.continueKiteLogIn2PageCon();
	    KiteHomePage  verify =new KiteHomePage(d);
	    verify.verifyKiteHomePagePN();
	    
	    
	}

}

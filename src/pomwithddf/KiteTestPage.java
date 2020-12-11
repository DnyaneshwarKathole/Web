package pomwithddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

public class KiteTestPage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		
		FileInputStream file=new FileInputStream("G:\\Program\\Excel Sheet\\kite.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		KiteLogIn1Page LogIn1=new KiteLogIn1Page(driver);
		String un = sh.getRow(0).getCell(0).getStringCellValue();
		LogIn1.setKiteLogIn1PageUN(un);
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		LogIn1.setKiteLogIn1PagePWD(pwd);
		LogIn1.setKiteLogIn1PageLOGIN();
		
		
	    KiteLogIn2Page LogIn2=new KiteLogIn2Page(driver);
	    String  pin=sh.getRow(0).getCell(2).getStringCellValue();
	    LogIn2.setKiteLogIn2PagePIN(pin);
	    LogIn2.continueKiteLogIn2Page();
	    
	    KiteHomePage verify =new  KiteHomePage(driver);
	    verify.verifyKiteHomePagePN();
	    		
		
	}

}

package POM_DDF_TestNG;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

public class KiteLoginTest {
	 WebDriver driver;
	Sheet sh;
	   KiteLogIn1Page login1;
	   KiteLogIn2Page login2;
	   KiteHomePage home;
	
	
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream File =new FileInputStream("G:\\Program\\Excel Sheet\\kite.xlsx");
	    sh=WorkbookFactory.create(File).getSheet("Sheet1");
	    System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://kite.zerodha.com");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   login1=new KiteLogIn1Page(driver);
	   login2=new KiteLogIn2Page(driver);
	   home= new KiteHomePage(driver);
	   
	}
	 @BeforeMethod
	   public void loginToApp() 
	   {
		 login1.setKiteLogIn1PageUN(sh.getRow(0).getCell(0).getStringCellValue());
		 login1.setKiteLogIn1PagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		 login1.clickKiteLogIn1PagePN();
		 login2.setKiteLogIn2PagePIN(sh.getRow(0).getCell(2).getStringCellValue());
		 login2.continueKiteLogIn2Page();
		  
	   }
	 
	 @Test
	 public void verifyPN() 
	 {
		home.verifyKiteHomePagePN(); 
	 }
	 @AfterMethod
	 public void logoutFromApp()
	 {
		 
	 }
	 @AfterClass
	 public void closeBrowser()
	 {
		 login1=null;
		 login2=null;
		 home=null;
		 driver.close();
	 }
}

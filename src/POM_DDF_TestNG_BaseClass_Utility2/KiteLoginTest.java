package POM_DDF_TestNG_BaseClass_Utility2;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

public class KiteLoginTest extends BaseClass {
	 //WebDriver driver;
	//Sheet sh;
	   KiteLogIn1Page login1;
	   KiteLogIn2Page login2;
	   KiteHomePage home;
	   int TCID;
	
	
	
	
	
	@BeforeClass
	
	
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
	   
	    browserOpen();
	   
	   login1=new KiteLogIn1Page(driver);
	   login2=new KiteLogIn2Page(driver);
	   home= new KiteHomePage(driver);
	   
	}
	 @BeforeMethod
	   public void loginToApp() throws EncryptedDocumentException, IOException 
	   {
		 
		 login1.setKiteLogIn1PageUN(Utility.getTestData(0, 0));
		 login1.setKiteLogIn1PagePWD(Utility.getTestData(0, 1));
		 login1.clickKiteLogIn1PagePN();
		 login2.setKiteLogIn2PagePIN(Utility.getTestData(0, 2));
		 login2.continueKiteLogIn2Page();
		  
	   }
	 
	 @Test
	 public void verifyPN() throws EncryptedDocumentException, IOException 
	 {
		 TCID=101;
		String actText = home.getKiteHomePageProfileName();
		String expText=Utility.getTestData(0, 3);
		System.out.println(actText);
		System.out.println(expText);
	    Assert.assertEquals(actText,expText,"act and exp not same");
	 }
	 @AfterMethod
	 public void logoutFromApp(ITestResult result) throws IOException
	 {
		 if(result.getStatus()==TestResult.FAILURE);
		 Utility.captureScreenshot(driver, TCID);
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

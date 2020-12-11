package testNg;

import org.testng.annotations.Test;

public class Keywords {
//	//1 invocationCount
//	@Test(invocationCount=1)
//	public void TC()
//	{
//		System.out.println("Running TC");
//	}
//	@Test
//	public void TC1() 
//	{
//	System.out.println("Running TC1");	
//	}
//	//2 priority
//    @Test(priority=2)
//    public void TC2()
//    {
//    	System.out.println("Running TC2");
//    }
	//3 enabled
//    @Test
//    public void TC3()
//    {
//    	System.out.println("Running TC3");
//    }
//    @Test(enabled=false)
//    public void TC4()
//    {
//    	System.out.println("Running TC4");
//    }
	 //4 timeout 
	@Test(timeOut=8000)
	public void TC5() throws InterruptedException
	{
		Thread.sleep(9000);
		System.out.println("Running TC5");
	}
	
	// 5 dependsOnMethods
    @Test 
    public void loginToApp()
    {
    	System.out.println("Running loing to App ");
    }
    @Test (dependsOnMethods={"loginToApp"})
    public void verifyPN()
    {
    	System.out.println("Verify PN TC");
    }
	 
	
}

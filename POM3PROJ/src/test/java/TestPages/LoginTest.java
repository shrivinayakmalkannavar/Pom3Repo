package TestPages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Login;
import TestBase.BaseTest;

public class LoginTest extends BaseTest {
	
	Login login1;
	
	
	
	public LoginTest()
	{
		
		super();
	}

	
	@BeforeClass()
	public void setup()
	{
		Initialization();
	}
	
	@Test
	public void titlevalidate() throws InterruptedException
	{
		String title=login1.Titlevalidate();
		Thread.sleep(3000);
		Assert.assertEquals(title, "POSNIC - Login to Control Panel");
		
	}
	
	@Test
	public void  Loginvalidate()
	{
		login1=new Login();
		login1.settextuser(prop.getProperty("username"));
		login1.settextpassword(prop.getProperty("password"));
		login1.clicklogin();
		
	
	
	
}
	
	//@AfterClass
	//public void Driverclose()
	//{
		//driver.close();
	//}
	
}


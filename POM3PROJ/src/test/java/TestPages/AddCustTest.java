package TestPages;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AddCust;
import Pages.Login;
import TestBase.BaseTest;

public class AddCustTest extends BaseTest {
	
	Login login1;
	
	
	
	public AddCustTest()
	{
		super();
		
	}
	
	@BeforeClass
	public void Setup()
	{
		Initialization();
		
	}
	
	@Test(priority=1)
	public void ValidateLogin() throws InterruptedException
	{
		login1=new Login();
		Thread.sleep(4000);
		login1.settextuser(prop.getProperty("username"));
		Thread.sleep(4000);
		login1.settextpassword(prop.getProperty("password"));
		login1.clicklogin();
		Thread.sleep(4000);
	
	}
	@Test(priority=2)
	public void AddcustDetails() throws InterruptedException
	{
		AddCust add=new AddCust();
		add.Addcustclick();
		Thread.sleep(3500);
		add.Nameadd("Yuvraj singh");
		Thread.sleep(3500);
		add.Contactadd("8879096689");
		Thread.sleep(3500);
		add.Contact2("Punjab1235");
		Thread.sleep(3500);
		add.Addbtn();
		Thread.sleep(3500);
		add.viewcustumerdetails();
			
		
	}
	
	
//	@AfterClass
//	public void closeDriver()
//	{
//		driver.close();
//	}

}

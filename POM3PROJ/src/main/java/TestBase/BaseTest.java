package TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static Properties prop;
	 
	
	
	
	public BaseTest()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\POM3PROJ\\src\\main\\java\\Config\\config.properties");
			prop.load(fis);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

   public static void Initialization()
   {
	   String browsername=prop.getProperty("browser");
	   if(browsername.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\POM3PROJ\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   
		   
	   }
	   
	   else
	   {
		   System.out.println("browser is not opened");
	   }
	   
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
   }
	
}

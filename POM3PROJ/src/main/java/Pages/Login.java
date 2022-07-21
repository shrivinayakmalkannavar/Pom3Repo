package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseTest;

public class Login extends BaseTest {
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath="//input[@name='username1']")
	WebElement textusername;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement textpassword;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Button;
	
	
	@FindBy(xpath="//a[@class='button ']")
	WebElement Forgotpassword;
	

	public String Titlevalidate()
	{
		return driver.getTitle();
		
	}
	
	public void settextuser(String uname)
	{
		textuser.sendKeys(uname);
	}
	
	public void settextpassword(String password)
	{
		textpassword.sendKeys(password);
	}
	
	
	
	
	public void clicklogin()
	{
		Button.click();
	}
	
	
	public void clickforgot()
	{
		Forgotpassword.click();
	}
	


}
 
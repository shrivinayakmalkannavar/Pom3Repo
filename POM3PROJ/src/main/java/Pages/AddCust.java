package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseTest;

public class AddCust extends BaseTest {
	
	
	public AddCust()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"side-menu fl\"]//li/a[text()=\"Add Customer\"]")
	WebElement Addcust;
	
	public void Addcustclick()
	{
		Addcust.click();
	}
	
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Addname;
	
	
	public void Nameadd(String name)
	{
		Addname.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='buyingrate']")
	WebElement contact;
	
	
	public void Contactadd(String cntact)
	{
		contact.sendKeys(cntact);
	}

	@FindBy(xpath="//input[@name='contact2']")
	WebElement cntct2;
	
public void Contact2(String Contact2)
{
	cntct2.sendKeys(Contact2);
}


@FindBy(xpath="//input[@name='Submit']")
WebElement Add;


public void Addbtn()
{
	Add.click();
}

@FindBy(xpath="//div[@class='side-menu fl']//ul//li[2]")
WebElement Viewcustumer;

public void viewcustumerdetails()
{
	Viewcustumer.click();
	
}

}

package listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V02POMOrange {

	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement Username;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
	public void sendUsername()
	{	Username.sendKeys("Admin");}
	public void sendPassword()
	{Password.sendKeys("admin12");}
	public void clickLoginBtn()
	{Login.click();}
	public V02POMOrange(WebDriver d1)
	{
		PageFactory.initElements(d1, this);
	}
}

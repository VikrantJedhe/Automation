package pomConcept;
import org.apache.commons.io.HexDump;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class V01Pom {
	@FindBy(xpath="//input [@ name=\'username\']")
	private WebElement Username;
	@FindBy(xpath="//input [@name=\'password\']")
	private WebElement Pass;	
	@FindBy(xpath="//button[@type=\'submit\']")
	private WebElement Login;
	public void sendUsername()
	{
		Username.sendKeys("Admin");		
	}
	public void sendPass()
	{
		Pass.sendKeys("admin123");
	}
	public void LoginBtnClick()
	{
		Login.click();
	}
	public V01Pom(WebDriver d2)
	{
		PageFactory.initElements(d2, this);

	}

}
	
	






package pomPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAlert {
	
	@FindBy(xpath="(//a[text()='Try it Yourself »'])[1]")
	private WebElement TryItNowButton;
	
	@FindBy(xpath="//button[text()='Try it']")
	private WebElement TryIt;
	
	
	public void ClickTryItButton()
	{
		TryItNowButton.click();
	}
	
	public void ClickTryIt()
	{
		TryIt.click();
	}
	
	public PomAlert(WebDriver d2)
	{
		PageFactory.initElements(d2, this);
	}

}

package pomPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google1 {
	
	@FindBy(xpath="//textarea[@title='Search']")
	private WebElement Searchbox;
	
	@FindBy(xpath="//h3[contains(text(),'Flipkart')]")
	private WebElement FlipKartLink;
	
	public void sendInput(String Input) throws InterruptedException
	{
		Searchbox.sendKeys(Input);
		
		Thread.sleep(3000);
		
		Searchbox.submit();
	}
	
	public void clickFlipkart()
	{
		FlipKartLink.click();
	}

	public Google1(WebDriver d2)
	{
		PageFactory.initElements(d2,this);
	}
	
	

}

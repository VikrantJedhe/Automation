package pomConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V02FlipkartPOM {
	WebDriver d2;

	Actions a=new Actions(d2);
	@FindBy(xpath ="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeLoginWindow;
	
	public void closeLogW()
	{
		closeLoginWindow.click();
	}
	
	@FindBy(xpath="//img[@alt='Electronics")
	private WebElement Electronics ;
	
	public void ClickElectronics()
	
	{
		a.moveToElement(Electronics).build().perform();
;
	}
	
	@FindBy (xpath = "//a[@class='_6WOcW9 _2-k99T']")
	private WebElement audio;
	
	public void ClickAudio() throws InterruptedException
	{

		a.moveToElement(audio).build().perform();
		Thread.sleep(3000);
		a.click(audio).build().perform();
		
		audio.click();
	}
	
	public V02FlipkartPOM(WebDriver d2)
	{
		this.d2=d2;
		PageFactory.initElements(d2, this);
	}
	
}

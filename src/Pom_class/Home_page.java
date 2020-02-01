package Pom_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_page 
{
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement entrbtn;
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void btnsrch()
	{
		searchbtn.sendKeys("iPhone XR (64GB) - Yellow");
	}
	
	public void btnentr()
	{
		entrbtn.click();
	}
}
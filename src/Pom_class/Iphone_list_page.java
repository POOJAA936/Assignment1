package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iphone_list_page 
{
	@FindBy(xpath="(//span[contains(.,'Apple iPhone XR (64GB) - Yellow')])[3]")
	private WebElement selectiphn;
	
	public Iphone_list_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click()
	{
		selectiphn.click();
	}

}

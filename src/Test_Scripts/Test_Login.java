package Test_Scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Generic_lib.Generic;
import Pom_class.Home_page;
import Pom_class.Iphone_list_page;
public class Test_Login extends Generic
{
	@Test
	public void Login(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		Home_page hp=new Home_page(driver);
		hp.btnsrch();
		Thread.sleep(3000);
		hp.btnentr();
		Thread.sleep(3000);
		Iphone_list_page ip=new Iphone_list_page(driver);
		ip.click();	
	}
}
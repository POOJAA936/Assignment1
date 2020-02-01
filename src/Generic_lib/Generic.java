package Generic_lib;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Generic 
{
	WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in.");
	}
	@AfterMethod
	public void CloseAppln()
	{
		driver.close();
	}
}
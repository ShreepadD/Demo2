package TestNGCrossBrowser;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Unacademy 
{
	@Parameters("bro")
	@Test
	public void unacademy(@Optional("chrome") String browserName)
	{
		RemoteWebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			driver= new SafariDriver();
		}
		else
		{
			Reporter.log("Invalid browser",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://unacademy.com/");
		driver.quit();
	}
}

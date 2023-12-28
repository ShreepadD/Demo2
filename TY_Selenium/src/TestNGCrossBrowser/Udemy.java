package TestNGCrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Udemy 
{
	@Parameters("bro")
@Test
	public void udemyM(@Optional("chrome") String browserName)
	{
		WebDriver driver= null;
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
			Reporter.log("Broswer name Invalid", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.udemy.com/");
		driver.quit();
			
	}
}

package dummy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class fossil 
{
	@Test (groups="function")
	public void fossilGroup()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fossilgroup.com/");
		Reporter.log("Fossil",true);
		driver.quit();
	}
}

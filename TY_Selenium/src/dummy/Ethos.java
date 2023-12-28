package dummy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ethos 
{
	@Test
	public void ethosGroup()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ethoswatches.com/");
		Reporter.log("Ethos",true);
		driver.quit();
	}
}

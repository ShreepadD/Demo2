package dummy1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Boat 
{
@Test
	public void boatHP()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.boat-lifestyle.com/");
		driver.quit();
		
	}
}

package dummy1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jabra 
{
	@Test
	public void jabraHP()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jabra.in/");
		driver.quit();
	}
}

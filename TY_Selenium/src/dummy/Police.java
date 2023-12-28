package dummy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Police 
{
	 @Test (groups="integration", dependsOnGroups = "smoke")
	 public void policeGroup()
	 {
		 ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://policelifestyle.com/");
			Reporter.log("Police",true);
			driver.quit();
}
}

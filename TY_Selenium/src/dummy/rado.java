package dummy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class rado 
{
 @Test (groups= {"function","smoke"})
 public void radoGroup()
 {
	 ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rado.com/");
		Reporter.log("rado",true);
		driver.quit();
 }
 @Test 
 public void tommyHilfiger()
 {
	 ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.helioswatchstore.com/");
		Reporter.log("rado",true);
		driver.quit(); 
 }
}

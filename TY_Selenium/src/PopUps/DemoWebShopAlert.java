package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
				//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://demowebshop.tricentis.com/");
				driver.findElement(By.xpath("//input[@value='Search']")).click();
				Thread.sleep(2000);
				Alert popups = driver.switchTo().alert();
				popups.accept();
	}
}

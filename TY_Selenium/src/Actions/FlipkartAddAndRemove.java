package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAddAndRemove 
{
	public static void main(String[] args) 
	{
				//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.flipkart.com/");
				Actions actions= new Actions(driver);
				driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
	}
}

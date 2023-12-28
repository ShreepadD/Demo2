package Actions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class infiniteLoop {

	public static void main(String[] args) 
	{
				//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				driver.get("https://onepagelove.com/");
				Actions actions= new Actions(driver);
				//WebElement derek = driver.findElement(By.linkText("Derek Sieber"));
				for(;;)
				{
					try
					{
						driver.findElement(By.linkText("Derek Sieber")).click();
						break;
					}
					catch (org.openqa.selenium.NoSuchElementException a)
					{
						actions.scrollByAmount(0, 500).perform();
					}
					catch(ElementClickInterceptedException b)
					{
						driver.findElement(By.linkText("Derek Sieber")).click();
						break;
					}
				}
	}

}

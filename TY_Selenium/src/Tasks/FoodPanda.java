package Tasks;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FoodPanda 
{
	public static void main(String[] args)
	{
			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.foodpanda.com/");
			Actions actions= new Actions(driver);
//			List<WebElement> allElements = driver.findElements(By.xpath("//li[@data-level='1'] "));
//			for(WebElement element: allElements)
//			{
//				actions.keyDown(Keys.COMMAND).perform();
//				element.click();
//				actions.keyUp(Keys.COMMAND).perform();
//			}
//			Set<String> allWindowHandles = driver.getWindowHandles();
//			for(String handles: allWindowHandles)
//			{
//				
//				driver.switchTo().window(handles);
//				if(driver.getTitle().contains("Site map"))
//				{
//					driver.close();
//					break;
//				}
//			
//			}
		List<WebElement> allele = driver.findElements(By.xpath("//nav/ul/li[contains(@id,'menu-item') and //li[contains(@class,'menu-item menu-item')]]"));
		for(WebElement ele: allele)
		{
			actions.keyDown(Keys.COMMAND).perform();
			ele.click();
			actions.keyUp(Keys.COMMAND).perform();
		}
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handles: allWindowHandles)
			{
				
				driver.switchTo().window(handles);
				if(driver.getTitle().contains("ads"))
				{
					driver.close();
					break;
				}
		
	}
}
}

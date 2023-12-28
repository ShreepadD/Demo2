package Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class MouseHoverMoveTo 
{
	public static void main(String[] args) 
	{
		SafariDriver driver= new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.reliancedigital.in");
		WebElement televisions = driver.findElement(By.xpath("//div[text()='Televisions']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(televisions).perform();
		driver.findElement(By.xpath("//a[text()='32 Inch TVs']")).click();
		
	}
}

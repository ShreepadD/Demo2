package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollNaukri 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.zomato.com/india");
		Actions actions= new Actions(driver);
		WebElement mumbai = driver.findElement(By.xpath("//h5[text()='Mumbai Restaurants']"));
		ScrollOrigin mum1 = ScrollOrigin.fromElement(mumbai);
		actions.scrollFromOrigin(mum1, 0, 100).perform();
		//h5[text()='Mumbai Restaurants']
	}
}

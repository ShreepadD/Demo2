package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoldandRelease {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.paiinternational.in/");
		driver.findElement(By.partialLinkText("Select Category")).click();
		driver.findElement(By.linkText("Furniture")).click();
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//span[@class='irs-slider from']"));
		Actions actions= new Actions(driver);
		actions.clickAndHold(from).perform();
		actions.moveByOffset(10, 0).perform();
		actions.release().perform();
	}

}

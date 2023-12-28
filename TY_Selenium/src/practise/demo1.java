package practise;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.agoda.com/");
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		WebElement checkIn = driver.findElement(By.xpath("//div[@data-selenium='checkInBox']"));
		checkIn.click();
		WebElement nxtMnth = driver.findElement(By.xpath("//button[@data-selenium='calendar-next-month-button']"));
		for(;;)
		{
			try
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.findElement(By.xpath("//div[text()='March 2024']/..//span[text()='20']")).click();
				driver.findElement(By.xpath("//div[text()='March 2024']/..//span[text()='31']")).click();
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//button[@data-selenium='calendar-next-month-button']")).click();
			}
		}
	}
}

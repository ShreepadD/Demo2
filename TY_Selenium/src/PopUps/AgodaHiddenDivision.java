package PopUps;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgodaHiddenDivision {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.agoda.com/");
		LocalDateTime ltd = LocalDateTime.now().plusMonths(5);
		int date = ltd.getDayOfMonth();
		int year = ltd.getYear();
		String month = ltd.getMonth().name();
		month=""+month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		driver.findElement(By.xpath("//i[@class='ficon IconBox__icon ficon-20 ficon-check-in']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='December 2023']/..//span[text()='8']")).click();
//		driver.findElement(By.xpath("//div[text()='January 2024']/..//span[text()='9']")).click();
		for(;;)
		{
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(date-4)+"']")).click();
			driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(date-2)+"']")).click();
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
	}

}

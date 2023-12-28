package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.facebook.com/");
				driver.findElement(By.linkText("Create new account")).click();
				WebElement hidden = driver.findElement(By.xpath("//input[@name='custom_gender']"));
				driver.executeScript("arguments[0].value='hello'", hidden);
	}
}

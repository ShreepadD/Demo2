package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTest {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.speedtest.net/");
		Thread.sleep(5000);
		WebElement frameElement = driver.findElement(By.id("google_ads_iframe_/6692/speedtest.net/stnext_lowerboard_0"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("cbb")).click();
	}

}

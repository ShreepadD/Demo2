package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DependantIndependantElements {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webDriver.chrome.driver", "/Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		//SafariDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("shreepaddaundkar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Asdfghjkl@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Health Book']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(3000);


		
		

		
	}

}

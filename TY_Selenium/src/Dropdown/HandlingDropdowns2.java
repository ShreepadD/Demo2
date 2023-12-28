package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns2 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		SafariDriver driver = new SafariDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://demoapp.skillrary.com/");
//		WebElement multiListBox = driver.findElement(By.id("cars"));
//		Select courseByPriceSelect= new Select(multiListBox);
//		courseByPriceSelect.selectByValue("99");
//		courseByPriceSelect.selectByIndex(0);
//		courseByPriceSelect.selectByVisibleText("INR 100 - INR 199 ( 16 )");
//		System.out.println(courseByPriceSelect.getFirstSelectedOption().getText());
//		Thread.sleep(1000);
//		courseByPriceSelect.deselectByIndex(0);
//		courseByPriceSelect.deselectByValue("99");
//		courseByPriceSelect.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select dayopt= new Select(day);
		dayopt.selectByValue("1");
		WebElement year = driver.findElement(By.id("year"));
		Select yearopt= new Select(year);
		yearopt.selectByIndex(10);
	}
}

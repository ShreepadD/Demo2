package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select daySelect= new Select(dayListBox);
		Select monthSelect= new Select(monthListBox);
		Select yearSelect= new Select(yearListBox);
		System.out.println(daySelect.isMultiple());
		daySelect.selectByValue("31");
		monthSelect.selectByIndex(4);
		yearSelect.selectByVisibleText("1997");

	}

}

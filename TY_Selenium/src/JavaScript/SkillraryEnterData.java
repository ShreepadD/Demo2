package JavaScript;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryEnterData {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		driver.executeScript("arguments[0].value='hey';", disabledBox);
	}

}

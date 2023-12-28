package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOptionMethod {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
				SafariDriver driver= new SafariDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
				WebElement dayListBox = driver.findElement(By.id("day"));
				WebElement monthListBox = driver.findElement(By.id("month"));
				WebElement yearListBox = driver.findElement(By.id("year"));
				LastOptionMethod a= new LastOptionMethod();
				a.selectLastOption(dayListBox);
				a.selectLastOption(yearListBox);
				a.selectLastOption(monthListBox);
				
	}
	
	public void selectLastOption(WebElement dropDownElement)
	{
		Select listbox= new Select(dropDownElement);
		int totalNoOfOptions=listbox.getOptions().size();
		listbox.selectByIndex(totalNoOfOptions-1);
	}

}

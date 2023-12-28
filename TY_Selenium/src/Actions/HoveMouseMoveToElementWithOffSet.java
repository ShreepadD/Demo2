package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class HoveMouseMoveToElementWithOffSet {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement passwordTxtBoz = driver.findElement(By.id("password"));
		passwordTxtBoz.sendKeys("asdkjhsfj");
		Thread.sleep(2000);
		System.out.println(passwordTxtBoz.getSize().getWidth());
		Actions actions= new Actions(driver);
		actions.moveToElement(passwordTxtBoz, 290, 2).click().perform();
		
	}

}

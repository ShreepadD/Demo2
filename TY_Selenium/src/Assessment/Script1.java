package Assessment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script1 {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		Set<String> allwindowHandles = driver.getWindowHandles();
		for(String handle: allwindowHandles)
		{
			driver.switchTo().window(handle);
			
		}
		Dimension size = driver.manage().window().getSize();
		int height= size.getHeight();
		int width= size.getWidth();
		System.out.println("Current Height is: "+height);
		System.out.println("Current Width is: "+width);
		Dimension newsize= new Dimension(656,880);
		driver.manage().window().setSize(newsize);
		driver.findElement(By.id("nextStep")).click();
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("Submit")).click();
		Alert name = driver.switchTo().alert();
		String invalidname = name.getText();
		System.out.println(invalidname);
		name.accept();
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("Shree");
		driver.findElement(By.id("accountNo")).sendKeys("123");
		driver.findElement(By.name("Submit")).click();
		Alert invalidacc = driver.switchTo().alert();
		String incorrectacc = invalidacc.getText();
		System.out.println(incorrectacc);
		invalidacc.accept();
		driver.findElement(By.id("accountNo")).clear();
		driver.findElement(By.id("accountNo")).sendKeys("12345678901");
		driver.findElement(By.name("Submit")).click();
		Alert selectCountry = driver.switchTo().alert();
		String country = selectCountry.getText();
		System.out.println(country);
		selectCountry.accept();
		
		WebElement chooseCntry = driver.findElement(By.id("selCountry"));
		Select cntry = new Select(chooseCntry);
		cntry.selectByValue("91");
		driver.findElement(By.id("mobileNo")).sendKeys("1234");
		driver.findElement(By.name("Submit")).click();
		Alert incorrectMob = driver.switchTo().alert();
		String wrongmob = incorrectMob.getText();
		System.out.println(wrongmob);
		incorrectMob.accept();
		driver.findElement(By.id("mobileNo")).clear();
		driver.findElement(By.id("mobileNo")).sendKeys("9673757830");
		driver.findElement(By.name("Submit")).click();
		Alert date = driver.switchTo().alert();
		String bdayDate = date.getText();
		System.out.println(bdayDate);
		date.accept();
		driver.findElement(By.id("datepicker5")).sendKeys("nkjd");
		driver.findElement(By.name("Submit")).click();
		Alert invalidDate = driver.switchTo().alert();
		String wrongDate = invalidDate.getText();
		System.out.println(wrongDate);
		invalidDate.accept();
		driver.findElement(By.id("datepicker5")).clear();
		driver.findElement(By.id("datepicker5")).sendKeys("31/03/1997");
		driver.findElement(By.name("Submit")).click();
		Alert captcha = driver.switchTo().alert();
		System.out.println(captcha.getText());
		captcha.accept();
		
		
		
	}
}

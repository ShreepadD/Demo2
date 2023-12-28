package Assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://demowebshop.tricentis.com/");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.godaddy.com/en-in");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://skillrary.com/");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
//				driver.get("https://www.godaddy.com/en-in");
//				driver.get("https://skillrary.com/");
//				driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
			//	driver.findElement(By.xpath("//button[@type='button']")).click();
				Thread.sleep(10000);
				Set<String> allWindowHandles = driver.getWindowHandles();
				List tabTitles = new ArrayList();
				for(String handles: allWindowHandles)
				{
					
					driver.switchTo().window(handles);
					tabTitles.add(driver.getTitle());
				}
				Collections.sort(tabTitles);
				System.out.println(tabTitles);
				for(Object a: tabTitles)
				{
					for(String handles: allWindowHandles)
					{
						
						driver.switchTo().window(handles);
						if(driver.getTitle().equals(a))
						{
							driver.close();
							
						}
					}
					
				}
				
				
	}

} 

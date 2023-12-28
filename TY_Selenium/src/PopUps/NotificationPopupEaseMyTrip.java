package PopUps;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;


public class NotificationPopupEaseMyTrip {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
			ChromeOptions settings = new ChromeOptions();
			ArrayList a= new ArrayList();
			a.add("--incognito");
			a.add("--disable-notifications");
			settings.addArguments(a);
				ChromeDriver driver= new ChromeDriver(settings);
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.easemytrip.com/");
//				Thread.sleep(5000);
//				Robot robot= new Robot();
//				robot.keyPress(KeyEvent.VK_TAB);
//				robot.keyPress(KeyEvent.VK_TAB);
//				robot.keyPress(KeyEvent.VK_TAB);
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_TAB);
//				robot.keyRelease(KeyEvent.VK_ENTER);
//	}

}
}

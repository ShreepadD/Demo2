package Tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESPNcricInfo {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/report/ipo-in-india-list-main-board-sme/82/");
		
//		List<WebElement> Rows = driver.findElements(By.xpath("//h2[text()='22K & 24K Gold Rates Per Gram in  Bangalore']/../..//tr[@class='bodyBase']"));
//		int count=0;
//		for(WebElement rows: Rows)
//		{
//			count++;
//		}
//		for(int i=1;i<=count;i++)
//		{
//			String rates = driver.findElement(By.xpath("//h2[text()='22K & 24K Gold Rates Per Gram in  Bangalore']/../..//tr[@class='bodyBase'][1]")).getText();
//			System.out.println(rates);
//		for(int i=1;i<5;i++)
//		{
//			String details= driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr[" + i + "]/td[1]")).getText();
//			String price = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr["+i+"]/td[2]/div/div[1]")).getText();
//			System.out.println(details+"-"+price);
//		}
//		}
		System.out.println("Company"+"          "+"Issue size");
		for(int i=1;i<=20;i++)
		{
			String company = driver.findElement(By.xpath("//h2[text()='IPO List 2023 (Mainboard & SME IPO)']/..//tbody/tr["+ i +"]/td[1]")).getText();
			String issueSize = driver.findElement(By.xpath("//h2[text()='IPO List 2023 (Mainboard & SME IPO)']/..//table/tbody/tr["+ i +"]/td[5]")).getText();
			
			System.out.println(company+"         -              "+"     "+issueSize);
		}
		//div[@class='ds-flex ds-flex-col ds-grow ds-justify-center']/../..//table[1]/tbody[1]/tr[1]/td[1]/div[1]
	}

}

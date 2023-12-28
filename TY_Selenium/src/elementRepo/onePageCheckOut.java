package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class onePageCheckOut extends BasePage {
public onePageCheckOut(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="(//input[@class='button-1 new-address-next-step-button'])[1]")
private WebElement Continue;

@FindBy(xpath="//input[@value='Confirm']")
private WebElement confirm;


}

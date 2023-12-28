package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCartPage extends BasePage {
	public shoppingCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(id="termsofservice")
	private WebElement termsOfService;
	
	@FindBy (name = "removefromcart")
	private WebElement removeFromCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	
	
	
}

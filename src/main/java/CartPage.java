import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BaseActions {
    private static final By CART_TITLE_SELECTOR = By.cssSelector("#cart_title");
    private static final By PROCEED_TO_CHECKOUT_BUTTON_SELECTOR = By.linkText("Proceed to checkout");


    public CartPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isCartPageTitlePresent() {
        return isElementPresent(CART_TITLE_SELECTOR, true);
    }

    public void pressCheckoutButton() {
        click(PROCEED_TO_CHECKOUT_BUTTON_SELECTOR);
    }
}

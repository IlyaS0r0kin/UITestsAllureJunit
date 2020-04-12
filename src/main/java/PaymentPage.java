import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends BaseActions {
    public PaymentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By PAYMENT_TITLE_SELECTOR = By.xpath("//div[@id=\"HOOK_PAYMENT\"]");
    private static final By PROCEED_TO_CHECKOUT_BUTTON_SELECTOR = By.xpath("//a[@class=\"bankwire\"]");
    private static final By FINISH_PAY_BUTTON_SELECTOR = By.xpath("//button[@class=\"button btn btn-default button-medium\"]");
    private static final By FINISH_TITLE_SELECTOR = By.xpath("//strong[text()= \"Your order on My Store is complete.\"]");


    public boolean isPaymentPageTitlePresent() {
        return isElementPresent(PAYMENT_TITLE_SELECTOR, true);
    }

    public void pressCheckoutButton() {
        click(PROCEED_TO_CHECKOUT_BUTTON_SELECTOR);
    }

    public void pressFinButton() {
        click(FINISH_PAY_BUTTON_SELECTOR);
    }

    public boolean isPaymentPageFinTitlePresent() {
        return isElementPresent(FINISH_TITLE_SELECTOR, true);
    }

}

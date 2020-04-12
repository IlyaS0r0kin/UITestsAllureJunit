import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage extends BaseActions {
    public ShippingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By SHIPPING_TITLE_SELECTOR = By.xpath("//h1[text()=\"Shipping\"]");
    private static final By PROCEED_TO_CHECKOUT_BUTTON_SELECTOR = By.xpath("//button[@name=\"processCarrier\"]");
    private static final By CHEK_BOX_SELECTOR = By.xpath("//div[@id=\"uniform-cgv\"]");


    public boolean isShippingPageTitlePresent() {
        return isElementPresent(SHIPPING_TITLE_SELECTOR, true);
    }

    public void pressCheckoutButton() {
        click(PROCEED_TO_CHECKOUT_BUTTON_SELECTOR);
    }

    public void cheсkBoxPusher() { click(CHEK_BOX_SELECTOR);
    }
}




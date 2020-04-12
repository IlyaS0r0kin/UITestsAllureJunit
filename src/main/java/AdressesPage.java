import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdressesPage extends BaseActions {
    public AdressesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By ADRESS_TITLE_SELECTOR = By.xpath("//h3[@class=\"page-subheading\"]");
    private static final By PROCEED_TO_CHECKOUT_BUTTON_SELECTOR = By.name("processAddress");


    public boolean isAdressesPageTitlePresent() {
        return isElementPresent(ADRESS_TITLE_SELECTOR, true);
    }

    public void pressCheckoutButton() {
        click(PROCEED_TO_CHECKOUT_BUTTON_SELECTOR);
    }
}

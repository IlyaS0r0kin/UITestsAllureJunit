import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    private static final String HOMEPAGE_URL = "http://automationpractice.com/";
    private static final By SIGN_IN_BTN_SELECTOR = By.cssSelector(".login");
    private static final By ONE_HOMEPAGE_PRODUCT_BLOCK_SELECTOR = By.cssSelector("ul#homefeatured > li");
    private static final By BLOCK_ADD_TO_CART_BUTTON_SELECTOR = By.cssSelector(".ajax_add_to_cart_button");


    private static final By PROCEED_TO_CHECKOUT_BUTTON_SELECTOR = By.cssSelector("a[title='Proceed to checkout']");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Step()
    public void goToSignInPage() {
        click(SIGN_IN_BTN_SELECTOR);
    }

    @Step(value = "go to main page")
    public void home() {
        driver.get(HOMEPAGE_URL);
    }

    @Step()
    public int getProductBlocksCount() {
        return driver.findElements(ONE_HOMEPAGE_PRODUCT_BLOCK_SELECTOR).size();
    }

    @Step()
    public void addProductToCartByIndex(int index) {
        WebElement firstBlock = driver.findElements(ONE_HOMEPAGE_PRODUCT_BLOCK_SELECTOR).get(index);
        new Actions(driver).moveToElement(firstBlock).build().perform();
        click(BLOCK_ADD_TO_CART_BUTTON_SELECTOR);
    }

    @Step()
    public void pressCheckoutButton() {
        click(PROCEED_TO_CHECKOUT_BUTTON_SELECTOR);
    }


}



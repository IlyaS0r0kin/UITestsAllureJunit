import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BaseActions {
    private static final By ACCOUNT_TITLE_SELECTOR = By.linkText("My account");
    private static final By GO_TO_HOME_BTN = new By.ByCssSelector("*.icon-home");


    public MyAccountPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isAccountPageTitlePresent() {
        return isElementPresent(ACCOUNT_TITLE_SELECTOR, true);
    }

    public void goToHome() {
        click(GO_TO_HOME_BTN);
    }
}

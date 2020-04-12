import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage extends BaseActions {
    private static final By EMAIL_FIELD_SELECTOR = By.cssSelector("#email");
    private static final By PASSWORD_FIELD_SELECTOR = By.cssSelector("#passwd");
    private static final By SUBMIT_LOGIN_BUTTON_SELECTOR = By.cssSelector("#SubmitLogin");
    private static final By ALERT_SELECTOR = By.cssSelector(".alert.alert-danger");
    private static final By ALERT_IN_CREATE_ACCOUNT_FORM_SELECTOR = By.cssSelector("#create-account_form > .form_content.clearfix > .alert.alert-danger");

    private static final By EMAIL_CREATE_ACCOUNT_SELECTOR = By.cssSelector("#email_create");
    private static final By SUBMIT_BTN_CREATE_ACCOUNT_SELECTOR = By.cssSelector("#SubmitCreate");

    public AuthenticationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Step()
    public void login(String email, String password) {
        type(EMAIL_FIELD_SELECTOR, email);
        type(PASSWORD_FIELD_SELECTOR, password);
        click(SUBMIT_LOGIN_BUTTON_SELECTOR);
    }

    @Step()
    public String getAuthenticationAlertText() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ALERT_SELECTOR));
        return driver.findElement(ALERT_SELECTOR).getText();
    }

    @Step()
    public void startAccountCreation(String email) {
        type(EMAIL_CREATE_ACCOUNT_SELECTOR, email);
        click(SUBMIT_BTN_CREATE_ACCOUNT_SELECTOR);
    }

    @Step()
    public boolean isCreationAccountAlertPresent() {
        return isElementPresent(ALERT_IN_CREATE_ACCOUNT_FORM_SELECTOR, true);
    }
}
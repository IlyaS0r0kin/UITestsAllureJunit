import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class AuthenticationTests extends BaseUITest {

    @Test
    @Epic("Tests from example")
    @Feature(value = "Negative Authentication ")
    @Severity(SeverityLevel.MINOR)
    @Description("Login to the account when entering incorrect data is closed")
    @Story(value = "Enter invalid data")
    public void negativeAuthenticationTest() {
        mainPage.home();
        mainPage.goToSignInPage();
        authenticationPage.login("demo@demo.ru", "12345678");
    }

    @Test
    @Epic("Tests from example")
    @Feature(value = "Negative account creation ")
    @Severity(SeverityLevel.NORMAL)
    @Description("Creating a new account with invalid data is not possible")
    @Story(value = "Enter invalid data")
    public void negativeAccountCreationTest() {
        mainPage.home();
        mainPage.goToSignInPage();
        authenticationPage.startAccountCreation("12345678");
    }
}

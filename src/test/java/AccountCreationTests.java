import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class AccountCreationTests extends BaseUITest {
    @Test
    @Epic("Tests from example")
    @Feature(value = "CreateAccount")
    @Severity(SeverityLevel.NORMAL)
    @Description("Register a new account on the authentication page")
    @Story(value = "We fill in the forms with valid data")
    public void createAccountTest() {
        mainPage.home();
        mainPage.goToSignInPage();
        String email = Utils.generateEmail();
        String password = Utils.generatePassword();
        authenticationPage.startAccountCreation(email);
        accountCreationPage.fillPersonalInformation(GenderEnum.MALE, "Bob", "Johnson",
                password, 14, "August", 1989);
        accountCreationPage.fillCompanyInformation("LG", "Lenin st. 122", "New York",
                4, "22333", "+134872349324", "addressAlias");
        accountCreationPage.submitAccountCreation();
    }
}
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class FullTestBuyDress extends BaseUITest {

    @Test
    @Epic("Tests from example")
    @Feature(value = "Full cycle of buying a dress ")
    @Severity(SeverityLevel.CRITICAL)
    @Description("critical path test")
    @Story(value = "The choice of goods on the main page, the transition to registration and placing an order.")
    public void fullTestBuyDress() {
        mainPage.home();
        mainPage.addProductToCartByIndex(0);
        mainPage.pressCheckoutButton();
        cartPage.pressCheckoutButton();
        String email = Utils.generateEmail();
        authenticationPage.startAccountCreation(email);
        accountCreationPage.fillPersonalInformation(GenderEnum.MALE, "Ivan", "Petrov", "1231233", 15, "April", 1990);
        accountCreationPage.fillCompanyInformation("portfolio example", "Kameron st", "Spb", 3, "55555", "34234234", "adress");
        accountCreationPage.submitAccountCreation();
        myAccountPage.isAccountPageTitlePresent();
        adressesPage.pressCheckoutButton();
        shippingPage.cheсkBoxPusher();
        shippingPage.pressCheckoutButton();
        paymentPage.pressCheckoutButton();
        paymentPage.pressFinButton();

    }
}

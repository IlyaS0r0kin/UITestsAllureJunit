import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class CartTests extends BaseUITest {

    @Test
    @Epic("Tests from example")
    @Feature(value = "Add to Cart ")
    @Severity(SeverityLevel.NORMAL)
    @Description("Select an item and proceed to purchase")
    @Story(value = "Select a product in the slider on the main page and proceed to purchase")
    public void addToCartTest() {
        mainPage.home();
        mainPage.addProductToCartByIndex(0);
        mainPage.pressCheckoutButton();
    }
}

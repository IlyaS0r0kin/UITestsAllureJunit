import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BaseUITest {
    private WebDriver driver;
    private WebDriverWait wait;
    protected MainPage mainPage;
    protected AuthenticationPage authenticationPage;
    protected CartPage cartPage;
    protected AccountCreationPage accountCreationPage;
    protected MyAccountPage myAccountPage;
    protected AdressesPage adressesPage;
    protected ShippingPage shippingPage;
    protected PaymentPage paymentPage;


    public void driverManager(String Name) {
        if (Name == "Firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (Name == "Chrome") {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            driver = new ChromeDriver(options);
        } else if (Name == "Edge") {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    @BeforeEach
    public void init() {
        //driverManager("Firefox");
        driverManager("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        mainPage = new MainPage(driver, wait);
        authenticationPage = new AuthenticationPage(driver, wait);
        cartPage = new CartPage(driver, wait);
        accountCreationPage = new AccountCreationPage(driver, wait);
        myAccountPage = new MyAccountPage(driver, wait);
        adressesPage = new AdressesPage(driver, wait);
        shippingPage = new ShippingPage(driver, wait);
        paymentPage = new PaymentPage(driver, wait);
    }

    @AfterEach
    public void shutdown() {
        driver.quit();
    }

}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreationPage extends BaseActions {
    // PERSONAL INFORMATION ELEMENTS
    private static final By RADIO_GENDER_MALE_SELECTOR = By.cssSelector("#id_gender1");
    private static final By RADIO_GENDER_FEMALE_SELECTOR = By.cssSelector("#id_gender2");
    private static final By FIRST_NAME_FIELD_SELECTOR = By.cssSelector("#customer_firstname");
    private static final By LAST_NAME_FIELD_SELECTOR = By.cssSelector("#customer_lastname");
    private static final By EMAIL_FIELD_SELECTOR = By.cssSelector("#email");
    private static final By PASSWORD_FIELD_SELECTOR = By.cssSelector("#passwd");
    private static final By DOB_DAYS_SELECTOR = By.cssSelector("#days");
    private static final By DOB_MONTHS_SELECTOR = By.cssSelector("#months");
    private static final By DOB_YEARS_SELECTOR = By.cssSelector("#years");

    // COMPANY INFORMATION ELEMENTS
    private static final By COMPANY_NAME_SELECTOR = By.cssSelector("#company");
    private static final By ADDRESS_FIELD_SELECTOR = By.cssSelector("#address1");
    private static final By CITY_FIELD_SELECTOR = By.cssSelector("#city");
    private static final By STATE_FIELD_SELECTOR = By.cssSelector("#id_state");
    private static final By POSTCODE_FIELD_SELECTOR = By.cssSelector("#postcode");
    private static final By PHONE_MOBILE_FIELD_SELECTOR = By.cssSelector("#phone_mobile");
    private static final By ADDRESS_ALIAS_SELECTOR = By.cssSelector("#alias");

    private static final By SUBMIT_ACCOUNT_FIELD_SELECTOR = By.cssSelector("#submitAccount");
    private static final By CHECK_ACCOUNT_CREATED_SELECTOR = By.xpath("//p[@class='info-account']");

    public AccountCreationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillPersonalInformation(GenderEnum gender, String firstName, String lastName,
                                        String password, int dobDay, String dobMonth, int dobYear) {
        if (gender == GenderEnum.MALE) {
            click(RADIO_GENDER_MALE_SELECTOR);
        } else {
            click(RADIO_GENDER_FEMALE_SELECTOR);
        }
        type(FIRST_NAME_FIELD_SELECTOR, firstName);
        type(LAST_NAME_FIELD_SELECTOR, lastName);
        type(PASSWORD_FIELD_SELECTOR, password);
        selectDropDownByText(DOB_DAYS_SELECTOR, String.valueOf(dobDay));
        selectDropDownByIndex(DOB_MONTHS_SELECTOR, 8);
        selectDropDownByText(DOB_YEARS_SELECTOR, String.valueOf(dobYear));
    }

    public void fillCompanyInformation(String companyName, String address, String city, int stateIndex,
                                       String zipCode, String phone, String addressAlias) {
        type(COMPANY_NAME_SELECTOR, companyName);
        type(ADDRESS_FIELD_SELECTOR, address);
        type(CITY_FIELD_SELECTOR, city);
        selectDropDownByIndex(STATE_FIELD_SELECTOR, stateIndex);
        type(POSTCODE_FIELD_SELECTOR, zipCode);
        type(PHONE_MOBILE_FIELD_SELECTOR, phone);
        type(ADDRESS_ALIAS_SELECTOR, addressAlias);
    }

    public void submitAccountCreation() {
        click(SUBMIT_ACCOUNT_FIELD_SELECTOR);
    }
}

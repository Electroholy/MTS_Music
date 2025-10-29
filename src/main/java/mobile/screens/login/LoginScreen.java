package mobile.screens.login;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.SneakyThrows;
import mobile.locators.login.LoginLocators;
import mobile.screens.BaseScreen;
import mobile.screens.main.MainScreen;
import mobile.utils.Helper;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    //------------------------------------------------------------
    @AndroidFindBy(xpath = LoginLocators.LOGIN_BUTTON)
    private WebElement loginButton;
    public void tapLoginButton() {
        wainUntilElementIsClickable(loginButton);
        loginButton.click();
    }
    //------------------------------------------------------------
    @AndroidFindBy(xpath = LoginLocators.NEXT_BUTTON)
    private WebElement nextButton;
    public void tapNextButton() {
        wainUntilElementIsClickable(nextButton);
        nextButton.click();
    }
    //------------------------------------------------------------
    @AndroidFindBy(xpath = LoginLocators.NUMBER_FIELD)
    private WebElement numberField;
    public void enterMusicTariffNumber() {
        waitUntilElementIsVisible(numberField);
        numberField.sendKeys(Helper.getValue("music"));
    }

    public void enterPremiumTariffNumber() {
        waitUntilElementIsVisible(numberField);
        numberField.sendKeys(Helper.getValue("premium"));
    }

    public void enterFreemiumTariffNumber() {
        waitUntilElementIsVisible(numberField);
        numberField.sendKeys(Helper.getValue("freemium"));
    }
    //------------------------------------------------------------
    @AndroidFindBy(xpath = LoginLocators.PASSWORD_FIELD)
    private WebElement passwordField;
    public void enterPassword() {
        waitUntilElementIsVisible(passwordField);
        passwordField.sendKeys(Helper.getValue("password"));
    }
    //------------------------------------------------------------
    @AndroidFindBy(xpath = LoginLocators.SSO_DIALOG_ROOT)
    private WebElement ssoDialogRoot;
    @AndroidFindBy(xpath = LoginLocators.WEB_LOGIN_FORM)
    private WebElement loginForm;
    @AndroidFindBy(xpath = LoginLocators.WEB_LOGIN_FORM_OUTSIDE)
    private WebElement loginFormOutside;
    @AndroidFindBy(xpath = LoginLocators.MTS_TARIFF_NUMBER)
    private WebElement mtsMusicTariffNumber;
    @AndroidFindBy(xpath = LoginLocators.PREMIUM_TARIFF_NUMBER)
    private WebElement premiumTariffNumber;
    @AndroidFindBy(xpath = LoginLocators.FREEMIUM_TARIFF_NUMBER)
    private WebElement freemiumTariffNumber;
    @SneakyThrows
    public MainScreen login (String tariff) {
        tapLoginButton();
        if (tariff.equalsIgnoreCase("music")) {
            wainUntilElementIsClickable(mtsMusicTariffNumber);
            mtsMusicTariffNumber.click();
        } else if (tariff.equalsIgnoreCase("premium")) {
            wainUntilElementIsClickable(premiumTariffNumber);
            premiumTariffNumber.click();
        } else if (tariff.equalsIgnoreCase("freemium")) {
            wainUntilElementIsClickable(freemiumTariffNumber);
            freemiumTariffNumber.click();
        }
        return new MainScreen(driver);
    }
    //------------------------------------------------------------
}

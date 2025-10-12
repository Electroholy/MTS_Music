package mobile.screens.main;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import mobile.locators.main.MainLocators;
import mobile.locators.TabBarLocators;
import mobile.screens.BaseScreen;
import mobile.screens.favorite.FavoriteScreen;

@Slf4j
public class MainScreen extends BaseScreen {
    public MainScreen(AppiumDriver driver) {
        super(driver);
    }

    //---------------------------------------------------------
    @AndroidFindBy(xpath = MainLocators.ALLOW_CONNECT_TO_FIND)
    private WebElement allowButton;
    @SneakyThrows
    public MainScreen allowConnectToFind () {
        wainUntilElementIsClickable(allowButton);
        allowButton.click();
        Thread.sleep(2000);
        log.info("allow connect to find");
        return this;
    }
    @AndroidFindBy(xpath = MainLocators.DECLINE_CONNECT_TO_FIND)
    private WebElement declineButton;
    public MainScreen declineConnectToFind () {
        wainUntilElementIsClickable(declineButton);
        declineButton.click();
        log.info("decline connect to find");
        return this;
    }
    //----------------------------------------------------------
    @AndroidFindBy(xpath = MainLocators.FREEMIUM_BANNER)
    private WebElement freemiumBanner;
    public MainScreen closeFreemiumBanner () {
        if (freemiumBanner.isDisplayed()) {
            scrollToBot();
        }
        log.info("freemium banner closed");
        return this;
    }
    //---------------------------------------------------------
    @AndroidFindBy(xpath = MainLocators.PREMIUM_BANNER)
    private WebElement premiumBanner;
    @AndroidFindBy(xpath = MainLocators.PREMIUM_BANNER_CLOSE_BUTTON)
    private WebElement premiumBannerCloseButton;
    public MainScreen closePremiumBanner() {
        if (premiumBanner.isDisplayed()) {
            wainUntilElementIsClickable(premiumBannerCloseButton);
            premiumBannerCloseButton.click();
        }
        log.info("premium banner closed");
        return this;
    }
    //----------------------------------------------------------
    @AndroidFindBy(xpath = TabBarLocators.FAVORITE_TAB)
    private WebElement favoriteTab;
    public FavoriteScreen tapFavoriteTab() {
        wainUntilElementIsClickable(favoriteTab);
        favoriteTab.click();
        log.info("navigate to favorite screen");
        return new FavoriteScreen(driver);
    }
}

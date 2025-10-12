package mobile.screens.favorite;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.extern.slf4j.Slf4j;
import mobile.locators.favorite.FavoriteLocators;
import mobile.screens.BaseScreen;
import mobile.screens.favorite.artist.FavoriteArtistScreen;

@Slf4j
public class FavoriteScreen extends BaseScreen {
    public FavoriteScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = FavoriteLocators.ARTISTS_CATEGORY)
    private WebElement artistsCategory;
    public FavoriteArtistScreen tapArtistsCategory () {
        wainUntilElementIsClickable(artistsCategory);
        artistsCategory.click();
        log.info("navigate to favorite artists category");
        return new FavoriteArtistScreen(driver);
    }
}

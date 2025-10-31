package mobile.screens.favorite.artist;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import mobile.enums.ToastAddAndRemoveFromFav;
import mobile.enums.ToastRemoveFromRec;
import mobile.xpath_locators.favorites.FavoritesLocators;
import mobile.xpath_locators.favorites.artists.FavoriteArtistLocators;
import mobile.screens.BaseScreen;
import mobile.utils.Helper;

@Slf4j
public class FavoriteArtistScreen extends BaseScreen {
    public FavoriteArtistScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_BUTTON)
    private List<WebElement> actionButtons;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_OPEN_DESCRIPTION_ARTIST)
    private WebElement openHidedArtistDescriptionButton;
    @SneakyThrows
    public FavoriteArtistScreen tapActionMenuButton () {
        int actionButtonCount = actionButtons.size();
        int randomActionButton = random.nextInt(actionButtonCount);
        actionButtons.get(randomActionButton).click();
        Thread.sleep(1000);
        scrollToTop();
        log.info("action menu opened");
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_LIKE)
    private WebElement tapActionMenuLike;
    public FavoriteArtistScreen tapLikeInActionMenu () {
        wainUntilElementIsClickable(tapActionMenuLike);
        tapActionMenuLike.click();
        log.info("tap like");
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_DESCRIPTION_ARTIST)
    private WebElement artistDescription;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_LIKE)
    private WebElement likeButton;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_SHARE)
    private WebElement shareButton;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_REMOVE_FROM_REC)
    private WebElement removeFromRecButton;

    public FavoriteArtistScreen tapRemoveFromRecButton () {
        wainUntilElementIsClickable(removeFromRecButton);
        removeFromRecButton.click();
        log.info("tap remove artists from recommendation");
        return this;
    }

    @AndroidFindBy(xpath = FavoritesLocators.TOAST_WITH_MESSAGE_CATEGORY)
    private WebElement toast;
    public FavoriteArtistScreen verifyToastWithMessageAfterDislikeDisplayed () {
        assertThat(toast.getText().equalsIgnoreCase(ToastAddAndRemoveFromFav.REMOVE_ARTIST_FROM_FAVORITE.getValue())).withFailMessage("toast is not displayed").isTrue();
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ACTION_MENU_SHARE)
    private WebElement actionMenuShare;
    public FavoriteArtistScreen tapActionMenuShare () {
        wainUntilElementIsClickable(actionMenuShare);
        actionMenuShare.click();
        log.info("tap share artists");
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.BOTTOM_SHEET_SHARE)
    private WebElement bottomSheetShare;
    @AndroidFindBy(xpath = FavoriteArtistLocators.BOTTOM_SHEET_SHARE_ARTIST_COVER)
    private WebElement bottomSheetArtistCover;
    @AndroidFindBy(xpath = FavoriteArtistLocators.BOTTOM_SHEET_SHARE_COPY_LINK)
    private WebElement bottomSheetShareCopyLink;
    @AndroidFindBy(xpath = FavoriteArtistLocators.BOTTOM_SHEET_SHARE_MORE_OPTION_FOR_SHARE)
    private WebElement bottomSheetShareMoreOption;
    @SneakyThrows
    public FavoriteArtistScreen verifyAllShareBottomSheetItemsPresent () {
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(bottomSheetShare.isDisplayed()).withFailMessage("share bottom sheet is not displayed").isTrue();
        softAssert.assertThat(bottomSheetArtistCover.isDisplayed()).withFailMessage("artist cover is not displayed").isTrue();
        softAssert.assertThat(bottomSheetShareCopyLink.isDisplayed()).withFailMessage("share copy link is not displayed").isTrue();
        softAssert.assertThat(bottomSheetShareMoreOption.isDisplayed()).withFailMessage("share more options is not displayed").isTrue();
        softAssert.assertAll();
        Thread.sleep(1000);
        return this;
    }

    public FavoriteArtistScreen closeShareBottomSheet () {
        tapByCoordinate(695, 490);
        log.info("share bottom sheet closed");
        return this;
    }

    public FavoriteArtistScreen verifyToastWithMessageAfterRemoveFromRecDisplayed() {
        assertThat(Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                Helper.isTextPresentInElement(toast, ToastRemoveFromRec.FIRST_MESSAGE.getValue()))
                .withFailMessage("toast is not displayed").isTrue();
        return this;
    }
}

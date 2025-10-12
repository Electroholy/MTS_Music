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
import mobile.locators.favorite.FavoriteLocators;
import mobile.locators.favorite.artist.FavoriteArtistLocators;
import mobile.screens.BaseScreen;

@Slf4j
public class FavoriteArtistScreen extends BaseScreen {
    public FavoriteArtistScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_BUTTON)
    private List<WebElement> actionButtons;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTIST_CATEGORY_ACTION_MENU_OPEN_DESCRIPTION_ARTIST)
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

    public FavoriteArtistScreen openArtistDescription() {
        if (openHidedArtistDescriptionButton.isDisplayed()) {
            openHidedArtistDescriptionButton.click();
        } else if (socialMediaElement.isDisplayed()) {
            return this;
        }
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_LIKE)
    private WebElement tapActionMenuLike;
    public FavoriteArtistScreen tapLikeInActionMenu () {
        wainUntilElementIsClickable(tapActionMenuLike);
        tapActionMenuLike.click();
        log.info("tap like");
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_DESCRIPTION_ARTIST)
    private WebElement artistDescription;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_LIKE)
    private WebElement likeButton;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_SHARE)
    private WebElement shareButton;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_REMOVE_FROM_REC)
    private WebElement removeFromRecButton;
    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_LINKS_RECYCLER)
    private WebElement socialMediaElement;
    public FavoriteArtistScreen verifyAllActionMenuItemsPresent () {
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(artistDescription.isDisplayed()).withFailMessage("artist description is not displayed").isTrue();
        softAssert.assertThat(likeButton.isDisplayed()).withFailMessage("like button is not displayed").isTrue();
        softAssert.assertThat(shareButton.isDisplayed()).withFailMessage("share button is not displayed").isTrue();
        softAssert.assertThat(removeFromRecButton.isDisplayed()).withFailMessage("remove from recommendation button is not displayed").isTrue();
        softAssert.assertThat(socialMediaElement.isDisplayed()).withFailMessage("artist social media is not displayed").isTrue();
        softAssert.assertAll();
        return this;
    }

    public FavoriteArtistScreen tapRemoveFromRecButton () {
        wainUntilElementIsClickable(removeFromRecButton);
        removeFromRecButton.click();
        log.info("tap remove artists from recommendation");
        return this;
    }

    @AndroidFindBy(xpath = FavoriteLocators.TOAST_WITH_MESSAGE_CATEGORY)
    private WebElement toast;
    public FavoriteArtistScreen verifyToastWithMessageAfterDislikeDisplayed () {
        assertThat(toast.getText().equalsIgnoreCase(ToastAddAndRemoveFromFav.REMOVE_ARTIST_FROM_FAVORITE.getValue())).withFailMessage("toast is not displayed").isTrue();
        return this;
    }

    @AndroidFindBy(xpath = FavoriteArtistLocators.ARTISTS_CATEGORY_ACTION_MENU_SHARE)
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
        assertThat(toast.getText().equalsIgnoreCase(ToastRemoveFromRec.FIRST_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.SECOND_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.THIRD_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.FOURTH_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.FIFTH_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.SIXTH_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.SEVENTH_MESSAGE.getValue()) ||
                toast.getText().equalsIgnoreCase(ToastRemoveFromRec.EIGHTH_MESSAGE.getValue()))
                .withFailMessage("toast is not displayed").isTrue();
        return this;
    }
}

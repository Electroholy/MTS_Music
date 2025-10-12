package tests;

import org.junit.jupiter.api.Test;

import mobile.screens.login.LoginScreen;

public class FavoriteScreenTest extends BaseTest {

    @Test
    public void favoriteArtistActionMenuTest() {
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.login("freemium")
                .allowConnectToFind()
                .closeFreemiumBanner()
                .tapFavoriteTab()
                .tapArtistsCategory()
                .tapActionMenuButton()
                .verifyAllActionMenuItemsPresent()
                .tapLikeInActionMenu()
                .verifyToastWithMessageAfterDislikeDisplayed()
                .tapActionMenuButton()
                .tapActionMenuShare()
                .verifyAllShareBottomSheetItemsPresent()
                .closeShareBottomSheet()
                .tapActionMenuButton()
                .tapRemoveFromRecButton()
                .verifyToastWithMessageAfterRemoveFromRecDisplayed();
    }
}

package mobile.locators.favorites.favorite_tracks;

import org.sikuli.script.Pattern;

import mobile.utils.Helper;

public class FavoriteTracksLocators {
    private static final String MAIN_PATH_TO_IMAGE = Helper.getValue("favorites.favoriteTracks");


    public static final Pattern NAVBAR_GO_BACK_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "GoBackButton.png");


    public static final Pattern NAVBAR_ACTION_MENU_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "ActionMenuButton.png");
    public static final String NAVBAR_ACTION_MENU_DOWNLOAD = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_download_option']";
    public static final String NAVBAR_ACTION_MENU_SORTING_TRACKS = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_sorting']";
    public static final String NAVBAR_ACTION_MENU_SORTING_BY_DATE = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/order_by_date']";
    public static final String NAVBAR_ACTION_MENU_SORTING_BY_ALPHABET = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/order_by_alphabet']";
    public static final String NAVBAR_ACTION_MENU_SORTING_BY_DOWNLOAD_TRACKS = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/order_by_download']";
    public static final String NAVBAR_ACTION_MENU_ADD_TRACK_IN_PLAYLIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_add_in_playlist_option']";


    public static final Pattern NAVBAR_SEARCH_TRACK_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "SearchButton.png");
    public static final String NAVBAR_SEARCH_CANCEL_BUTTON = "//android.widget.TextView[@text='Отмена']";
    public static final String NAVBAR_SEARCH_TRACKS = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View";
    public static final String NAVBAR_SEARCH_ACTION_MENU = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View";
    public static final Pattern EMPTY_SCREEN = new Pattern(MAIN_PATH_TO_IMAGE + "EmptyScreen.png");


    public static final String HEADER_DOWNLOAD_BUTTON = "//android.widget.TextView[@text='Скачать']";
    public static final String HEADER_LISTEN_BUTTON = "(//android.widget.TextView[@text='Слушать'])[1]";
    public static final String HEADER_SHUFFLE_BUTTON = "//android.widget.TextView[@text='Перемешать']";


    public static final String ADD_TRACKS_BUTTON = "//android.widget.TextView[@text='Добавить треки']";
    public static final String BOTTOM_SHEET_ADD_TRACKS = "//android.widget.FrameLayout[@resource-id='ru.mts.music.android:id/design_bottom_sheet']";
    public static final String BOTTOM_SHEET_ADD_TRACKS_SEARCH_FIELD = "//android.widget.EditText[@resource-id='ru.mts.music.android:id/searchEditText']";
    public static final String BOTTOM_SHEET_ADD_TRACKS_CLOSE_BUTTON = "//android.widget.ImageView[@resource-id='ru.mts.music.android:id/close_icon']";
    public static final String BOTTOM_SHEET_ADD_TRACKS_TRACKS_TO_ADD = "(//android.view.ViewGroup[@resource-id='ru.mts.music.android:id/item_track_for_adding'])";
    public static final String BOTTOM_SHEET_ADD_TRACKS_LIKE_BUTTON = "(//android.widget.ImageView[@resource-id='ru.mts.music.android:id/like_icon'])";
    public static final String BOTTOM_SHEET_ADD_TRACKS_AUTHOR_NAME = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_author_name']";
    public static final String BOTTOM_SHEET_ADD_TRACKS_TRACK_NAME = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_title']";


    /*
    Локаторы FAVORITE_TRACK & ACTION_MENU_BUTTON хрупкие (любимые треки берут счёт с 5 индекса), кнопки экшн меню соответствуют индексу трека,
    в тестах можно использовать random значение по индексу от 5 до 9 включительно (это будут первые 5 треков, которые присутствуют в дереве сразу)
    */
    public static final String FAVORITE_TRACK = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]";
    public static final String ACTION_MENU_BUTTON = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View";


    public static final String ACTION_MENU_TRACK_TITLE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_title']";
    public static final String ACTION_MENU_TRACK_AUTHOR = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_author']";
    public static final String ACTION_MENU_MIX_BY_TRACK_BUTTON = "//android.view.ViewGroup[@resource-id='ru.mts.music.android:id/item_mix_by_track']";
    public static final String ACTION_MENU_LIKE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_dislike']";
    public static final String ACTION_MENU_DOWNLOAD = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_download']";
    public static final String ACTION_MENU_SHARE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_share']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_add_in_playlist']";
    public static final String ACTION_MENU_REMOVE_FROM_PLAYLIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_remove_in_playlist']";
    public static final String ACTION_MENU_SHOW_TEXT = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_show_text']";
    public static final String ACTION_MENU_NAVIGATE_TO_ALBUM = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_open_album']";
    public static final String ACTION_MENU_NAVIGATE_TO_ARTIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_open_artist']";
    public static final String ACTION_MENU_ABOUT_TRACK = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/about_tracks']";



    public static final Pattern SCROLL_TO_TOP_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "ScrollToTopButton.png");


    public static final Pattern PAYWALL_DOWNLOAD_LIMITED = new Pattern(MAIN_PATH_TO_IMAGE + "PaywallDownloadLimited.png");
    public static final Pattern PAYWALL_PLAYLIST_LISTENING_LIMITED = new Pattern(MAIN_PATH_TO_IMAGE + "PaywallListeningLimited.png");
}

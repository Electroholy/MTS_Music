package mobile.xpath_locators.favorites.albums;

import org.sikuli.script.Pattern;

import mobile.utils.Helper;

public class FavoriteAlbumsLocators {
    private static final String MAIN_PATH_TO_IMAGE = Helper.getValue("favorites.albums");

    public static final Pattern NAVBAR_GO_BACK_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "GoBackButton.png");
    public static final Pattern NAVBAR_SORTING_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "SortingButton.png");
    public static final String SORTING_BY_DATE = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/by_date']";
    public static final String SORTING_BY_ALBUM_NAME = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/by_album_name']";


    public static final String SEARCHING_FIELD = "//android.widget.EditText[@resource-id='ru.mts.music.android:id/searchEditText']";
    public static final String CANCEL_BUTTON = "//android.widget.Button[@resource-id='ru.mts.music.android:id/cancelButton']";
    public static final String CLEAR_SEARCHING_FIELD_BUTTON = "//android.widget.Button[@content-desc='Очистить']";


    public static final Pattern EMPTY_SCREEN = new Pattern(MAIN_PATH_TO_IMAGE + "EmptyScreen.png");
    public static final String SEARCH_IN_CATALOG_ON_EMPTY_SCREEN_BUTTON = "//android.view.View[@content-desc='Поиск по каталогу.Кнопка']";


    public static final String ACTION_MENU_BUTTON = "(//android.widget.ImageButton[@resource-id='ru.mts.music.android:id/more_button'])";
    public static final String ACTION_MENU_ALBUM_TITLE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_title']";
    public static final String ACTION_MENU_AUTHOR_AND_YEAR = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_author_and_year']";
    public static final String ACTION_MENU_LIKE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_dislike']";
    public static final String ACTION_MENU_DOWNLOAD_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_download']";
    public static final String ACTION_MENU_SHARE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_share']";
    public static final String ACTION_MENU_NAVIGATE_TO_ARTIST_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_open_artist']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/album_options_add_in_playlist']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST_OPTION_NAME_FIELD = "//android.widget.EditText[@resource-id='ru.mts.music.android:id/name_playlist']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST_OPTION_CLEAR_FIELD_BUTTON = "//android.widget.ImageView[@resource-id='ru.mts.music.android:id/delete_image_button']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST_OPTION_CREATE_PLAYLIST_BUTTON = "//android.widget.Button[@resource-id='ru.mts.music.android:id/create_play_list']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST_OPTION_CANCEL_BUTTON = "//android.widget.Button[@resource-id='ru.mts.music.android:id/cancel']";
}

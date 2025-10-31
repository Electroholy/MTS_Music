package mobile.xpath_locators.favorites.playlists;

import org.sikuli.script.Pattern;

import mobile.utils.Helper;

public class FavoritePlaylistsLocators {
    private static final String MAIN_PATH_TO_IMAGE = Helper.getValue("favorites.playlists");


    public static final Pattern NAVBAR_GO_BACK_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "GoBackButton.png");
    public static final Pattern NAVBAR_SORTING_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "SortingButton.png");
    public static final String SORTING_BY_ADDING_DATE_BUTTON = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/sort_by_adding_date']";
    public static final String SORTING_BY_ALPHABET_BUTTON = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/sort_by_alphabet']";
    public static final String SORTING_BY_CREATING_DATE_BUTTON = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/sort_by_creation_date']";
    public static final String SEARCHING_FIELD = "//android.widget.EditText[@resource-id='ru.mts.music.android:id/searchEditText']";
    public static final String CANCEL_BUTTON = "//android.widget.Button[@resource-id='ru.mts.music.android:id/cancelButton']";
    public static final Pattern EMPTY_SCREEN = new Pattern(MAIN_PATH_TO_IMAGE + "EmptyScreen.png");


    public static final String CREATE_NEW_PLAYLIST_BUTTON = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_title' and @text='Новый плейлист']";
    private static final String CREATE_NEW_PLAYLIST_PLAYLIST_NAME = "//android.widget.EditText[@text='Плейлист №%s']";
    public static final String CREATE_NEW_PLAYLIST_PLAYLIST_NAME_FIELD (int number) {
        return String.format(CREATE_NEW_PLAYLIST_PLAYLIST_NAME, number + 1);
    }
    public static final String CREATE_NEW_PLAYLIST_PLAYLIST_DESCRIPTION_FIELD = "//android.widget.EditText[@text='Описание плейлиста']";
    public static final String CREATE_NEW_PLAYLIST_CREATE_PLAYLIST_BUTTON = "//android.view.View[@content-desc='Создать плейлист.Кнопка']";


    public static final String PLAYLIST_COVER = "(//android.widget.ImageView[@resource-id='ru.mts.music.android:id/single_cover'])"; //по кол-ву плейлистов ищем поле ввода при создании нового плейлиста (+1)
    public static final String PLAYLIST_TITLE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_title']";
    public static final String PLAYLIST_TRACK_COUNT = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_track_count']";
    public static final String PLAYLIST_ACTION_MENU_BUTTON = "(//android.widget.ImageButton[@resource-id='ru.mts.music.android:id/options_icon'])";
    public static final String PLAYLIST_ACTION_MENU_PLAYLIST_TITLE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_options_title']";
    public static final String PLAYLIST_ACTION_MENU_PLAYLIST_TRACK_AND_DURATION_COUNT = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_count_track_and_duration']";
    public static final String PLAYLIST_ACTION_MENU_DOWNLOAD_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_download_option']";
    public static final String PLAYLIST_ACTION_MENU_SHARE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_share_option']";
    public static final String PLAYLIST_ACTION_MENU_PIN_PLAYLIST_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_pin_option']";
    public static final String PLAYLIST_ACTION_MENU_EDIT_PLAYLIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_edit_playlist_option']";
    public static final String PLAYLIST_ACTION_MENU_REMOVE_FROM_FAVORITE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/playlist_delete_in_favorite_option']";
}

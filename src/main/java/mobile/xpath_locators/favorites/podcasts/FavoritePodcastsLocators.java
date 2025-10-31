package mobile.xpath_locators.favorites.podcasts;

import org.sikuli.script.Pattern;

import mobile.utils.Helper;

public class FavoritePodcastsLocators {
    private static final String MAIN_PATH_TO_IMAGE = Helper.getValue("favorites.podcasts");


    public static final Pattern NAVBAR_GO_BACK_BUTTON = new Pattern(MAIN_PATH_TO_IMAGE + "GoBackButton.png");
    public static final String SEARCHING_FIELD = "//android.widget.EditText[@resource-id='ru.mts.music.android:id/searchEditText']";
    public static final String MY_PODCASTS_SECTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/title' and @text='Мои подкасты']";
    public static final String MY_PODCAST = "(//android.view.View[@resource-id='ru.mts.music.android:id/outline'])";
    public static final String MY_PODCASTS_EPISODE_SECTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/title' and @text='Мои выпуски']";
    public static final String PLAY_PODCAST_EPISODE_BUTTON = "(//android.widget.ImageView[@resource-id='ru.mts.music.android:id/fast_play_button'])";
    public static final String PODCAST_EPISODE_TITLE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/podcast_episode_title']";


    public static final String ACTION_MENU_BUTTON = "(//android.widget.ImageButton[@resource-id='ru.mts.music.android:id/options_icon'])";
    public static final String ACTION_MENU_PODCAST_EPISODE_TITLE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_title']";
    public static final String ACTION_MENU_PODCAST_EPISODE_DESCRIPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/description']";
    public static final String ACTION_MENU_LIKE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_dislike']";
    public static final String ACTION_MENU_DOWNLOAD_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_download']";
    public static final String ACTION_MENU_SHARE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_share']";
    public static final String ACTION_MENU_ADD_IN_PLAYLIST_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_add_in_playlist']";
    public static final String ACTION_MENU_ADD_TRACK_IN_PLAYLIST_CREATE_NEW_PLAYLIST_BUTTON = "//android.view.View[@content-desc='Создать новый плейлист.Кнопка']";
    public static final String ACTION_MENU_ADD_TRACK_IN_PLAYLIST_PLAYLIST_NAME_FIELD = "//android.widget.EditText[@resource-id='ru.mts.music.android:id/name_playlist']";
    public static final String ACTION_MENU_ADD_TRACK_IN_PLAYLIST_PLAYLIST_REMOVE_FIELD_BUTTON = "//android.widget.ImageView[@resource-id='ru.mts.music.android:id/delete_image_button']";
    public static final String ACTION_MENU_ADD_TRACK_IN_PLAYLIST_CREATE_PLAYLIST_BUTTON = "//android.widget.Button[@resource-id='ru.mts.music.android:id/create_play_list']";
    public static final String ACTION_MENU_ADD_TRACK_IN_PLAYLIST_CANCEL_BUTTON = "//android.widget.Button[@resource-id='ru.mts.music.android:id/cancel']";
    public static final String ACTION_MENU_ADD_TRACK_IN_PLAYLIST_PLAYLIST = "(//android.view.ViewGroup[@resource-id='ru.mts.music.android:id/playlist_dialog'])";
    public static final String ACTION_MENU_SHOW_TEXT_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_show_text']";
    public static final String ACTION_MENU_PLAY_NEXT_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_play_next']";
    public static final String ACTION_MENU_ADD_TO_QUEUE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_add_in_playback']";
    public static final String ACTION_MENU_NAVIGATE_TO_PODCAST_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/track_options_open_podcast_album']";
    public static final String ACTION_MENU_REMOVE_FROM_FAVORITE_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/podcast_episode_options_remove_from_music_library']";
    public static final String ACTION_MENU_ABOUT_PODCAST_OPTION = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/about_tracks']";


    public static final String EMPTY_SCREEN = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/placeholder_empty_favorite_podcasts']";
    public static final Pattern PAYWALL_LISTENING_LIMITED = new Pattern(MAIN_PATH_TO_IMAGE + "PaywallListeningLimited.png");
    public static final Pattern PAYWALL_DOWNLOAD_LIMITED = new Pattern(MAIN_PATH_TO_IMAGE + "PaywallDownloadLimited.png");
    public static final Pattern SNACK_BAR_SHOWING_TEXT_LIMITED = new Pattern(MAIN_PATH_TO_IMAGE + "SnackBarShowingTextLimited.png");
    public static final Pattern PAYWALL_ADD_TRACK_TO_QUEUE_LIMITED = new Pattern(MAIN_PATH_TO_IMAGE + "PaywallAddTrackToQueueLimited.png");
}

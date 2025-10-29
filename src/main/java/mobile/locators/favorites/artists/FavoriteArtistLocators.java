package mobile.locators.favorites.artists;

import org.sikuli.script.Pattern;

import mobile.utils.Helper;

public class FavoriteArtistLocators {
    private static final String MAIN_PATH_TO_IMAGE = Helper.getValue("favorites.artists");


    public static final String ARTIST = "//androidx.recyclerview.widget.RecyclerView[@resource-id='ru.mts.music.android:id/recycler_view']/android.view.ViewGroup";
    public static final String ARTIST_NAME = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/favorite_artist_name']";
    public static final String ARTIST_TRACKS_COUNT = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/favorite_artist_track_count']";


    public static final String ACTION_MENU_BUTTON = "(//android.widget.ImageButton[@resource-id='ru.mts.music.android:id/favorite_artist_more_actions_button'])";
    public static final String ACTION_MENU_DESCRIPTION_ARTIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/description_artist']";
    public static final String ACTION_MENU_OPEN_DESCRIPTION_ARTIST = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/more_description']";
    public static final Pattern OTHER_SOCIAL_MEDIA_ICON = new Pattern(MAIN_PATH_TO_IMAGE + "OtherIcon.png");
    public static final Pattern PERSONAL_WEBSITE_ICON = new Pattern(MAIN_PATH_TO_IMAGE + "PersonalWebsiteIcon.png");
    public static final Pattern TIKTOK_ICON = new Pattern(MAIN_PATH_TO_IMAGE + "TikTokIcon.png");
    public static final Pattern VK_ICON = new Pattern(MAIN_PATH_TO_IMAGE + "VKIcon.png");
    public static final Pattern YOUTUBE_ICON = new Pattern(MAIN_PATH_TO_IMAGE + "YouTubeIcon.png");


    public static final String ACTION_MENU_LIKE = "//android.widget.Button[@resource-id='ru.mts.music.android:id/artist_options_like']";
    public static final String ACTION_MENU_SHARE = "//android.widget.Button[@resource-id='ru.mts.music.android:id/artist_options_share']";
    public static final String ACTION_MENU_REMOVE_FROM_REC = "//android.widget.Button[@resource-id='ru.mts.music.android:id/artist_options_dislike_artist']";


    public static final String BOTTOM_SHEET_SHARE = "//android.view.ViewGroup[@resource-id='ru.mts.music.android:id/content']";
    public static final String BOTTOM_SHEET_SHARE_ARTIST_COVER = "//android.widget.ImageView[@resource-id='ru.mts.music.android:id/single_cover']";
    public static final String BOTTOM_SHEET_SHARE_COPY_LINK = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/link_view']";
    public static final String BOTTOM_SHEET_SHARE_MORE_OPTION_FOR_SHARE = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/more_options_view']']";


    public static final String SORTING_OPTIONS_BUTTON = "//android.widget.FrameLayout[@resource-id='ru.mts.music.android:id/sorting_options']";
    public static final String SORT_BY_DATE_BUTTON = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/sort_by_adding_date']";
    public static final String SORT_BY_ALPHABET_BUTTON = "//android.widget.LinearLayout[@resource-id='ru.mts.music.android:id/sort_by_alphabet']";

}

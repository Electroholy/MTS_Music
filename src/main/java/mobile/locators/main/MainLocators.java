package mobile.locators.main;

public class MainLocators {
    public static final String ALLOW_CONNECT_TO_FIND = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']";
    public static final String DECLINE_CONNECT_TO_FIND = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']";
    public static final String PREMIUM_BANNER = "//android.widget.ScrollView[@resource-id='ru.mts.music.android:id/scroll_premium']/android.widget.LinearLayout";
    public static final String PREMIUM_BANNER_GOOD_BUTTON = "//android.view.View[@content-desc='Хорошо.Кнопка']";
    public static final String PREMIUM_BANNER_MORE_INFO_BUTTON = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/premium_more_information']";
    public static final String PREMIUM_BANNER_CLOSE_BUTTON = "//android.widget.ImageView[@resource-id='ru.mts.music.android:id/close_button']";
    public static final String FREEMIUM_BANNER = "//androidx.compose.ui.platform.ComposeView[@resource-id='ru.mts.music.android:id/root_view']/android.view.View";
    public static final String FREEMIUM_BANNER_I_HAVE_PROMO_BUTTON = "//androidx.compose.ui.platform.ComposeView[@resource-id='ru.mts.music.android:id/root_view']/android.view.View/android.view.View[1]/android.widget.Button";
    public static final String MODAL_WINDOW_CONNECT_TO_FIND = "//android.widget.LinearLayout[@resource-id='com.android.permissioncontroller:id/grant_dialog']";

}

package mobile.xpath_locators.login;

public class LoginLocators {
    public static final String LOGIN_BUTTON = "//android.widget.Button";
    public static final String NEXT_BUTTON = "//android.widget.Button[@text='ДАЛЕЕ']";
    public static final String NUMBER_FIELD = "//android.widget.EditText[@resource-id='login']";
    public static final String PASSWORD_FIELD = "//android.widget.EditText[@resource-id='password']";
    public static final String SSO_DIALOG_ROOT = "//android.view.ViewGroup[@resource-id='ru.mts.music.android:id/sdkssoDialogRoot']";
    public static final String MTS_TARIFF_NUMBER = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/sdkSsoUserPhone' and @text='+7 910 086-48-62']";
    public static final String PREMIUM_TARIFF_NUMBER = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/sdkSsoUserPhone' and @text='+7 910 085-08-74']";
    public static final String FREEMIUM_TARIFF_NUMBER = "//android.widget.TextView[@resource-id='ru.mts.music.android:id/sdkSsoUserPhone' and @text='+7 915 145-76-83']";
    public static final String WEB_LOGIN_FORM = "//android.webkit.WebView[@resource-id='ru.mts.music.android:id/sdkSsoWebLoginForm']";
    public static final String WEB_LOGIN_FORM_OUTSIDE = "//android.view.View[@resource-id='ru.mts.music.android:id/touch_outside']";
}

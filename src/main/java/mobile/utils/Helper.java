package mobile.utils;

import org.openqa.selenium.WebElement;

import java.io.InputStream;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Helper {
    @Setter
    private static AppiumDriver driver;
    private static Properties config = new Properties();

    static {
        try (InputStream input = Helper.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                log.error("config not found");
            }
            config.load(input);
        } catch (Exception e) {
            log.error("Failed to load configuration");
            throw new RuntimeException();
        }
    }

    public static int stringToInteger (String value) {
        return Integer.parseInt(value.replaceAll("[^0-9.]", "").replaceAll("\\..*", ""));
    }

    public static Boolean isTextOnScreen (String expectedText) {
        return driver.getPageSource().contains(expectedText);
    }

    public static String getValue (String key) {
        return config.getProperty(key);
    }

    public static Boolean isTextPresentInElement (WebElement element, String text) {
        return element.getText().equalsIgnoreCase(text);
    }
}

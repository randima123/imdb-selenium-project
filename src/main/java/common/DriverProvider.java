package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

    private static final String BROWSER = Configuration.getBrowser();
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";


    public static WebDriver getWebDriver() {

        if (BROWSER == null) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }

        switch (BROWSER.toLowerCase()) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
//            case FIREFOX:
//                WebDriverManager.firefoxdriver().setup();
//                return new Firefo
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }

    }


}

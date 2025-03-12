package BrowserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.SendKeys.wait;

public class DriverFactory {

    private static final long ELEMENT_TIMEOUT = 30; // Tempo de espera para elementos
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            // Initialize Chrome options to set the SSL for tests
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);

            // Creates driver with ChromeDriver options
            driver = new ChromeDriver(options);

            // Maximize window
            driver.manage().window().maximize();

            // Time to wait for the elements before timeout
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ELEMENT_TIMEOUT));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(ELEMENT_TIMEOUT));
    }
}

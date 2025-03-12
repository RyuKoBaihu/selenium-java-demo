package BrowserFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;

public class Hook {

    private static WebDriver driver;

    @Before
    public static void setUp() {
        driver = getDriver();
        System.out.println("Browser initialized");
    }

    @After
    public static void tearDown() {
        if (driver != null) {
            DriverFactory.quitDriver();
            System.out.println("Browser closed");
        }
    }
}

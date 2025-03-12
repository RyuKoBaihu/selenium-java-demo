package BrowserFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public class Hook {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.getDriver();
        System.out.println("Navegador iniciado com sucesso!");
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            DriverFactory.quitDriver();
            System.out.println("Navegador fechado com sucesso!");
        }
    }
}

package BrowserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private static final long ELEMENT_TIMEOUT = 30;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            // Inicializa opções do Chrome
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);

            // Desativa o serviço de credenciais e o gerenciador de senhas do Chrome
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("safebrowsing.enabled", false);
            options.setExperimentalOption("prefs", prefs);

            // Opcional: evita detecção de automação (não obrigatório, mas útil em alguns testes)
            options.addArguments("--incognito");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.addArguments("--disable-features=PasswordLeakDetection");

            // Cria o driver com as opções configuradas
            driver = new ChromeDriver(options);

            // Maximiza a janela
            driver.manage().window().maximize();

            // Tempo de espera implícito
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

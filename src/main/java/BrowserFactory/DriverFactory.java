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
            WebDriverManager.chromedriver().setup(); // Configura o WebDriver Manager para o ChromeDriver

            // Inicializa o ChromeOptions para passar opções personalizadas ao Chrome
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true); // Aceita certificados SSL inseguros

            // Cria o driver do Chrome com as opções configuradas
            driver = new ChromeDriver(options);

            // Maximiza a janela do navegador
            driver.manage().window().maximize();

            // Configura o tempo de espera para encontrar os elementos
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ELEMENT_TIMEOUT));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit(); // Fecha o navegador
            driver = null; // Limpa a instância do driver
        }
    }

    public static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(ELEMENT_TIMEOUT)); // 10 segundos de timeout
    }
}

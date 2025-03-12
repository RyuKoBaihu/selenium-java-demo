package StepDefinitions.GeneralSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {

    // Carregar as propriedades
    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(fis); // Carrega o arquivo application.properties
        } catch (IOException e) {
            e.printStackTrace(); // Tratar caso o arquivo não seja encontrado ou erro de leitura
        }
    }

    // Ler a URL da aplicação do arquivo properties
    public static String getUrl() {
        return properties.getProperty("application.url");
    }
}

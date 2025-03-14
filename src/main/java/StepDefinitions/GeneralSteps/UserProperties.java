package StepDefinitions.GeneralSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserProperties {

    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("src/test/resources/user.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsername() {
        return properties.getProperty("username");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }
}

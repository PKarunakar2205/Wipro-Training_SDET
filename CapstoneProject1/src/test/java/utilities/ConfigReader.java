package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    static {

        try {

            prop = new Properties();

            prop.load(
            new FileInputStream(
            "src/test/resources/config.properties"));

        }

        catch(Exception e) {

            e.printStackTrace();
        }
    }

    public static String getUrl() {

        return prop.getProperty("url");
    }

    public static String getBrowser() {

        return prop.getProperty("browser");
    }
}
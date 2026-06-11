package utilities;

import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtils {

    public static void capture(
            WebDriver driver,
            String testName)
            throws Exception {

        File src =
        ((TakesScreenshot)driver)
        .getScreenshotAs(OutputType.FILE);

        File dest =
        new File("./Screenshots/"
        + testName + ".png");

        FileUtils.copyFile(src,dest);
    }
}
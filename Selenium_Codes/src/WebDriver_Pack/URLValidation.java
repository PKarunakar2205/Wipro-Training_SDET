package WebDriver_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLValidation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/downloads/");

        Thread.sleep(3000);

        String expectedurl = "https://www.selenium.dev/downloads/";

        String actualurl = driver.getCurrentUrl();

        System.out.println("Expected URL is = " + expectedurl);
        System.out.println("Actual URL is = " + actualurl);

        if (expectedurl.equals(actualurl)) {

            System.out.println("URL validation pass");

        } else {

            System.out.println("URL validation fail");
        }

        Thread.sleep(3000);

        driver.close();
    }
}
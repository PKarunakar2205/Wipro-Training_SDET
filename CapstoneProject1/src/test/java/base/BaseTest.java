package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.POM_Implementation;

public class BaseTest {

    public static WebDriver driver;

    public POM_Implementation p;

    @BeforeMethod

    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(
        "https://testautomationpractice.blogspot.com/");

        p = new POM_Implementation(driver);
    }

    @AfterMethod

    public void tearDown() {

        driver.quit();
    }
}
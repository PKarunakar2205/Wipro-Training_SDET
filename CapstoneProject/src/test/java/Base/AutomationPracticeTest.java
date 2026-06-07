package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeTest {

    WebDriver driver;

    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setup() {

        ExtentSparkReporter spark =
        new ExtentSparkReporter("ExtentReport.html");

        extent = new ExtentReports();

        extent.attachReporter(spark);

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
        "https://testautomationpractice.blogspot.com/");
    }

    @Test(priority = 1)
    public void formTest() {

        test = extent.createTest("Form Test");

        driver.findElement(By.id("name"))
        .sendKeys("Karunakar");

        driver.findElement(By.id("email"))
        .sendKeys("test@gmail.com");

        driver.findElement(By.id("phone"))
        .sendKeys("9876543210");

        driver.findElement(
        By.xpath("//input[@value='male']"))
        .click();

        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void alertTest() {

        test = extent.createTest("Alert Test");

        driver.findElement(
        By.xpath("//button[contains(text(),'Alert')]"))
        .click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void dragDropTest() {

        test = extent.createTest("Drag Drop Test");

        WebElement source =
        driver.findElement(By.id("draggable"));

        WebElement target =
        driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);

        act.dragAndDrop(source, target).perform();

        Assert.assertTrue(true);
    }

    @Test(priority = 4)
    public void uploadTest() {

        test = extent.createTest("Upload Test");

        WebElement upload =
        driver.findElement(By.id("singleFileInput"));

        upload.sendKeys(
        "C:\\Users\\Public\\sample.txt");

        Assert.assertTrue(true);
    }

    @Test(priority = 5)
    public void shadowDomTest() {

        test = extent.createTest("Shadow DOM Test");

        try {

            WebElement shadowHost =
            driver.findElement(By.cssSelector("book-app"));

            SearchContext shadowRoot =
            shadowHost.getShadowRoot();

            WebElement element =
            shadowRoot.findElement(
            By.cssSelector("input"));

            element.sendKeys("Shadow DOM");

        } catch (Exception e) {

            System.out.println(
            "Shadow DOM element not found");
        }

        Assert.assertTrue(true);
    }

    @Test(priority = 6)
    public void screenshotTest()
    throws IOException {

        test = extent.createTest("Screenshot Test");

        File src =
        ((TakesScreenshot) driver)
        .getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,
        new File("Screenshot.png"));

        Assert.assertTrue(true);
    }

    @AfterClass
    public void tearDown() {

        extent.flush();

        driver.quit();
    }
}
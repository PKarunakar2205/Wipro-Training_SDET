package Amazon;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProductSearch {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        // Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Search Box
        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")));

        search.sendKeys("Sunglass");
        search.sendKeys(Keys.ENTER);

        // Brand Filter
        WebElement brand = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[@id='p_123/230542']/span/a/span")));

        brand.click();

        // Screenshot 1
        TakesScreenshot tc = (TakesScreenshot) driver;
        File sc = tc.getScreenshotAs(OutputType.FILE);
        File dest = new File("Brand.png");
        FileHandler.copy(sc, dest);

        // Rating Filter
        WebElement rating = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[@id='p_72/1318476031']/span/div/a/i")));

        rating.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");

        // Screenshot 2
        TakesScreenshot tc1 = (TakesScreenshot) driver;
        File sc1 = tc1.getScreenshotAs(OutputType.FILE);
        File dest1 = new File("Rating.png");
        FileHandler.copy(sc1, dest1);

        // Discount Filter
        WebElement discount = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[@id='p_n_pct-off-with-tax/2665400031']/span/a/span")));

        discount.click();

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,900)");

        // Screenshot 3
        TakesScreenshot tc2 = (TakesScreenshot) driver;
        File sc2 = tc2.getScreenshotAs(OutputType.FILE);
        File dest2 = new File("Discount.png");
        FileHandler.copy(sc2, dest2);

        driver.quit();
    }
}
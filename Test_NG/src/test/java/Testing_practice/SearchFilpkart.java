package Testing_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchFilpkart {

    WebDriver driver;

    @DataProvider(name = "searchdata")
    public Object[][] dp() {

        return new Object[][] {

                {"Laptop"},
                {"Headphone"},
                {"Mobile"},
                {"Speaker"},
                {"AC"},
                {"facewash"},
                {"ipad"}
        };
    }

    @Test(dataProvider = "searchdata")
    public void validateSearch(String search)
            throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(3000);

        WebElement searchbox = driver.findElement(By.name("q"));

        Assert.assertTrue(searchbox.isEnabled());

        searchbox.sendKeys(search);

        Thread.sleep(2000);

        searchbox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("search"));

        driver.close();
    }
}
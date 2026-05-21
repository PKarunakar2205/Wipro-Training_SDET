package WebDriver_Pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TestAutomation {

    public static void main(String[] args)
            throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("name"))
                .sendKeys("P Karunakar");

        // Email
        driver.findElement(By.id("email"))
                .sendKeys("pkarunakar@gmail.com");

        // Phone
        driver.findElement(By.id("phone"))
                .sendKeys("6375878421");

        driver.findElement(By.id("textarea"))
                .sendKeys("Bhubaneswar, Odisha");

        driver.findElement(By.id("male")).click();

        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("wednesday")).click();
        driver.findElement(By.id("friday")).click();

        WebElement country =
                driver.findElement(By.id("country"));

        Select sel = new Select(country);
        sel.selectByVisibleText("India");

        WebElement colors =
                driver.findElement(By.id("colors"));

        Select col = new Select(colors);
        col.selectByVisibleText("Red");
        col.selectByVisibleText("Blue");

        WebElement animals =
                driver.findElement(By.id("animals"));

        Select ani = new Select(animals);
        ani.selectByVisibleText("Cat");
        ani.selectByVisibleText("Dog");

        WebElement dp1 =
                driver.findElement(By.id("datepicker"));

        dp1.sendKeys("05/22/2003");

        WebElement dp2 =
                driver.findElement(By.id("txtDate"));

        dp2.sendKeys("22/05/2003");

        driver.findElement(By.id("start-date"))
                .sendKeys("2026-05-01");

        driver.findElement(By.id("end-date"))
                .sendKeys("2026-05-15");

        driver.findElement(By.xpath("//button[text()='Submit']"))
                .click();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,700)");

        Thread.sleep(2000);

        WebElement singleFile =
                driver.findElement(By.id("singleFileInput"));

        singleFile.sendKeys(
                "C:\\Users\\YourName\\Desktop\\testfile.txt");

        driver.findElement(
                By.xpath("//button[text()='Upload Single File']"))
                .click();

        WebElement multiFile =
                driver.findElement(By.id("multipleFilesInput"));

        multiFile.sendKeys(
                "C:\\Users\\YourName\\Desktop\\file1.txt\n" +
                "C:\\Users\\YourName\\Desktop\\file2.txt");

        driver.findElement(
                By.xpath("//button[text()='Upload Multiple Files']"))
                .click();

        js.executeScript("window.scrollBy(0,700)");

        String book =
                driver.findElement(
                By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[1]"))
                .getText();

        System.out.println("Book Name: " + book);

        String cpu =
                driver.findElement(
                By.xpath("//p[contains(text(),'CPU load')]"))
                .getText();

        System.out.println(cpu);

        driver.findElement(
                By.xpath("//table[@id='productTable']/tbody/tr[1]/td[4]/input"))
                .click();

        driver.findElement(
                By.xpath("//a[text()='2']"))
                .click();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//table[@id='productTable']/tbody/tr[2]/td[4]/input"))
                .click();

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        File src =
                ts.getScreenshotAs(OutputType.FILE);

        File dest =
                new File("D:\\Screenshot\\testautomationpractice.png");

        FileHandler.copy(src, dest);

        System.out.println("Screenshot Saved");

        Thread.sleep(5000);

        driver.quit();
    }
}
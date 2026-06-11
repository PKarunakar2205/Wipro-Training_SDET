package WebDriver_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement fname = driver.findElement(By.id("firstName"));
        fname.sendKeys("P");

        WebElement lname = driver.findElement(By.id("lastName"));
        lname.sendKeys("Karunakar");
        WebElement useremail = driver.findElement(By.id("userEmail"));
        useremail.sendKeys("pkarunakar@gmail.com");

      
    }
}
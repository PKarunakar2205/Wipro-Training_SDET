package WebDriver_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbutton {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("q")).click();

        driver.findElement(By.name("q")).sendKeys("nature images");

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

       
    }
}

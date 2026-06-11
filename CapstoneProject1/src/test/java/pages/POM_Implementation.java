package pages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class POM_Implementation {

    WebDriver driver;

    public POM_Implementation(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {

        driver.findElement(By.id("name"))
              .sendKeys(name);
    }

    public void enterEmail(String email) {

        driver.findElement(By.id("email"))
              .sendKeys(email);
    }

    public void enterPhone(String mobile) {

        driver.findElement(By.id("phone"))
              .sendKeys(mobile);
    }

    public void enterAddress(String address) {

    	driver.findElement(By.xpath("//textarea"))
        .sendKeys(address);
    }

    public void selectRadioAndCheckbox() {

        driver.findElement(By.id("male")).click();

        driver.findElement(By.id("sunday")).click();
    }

    public void selectCountry() {

        Select s =
        new Select(driver.findElement(By.id("country")));

        s.selectByVisibleText("India");
    }

    public void selectColors() {

        Select s =
        new Select(driver.findElement(By.id("colors")));

        s.selectByVisibleText("Red");
    }

    public void selectAnimals() {

        Select s =
        new Select(driver.findElement(By.id("animals")));

        s.selectByVisibleText("Rabbit");
    }

    public void uploadSingleFile(String path) {

        driver.findElement(By.id("singleFileInput"))
              .sendKeys(path);
    }

    public void handleAlerts() {

        driver.findElement(By.id("alertBtn")).click();

        Alert a =
        driver.switchTo().alert();

        a.accept();
    }

    public void newtab() {

        String parent =
        driver.getWindowHandle();

        driver.findElement(
        By.xpath("//*[@id='HTML4']/div[1]/button"))
        .click();

        Set<String> windows =
        driver.getWindowHandles();

        for(String win : windows) {

            if(!win.equals(parent)) {

                driver.switchTo().window(win);

                driver.close();
            }
        }

        driver.switchTo().window(parent);
    }

    public void mouseHover() {

        Actions act =
        new Actions(driver);

        act.moveToElement(
        driver.findElement(
        By.xpath("//*[@id='HTML3']/div[1]/div/button")))
        .perform();
    }

    public void doubleClick() {

        Actions act =
        new Actions(driver);

        act.doubleClick(
        driver.findElement(
        By.xpath("//button[@ondblclick='myFunction1()']")))
        .perform();
    }

    public void dragDrop() {

        Actions act =
        new Actions(driver);

        act.dragAndDrop(
        driver.findElement(By.id("draggable")),
        driver.findElement(By.id("droppable")))
        .perform();
    }

    public void slider() {

        Actions act =
        new Actions(driver);

        act.dragAndDropBy(
        driver.findElement(
        By.xpath("//*[@id='slider-range']/span[1]")),
        50,
        0)
        .perform();
    }
}
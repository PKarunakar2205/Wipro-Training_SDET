package Test_ng;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class assignment {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest(alwaysRun=true)
    public void beforeclass() {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test(priority=1,groups="Smoke")
    public void registration() {

    	    driver.findElement(By.linkText("Register")).click();

    	    driver.findElement(By.id("gender-male")).click();
    	    driver.findElement(By.id("FirstName")).sendKeys("Sowmithran");
    	    driver.findElement(By.id("LastName")).sendKeys("V");

    	    String email = "test" + System.currentTimeMillis() + "@gmail.com";
    	    driver.findElement(By.id("Email")).sendKeys(email);

    	    driver.findElement(By.id("Password")).sendKeys("Sowmithran@24");
    	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Sowmithran@24");

    	    driver.findElement(By.id("register-button")).click();

    	    driver.findElement(By.cssSelector(".register-continue-button")).click();
    	}
    

    @Test(priority=2,groups="Smoke")
    public void login() {

        boolean isLoggedIn = driver.findElements(By.linkText("Log out")).size() > 0;

        if (isLoggedIn) {
            System.out.println("Already logged in, skipping login step");
            return;
        }

        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("Email")).sendKeys("testuser@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Sowmithran@24");

        driver.findElement(By.cssSelector(".login-button")).click();
    }
}
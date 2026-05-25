package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Searchstep {

    WebDriver driver;

    @And("go to search button and click add inputs")
    public void go_to_search_button_and_click_add_inputs() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.name("search")).click();

        driver.findElement(By.name("search"))
              .sendKeys("iPhone");

        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"))
              .click();

        System.out.println("Search completed successfully");
    }

    @Then("list of products")
    public void list_of_products() {

        System.out.println("Product list displayed");

    }

    @And("add product to wishlist")
    public void add_product_to_wishlist() {

        driver.findElement(By.xpath("(//button[@data-original-title='Add to Wish List'])[1]")).click();

        System.out.println("Product added to wishlist");

    }

    @And("add product to cart")
    public void add_product_to_cart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//button[@onclick[contains(.,'cart.add')]])[1]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", addToCart);

        js.executeScript("arguments[0].click();", addToCart);

        System.out.println("Product added to cart");

    }

    @And("open shopping cart")
    public void open_shopping_cart() {

        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();

        System.out.println("Shopping cart opened");

    }

    @And("proceed to checkout")
    public void proceed_to_checkout() {

        driver.findElement(By.linkText("Checkout")).click();

        System.out.println("Checkout page opened");

    }

    @Then("close browser")
    public void close_browser() {

        driver.quit();

        System.out.println("Browser closed");

    }
}
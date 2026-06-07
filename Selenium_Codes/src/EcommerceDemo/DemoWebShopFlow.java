package EcommerceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShopFlow {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {

			driver.get("https://demowebshop.tricentis.com/");

			System.out.println("Demo Web Shop Opened");

			WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));

			loginLink.click();

			System.out.println("Login Page Opened");

			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));

			email.sendKeys("testselenium123@gmail.com");

			WebElement password = driver.findElement(By.id("Password"));

			password.sendKeys("Test@123");

			WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));

			loginBtn.click();

			System.out.println("Login Successful");

			WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("small-searchterms")));

			searchBox.sendKeys("laptop");

			searchBox.sendKeys(Keys.ENTER);

			System.out.println("Search Completed");

			Thread.sleep(3000);

			WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@class='product-title'])[1]")));

			System.out.println("Product Title : "+ title.getText());

			WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='price actual-price'])[1]")));

			System.out.println("Product Price : "+ price.getText());

			WebElement rating = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='rating'])[1]")));

			if (rating.isDisplayed()) {

				System.out.println("Product Rating Displayed");
			}

			title.click();

			System.out.println("Product Opened");

			Thread.sleep(3000);

			WebElement image = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='main-product-img-31']")));

			Actions act = new Actions(driver);

			act.moveToElement(image).perform();

			System.out.println("Image Zoom Working");

			Thread.sleep(3000);

			WebElement addToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button-31")));

			if (addToCart.isDisplayed()) {

				System.out.println("Add To Cart Button Visible");
			}

			if (addToCart.isEnabled()) {

				System.out.println("Buy Button Working");
			}

			js.executeScript("arguments[0].click();",addToCart);

			System.out.println("Product Added To Cart");

			Thread.sleep(3000);

			WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Shopping cart']")));

			cart.click();

			System.out.println("Shopping Cart Opened");

			Thread.sleep(3000);

			WebElement checkout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));

			if (checkout.isDisplayed()) {

				System.out.println("Checkout Button Visible");
			}

			WebElement terms = driver.findElement(By.id("termsofservice"));

			terms.click();

			js.executeScript("arguments[0].click();",checkout);

			System.out.println("Checkout Process Started");

			Thread.sleep(5000);

			System.out.println("Automation Completed Successfully");

		}

		catch (Exception e) {

			System.out.println("Test Failed : "+ e.getMessage());
		}

		finally {

			Thread.sleep(3000);

			driver.quit();

			System.out.println("Browser Closed");
		}
	}
}
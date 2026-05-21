package Testing_practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart_Testng {

	WebDriver driver;

	WebDriverWait wait;

	JavascriptExecutor js;

	@BeforeTest

	public void beforeTest() {

		driver = new ChromeDriver();

		wait = new WebDriverWait(driver,
				Duration.ofSeconds(20));

		js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

	}

	@Test(priority = 1)

	public void registration() throws Exception {

		Thread.sleep(3000);
		WebElement cutBtn = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("/html/body/div[5]/div/span")));

		cutBtn.click();

		WebElement loginBtn = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[2]/div[2]/div/div/div[1]/div/a/span")));

		loginBtn.click();

		WebElement mobile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")));

		mobile.sendKeys("9777828123");

		WebElement otpBtn = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")));

		otpBtn.click();

		Thread.sleep(30000);

		WebElement search = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.name("q")));


	}

//	@Test(priority = 2)

//	public void login() throws Exception {
//
//		WebElement otp = wait.until(
//				ExpectedConditions.elementToBeClickable(
//						By.xpath("//button[contains(text(),'Request OTP')]")));
//
//		js.executeScript(
//				"arguments[0].click();", otp);
//
//		Thread.sleep(20000);
//
//	}

	@Test(priority = 3)

	public void multiple_search() throws Exception {

		WebElement search = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.name("q")));

		search.sendKeys("Boat Headphones");

		Thread.sleep(1000);

		search.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

	}

	@Test(priority = 4)

	public void add_to_cart() throws Exception {

		WebElement product = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[1]/div/a[3]")));

		js.executeScript(
				"arguments[0].click();", product);

		Thread.sleep(5000);

		String parent = driver.getWindowHandle();

		Set<String> tabs = driver.getWindowHandles();

		for (String tab : tabs) {

			if (!tab.equals(parent)) {

				driver.switchTo().window(tab);
			}
		}

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(3000);

		WebElement addcart = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[18]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div")));

		js.executeScript(
				"arguments[1].click();", addcart);

		Thread.sleep(5000);

	}

	@Test(priority = 5)

	public void product_details() throws Exception {

		Actions act = new Actions(driver);

		WebElement image = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/script[7]")));

		act.moveToElement(image).perform();

		Thread.sleep(3000);

	}

	@Test(priority = 6)

	public void delete_cart_item() throws Exception {

		WebElement cart = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div")));

		js.executeScript(
				"arguments[0].click();", cart);

		Thread.sleep(4000);

		WebElement remove = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"slot-list-container\"]/div/div[1]/div/div/div/div/div/div[1]/div/div[3]/div/div/div/div/div/div/div[3]/div/div[2]/div/div")));

		js.executeScript(
				"arguments[0].click();", remove);

		Thread.sleep(3000);

		WebElement remove2 = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"slot-list-container\"]/div/div[1]/div/div/div/div/div/div[1]/div/div[3]/div/div/div/div/div/div/div[3]/div/div[2]/div/div")));

		js.executeScript(
				"arguments[0].click();", remove2);

		Thread.sleep(5000);

	}

	@Test(priority = 7)

	public void buy_now() throws Exception {

		driver.navigate().back();

		Thread.sleep(5000);

		WebElement buy = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[18]/div/div/div/div/div")));

		js.executeScript(
				"arguments[0].click();", buy);

		Thread.sleep(5000);

	}

	@Test(priority = 8)

	public void change_delivery_address() throws Exception {

		WebElement placeorder = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"slot-list-container\"]/div/div[1]/div/div/div/div/div/div[2]/div/div[3]/div")));

		js.executeScript(
				"arguments[0].click();", placeorder);

		Thread.sleep(3000);

//		driver.switchTo().newWindow(WindowType.TAB);
//
//		driver.get("https://www.flipkart.com/");
//
//		Thread.sleep(3000);

	}

	@AfterTest

	public void afterTest() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

}
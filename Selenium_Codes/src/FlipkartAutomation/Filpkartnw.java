package FlipkartAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filpkartnw {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(driver,
				Duration.ofSeconds(60));

		driver.get("https://www.flipkart.com");

		Thread.sleep(5000);

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

		search.sendKeys("Dell Laptop");

		Thread.sleep(2000);

		search.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(3000);

		WebElement dellLaptop = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]")));

		dellLaptop.click();

		Thread.sleep(2000);

		for (String tab : driver.getWindowHandles()) {

			driver.switchTo().window(tab);
		}

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(3000);

		WebElement buyNow = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//button[contains(.,'Buy Now')]")));

		js.executeScript("arguments[0].click();", buyNow);

		Thread.sleep(8000);

		WebElement placeOrder = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//span[contains(text(),'Place Order')]")));

		js.executeScript("arguments[0].click();", placeOrder);

		Thread.sleep(5000);

		driver.quit();

	}

}
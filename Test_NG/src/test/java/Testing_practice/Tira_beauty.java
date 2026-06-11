package Testing_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tira_beauty {

	WebDriver driver;

	WebDriverWait wait;

	@BeforeTest

	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(10));

		wait = new WebDriverWait(driver,
				Duration.ofSeconds(20));

		driver.get(
				"https://www.tirabeauty.com/");
	}

	@Test(priority = 1)

	public void searchProduct() {

		WebElement search = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.tagName("input")));

		search.click();

		search.sendKeys("face wash");

		search.sendKeys(Keys.ENTER);

		System.out.println(
				"Search Successful");
	}

	@Test(priority = 2)

	public void verifyTitle() {

		String title = driver.getTitle();

		System.out.println(title);
	}

	@Test(priority = 3)

	public void openCart() {

		driver.navigate().to(
				"https://www.tirabeauty.com/cart/bag");

		System.out.println(
				"Cart Opened");
	}

	@AfterTest

	public void closeBrowser() {

		driver.quit();
	}
}
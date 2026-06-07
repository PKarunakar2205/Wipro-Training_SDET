package Tirabeauty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_22 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait wait = new WebDriverWait(driver,
				Duration.ofSeconds(15));

		driver.get("https://www.tirabeauty.com/");

		Thread.sleep(5000);

		WebElement searchBox = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.id("search")));

		searchBox.click();

		searchBox.sendKeys("Men's facewash");

		Thread.sleep(2000);

		searchBox.sendKeys(Keys.ENTER);

		Thread.sleep(4000);


		WebElement brand = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//div[@id='Brand']//button")));

		brand.click();

		Thread.sleep(2000);

		WebElement nivea = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//div[text()='Nivea']")));

		nivea.click();

		Thread.sleep(3000);


		WebElement skinType = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//div[@id='Skin Type']//button")));

		skinType.click();

		Thread.sleep(2000);

		WebElement oily = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//div[text()='Oily']")));

		oily.click();

		Thread.sleep(4000);


		WebElement product = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("/html/body/div/div/div[2]/div[4]/div[2]/div[2]/div/div/div[1]/a/div/div[1]/div[2]/div[1]/div[1]")));

		product.click();

		Thread.sleep(4000);


		String parentWindow = driver.getWindowHandle();

		for (String window : driver.getWindowHandles()) {

			if (!window.equals(parentWindow)) {

				driver.switchTo().window(window);

				break;
			}
		}

		Thread.sleep(3000);


		WebElement addBag = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//button[./span[text()='Add To Bag']]")));

		addBag.click();

		Thread.sleep(4000);


		WebElement cart = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.cssSelector("a[href='/cart/bag']")));

		cart.click();

		Thread.sleep(4000);


		WebElement loginBtn = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/button")));

		loginBtn.click();

		Thread.sleep(3000);


		WebElement mobile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//input[@id='mobile-number-input' or @name='mobile-number']")));

		mobile.click();

		mobile.clear();

		mobile.sendKeys("9777828123");

		Thread.sleep(2000);


		WebElement checkbox = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//div[contains(@class,'filterCheckbox')] | //div[contains(@class,'checkbox')]")));

		checkbox.click();

		Thread.sleep(2000);


		WebElement sendOtp = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//button[text()='Send OTP']")));

		sendOtp.click();

		System.out.println("Enter OTP manually");

		Thread.sleep(20000);


		WebElement submitBtn = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//button[contains(text(),'Verify')] | //button[contains(text(),'Continue')] | //button[contains(text(),'Submit')]")));

		submitBtn.click();

		Thread.sleep(4000);

		WebElement firstName = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.name("firstName")));

		firstName.sendKeys("P");

		Thread.sleep(1000);


		WebElement lastName = driver.findElement(
				By.name("lastName"));

		lastName.sendKeys("Karunakar");

		Thread.sleep(1000);


		WebElement email = driver.findElement(
				By.name("email"));

		email.sendKeys("karunakar@gmail.com");

		Thread.sleep(1000);


		WebElement male = driver.findElement(
				By.xpath("//span[text()='Male']"));

		male.click();

		Thread.sleep(1000);


		WebElement dob = driver.findElement(
				By.xpath("//input[@placeholder='DD/MM/YYYY']"));

		dob.sendKeys("22/05/2003");

		Thread.sleep(1000);


		WebElement referral = driver.findElement(
				By.xpath("//input[contains(@placeholder,'referral')]"));

		referral.sendKeys("TIRA12");

		Thread.sleep(1000);


		WebElement save = wait.until(
				ExpectedConditions.elementToBeClickable(
						By.xpath("//button[contains(text(),'Save')]")));

		save.click();

		Thread.sleep(5000);

		driver.quit();
	}
}
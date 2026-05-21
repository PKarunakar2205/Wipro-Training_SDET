package Blogspot;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Alert_test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("name")).sendKeys("Karunakar");

		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("karunakar@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.id("phone")).sendKeys("9876543210");

		Thread.sleep(1000);

		driver.findElement(By.id("textarea")).sendKeys("Bhubaneswar Odisha");

		Thread.sleep(1000);

		driver.findElement(By.id("male")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("sunday")).click();

		driver.findElement(By.id("monday")).click();

		driver.findElement(By.id("tuesday")).click();

		driver.findElement(By.id("wednesday")).click();

		driver.findElement(By.id("thursday")).click();

		driver.findElement(By.id("friday")).click();

		driver.findElement(By.id("saturday")).click();

		Thread.sleep(2000);

		WebElement country = driver.findElement(By.id("country"));

		Select sc = new Select(country);

		sc.selectByVisibleText("India");

		Thread.sleep(2000);

		WebElement colors = driver.findElement(By.id("colors"));

		Select cl = new Select(colors);

		cl.selectByVisibleText("Red");

		cl.selectByVisibleText("Blue");

		Thread.sleep(2000);

		WebElement animal = driver.findElement(By.id("animals"));

		Select an = new Select(animal);

		an.selectByVisibleText("Lion");

		Thread.sleep(2000);

		driver.findElement(By.id("datepicker")).sendKeys("20/05/2026");

		Thread.sleep(2000);

		driver.findElement(By.id("alertBtn")).click();

		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();

		al.accept();

		Thread.sleep(2000);

		driver.findElement(By.id("confirmBtn")).click();

		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		Actions ac = new Actions(driver);

		WebElement point = driver.findElement(By.xpath("//button[text()='Point Me']"));

		ac.moveToElement(point).perform();

		Thread.sleep(3000);

		WebElement copy = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		ac.doubleClick(copy).perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='START']")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("Wikipedia1_wikipedia-search-input"))
				.sendKeys("Selenium");

		Thread.sleep(2000);

		driver.findElement(By.className("wikipedia-search-button")).click();

		Thread.sleep(5000);

		String parent = driver.getWindowHandle();

		driver.findElement(By.linkText("Selenium")).click();

		Thread.sleep(5000);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		Thread.sleep(3000);

		driver.close();

		driver.switchTo().window(parent);

		Thread.sleep(3000);

		driver.navigate().to("https://demoqa.com/droppable");

		Thread.sleep(3000);

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		ac.dragAndDrop(drag, drop).perform();

		Thread.sleep(5000);

		driver.close();

	}

}
package Testing_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_impl {
	WebDriver driver;

	public POM_impl(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.linkText("Log in");
	By email = By.id("Email");
	By pass = By.id("Password");
	By loginBtn =By.xpath("//input[@value='Log in']");
	By registerLink = By.linkText("Register");
	By gender = By.id("gender-male");
	By fname = By.id("FirstName");
	By lname = By.id("LastName");
	//By email = By.id("Email");
	By password = By.id("Password");
	By confirm = By.id("ConfirmPassword");
	By registerBtn = By.id("register-button");
	

	public void login() {

		driver.findElement(login).click();

		driver.findElement(email)
		.sendKeys("karunakar@gmail.com");

		driver.findElement(pass)
		.sendKeys("Karunakar@22");

		driver.findElement(loginBtn)
		.click();
		
	}
	public void register() {

		driver.findElement(registerLink).click();

		driver.findElement(gender).click();

		driver.findElement(fname)
		.sendKeys("P");

		driver.findElement(lname)
		.sendKeys("Karunakar");

		driver.findElement(email)
		.sendKeys("karunakar@gmail.com");

		driver.findElement(password)
		.sendKeys("Karunakar@22");

		driver.findElement(confirm)
		.sendKeys("Karunakar@22");

		driver.findElement(registerBtn)
		.click();
	}

  @Test
  public void f() {
  }
}
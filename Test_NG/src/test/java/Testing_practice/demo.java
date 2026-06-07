package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class demo {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts();
		//implicitlyWait(Duration.ofSeconds(10));

		driver.get(
		"https://demowebshop.tricentis.com/");
	}
	@Test
	public void login() {
		POM_impl p=new POM_impl(driver);
		p.register();
		p.login();
	}
  @AfterTest
  public void afterTest() {
  }

}
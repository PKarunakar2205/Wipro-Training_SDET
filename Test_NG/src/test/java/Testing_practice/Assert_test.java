package Testing_practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assert_test {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		//navigate to url(webpage url)
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
	  }
  @Test
  public void titlevalidation() {
	  // soft assert
	  SoftAssert soft=new SoftAssert();
	  String expectedtitle="Selenium dev";
	  String actualtitle=driver.getTitle();
	  soft.assertEquals(actualtitle,expectedtitle, "Title validation failed");
	  String expectedURL="https://www.selenium.dev/";
	  String actualURL=driver.getCurrentUrl();
	  soft.assertEquals(actualURL,expectedURL, "URL validation failed");
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
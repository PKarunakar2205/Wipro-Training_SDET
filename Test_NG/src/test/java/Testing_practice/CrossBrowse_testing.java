package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowse_testing {
	WebDriver driver;
  @Test
  public void chrome() throws InterruptedException {
	  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		//navigate to url(webpage url)
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
  }
  @Test
  public void edge() throws InterruptedException {
	  driver=new EdgeDriver();
		 driver.manage().window().maximize();
		//navigate to url(webpage url)
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

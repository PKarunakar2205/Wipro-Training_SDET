package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentDay25 { WebDriver driver; @DataProvider(name="data") public Object[][] function(){
return new Object[][] {
{"admin","admin123"},
{"user","user123"},
{"test","test123"}
};
}
 
@Test(dataProvider="data")
public void function1(String uname,String password) { driver=new ChromeDriver();

driver.get("http://zero.webappsecurity.com/login.html"); driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement name=driver.findElement(By.id("user_login"));

name.sendKeys(uname);

WebElement pass=driver.findElement(By.id("user_password"));

pass.sendKeys(password); driver.findElement(By.name("submit")).click();
driver.quit();
}

}


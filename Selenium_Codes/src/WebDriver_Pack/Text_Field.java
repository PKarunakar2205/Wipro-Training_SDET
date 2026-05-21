package WebDriver_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Field {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		 String expectedtitle = "Downloads | Selenium";

	        String actualtitle = driver.getTitle();

	        System.out.println("Expected Title is = " + expectedtitle);
	        System.out.println("Actual Title is = " + actualtitle);

	        if (expectedtitle.equals(actualtitle)) {

	            System.out.println("Title validation pass");

	        } else {

	            System.out.println("Title validation fail");
	        }

	
	        Thread.sleep(3000);

	        driver.close();

	}

}

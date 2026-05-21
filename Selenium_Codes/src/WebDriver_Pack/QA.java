package WebDriver_Pack;
 
import java.io.File;
import java.io.IOException;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
//xpath syntax= //node[@attribute="attribute value"]
//select class - used select or deselect options with the help of by selectbyindex, selectbyvalue, selectbyvisibletext
public class QA {
 
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		
//		WebElement fname=driver.findElement(By.id("firstName"));
//		//fname.click();
//		fname.sendKeys("Neeva");
//		
//		WebElement lname=driver.findElement(By.id("lastName"));
//		//fname.click();
//		lname.sendKeys("Sharma");
//		driver.findElement(By.id("gender-radio-2")).click();
//		// click on date of birth field
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");// scroll down
		
//		driver.findElement(By.id("dateOfBirthInput")).click();
//
////		WebElement yr=driver.findElement(By.className("react-datepicker__year-select"));
////		WebElement mt=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
////		Select sel=new Select(yr);
////		sel.selectByIndex(100);
////		Select sel1=new Select(mt);
////		sel1.selectByVisibleText("May");
////		
////		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[5]/div[4]")).click();
		// select by xpath
//		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/select/option[118]")).click();
//		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/select/option[12]")).click();
//		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[4]/div[2]")).click();
//		// add subjects
//
//	    WebElement sub=driver.findElement(By.id("subjectsInput"));
//	    sub.click();
//	    sub.sendKeys("Com");
//	    sub.sendKeys(Keys.ARROW_DOWN);
//	    sub.sendKeys(Keys.ENTER);
//	    sub.sendKeys("eco");
//	   
//	    sub.sendKeys(Keys.ENTER);
//	    
//	    WebElement img=driver.findElement(By.id("uploadPicture"));
//	    img.sendKeys("C:\\Users\\dell\\Desktop\\Sript_Govi.txt");
//	    js.executeScript("window.scrollBy(0,-900)" );
//	    js.executeScript("window.scrollBy(100,0)" );// scrollby(x,y) x- left(-) and right  y- up(-) and down
	    
	   WebElement state= driver.findElement(By.id("react-select-3-input"));
	   state.sendKeys("NCR");
	   state.sendKeys(Keys.ENTER);
	   WebElement city= driver.findElement(By.id("react-select-4-input"));
	   city.sendKeys("gur");
	   city.sendKeys(Keys.ENTER);
	   
	   TakesScreenshot tc=(TakesScreenshot)driver;
	   File sc=tc.getScreenshotAs(OutputType.FILE);
	   
	   File dest=new File("\"D:\\from c drive\\Downloads\\slide2.jpeg\"");
	   FileHandler.copy(sc, dest);
		Thread.sleep(5000);
		//driver.quit();
		
		
		
 
	}
 
}
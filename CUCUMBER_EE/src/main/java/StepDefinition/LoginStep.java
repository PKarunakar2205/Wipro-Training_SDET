package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    WebDriver driver;

    @Given("login page should be open in default browser")
    public void login_page_should_be_open_in_default_browser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    }

    @When("click on username field and add valid user username")
    public void click_on_username_field_and_add_valid_user_username() {

        WebElement user = driver.findElement(By.id("input-email"));

        user.sendKeys("test@gmail.com");

    }

    @And("then click on password button and enter valid password")
    public void then_click_on_password_button_and_enter_valid_password() {

        WebElement pass = driver.findElement(By.id("input-password"));

        pass.sendKeys("test123");

    }

    @And("now click on submit button")
    public void now_click_on_submit_button() {

        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

    @Then("login successfully and redirect to home page")
    public void login_successfully_and_redirect_to_home_page() {

        System.out.println("Login successfully done");

    }

}
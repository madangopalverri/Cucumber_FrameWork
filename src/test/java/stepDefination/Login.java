package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

public static WebDriver driver;
@Given("browser open")
public void browser_open() {
	
	driver=new ChromeDriver();
}

@Given("application is open")
public void application_is_open() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://parabank.parasoft.com/parabank/index.htm");
    driver.manage().window().maximize();
    
}

@When("user data enter")
public void user_data_enter() {
   driver.findElement(By.xpath("//input[@class='input'][@name='username']")).sendKeys("gopal");
   driver.findElement(By.xpath("//input[@class='input'][@name='password']")).sendKeys("Mg@12345");   
}

@When("click  login button")
public void click_login_button() {
    driver.findElement(By.xpath("//input[@class='button'][@value='Log In']")).click();
}

@Then("successfully login")
public void successfully_login() {
   System.out.println("login Success");
}
}

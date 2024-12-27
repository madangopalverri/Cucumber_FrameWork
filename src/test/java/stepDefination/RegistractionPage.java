package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistractionPage {
	public static WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
		driver=new ChromeDriver();

	}

	@Given("open the Application")
	public void open_the_application() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://parabank.parasoft.com/parabank/register.htm");
	   driver.manage().window().maximize();
	}

	@When("Enter the user Detailes")
	public void enter_the_user_detailes() {
	   driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("madan");
	   driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("gopal");
	   driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("hyderabad");
	   driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Hyderabad");
	   driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Telangana");
	   driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2365");
	   driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("7896542319");
	   driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("abcd");
	   driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("gopal");
	   driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Mg@12345");
	   driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Mg@12345");
	   
	}

	@When("Click on the Register Button")
	public void click_on_the_register_button() {
	   driver.findElement(By.xpath("//input[@class='button'][@value='Register']")).click();
	}

	@Then("User succesfully register the account")
	public void user_succesfully_register_the_account() {
	   System.out.println("User register successsfullys");
	}

	
}

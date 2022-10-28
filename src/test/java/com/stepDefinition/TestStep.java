package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import pageObject.LoginPage;

public class TestStep {
	static LoginPage lp;
	public static WebDriver driver;
	public String ExpectedOutput="Hello vasuvespag!";
	
	@Given("User is on HotelApp Homepage")
	public void user_is_on_hotel_app_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Priya\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}

	@When("User enters username")
	public void user_enters_username() {
		/*WebElement uname = driver.findElement(By.id("username"));
	    uname.clear();
	    uname.sendKeys("vasuvespag");*/
		
		lp.enterUsername("vasuvespag");
	}

	@When("User enters password")
	public void user_enters_password() {
		//driver.findElement(By.name("password")).clear();    
	    //driver.findElement(By.name("password")).sendKeys("vasu1234");
		lp.enterPassword("vasu1234");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		//driver.findElement(By.className("login_button")).click();
		lp.clickLoginButton();
	}

	@Then("Login is successful")
	public void login_is_successful() {
		WebElement Greeting=driver.findElement(By.name("username_show"));
        String actualOutput=Greeting.getAttribute("value");
        Assert.assertEquals(ExpectedOutput, actualOutput);
	}
	
	@When("User selects location from drop down")
	public void user_selects_location_from_drop_down() {
		new Select(driver.findElement(By.cssSelector("#location"))).selectByVisibleText("Sydney");
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
	}

	@Then("List of hotels is displayed")
	public void list_of_hotels_is_displayed() {
		String expectedOutput = "Adactin.com - Select Hotel";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedOutput,actualTitle);
	}
	
	@When("User select a radio button")
	public void user_select_a_radio_button() {
		driver.findElement(By.xpath("//*[@id=\"radiobutton_1\"]")).click();
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}

	@Then("Book a Hotel is displayed")
	public void book_a_hotel_is_displayed() {
		String expectedOutput = "Adactin.com - Book A Hotel";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedOutput,actualTitle);
	}
	
	/*@When("User enters Username as {string}")
	public void user_enters_username_as(String string) {
		WebElement uname = driver.findElement(By.id("username"));
	    uname.clear();
	    uname.sendKeys(string);
	}

	@When("User enters Password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.name("password")).clear();    
	    driver.findElement(By.name("password")).sendKeys(string);
	}*/
	
	@When("User enters username as <{string}>")
	public void user_enters_username_as(String string) {
		WebElement uname = driver.findElement(By.id("username"));
	    uname.clear();
	    uname.sendKeys(string);
	}

	@When("User enters password as <{string}>")
	public void user_enters_password_as(String string) {
		driver.findElement(By.name("password")).clear();    
	    driver.findElement(By.name("password")).sendKeys(string);
	}
	
	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable userCredentials) {
	    List<Map<String,String>> data = userCredentials.asMaps(String.class,String.class);
	    for(Map<String,String> data1:data) {
	    	String userName = data1.get("username");
	    	WebElement uname = driver.findElement(By.id("username"));
	    	uname.clear();
	    	uname.sendKeys(userName);
	    	String passWord = data1.get("password");
	    	driver.findElement(By.name("password")).clear();    
		    driver.findElement(By.name("password")).sendKeys(passWord);
	    	
	    }
	}
	
	@When("User enters Username  {string}")
	public void user_enters_username(String string) {
		WebElement uname = driver.findElement(By.id("username"));
	    uname.clear();
	    uname.sendKeys(string);
	}

	@When("User enters Password  {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.name("password")).clear();    
	    driver.findElement(By.name("password")).sendKeys(string);
	}
}


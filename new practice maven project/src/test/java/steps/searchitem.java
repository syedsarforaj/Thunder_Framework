package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class searchitem {
	
	WebDriver driver;
	@Given(": i am on the yahoo homepage")
	public void i_am_on_the_yahoo_homepage() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
		
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {
		
		WebElement searchBar =driver.findElement(By.id("ybar-sbq"));
		searchBar.sendKeys(string);
		
		
		
		
	    
	}
	   


	@When("i click on the search button")
	public void i_click_on_the_search_button() {
	   
	}

	@Then("I can see the search results successfully")
	public void i_can_see_the_search_results_successfully() {
	    
	}



}

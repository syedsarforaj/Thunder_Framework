package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {
	
	WebDriver driver;
	
	public googleHomePage (WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "APjFqb")
	WebElement searchBar;
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	@FindBy(id = "result-stats")
	WebElement searchResults;
	
	
	
	
	public void enterProduct(String s) {
	searchBar.sendKeys(s);

}
	
	public void clickOnSearchButton() {
		searchButton.click();
		
	}
	
	public boolean verifySearchResultIsDisplayed() {
		
		return searchResults.isDisplayed();
		
	}
}

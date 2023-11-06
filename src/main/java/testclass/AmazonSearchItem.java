package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchItem {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
	WebElement clickonsearch;
	
	@FindBy(xpath = "//*[@id=\"p_89/HP\"]/span/a/div/label/i")
	WebElement selectHP;

	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement selectFirstItem;
	
	public AmazonSearchItem(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem() {
		searchBox.sendKeys("laptop");
		clickonsearch.click();
		selectHP.click();
		selectFirstItem.click();
	}
}

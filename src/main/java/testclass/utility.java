package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	private WebDriver driver;
	private WebDriverWait wait;
	
	@SuppressWarnings("deprecation")
	public utility(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	public void actionFeature() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void actionFeature2() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public void waitAndClick(By locator) {
		// TODO Auto-generated method stub
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		 element.click();
	}
	
	public void sendInput(By locator, String text) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		 element.click();
		 Thread.sleep(3000);
		 element.sendKeys(text);
	}
}

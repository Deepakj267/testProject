package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo {
	WebDriver driver;
	@FindBy(xpath = "//input[@name= 'username']")
	private WebElement username2;

	By username = By.xpath("//input[@name= 'username']");
	
	@FindBy(xpath = "//input[@name=\"password\"]") 
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
	private WebElement logoutOption;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	private WebElement logout; 
	
	Constants constant = new Constants(driver);

	public LoginPo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToPage() throws InterruptedException {
		utility ut = new utility(driver);
		ut.sendInput(username, constant.USERNAME);
		
		password.sendKeys(constant.PASSWORD);
		loginButton.click();
	}
	
	public void logout() throws InterruptedException {
		logoutOption.click();
		Thread.sleep(2000);
		logout.click();
	}
}

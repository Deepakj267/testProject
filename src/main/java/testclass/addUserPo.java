package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class addUserPo {
	WebDriver driver;
	By adminOption = By.linkText("Admin");

	By clickAddButton = By.xpath("//div[@class='orangehrm-header-container']//descendant::button");

	By userRoleClick = By.xpath("//div[@class='oxd-select-text-input'][1]");

	By empName = By.xpath("//input[@placeholder=\"Type for hints...\"]");
	
	By getEmpName = By.xpath("//p[@class='oxd-userdropdown-name']");
	
	By status = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
	
	By empUsername = By.xpath("//input[@class='oxd-input oxd-input--focus']");
	
	By password = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	
	By confirm_pass = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	
	By cancle = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
	
	By submit = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
	
	public addUserPo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	Constants constant = new Constants(driver);
	
	public void addUser() throws InterruptedException {
		utility ut = new utility(driver);
		Constants con = new Constants(driver);
		ut.waitAndClick(adminOption);
		Thread.sleep(1000);
		ut.waitAndClick(clickAddButton);
		//Thread.sleep(1000);
		ut.waitAndClick(userRoleClick);
		Thread.sleep(1000);
		ut.actionFeature();
		
		Thread.sleep(3000);
		ut.sendInput(empName, getEmployeeName() );
		Thread.sleep(3000);
		ut.actionFeature2();
		
		Thread.sleep(3000);
		ut.waitAndClick(status);
		ut.actionFeature();
		Thread.sleep(1000);
		
		//ut.sendInput(empUsername, constant.USERNAME);
		ut.sendInput(password, constant.EMP_PASS);
		ut.sendInput(confirm_pass, constant.CONFIRM_EMP_PASS);
		ut.waitAndClick(submit);
	}
	
	public String getEmployeeName() {
		String getName = driver.findElement(getEmpName).getText();
		return getName;
	}
}

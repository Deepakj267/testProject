package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants {
	WebDriver driver;
	
	public Constants(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static String USERNAME = "Admin";
	public static String PASSWORD = "admin123";
	public String EMP_NAME = "Sachin";
	public static String EMP_PASS = "PuneMaharashtra123";
	public static String CONFIRM_EMP_PASS = "PuneMaharashtra123";
}

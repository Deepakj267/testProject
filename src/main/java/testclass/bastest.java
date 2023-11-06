package testclass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class bastest {
	@Test
	public void demoFramework() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
//      AmazonSearchItem amz = new AmazonSearchItem(driver);
//      amz.searchItem();
        addUserPo aduser = new addUserPo(driver);
        LoginPo login = new LoginPo(driver);
         
        
        
        
        
        login.loginToPage();
        Thread.sleep(1500);
        
        aduser.addUser();
        
        //login.logout(); 
        Thread.sleep(1500);
        
        driver.close();
	}
}

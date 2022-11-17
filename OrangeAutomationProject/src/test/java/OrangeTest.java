

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OrangeTest {

	
	WebDriver driver;
	
	@BeforeSuite	
	public void preTestCondition()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_new_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			
	}
	
	@Test()
	public void orangeTestDemo() throws InterruptedException
	{	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		Login cred = new Login(driver);
		cred.typeUserName();
		cred.typePassword();
		Thread.sleep(4000);
		cred.clickOnSubmit();				
	}
	//adding comment
	@Test(dependsOnMethods="orangeTestDemo")
	public void logoutTest() throws InterruptedException
	{
		
		Logout signoff= new Logout(driver);
		signoff.logoutFromApp();
	}
	
	
}

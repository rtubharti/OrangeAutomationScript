

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	//"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	//input[@name='username']
	//input[@name='password']
	//button[@type='submit']
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By submit = By.xpath("//button[@type='submit']");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("Admin");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("admin123");
	}
	
	public void clickOnSubmit()
	{
		driver.findElement(submit).click();
	}


}

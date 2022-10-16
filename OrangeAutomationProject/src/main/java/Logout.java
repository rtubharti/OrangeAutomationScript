import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Logout {

	WebDriver driver;
	
	By profile = By.cssSelector("span.oxd-userdropdown-tab");
	By logout = By.xpath("//a[text()='Logout']");
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void logoutFromApp()
	{
		driver.findElement(profile).click();
		driver.findElement(logout).click();
		
		
	}
	
}

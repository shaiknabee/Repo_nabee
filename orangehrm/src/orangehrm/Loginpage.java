package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loginpage extends Baseclass
{
	static By by_username=By.xpath("//input[@name='username']");
	static By by_password=By.xpath("//input[@name='password']");
	static By by_login=By.xpath("//button[@type='submit']");
	
	static WebElement ele_username=d.findElement(by_username);
	static WebElement ele_password=d.findElement(by_password);
	static WebElement ele_login=d.findElement(by_login);
	
	
		public static void username()
		{
		 ele_username.sendKeys("Admin");
		 
		}
		
		public static void password()
		{
		 ele_password.sendKeys("admin123");
	 	
		} 
		
		public static void clicklogin()
		{
		 ele_login.click();
		 
		}
	}
 


package testphpsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends base
{
	
	
	static By by_username=By.xpath("//input[@name='uname']");
	static By by_password=By.xpath("//input[@name='pass']");
	static By by_login=By.xpath("//input[@value='login']");
	
	static WebElement ele_username=d.findElement(by_username);
	static WebElement ele_password=d.findElement(by_password);
	static WebElement ele_login=d.findElement(by_login);

	public static void username()
	{
	 ele_username.sendKeys("test");
	}
	
	public static void password()
	{
	ele_password.sendKeys("test");
	}
	public static void login()
	{
		ele_login.click();
	}
	

}

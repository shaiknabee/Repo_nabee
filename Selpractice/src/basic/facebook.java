package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
	public static void main(String[] args) throws InterruptedException
	{ 
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		//input[@id="email"]
		
		By by_email=By.xpath("//input[@id='email']");
		WebElement ele_email=d.findElement(by_email);
		ele_email.sendKeys("nabeeshaik03@gmail.com");
		Thread.sleep(1000);
		
		By by_password=By.xpath("//input[@id='pass']");
		WebElement ele_password=d.findElement(by_password);
		ele_password.sendKeys("Nabee@1998");
		Thread.sleep(1000);
		
		By by_login=By.xpath("//button[text()='Log in']");
		WebElement ele_login=d.findElement(by_login);
		ele_login.click();
		Thread.sleep(5000);
		
		
		
	
		

	}
}

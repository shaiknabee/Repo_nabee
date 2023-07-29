package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practisetestpage
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By by_username=By.id("username");
		WebElement ele_username=d.findElement(by_username);
		ele_username.sendKeys("student");
		Thread.sleep(2000);
		
		By by_password=By.id("password");
		WebElement ele_password=d.findElement(by_password);
		ele_password.sendKeys("Password123");
		Thread.sleep(2000);
		
		By by_submit=By.id("submit");
		WebElement ele_submit =d.findElement(by_submit);
		ele_submit.click();
		Thread.sleep(2000);
		
	}

}

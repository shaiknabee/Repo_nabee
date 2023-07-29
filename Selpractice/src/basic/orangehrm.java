package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
	public static void main(String[] args) throws InterruptedException {
		//logging in and logging out orangehrm website
		
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		By by_username=By.xpath("//input[@name='username']");
		WebElement ele_username=d.findElement(by_username);
		ele_username.sendKeys("Admin");
		Thread.sleep(1000);
		
		
		By by_password=By.xpath("//input[@name='password']");
		WebElement ele_password=d.findElement(by_password);
		ele_password.sendKeys("admin123");
		Thread.sleep(1000);
		
		By by_login=By.xpath("//button[@type='submit']");
		WebElement ele_login=d.findElement(by_login);
		ele_login.click();
		Thread.sleep(3000);

		
		
		By by_dropdown=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
		WebElement ele_dropdown=d.findElement(by_dropdown);
		ele_dropdown.click();
		Thread.sleep(1000);
		
		
		
		By by_logout=By.xpath("//a[text()='Logout']");
		WebElement ele_logout=d.findElement(by_logout);
		ele_logout.click();
		Thread.sleep(1000);
		
	}

}

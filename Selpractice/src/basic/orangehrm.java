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
		
		By by_info=By.xpath("//span[text()='My Info']");
		WebElement ele_info=d.findElement(by_info);
		ele_info.click();
		Thread.sleep(3000);
		
		By by_fname=By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
		WebElement ele_fname=d.findElement(by_fname);
		ele_fname.clear();
		ele_fname.sendKeys("Nabee");
		Thread.sleep(1000);
		
		By by_lname=By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
		WebElement ele_lname=d.findElement(by_lname);
		ele_lname.clear();
		ele_lname.sendKeys("Shaik");
		Thread.sleep(1000);
		
     	By by_nname=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
		WebElement ele_nname=d.findElement(by_nname);
		ele_nname.sendKeys("Nab");
		Thread.sleep(1000);   

		By by_eid=By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
		WebElement ele_eid=d.findElement(by_eid);
		ele_eid.clear();
		//ele_eid.sendKeys("ZTOH0046");
		Thread.sleep(1000);   

		
		
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

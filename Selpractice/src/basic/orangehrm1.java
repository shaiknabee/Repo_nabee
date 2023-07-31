package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm1 {
	public static void main(String[] args) throws InterruptedException
	{
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
		
		By by_PIM=By.xpath("//span[text()='PIM']");
		WebElement ele_PIM=d.findElement(by_PIM);
		ele_PIM.click();
		Thread.sleep(3000);
	
		By by_add=By.xpath("//button[text()=' Add ']");
		WebElement ele_add=d.findElement(by_add);
		ele_add.click();
		Thread.sleep(1000);
		
		By by_firstname=By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
		WebElement ele_firstname=d.findElement(by_firstname);
		ele_firstname.sendKeys("Baji");
		Thread.sleep(1000);
		
		By by_lastname=By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
		WebElement ele_lastname=d.findElement(by_lastname);
		ele_lastname.sendKeys("Shaik");
		Thread.sleep(1000);
		
		By by_adlogin=By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
		WebElement ele_adlogin=d.findElement(by_adlogin);
		ele_adlogin.click();
		Thread.sleep(1000);
		
		By by_aduser=By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
		WebElement ele_aduser=d.findElement(by_aduser);
		ele_aduser.sendKeys("ShaikBaji");
		Thread.sleep(1000);
		
		
		By by_adpass=By.xpath("(//input[@type='password'])[1]");
		WebElement ele_adpass=d.findElement(by_adpass);
		ele_adpass.sendKeys("ShaikBaji1");
		Thread.sleep(1000);
		
		By by_adpass2=By.xpath("(//input[@type='password'])[2]");
		WebElement ele_adpass2=d.findElement(by_adpass2);
		ele_adpass2.sendKeys("ShaikBaji1");
		Thread.sleep(1000);
		
		By by_save=By.xpath("//button[@type='submit']");
		WebElement ele_save=d.findElement(by_save);
		ele_save.click();
		Thread.sleep(1000);		
		
		By by_PIM1=By.xpath("//span[text()='PIM']");
		WebElement ele_PIM1=d.findElement(by_PIM1);
		ele_PIM1.click();
		Thread.sleep(3000);
		
		By by_click=By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[4]");
		WebElement ele_click=d.findElement(by_click);
		ele_click.click();
		Thread.sleep(1000);		
								
		By by_del=By.xpath("(//i[@class='oxd-icon bi-trash'])[4]");
		WebElement ele_del=d.findElement(by_del);
		ele_del.click();
		Thread.sleep(1000);	
		
		
		By by_delete=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
		WebElement ele_delete=d.findElement(by_delete);
		ele_delete.click();
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

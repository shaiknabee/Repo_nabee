package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PIMpage extends Baseclass
{

	static By by_PIM=By.xpath("//span[text()='PIM']");
	static By by_add=By.xpath("//button[text()=' Add ']");
	static By by_firstname=By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
	static By by_lastname=By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
	static By by_adlogin=By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
	static By by_aduser=By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	static By by_adpass=By.xpath("(//input[@type='password'])[1]");
	static By by_adpass2=By.xpath("(//input[@type='password'])[2]");
	static By by_save=By.xpath("//button[@type='submit']");


	static WebElement ele_PIM=d.findElement(by_PIM);
	static WebElement ele_add=d.findElement(by_add);
	static WebElement ele_firstname=d.findElement(by_firstname);
	static WebElement ele_lastname=d.findElement(by_lastname);
	static WebElement ele_adlogin=d.findElement(by_adlogin);
	static WebElement ele_aduser=d.findElement(by_aduser);
	static WebElement ele_adpass=d.findElement(by_adpass);
	static WebElement ele_adpass2=d.findElement(by_adpass2);
	static WebElement ele_save=d.findElement(by_save);


	public static void PIM()
	{
		ele_PIM.click();		
	}	

	public static void adduser()
	{
		ele_add.click();
	}	

	public static void firstname()
	{
		ele_firstname.sendKeys("Baji");
	}

	public static void lastname()
	{
		ele_lastname.sendKeys("Shaik");
	}

	public static void adlogin()
	{
		ele_adlogin.click();
	}

	public static void aduser()
	{
		ele_aduser.sendKeys("ShaikBaji");
	}	

	public static void adpass()
	{
		ele_adpass.sendKeys("ShaikBaji1");
	}

	public static void confirmpass()
	{
		ele_adpass2.sendKeys("ShaikBaji1");		
	}

	public static void save()
	{
		ele_save.click();
	}
}

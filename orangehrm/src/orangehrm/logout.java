package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout extends Baseclass
{
	static By by_dropdown=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	static By by_logout=By.xpath("//a[text()='Logout']");

	static WebElement ele_dropdown=d.findElement(by_dropdown);
	static WebElement ele_logout=d.findElement(by_logout);
	
	
	public static void dropdown()
	{
		ele_dropdown.click();
		
	}
	
	public static void loggout()
	{
		ele_logout.click();
		
	}
}

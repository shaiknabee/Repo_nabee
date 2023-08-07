package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class deleteuser extends Baseclass
{
	
	static By by_PIM1=By.xpath("//span[text()='PIM']");
	static By by_click=By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[4]");
	static By by_del=By.xpath("(//i[@class='oxd-icon bi-trash'])[4]");
	static By by_delete=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
	
	static WebElement ele_PIM1=d.findElement(by_PIM1);
	static WebElement ele_click=d.findElement(by_click);
	static WebElement ele_del=d.findElement(by_del);
	static  WebElement ele_delete=d.findElement(by_delete);
	
	 
	public static void PIM1()
	{
		ele_PIM1.click();		
	}
	
	public static void click()
	{
		ele_click.click();
	}
	
	public static void del()
	{
		ele_del.click();
	}
	
	public static void delete()
	{
		ele_delete.click();
	}
}

package testphpsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class updatedetails extends base
{
  static By by_user=By.xpath("//input[@name='urname']");
  static By by_credit=By.xpath("//input[@name='ucc']");
  static By by_email=By.xpath("//input[@name='uemail']");
  static By by_phone=By.xpath("//input[@name='uphone']");
  static By by_address=By.xpath("//textarea[@name='uaddress']");
  static By by_update=By.xpath("//*[@id='content']/div[2]/form/table/tbody/tr[6]/td/input");

  
  static WebElement ele_user=d.findElement(by_user);
  static WebElement ele_credit=d.findElement(by_credit);
  static WebElement ele_email=d.findElement(by_email);
  static WebElement ele_phone=d.findElement(by_phone);
  static WebElement ele_address=d.findElement(by_address);
  static WebElement ele_update=d.findElement(by_update);
  
  
  public static void user() throws InterruptedException
  {
	  ele_user.clear();
	  Thread.sleep(1000);
	  ele_user.sendKeys("baji");
	  Thread.sleep(1000);
  }
  
  public static void credit() throws InterruptedException
  {
	  ele_credit.clear();
	  Thread.sleep(1000);
	  ele_credit.sendKeys("9502953958");
	  Thread.sleep(1000);
  }
  
  public static void email() throws InterruptedException
  {
	  ele_email.clear();
	  Thread.sleep(1000);
	  ele_email.sendKeys("baji123@gmail.com");
	  Thread.sleep(1000);
  }
  
  public static void phone() throws InterruptedException
  {
	  ele_phone.clear();
	  Thread.sleep(1000);
	  ele_phone.sendKeys("7780456123");
	  Thread.sleep(1000);
  }
  
  public static void address() throws InterruptedException 
  {
	  ele_address.clear();
	  Thread.sleep(1000);
	  ele_address.sendKeys("41 street");
	  Thread.sleep(1000);
  }
  
  public static void update() throws InterruptedException
  {
	  ele_update.clear();
	  Thread.sleep(1000);
	  ele_update.click();
	  Thread.sleep(1000);
  }
  
}

package cyclos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class overview extends base
{
   static By overview=By.xpath("(//a[@rel='noreferrer'])[6]");
   static By doc=By.xpath("//a[text()='Cyclos documentation']");
   static By manual=By.xpath("//a[text()='Administrator manual']");
   
   public static WebElement overviews()
   {
	   WebElement ele_overview=d.findElement(overview);
	   return ele_overview;
   }
   
   public static WebElement documentation()
   {
	   WebElement ele_doc=d.findElement(doc);
	   return ele_doc;	   
   }
  
   public static WebElement manual()
	{
		WebElement ele_manual=d.findElement(manual);
		return ele_manual;	   
	}
   
   //ACTIONS------------------------------------------------------------------
   
   public static void overviewm() throws InterruptedException
   {
	   overviews().click();
	   Thread.sleep(3000);
   }
   
   public static void docm() throws InterruptedException
   {
	   documentation().click();
	   Thread.sleep(3000);
   }
   
   public static void manualm() throws InterruptedException
	{
		manual().click();
		Thread.sleep(3000);
	}
   
}

package orangehrm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class windowhandling extends base
{
	public static void main(String[] args) throws InterruptedException
	{
	  launch();
      By ohrm=By.xpath("//a[text()='OrangeHRM, Inc']");
	  WebElement ele_hrm=d.findElement(ohrm);  
	  ele_hrm.click();
	  
	  String pwinid=d.getWindowHandle();
	  String pwintext=d.getTitle();
	  System.out.println("ID :"+pwinid+" and title : "+pwintext);
	  
	  Set<String> cwin=d.getWindowHandles();
	  System.out.println(cwin);
	  
	  for(String ChildWindow:cwin)
	  {
		  if(!(ChildWindow.equals(pwinid)))
		  {
			  d.switchTo().window(ChildWindow);
			  Thread.sleep(3000);
			  
			  By email=By.xpath("//input[@id='Form_submitForm_EmailHomePage']");
			  WebElement ele_email=d.findElement(email);
			  ele_email.sendKeys("nabeeshaik03@gmail.com");
			  
			  By tryy=By.xpath("//input[@id='Form_submitForm_action_request']");
			  WebElement ele_tryy=d.findElement(tryy);
			  ele_tryy.click();
			  d.close();
			  
		  }
	  }
	  
	  d.switchTo().window(pwinid);
	  System.out.println(d.getTitle());
	}  
}

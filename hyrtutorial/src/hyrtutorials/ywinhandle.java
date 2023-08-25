package hyrtutorials;

import java.lang.reflect.Array;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ywinhandle extends xwa
{
	public static void handle() throws InterruptedException
	{


		butclick();
		Thread.sleep(5000);
		String pwinid=d.getWindowHandle();
		String pwintitle=d.getTitle();
		System.out.println("Parent window ID: "+pwinid+" Parent window Title: "+pwintitle);

		Set<String> cwinid=d.getWindowHandles();
		String []str=cwinid.toArray(new String[cwinid.size()]);
		System.out.println(cwinid);

		for(String ChildWindow:cwinid)
		{
			if(!(ChildWindow).equals(pwinid))
			{	
				d.switchTo().window(ChildWindow);
				Thread.sleep(5000);

				if(firstname().isDisplayed())
				{
					action();
					Thread.sleep(1000);			
                    d.close();	
                    
                    d.switchTo().window(str[2]);
                    Thread.sleep(2000);	
                    d.close();
					break;
				}
			}		   
		}
		d.switchTo().window(pwinid);
		Thread.sleep(1000);			
		names();
		Thread.sleep(2000);
		d.close();
		
	}
}

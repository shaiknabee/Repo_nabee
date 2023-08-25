package cyclos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class win_handle extends overview
{	
	public static void newwindow() throws InterruptedException
	{
		String pwinid=d.getWindowHandle();
		String pwintext=d.getTitle();
		System.out.println("Parent window id: "+pwinid+" Parent window title: "+pwintext);

		Set<String> cwinid=d.getWindowHandles();
		System.out.println(cwinid);

		for(String ChildWindow:cwinid)
		{
			if(!(ChildWindow.equals(pwinid)))
			{
				d.switchTo().window(ChildWindow);
				Thread.sleep(2000);
				manualm();
				
				d.close();
			}
		}
	}
}
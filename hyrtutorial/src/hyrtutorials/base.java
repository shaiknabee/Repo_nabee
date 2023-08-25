package hyrtutorials;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	static WebDriver d;	
	public static void launch() throws InterruptedException
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);

		d.manage().window().maximize();
		
	}
	

}

package cyclos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{
	static WebDriver d;

	public static void launch() throws InterruptedException
	{ 
	    d=new ChromeDriver();
		d.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(5000);

		d.manage().window().maximize();
		Thread.sleep(5000);

	}
}

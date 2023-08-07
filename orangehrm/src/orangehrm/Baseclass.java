package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass
{ 
	static WebDriver d;
	public static void launch() throws InterruptedException
	{
		 d=new ChromeDriver();
		 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		
		 d.manage().window().maximize();
		 Thread.sleep(1000);
	}
}

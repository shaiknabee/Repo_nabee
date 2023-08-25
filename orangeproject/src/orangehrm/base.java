package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
	static WebDriver d;
	 public static void launch() throws InterruptedException
	 {
		 d=new ChromeDriver();
		 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 
		 d.manage().window().maximize();
		 Thread.sleep(3000);
		 
	 }
}

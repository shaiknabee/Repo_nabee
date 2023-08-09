package testphpsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	static WebDriver d;
 public static void launch() throws InterruptedException
 {
	 d=new ChromeDriver();
	 d.get("http://testphp.vulnweb.com/login.php");
	 Thread.sleep(2000);
	 
	 d.manage().window().maximize();
	 Thread.sleep(2000);
 }
}

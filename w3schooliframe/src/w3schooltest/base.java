package w3schooltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	static WebDriver d;
	 public static void launch() throws InterruptedException
	 {
		 d=new ChromeDriver();
		 d.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		 Thread.sleep(3000);
		 
		 d.manage().window().maximize();
		 Thread.sleep(3000);
		 
	 }
}

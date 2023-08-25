package iframetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	static WebDriver d;
 public static void launch() throws InterruptedException
 {
	 d=new ChromeDriver();
	 d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview.summary.html");
	 Thread.sleep(3000);
	 
	 d.manage().window().maximize();
	 Thread.sleep(3000);
	 
 }
}

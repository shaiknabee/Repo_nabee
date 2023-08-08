package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclasss 
{
	static WebDriver d;
	public static void launch() throws InterruptedException
	{
		d=new ChromeDriver();
		d.get("https://automationintesting.online/");
		Thread.sleep(1000);

		d.manage().window().maximize();
		Thread.sleep(3000);
	}
}

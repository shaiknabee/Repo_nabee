package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait 
{
	public static void main(String[] args) throws InterruptedException
	{
        WebDriver d=new ChromeDriver();
        d.get("https://www.hyrtutorials.com/p/waits-demo.html");
        d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        d.manage().window().maximize();
        
        
        By but1=By.xpath("//button[@id='btn1']");
        WebElement ele_but1=d.findElement(but1);
        ele_but1.click();
        		
        By text1=By.xpath("(//input[@id='txt1'])[1]");
        WebElement ele_text1=d.findElement(text1);
        ele_text1.sendKeys("Text entered");
        Thread.sleep(2000);
        d.close();
        
        
	}
}

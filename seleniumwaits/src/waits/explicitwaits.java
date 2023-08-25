package waits;

import java.beans.Visibility;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaits 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
        d.get("https://www.hyrtutorials.com/p/waits-demo.html");
        d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);        
        
        
        d.manage().window().maximize();
        
        
        By but1=By.xpath("//button[@id='btn1']");
        WebElement ele_but1=d.findElement(but1);
        ele_but1.click();
        		
        By text1=By.xpath("(//input[@id='txt1'])[1]");
        WebElement ele_text1=d.findElement(text1);
        ele_text1.sendKeys("Text entered in first box");
        Thread.sleep(2000);
//        d.close();
        
        By but2=By.xpath("//button[@id='btn2']");
        WebElement ele_but2=d.findElement(but2);
        ele_but2.click();
       
      //  WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(15) );    
        
        
        By text2=By.xpath("(//input[@id='txt2'])[1]");
        WebElement ele_text2=d.findElement(text2);
     //   wait.until(ExpectedConditions.visibilityOf(ele_text2));
        ele_text2.sendKeys("Text entered in second box");
        Thread.sleep(2000);
        
        
	}
}

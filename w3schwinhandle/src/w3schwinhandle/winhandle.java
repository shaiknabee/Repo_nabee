package w3schwinhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class winhandle 
{
	public static void main(String[] args) throws InterruptedException
	{
       WebDriver d=new ChromeDriver();
       d.get("https://www.w3schools.com/html/html_forms.asp");
       Thread.sleep(4000);
		
       d.manage().window().maximize();
       Thread.sleep(3000);
       
       By tryit=By.xpath("(//a[text()='Try it Yourself »'])[1]");
       WebElement ele_tryit=d.findElement(tryit);
       ele_tryit.click();
       
       String pwinid=d.getWindowHandle();
       String pwintext=d.getTitle();
       System.out.println("Parent window ID: "+pwinid+" and text:"+pwintext);
       
       Set<String> cwinid=d.getWindowHandles();
       System.out.println(cwinid);
       
       for(String ChildWindow:cwinid)
       {
    	   if(!(ChildWindow.equals(pwinid)))
    	   {
    		   d.switchTo().window(ChildWindow);
    		   Thread.sleep(2000);

    		   d.switchTo().frame("iframeResult");
    		   Thread.sleep(1000);    		   
    		   
    		   By fname=By.xpath("//input[@id='fname']");
    		   WebElement ele_fname=d.findElement(fname);
    		   ele_fname.clear();
    		   ele_fname.sendKeys("shaik");
    		   Thread.sleep(1000);

    		   By lname=By.xpath("//input[@id='lname']");
    		   WebElement ele_lname=d.findElement(lname);
    		   ele_lname.clear();
    		   ele_lname.sendKeys("nabee");
    		   Thread.sleep(1000);
    		   
    		   By submit=By.xpath("//input[@type='submit']");
    		   WebElement ele_submit=d.findElement(submit);
    		   ele_submit.click();
    		   Thread.sleep(1000);
    		   
    		   d.switchTo().parentFrame();    		   
    		   Thread.sleep(1000);
    		   
    	       By run=By.xpath("//button[@id='runbtn']");   		   
    		   WebElement ele_run=d.findElement(run);
    		   ele_run.click();
    		   Thread.sleep(2000);
    		   
    		   d.close();
    		   Thread.sleep(2000);
    	   }
       }
       
	}
}

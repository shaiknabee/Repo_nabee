package w3schooltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class forms extends base
{
    public static void main(String[] args) throws InterruptedException 
    {
		launch();
		
		d.switchTo().frame("iframeResult");
		
		By fname=By.xpath("//input[@name='fname']");
		WebElement ele_fname=d.findElement(fname);
		ele_fname.clear();
		ele_fname.sendKeys("Shaik");
		Thread.sleep(2000);
		
		By lname=By.xpath("//input[@name='lname']");
		WebElement ele_lname=d.findElement(lname);
		ele_lname.clear();
		ele_lname.sendKeys("Nabee");
		Thread.sleep(2000);
		
		By submit=By.xpath("//input[@type='submit']");
		WebElement ele_submit=d.findElement(submit);
		ele_submit.click();
		Thread.sleep(2000);
		
		d.switchTo().defaultContent();
		
		
		By run=By.xpath("//button[@id='runbtn']");
		Thread.sleep(2000);
		WebElement ele_run=d.findElement(run);
		Thread.sleep(2000);
		ele_run.click();
		
		
	}
}

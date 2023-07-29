package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
         ChromeDriver d=new ChromeDriver();
         d.get("https://www.amazon.in/");
         
         Thread.sleep(1000);
         d.manage().window().maximize();
         Thread.sleep(1000);
         
         By by_todaydeals=By.xpath("//*[@id=\"nav-xshop\"]/a[4]");
         WebElement ele_todaydeals=d.findElement(by_todaydeals);
         ele_todaydeals.click();
         Thread.sleep(1000);
         
         By by_laptop=By.xpath("(//div[@class=\"DealContent-module__truncate_sWbxETx42ZPStTc9jwySW\"])[1]");
         WebElement ele_laptop=d.findElement(by_laptop);
         ele_laptop.click();	
         Thread.sleep(1000);
         
         By by_laptop5=By.xpath("(//a[@class='a-size-base a-color-base a-link-normal a-text-normal'])[5]");
         WebElement ele_laptop5=d.findElement(by_laptop5);
         ele_laptop5.click();	
         Thread.sleep(1000);
        
         By by_addtocart=By.xpath("//input[@id='add-to-cart-button']");
         WebElement ele_addtocart=d.findElement(by_addtocart);
         ele_addtocart.click();	
         Thread.sleep(1000);
         
         
	}
	
}

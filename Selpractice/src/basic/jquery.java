package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/");
		Thread.sleep(2000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);
		
//		By by_acc=By.xpath("//a[text()='Accordion']");
//		WebElement ele_acc=d.findElement(by_acc);
//		ele_acc.click();
//		Thread.sleep(4000);

//		By by_auto=By.xpath("//a[text()='Autocomplete']");
//		WebElement ele_auto=d.findElement(by_auto);
//		ele_auto.click();
//		Thread.sleep(4000);
		
		By by_button=By.xpath("//a[text()='Button']");
		WebElement ele_buttons=d.findElement(by_button);
		ele_buttons.click();
		Thread.sleep(2000);
		
		By by_buttonelement=By.xpath("//button[text()='A button element'][1]");
		WebElement ele_buttonelement=d.findElement(by_buttonelement);
		ele_buttonelement.click();
		Thread.sleep(2000);
	}

}

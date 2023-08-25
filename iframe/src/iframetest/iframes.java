package iframetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframes extends base
{
	public static void main(String[] args) throws InterruptedException {
		launch();
		d.switchTo().frame("packageListFrame");
		
		By iframe=By.xpath("//a[text()='org.openqa.selenium']");
		WebElement ele_iframe=d.findElement(iframe);
		ele_iframe.click();
		Thread.sleep(1000);
		
		d.switchTo().frame("packageFrame");
		By alert=By.xpath("//ul[@title='Packages']//a[text()='org.openqa.selenium']");
		WebElement ele_alert=d.findElement(alert);
		ele_alert.click();
		Thread.sleep(1000);

		d.switchTo().frame("classFrame");
		By packages=By.xpath("(//a[ text()='Package'])[1]");
		WebElement ele_packages=d.findElement(packages);
		ele_packages.click();
		Thread.sleep(1000);
		
		By nse=By.xpath("//table[@class='typeSummary']//a[text()='NoSuchElementException']");
		WebElement ele_nse=d.findElement(nse);
		ele_nse.click();
		Thread.sleep(1000);
		
	} 
   
   
   
   
   
   
   
  
}

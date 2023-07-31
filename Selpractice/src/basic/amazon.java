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

		By by_cusservive=By.xpath("//a[text()='Customer Service']");
		WebElement ele_cusservive=d.findElement(by_cusservive);
		ele_cusservive.click();
		Thread.sleep(1000);

		
		By by_digservive=By.xpath("(//h3[@class='a-spacing-none a-text-normal'])[8]");
	    WebElement ele_digservive=d.findElement(by_digservive);
		ele_digservive.click();
		Thread.sleep(1000);
		
		
		By by_prime=By.xpath("//div[text()='Prime Video']");
	    WebElement ele_prime=d.findElement(by_prime);
	    ele_prime.click();
		Thread.sleep(1000);
		
		
		By by_subtitles=By.xpath("//h3[text()='Subtitles & Captions']");
	    WebElement ele_subtitles=d.findElement(by_subtitles);
	    ele_subtitles.click();
		Thread.sleep(1000);
	}

}

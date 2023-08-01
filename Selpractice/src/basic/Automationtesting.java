package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtesting 
{
 public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://automationintesting.online/");
	Thread.sleep(1000);
	
	d.manage().window().maximize();
	Thread.sleep(3000);
	
	By by_book=By.xpath("//button[text()='Book this room']");
	WebElement ele_book=d.findElement(by_book);
	ele_book.click();
	Thread.sleep(1000);
	
	By by_today=By.xpath("//button[text()='Today']");
	WebElement ele_today=d.findElement(by_today);
	ele_today.click();
	Thread.sleep(1000);
	
	
	By by_date=By.xpath("(//button[text()='02'])[1]");
	WebElement ele_date=d.findElement(by_date);
	ele_date.click();
	Thread.sleep(1000);
	
	By by_firstname=By.xpath("//input[@class='form-control room-firstname']");
	WebElement ele_firstname=d.findElement(by_firstname);
	ele_firstname.sendKeys("Shaik");
	Thread.sleep(1000);
	
	By by_lastname=By.xpath("//input[@class='form-control room-lastname']");
	WebElement ele_lastname=d.findElement(by_lastname);
	ele_lastname.sendKeys("Nabee");
	Thread.sleep(1000);
	
	By by_email=By.xpath("//input[@class='form-control room-email']");
	WebElement ele_email=d.findElement(by_email);
	ele_email.sendKeys("Nabee123@gmail.com");
	Thread.sleep(1000);
	
	By by_phone=By.xpath("//input[@class='form-control room-phone']");
	WebElement ele_phone=d.findElement(by_phone);
	ele_phone.sendKeys("9876543210");
	Thread.sleep(1000);
	
	By by_booking=By.xpath("//button[@class='btn btn-outline-primary float-right book-room']");
	WebElement ele_booking=d.findElement(by_booking);
	ele_booking.click();
	Thread.sleep(1000);
	
}
}

package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class bookslot extends baseclasss
{
	static By by_book=By.xpath("//button[text()='Book this room']");
	static By by_today=By.xpath("//button[text()='Today']");
	static By by_date=By.xpath("(//button[text()='02'])[1]");
	static By by_firstname=By.xpath("//input[@class='form-control room-firstname']");
	static By by_lastname=By.xpath("//input[@class='form-control room-lastname']");
	static By by_email=By.xpath("//input[@class='form-control room-email']");
	static By by_phone=By.xpath("//input[@class='form-control room-phone']");
	static By by_booking=By.xpath("//button[@class='btn btn-outline-primary float-right book-room']");


	static WebElement ele_book=d.findElement(by_book);
	static WebElement ele_today=d.findElement(by_today);
	static WebElement ele_date=d.findElement(by_date);
	static WebElement ele_firstname=d.findElement(by_firstname);
	static WebElement ele_lastname=d.findElement(by_lastname);
	static WebElement ele_email=d.findElement(by_email);
	static WebElement ele_phone=d.findElement(by_phone);
	static WebElement ele_booking=d.findElement(by_booking);

	public static void bookbutton()
	{
		ele_book.click();	
	}

	public static void todaybutton()
	{
		ele_today.click();	
	}

	public static void date()
	{
		ele_date.click();	
	}

	public static void firstname()
	{
		ele_firstname.sendKeys("Shaik");	
	}

	public static void lastname()
	{
		ele_lastname.sendKeys("Nabee");	
	}

	public static void email()
	{
		ele_email.sendKeys("Nabee123@gmail.com");	
	}

	public static void phone()
	{
		ele_phone.sendKeys("98765432101");	
	}

	public static void booking()
	{
		ele_booking.click();	
	}
}

package hyrtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xwa extends base
{
  static By but=By.xpath("//button[@id='newTabsBtn']");
  static By fname=By.xpath("//input[@id='firstName']");
  static By lname=By.xpath("//input[@id='lastName']");
  static By box=By.xpath("//input[@id='englishchbx']");
  static By email=By.xpath("//input[@id='email']");
  static By password=By.xpath("//input[@id='password']");
  static By register=By.xpath("//button[@id='registerbtn']");
  static By name=By.xpath("//input[@id='name']");

  
	public static WebElement button()
	{
		WebElement ele_but=d.findElement(but);
		return ele_but;
	}

	public static WebElement firstname()
	{
		WebElement ele_fname=d.findElement(fname);
		return ele_fname;
	}
	
	public static WebElement lastname()
	{
		WebElement ele_lname=d.findElement(lname);
		return ele_lname;
	}
	
	public static WebElement checkbox()
	{
		WebElement ele_box=d.findElement(box);
		return ele_box;
	}
	
	public static WebElement email()
	{
		WebElement ele_email=d.findElement(email);
		return ele_email;
	}
	
	public static WebElement password()
	{
		WebElement ele_password=d.findElement(password);
		return ele_password;
	}
	
	public static WebElement registers()
	{
		WebElement ele_register=d.findElement(register);
		return ele_register;
	}
	
	public static WebElement name()
	{
		WebElement ele_name=d.findElement(name);
		return ele_name;
	}
    //Actions	
	
	public static void butclick() throws InterruptedException
	{
		button().click();	
	}
	
	public static void fname() throws InterruptedException
	{
		firstname().sendKeys("shaik");	
	}
	
	public static void lname() throws InterruptedException
	{
		lastname().sendKeys("nabee");			
	}
	
	public static void cbox() throws InterruptedException
	{
		checkbox().click();		
	}
	
	public static void emaill() throws InterruptedException
	{
		email().sendKeys("nabeeshaik1@gmail.com");	
	}
	
	public static void pass() throws InterruptedException
	{
		password().sendKeys("nabee123");	
	}
	
	public static void reg() throws InterruptedException
	{
		registers().click();
	}
		
	public static void names() throws InterruptedException
	{
		name().sendKeys("Thread returns succesfully");
	}
	
	public static void action() throws InterruptedException
	{
		fname();
		Thread.sleep(1000);
		lname();
		Thread.sleep(1000);
		cbox();
		Thread.sleep(1000);
        emaill();
		Thread.sleep(1000);
		pass();
		Thread.sleep(1000);
		reg();
		Thread.sleep(1000);
		
		
		
	}
}

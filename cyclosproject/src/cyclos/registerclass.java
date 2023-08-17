package cyclos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registerclass extends baseclass
{
	static By by_Register=By.xpath("//div[text()=' Register ']");
	static By by_name=By.xpath("//input[@id='id_1']");
	static By by_loginname=By.xpath("//input[@id='id_2']");
	static By by_email=By.xpath("//input[@id='id_3']");
	static By by_website=By.xpath("//input[@id='website']");
	static By by_gender=By.xpath("//label[text()=' Male ']");
	static By by_phone=By.xpath("//input[@id='id_4']");
	static By by_address=By.xpath("(//label[@class='custom-control-label'])[3]");
	static By by_line=By.xpath("//input[@id='addressLine1']");
	static By by_zip=By.xpath("//input[@id='zip']");
	static By by_city=By.xpath("//input[@id='city']");
	static By by_region=By.xpath("//input[@id='region']");
	static By by_next=By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']");
	static By by_pass=By.xpath("//input[@id='id_7']");
	static By by_pass1=By.xpath("//input[@id='id_8']");
	static By by_box=By.xpath("//label[@class='custom-control-label']");
	static By by_box1=By.xpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired']");
	static By by_submit=By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']");

	public static WebElement regmethod() throws InterruptedException
	{
		WebElement ele_Register=d.findElement(by_Register);
		return ele_Register;
	}
	
	public static WebElement namemethod() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ele_name=d.findElement(by_name);
		return ele_name;
		
	}
	
	public static WebElement lnamemethod() throws InterruptedException
	{
		WebElement ele_loginname=d.findElement(by_loginname);
		Thread.sleep(1000);
		return ele_loginname;
	}
	
	public static WebElement emailmethod() throws InterruptedException
	{
		WebElement ele_email=d.findElement(by_email);
		Thread.sleep(1000);
		return ele_email;
		
	}
	
	public static WebElement webmethod() throws InterruptedException
	{
		WebElement ele_website=d.findElement(by_website);
		Thread.sleep(1000);
		return ele_website;
	}
	
	public static WebElement genmethod() throws InterruptedException
	{
		WebElement ele_gender=d.findElement(by_gender);
		Thread.sleep(1000);
		return ele_gender;

	}

	public static WebElement phonemethod() throws InterruptedException
	{
		WebElement ele_phone=d.findElement(by_phone);
		Thread.sleep(1000);
		return ele_phone;
		
	}

	public static WebElement addressmethod() throws InterruptedException
	{
		WebElement ele_address=d.findElement(by_address);
		Thread.sleep(1000);
		return ele_address;
	}
	public static WebElement linemethod() throws InterruptedException
	{
		WebElement ele_line=d.findElement(by_line);
		Thread.sleep(1000);
		return ele_line;
	}
	
	public static WebElement zipmethod() throws InterruptedException
	{
		WebElement ele_zip=d.findElement(by_zip);
		Thread.sleep(1000);
		return ele_zip;

	}
	
	public static WebElement citymethod() throws InterruptedException
	{
		WebElement ele_city=d.findElement(by_city);
		Thread.sleep(1000);
		return ele_city;
	}
	
	public static WebElement regionmethod() throws InterruptedException
	{
		WebElement ele_region=d.findElement(by_region);
		Thread.sleep(1000);
		return ele_region;
	}
	
	public static WebElement nextmethod() throws InterruptedException
	{
		WebElement ele_next=d.findElement(by_next);
		Thread.sleep(1000);
		return ele_next;
	}
	
	public static WebElement passmethod() throws InterruptedException
	{
		WebElement ele_pass=d.findElement(by_pass);
		Thread.sleep(1000);
		return ele_pass;
	}
	
	public static WebElement pass1method() throws InterruptedException
	{
		WebElement ele_pass1=d.findElement(by_pass1);
		Thread.sleep(1000);
		return ele_pass1;
	}
	
	public static WebElement boxmethod() throws InterruptedException
	{
	  WebElement ele_box=d.findElement(by_box);
	  Thread.sleep(1000);
	  return ele_box;
	}
 
	public static WebElement box1method() throws InterruptedException
	{
		 WebElement ele_box1=d.findElement(by_box1); 
		 Thread.sleep(1000);
         return ele_box1;
	}

	public static WebElement submitmethod() throws InterruptedException
	{
		 WebElement ele_submit=d.findElement(by_submit);
		 Thread.sleep(1000);
		 return ele_submit;
	}
	
	
	

    //actions
	
    public static void register() throws InterruptedException
    {
       regmethod().click();
    }

    public static void name() throws InterruptedException
    {
    	namemethod().sendKeys("Shaik Nabee");    
    }
    
    public static void lname() throws InterruptedException
    {
    	lnamemethod().sendKeys("Nabee");        
    }
     
    public static void email() throws InterruptedException
    {
    	emailmethod().sendKeys("nabee123@gmail.com");        	
    }
        
    public static void website() throws InterruptedException
    {
    	webmethod().sendKeys("www.facebook.com");   	    
    }
        
    public static void gender() throws InterruptedException
    {
    	genmethod().click();        
    	
    }
     public static void phone() throws InterruptedException
    {
    	phonemethod().sendKeys("+917780123456");        
    }
               
    public static void address() throws InterruptedException
    {
    	 addressmethod().click();    	     
    }
   		   
    public static void line() throws InterruptedException
    {
    	 linemethod().sendKeys("Patancheru");       
    }
   		 
    public static void zip() throws InterruptedException
    {
    	zipmethod().sendKeys("500018");         
    }
   		     
    public static void city() throws InterruptedException
    {
    	citymethod().sendKeys("Secunderabad");        
    }
    
    public static void region() throws InterruptedException
    {
    	regionmethod().sendKeys("Telangana");       
    }
       
    public static void nextbutton() throws InterruptedException
    {
    	nextmethod().click();        
    }
        
    public static void password() throws InterruptedException
    {
    	passmethod().sendKeys("1234");        
    }
        
    public static void pass1() throws InterruptedException
    {
    	pass1method().sendKeys("1234");       
    }
        
    public static void box() throws InterruptedException
    {
    	boxmethod().click();       
    }
       
    public static void box1() throws InterruptedException
    {
    	box1method().click();        
    }
    
    public static void submit() throws InterruptedException
    {
    	 submitmethod().click();    	    
    }
}

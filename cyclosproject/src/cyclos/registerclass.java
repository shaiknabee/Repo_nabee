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

	
	static WebElement ele_Register=d.findElement(by_Register);
	static WebElement ele_name=d.findElement(by_name);
	static WebElement ele_loginname=d.findElement(by_loginname);
	static WebElement ele_email=d.findElement(by_email);
	static WebElement ele_website=d.findElement(by_website);
	static WebElement ele_gender=d.findElement(by_gender);
	static WebElement ele_phone=d.findElement(by_phone);
	static WebElement ele_address=d.findElement(by_address);
	static WebElement ele_line=d.findElement(by_line);
	static WebElement ele_zip=d.findElement(by_zip);
	static WebElement ele_city=d.findElement(by_city);
	static WebElement ele_region=d.findElement(by_region);
	static WebElement ele_next=d.findElement(by_next);
	static WebElement ele_pass=d.findElement(by_pass);
	static WebElement ele_pass1=d.findElement(by_pass1);
	static WebElement ele_box=d.findElement(by_box);
	static WebElement ele_box1=d.findElement(by_box1);
	static WebElement ele_submit=d.findElement(by_submit);
    
	
    public static void register()
    {
    	ele_Register.click();
    }

    public static void name()
    {
    	ele_name.sendKeys("Shaik Nabee");      
    }
    
    public static void lname()
    {
    	ele_loginname.sendKeys("Nabee");        
    }
     
    public static void email()
    {
        ele_email.sendKeys("nabee123@gmail.com");        	
    }
        
    public static void website()
    {
    	 ele_website.sendKeys("www.facebook.com");   	    
    }
        
    public static void gender()
    {
    	ele_gender.click();        
    }
       
    public static void phone()
    {
    	ele_phone.sendKeys("+917780123456");        
    }
               
    public static void address()
    {
    	 ele_address.click();    	     
    }
   		   
    public static void line()
    {
    	ele_line.sendKeys("Patancheru");       
    }
   		 
    public static void zip()
    {
    	ele_zip.sendKeys("500018");         
    }
   		     
    public static void city()
    {
    	ele_city.sendKeys("Secunderabad");        
    }
    
    public static void region()
    {
    	ele_region.sendKeys("Telangana");       
    }
       
    public static void nextbutton()
    {
    	ele_next.click();        
    }
        
    public static void password()
    {
    	ele_pass.sendKeys("1234");        
    }
        
    public static void pass1()
    {
    	ele_pass1.sendKeys("1234");       
    }
        
    public static void box()
    {
    	ele_box.click();       
    }
       
    public static void box1()
    {
    	ele_box1.click();        
    }
    
    public static void submit()
    {
    	 ele_submit.click();    	    
    }
}

package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cyclos {
	public static void main(String[] args) throws InterruptedException 
	{
         WebDriver d=new ChromeDriver();
         d.get("https://demo.cyclos.org/ui/home");
         Thread.sleep(5000);
         
         d.manage().window().maximize();
         Thread.sleep(5000);
         
         By by_Register=By.xpath("//div[text()=' Register ']");
         WebElement ele_Register=d.findElement(by_Register);
         ele_Register.click();
         Thread.sleep(4000);
         
         By by_name=By.xpath("//input[@id='id_1']");
         WebElement ele_name=d.findElement(by_name);
         ele_name.sendKeys("Shaik Nabee");
         Thread.sleep(2000);
         
         By by_loginname=By.xpath("//input[@id='id_2']");
         WebElement ele_loginname=d.findElement(by_loginname);
         ele_loginname.sendKeys("Nabee");
         Thread.sleep(2000);
         
         By by_email=By.xpath("//input[@id='id_3']");
         WebElement ele_email=d.findElement(by_email);
         ele_email.sendKeys("nabee123@gmail.com");
         Thread.sleep(2000);
         
         By by_website=By.xpath("//input[@id='website']");
         WebElement ele_website=d.findElement(by_website);
         ele_website.sendKeys("www.facebook.com");
         Thread.sleep(2000);
         
         By by_gender=By.xpath("//label[text()=' Male ']");
         WebElement ele_gender=d.findElement(by_gender);
         ele_gender.click();
         Thread.sleep(2000);
         
         By by_phone=By.xpath("//input[@id='id_4']");
         WebElement ele_phone=d.findElement(by_phone);
         ele_phone.sendKeys("+917780123456");
         Thread.sleep(2000);
                  
         By by_address=By.xpath("(//label[@class='custom-control-label'])[3]");
         WebElement ele_address=d.findElement(by_address);
         ele_address.click();
         Thread.sleep(2000);      		 
        		 
         By by_line=By.xpath("//input[@id='addressLine1']");
         WebElement ele_line=d.findElement(by_line);
         ele_line.sendKeys("Patancheru");
         Thread.sleep(2000); 	 
        		 
         By by_zip=By.xpath("//input[@id='zip']");
         WebElement ele_zip=d.findElement(by_zip);
         ele_zip.sendKeys("500018");
         Thread.sleep(2000); 		 
        		 
         By by_city=By.xpath("//input[@id='city']");
         WebElement ele_city=d.findElement(by_city);
         ele_city.sendKeys("Secunderabad");
         Thread.sleep(2000);
         
         By by_region=By.xpath("//input[@id='region']");
         WebElement ele_region=d.findElement(by_region);
         ele_region.sendKeys("Telangana");
         Thread.sleep(2000);
         
         By by_next=By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']");
         WebElement ele_next=d.findElement(by_next);
         ele_next.click();
         Thread.sleep(2000);
         
         By by_pass=By.xpath("//input[@id='id_7']");
         WebElement ele_pass=d.findElement(by_pass);
         ele_pass.sendKeys("1234");
         Thread.sleep(2000);
         
         By by_pass1=By.xpath("//input[@id='id_8']");
         WebElement ele_pass1=d.findElement(by_pass1);
         ele_pass1.sendKeys("1234");
         Thread.sleep(2000);
         
         By by_box=By.xpath("//label[@class='custom-control-label']");
         WebElement ele_box=d.findElement(by_box);
         ele_box.click();
         Thread.sleep(2000);
         
         By by_box1=By.xpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired']");
         WebElement ele_box1=d.findElement(by_box1);
         ele_box1.click();
         Thread.sleep(2000);
       
         By by_submit=By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']");
         WebElement ele_submit=d.findElement(by_submit);
         ele_submit.click();
         Thread.sleep(2000);
	}

}

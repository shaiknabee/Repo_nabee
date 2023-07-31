package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//code not working
public class w3schools 
{
	public static void main(String[] args) throws InterruptedException
	{
       WebDriver d=new ChromeDriver();
       d.get("https://www.w3schools.com/");
       Thread.sleep(3000);
       
       d.manage().window().maximize();
       Thread.sleep(1000);
  
       By by_login=By.xpath("//a[@id='w3loginbtn']");
       WebElement ele_login=d.findElement(by_login);
       ele_login.click();
       Thread.sleep(3000);
     
       By by_email=By.xpath("//input[@class='EmailInput_input_field__6t4Ux undefined']");
       WebElement ele_email=d.findElement(by_email);
       ele_email.sendKeys("nabeeshaik03@gmail.com");
       Thread.sleep(1000);
       
       By by_Password=By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']");
       WebElement ele_Password=d.findElement(by_Password);
       ele_Password.sendKeys("Nabee@1998");
       Thread.sleep(1000);
       
       By by_loginbutton=By.xpath("//span[text()='Log in']");
       WebElement ele_loginbutton=d.findElement(by_loginbutton);
       ele_loginbutton.click();
       Thread.sleep(3000);
       
       By by_browse=By.xpath("//button[text()='Browse all tutorials']");
       WebElement ele_browse=d.findElement(by_browse);
       ele_browse.click();
       Thread.sleep(1000);
       
       By by_git=By.xpath("(//div[@class='TutorialCard_cardTitle__XFD04 card-title h5'])[11]");
       WebElement ele_git=d.findElement(by_git);
       ele_git.click();
       Thread.sleep(1000);
         
       By by_branches=By.xpath("(//div[@class=\"chapter-text\"])[3]");
       WebElement ele_branches=d.findElement(by_branches);
       ele_branches.click();
       Thread.sleep(1000); 
       
     //span[text()="Lesson 3.2"]
       By by_merge=By.xpath("//span[text()='Lesson 3.2']");
       WebElement ele_merge=d.findElement(by_merge);
       ele_merge.click();
       Thread.sleep(1000); 
       
       
       
       
       
       
       
       
       
    
//       By by_profile=By.xpath("//div[@id='topnav']/a[4][text()='Profile']");
//       WebElement ele_profile=d.findElement(by_profile);
//       ele_profile.click();
//       Thread.sleep(1000);
//       
//       By by_firstname=By.xpath("//input[@id='profile-firstname-146b210e-bc75-4793-ac1f-fac39b6808f6']");
//       WebElement ele_firstname=d.findElement(by_firstname);
//       ele_firstname.clear();
//       ele_firstname.sendKeys("Nabee");
//       Thread.sleep(1000);
//       
//       
//       By by_lastname=By.xpath("//input[@id='profile-lastname-efb951d4-0824-4259-8a2b-89350989fa77']");
//       WebElement ele_lastname=d.findElement(by_lastname);
//       ele_lastname.clear();
//       ele_lastname.sendKeys("Shaik");
//       Thread.sleep(1000);
//       
//       By by_save=By.xpath("//span[text()='Save']");
//       WebElement ele_save=d.findElement(by_save);
//       ele_save.click();
//       Thread.sleep(1000);
//       
//       By by_nickname=By.xpath("//input[@id='input-item-e3934c70-1351-4112-a8ac-c66056c3774e']");
//       WebElement ele_nickname=d.findElement(by_nickname);
//       ele_nickname.sendKeys("Nab");
//       Thread.sleep(1000);
//    
//     
//       By by_bio=By.xpath("//textarea[@id='profile_bio-431565d0-ade4-4ab8-8c4c-8fd364aa80ef']");
//       WebElement ele_bio=d.findElement(by_bio);
//       ele_nickname.sendKeys("Hi my name is Shaik Nabee.Iam a Graduate");
//       Thread.sleep(1000);
	}
	
}

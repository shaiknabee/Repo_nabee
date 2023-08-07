package orangehrm;

public class testclass
{
	public static void main(String[] args) throws InterruptedException 
	{
		 Loginpage.launch();
		 
         Loginpage.username();
         Thread.sleep(1000);
         
         Loginpage.password();
         Thread.sleep(1000);
         
         Loginpage.clicklogin();
         Thread.sleep(3000);
         
         PIMpage.PIM();
         Thread.sleep(3000);
         
         PIMpage.adduser();
         Thread.sleep(1000);
         
         PIMpage.firstname();
         Thread.sleep(1000);
         
         PIMpage.lastname();
         Thread.sleep(1000);
         
         PIMpage.adlogin();
         Thread.sleep(1000);
         
         PIMpage.aduser();
         Thread.sleep(1000);
         
         PIMpage.adpass();
         Thread.sleep(1000);
         
         PIMpage.confirmpass();
         Thread.sleep(1000);
         
         PIMpage.save();
         Thread.sleep(1000);
         
         deleteuser.PIM1();
         Thread.sleep(3000);
         
         deleteuser.click();
         Thread.sleep(3000);
         
         deleteuser.del();
         Thread.sleep(3000);
         
         deleteuser.delete();
         Thread.sleep(3000);
         
         logout.dropdown();
         Thread.sleep(3000);
         
         logout.loggout();
         Thread.sleep(3000);
	}
}

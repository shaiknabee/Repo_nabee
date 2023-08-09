package testphpsite;

public class testclass 
{
	public static void main(String[] args) throws InterruptedException 
	{
         base.launch();
         
         loginpage.username();
         Thread.sleep(1000);
         
         loginpage.password();
         Thread.sleep(1000);

         loginpage.login();
         Thread.sleep(3000);
         
         updatedetails.user();
         Thread.sleep(1000);
         
         updatedetails.credit();
         Thread.sleep(1000);
         
         updatedetails.email();
         Thread.sleep(1000);
         
         updatedetails.phone();
         Thread.sleep(1000);
         
         updatedetails.address();
         Thread.sleep(1000);
         
         updatedetails.update();
         Thread.sleep(1000);
	}
}

package scripts;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
      Lib LB=new Lib();
      @BeforeTest
public void launch() throws IOException
{
	LB.OpenApp("http://www.gmail.com");
}
@Test(dataProvider="GmailData")
public void Login(String Email,String Pswd)
{
   LB.Glogin(Email,Pswd);	
}

  @DataProvider
  
  public Object[][] GmailData()
  {
	  Object[][] Obj=new Object[3][2];
	  
	  Obj[0][0]="testmindq";
	  Obj[0][1]="mindq123";
	  
	  Obj[1][0]="santhumiryala";
	  Obj[1][1]="mindq1857";
	  
	  Obj[2][0]="selenium";
	  Obj[2][1]="tester123";
	  
	  return Obj;
  }

}


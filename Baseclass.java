package scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Baseclass 
{
  Lib LB=new Lib();
  
  @BeforeTest
  public void beforeTest() 
  {
  LB.Glogin("testmindq","mindqsystems");
  }

  @AfterTest
  public void afterTest() 
  {
  LB.Lout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  LB.OpenApp("http://www.gmail.com");
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Aclose();
  }

}

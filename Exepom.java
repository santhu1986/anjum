package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Exepom 
{
	@Test
  public void pom()
  {
   WebDriver driver=new FirefoxDriver();
   driver.get("http://opensource.demo.orangehrmlive.com/");
   driver.manage().window().maximize();
   WebDriver.Navigation move=driver.navigate();
   OrangeHP OHP=PageFactory.initElements(driver,OrangeHP.class);
   OHP.login();
   Sleeper.sleepTightInSeconds(5);
   OrangeLP OLP=PageFactory.initElements(driver,OrangeLP.class);
   OLP.Recruitment();
   move.back();
   Sleeper.sleepTightInSeconds(5);
   OLP.Tm();
   
  }
}

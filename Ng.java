package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ng 
{
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties Pr;
	public static FileInputStream Fis;
@BeforeTest
public void OpenApp() throws IOException
{

	Pr=new Properties();
	Fis=new FileInputStream("E:\\Ashwini\\Selenium\\src\\scripts\\Rep.properties");
	Pr.load(Fis);
	
	Expval="sign in";
	//firefox
	driver=new FirefoxDriver();
		//launch Gmail page
	driver.get("http://www.gmail.com");
					//maximize
			driver.manage().window().maximize();
			Actval=driver.findElement(By.xpath(Pr.getProperty("Sin"))).getText();
			Sleeper.sleepTightInSeconds(5);
             System.out.println(Actval);
             if (Expval.equalsIgnoreCase(Actval)) 
             {
			System.out.println("Gmail Page is Displayed");	
			}
             else
             {
            	 System.out.println("Gmail page is not Displayed");
             }
            // return "Gmail open";
}
@Test
public void Glogin()
{
	WebDriver.Navigation move=driver.navigate();
	driver.findElement(By.id(Pr.getProperty("Email"))).clear();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.id(Pr.getProperty("Email"))).sendKeys("testmindq");
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(Pr.getProperty("Enext"))).click();
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(Pr.getProperty("pswd"))).sendKeys("mindqsystems");
driver.findElement(By.xpath(Pr.getProperty("Pnxt"))).click();
  //  move.back();
Sleeper.sleepTightInSeconds(4);
//return "login succ";
}
@AfterTest
public void Lout()
{
	Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
    Sleeper.sleepTightInSeconds(4);
}

public void Aclose()
{
	driver.close();
}
}
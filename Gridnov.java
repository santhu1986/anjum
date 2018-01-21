package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gridnov 
{
DesiredCapabilities cap=null;

@Parameters("browser")
@Test
public void Gd(String Br) throws MalformedURLException
{
	if(Br.equalsIgnoreCase("firefox"))
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
			}
	else if (Br.equalsIgnoreCase("chrome")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
			
	}
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.106:4444/wd/hub"),cap);
     
     driver.get("http://www.amazon.com");
 	driver.manage().window().maximize();
 	
 	Actions act=new Actions(driver);
 	act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"))).build().perform();
 	act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"))).build().perform();
 	Sleeper.sleepTightInSeconds(5);
 	driver.findElement(By.partialLinkText("Fire TV St")).click();
 	
}

}

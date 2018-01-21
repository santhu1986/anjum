package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{

	DesiredCapabilities cap=null;
	@Parameters("browser")
	@Test
	public void gd(String Br) throws MalformedURLException
	{
		if (Br.equalsIgnoreCase("firefox"))
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
		
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.148:4444/wd/hub"),cap);	
	driver.get("http://www.gmail.com");
	
	//maximize
	
	driver.manage().window().maximize();
	
driver.findElement(By.id("identifierId")).sendKeys("testmindq");
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("mindqsystems");
driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
Sleeper.sleepTightInSeconds(4);
driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
Sleeper.sleepTightInSeconds(4);
driver.findElement(By.xpath(".//*[@id='gb_71']")).click();

	}
}

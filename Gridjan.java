package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gridjan 
{
	DesiredCapabilities cap=null;
	
	@Parameters("browser")
	@Test
	public void Gd(String Br) throws MalformedURLException
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
			cap.setPlatform(Platform.ANY);
				
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.164:4444/wd/hub"),cap);
        driver.manage().window().maximize();
        driver.get("http://183.82.100.55/ranford2");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("jyothi");
		driver.findElement(By.id("txtAdd1")).sendKeys("karimnagar");
		driver.findElement(By.id("txtArea")).sendKeys("abcdef");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		Select ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		ctry.selectByVisibleText("INDIA");
		Sleeper.sleepTightInSeconds(5);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText("GOA");
		Sleeper.sleepTightInSeconds(5);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText("GOA");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("btn_insert")).click();
		
		driver.switchTo().alert().accept();
	
	
	}
}
package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;


public class Locators {

	public static void main(String[] args) 
	{
      //firefox
		
		String Expval="Facebook";
		
		WebDriver driver=new FirefoxDriver();
		
		//launch facebook page
		
		driver.get("http://www.facebook.com");
		
		//get title
		
		String Actval=driver.getTitle();
		//maximize
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		
		//If condition
		
		if (Actval.contains(Expval))
		{
		System.out.println("Facebook page displayed");	
		}
		else
		{
			System.out.println("Facebook page not displayed");
		}
		
		/*
		
		//ID   
		driver.findElement(By.name("firstname")).sendKeys("Santhosh");
		//name
		driver.findElement(By.name("lastname")).sendKeys("miryala");
		//Css 
		driver.findElement(By.cssSelector("#u_0_l")).sendKeys("9885879005");
		//xpath
		driver.findElement(By.xpath(".//*[@id='u_0_s']")).sendKeys("santhosh");
		//link text
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		//Partial link text
		//driver.findElement(By.partialLinkText("Forg")).click();
		
		//Handlimg Dropdown
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(0);
*/	
		}

}

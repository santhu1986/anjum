package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Google {

	public static void main(String[] args) 
	{

		//Firefox Browser
		
		WebDriver driver=new FirefoxDriver();
		
		//Navigate
		
		WebDriver.Navigation move=driver.navigate();
		
		
		//to launch google
		
	move.to("http://www.google.com");
	System.out.println(driver.getTitle());
	
	String txt=driver.findElement(By.id("gb_70")).getText();
		System.out.println(txt);
		//maximize
		
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Gm")).click();
		//GetcurrentURL
		System.out.println(driver.getCurrentUrl());
		//Gettitle
		System.out.println(driver.getTitle());
		Sleeper.sleepTightInSeconds(4);
		
		//get attribute
		
		String Val=driver.findElement(By.id("identifierId")).getAttribute("id");
		System.out.println(Val);
		
		driver.findElement(By.id("identifierId")).sendKeys("testmindq");
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id("identifierId")).clear();
		
		
		/*		//back
		move.back();
		Sleeper.sleepTightInSeconds(4);
		//forward
		move.forward();
		Sleeper.sleepTightInSeconds(4);
		//refresh
		move.refresh();
		//close
		driver.close();
*/	
	}

}

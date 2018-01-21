package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mousehover {

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.amazon.com");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"))).build().perform();
	Sleeper.sleepTightInSeconds(5);
	driver.findElement(By.partialLinkText("Fire TV St")).click();
	}

}

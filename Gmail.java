package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Gmail {

	public static void main(String[] args) 
	{
 //firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//launch Gmail page
		
		driver.get("http://www.gmail.com");
		
		//maximize
		
		driver.manage().window().maximize();
		String Actval=driver.findElement(By.xpath(".//*[@id='headingText']")).getText();
        System.out.println(Actval);

		
   driver.findElement(By.id("identifierId")).sendKeys("testmindq");
	    Sleeper.sleepTightInSeconds(4);
	    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	    Sleeper.sleepTightInSeconds(4);
	    driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("mindqsystems");
	driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
    Sleeper.sleepTightInSeconds(5);
    driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
    Sleeper.sleepTightInSeconds(4);
    driver.close();
    
	}

}

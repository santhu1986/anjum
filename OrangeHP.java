package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHP 
{
//Element Properties
	
	@FindBy (id="txtUsername")
	WebElement Uname;
	
	@FindBy (xpath=".//*[@id='txtPassword']")
	WebElement Pswd;
	
	@FindBy (id="btnLogin")
	WebElement Lgn;
	
	
	//Element Methods
	
	public void login()
	{
	Uname.sendKeys("Admin");
	Pswd.sendKeys("admin");
	Lgn.click();
	}
}

package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeLP 
{
	
@FindBy (xpath=".//*[@id='menu_leave_viewLeaveModule']/b")
WebElement leave;

@FindBy (xpath=".//*[@id='menu_time_viewTimeModule']/b")
WebElement Time;

@FindBy (xpath=".//*[@id='menu_recruitment_viewRecruitmentModule']/b")
WebElement Rec;



public void Lea()
{
	leave.click();
}

public void Tm()
{
	Time.click();
}
public void Recruitment()
{
	Rec.click();
}
}

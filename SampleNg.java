package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleNg 
{
@Test(priority=0)	
	public void xyz()
	{
		Assert.assertEquals("Gmail","Gmail");
	}
@Test(priority=1,enabled=false)
	public void abc()
	{
        Assert.assertEquals("facebook","facebook");
	}
@Test(priority=2)
	public void pqr()
	{
        Assert.assertEquals("yahoo","yahoo");
	}
	
	

}

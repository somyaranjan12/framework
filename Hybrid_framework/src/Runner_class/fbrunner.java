package Runner_class;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_srcipt.Pom1;
import generic.Baseclass;

public class fbrunner extends Baseclass{
	
@Test(dataProvider = "test1")
public void logfb(String un,String pwd) throws InterruptedException
{
	
	Pom1 p = new Pom1(driver);
	p.passdata(un);
	Thread.sleep(2000);
	p.passdata1(pwd);
	Thread.sleep(2000);
	p.login();
	Assert.fail();
}
@DataProvider(name="test1")
public Object[][]createdata1()
{
	return new Object[][]{
			{"santosh@gamil.com","santosh123"},{"somya@gmail.com","somat123"}
	};

}
}

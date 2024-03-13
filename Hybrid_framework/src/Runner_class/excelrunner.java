package Runner_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM_srcipt.Pom1;
import generic.Baseclass1;
import generic.Excel_generic;

public class excelrunner extends Baseclass1{
@Test
public void fb_login() throws InterruptedException {
	WebDriver driver = null;
	Pom1 p= new Pom1(driver);
	p.passdata(Excel_generic.getdata("sheet", 0, 0));
	Thread.sleep(2000);
	p.passdata1(Excel_generic.getdata("sheet", 0, 1));
	Thread.sleep(2000);
p.login();	
}
}

package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Util.Fetchpropertyfile;

public class Baseclass extends generic_take_screenshot{
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void  openappln() throws FileNotFoundException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Fetchpropertyfile.fetchpro());
	}
@AfterMethod
public void closeappln(ITestResult res) {
	if(ITestResult.FAILURE==res.getStatus())
	{
		generic_take_screenshot.get_photo(driver);
	}
	driver.close();
}	
}




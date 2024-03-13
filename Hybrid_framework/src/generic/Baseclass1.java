package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Util.Fetchpropertyfile;

public class Baseclass1 extends Fetchpropertyfile{
	public WebDriver driver;
	@BeforeMethod
	public void open_app() throws FileNotFoundException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Fetchpropertyfile.fetchpro());
		Thread.sleep(2000);
	}
	@AfterMethod
	public void close_app()
	{
		driver.close();
	}

}

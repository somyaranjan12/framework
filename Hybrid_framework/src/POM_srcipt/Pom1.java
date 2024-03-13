package POM_srcipt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Basepage;

public class Pom1 extends Basepage 
//declaration
{
@FindBy(id="email")
private WebElement un;
@FindBy(id="pass")
private WebElement pwd;
@FindBy(xpath = "//button[@name='login']")
private WebElement ele;
//initiation
public Pom1(WebDriver driver) 

{
	super(driver);
}
//utilization
public void passdata(String uname)
{
	un.sendKeys(uname);
}
public void passdata1(String pass)
{
	pwd.sendKeys(pass);
}
public void login()
{
	ele.click();
}
}


package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
 
public class Fetchpropertyfile {
@Test
public static String fetchpro() throws FileNotFoundException, IOException
{
	Properties p= new Properties();
	p.load(new FileInputStream("./fetchurl.properties"));
	String val =p.getProperty("baseurl");
	return val;
}
}

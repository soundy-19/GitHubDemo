package GradleDemo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLogin 
{
	@Test
	public void login()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1226\\Desktop\\sound works\\drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");
	
	}
}

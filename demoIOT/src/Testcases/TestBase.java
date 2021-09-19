package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase
{
	
	ChromeDriver driver;
	
	@BeforeSuite
	public void openWebPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\6948\\Desktop\\Tech\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		                                               
		driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase
{

	static WebElement searchField;
	static WebElement searchbtn;
	
	
	public HomePage(ChromeDriver driver) 
	{
		super(driver);
		
		searchField = driver.findElement(By.xpath("//*[@id='ss']"));
		searchbtn = driver.findElement(By.xpath("//*[@type='submit']"));
	}
	
	
	public void searchHotels(String Location)
	{
		searchField.sendKeys(Location);
		searchbtn.click();		
	}
	
	public boolean searchbtnDisplayed()
	{
		return searchbtn.isDisplayed();
	}

}

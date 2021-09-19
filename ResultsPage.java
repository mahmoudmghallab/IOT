package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsPage extends PageBase
{
	static WebElement cityName;
	static WebElement homePageIcon;

	public ResultsPage(ChromeDriver driver)
	{
		super(driver);
		
		cityName = driver.findElement(By.xpath("//*[@class='sorth1']"));
		homePageIcon = driver.findElement(By.xpath("//*[@class='bui-header__logo']"));
	}
	
	public String searchedCityName()
	{
		return cityName.getText();
	}
	
	public void navigateToHomePage()
	{
		homePageIcon.click();
	}
	

}

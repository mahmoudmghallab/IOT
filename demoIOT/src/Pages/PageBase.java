package Pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected static ChromeDriver driver; 
	protected static WebDriverWait wait;
	
	public PageBase(ChromeDriver driver)
	{
		PageBase.driver = driver; 
		wait = new WebDriverWait(driver, 10);
	}
}

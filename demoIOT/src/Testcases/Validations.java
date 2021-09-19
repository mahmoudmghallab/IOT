package Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ResultsPage;

public class Validations extends TestBase
{
    
	HomePage homeObj;
	ResultsPage resultspageObj;
	
	
	@Test(priority = 2)
	public void results()
	{
		homeObj = new HomePage(driver);
		homeObj.searchHotels("Madrid");
		
		resultspageObj = new ResultsPage(driver);		
		assertTrue(resultspageObj.searchedCityName().contains("Madrid"));
	}
	
	@Test(priority = 1)
	public void navigateBackToHome ()
	{
		homeObj = new HomePage(driver);
		homeObj.searchHotels("Cairo");
		
		resultspageObj = new ResultsPage(driver);		
		resultspageObj.navigateToHomePage();
		
		homeObj = new HomePage(driver);
        assertTrue(homeObj.searchbtnDisplayed());
	}
	

}

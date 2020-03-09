package jpetStore_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import jpetStore_pages.JpetStore_SearchPage;


public class JpetStoreSearch extends BaseClass { 

	@BeforeClass
	public void startup() 
	{
		launchApllication("chrome","https://jpetstore.cfapps.io/catalog");	
	}


	@Test
	public void search1() throws InterruptedException, IOException {
		JpetStore_SearchPage spage=new JpetStore_SearchPage(driver);
		spage.searchpets("golden");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		screenshot("D:\\Selenium example\\JpetStoreNarendra\\src\\test\\resources\\screenshots\\golden1.png");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test
	public void search2() throws InterruptedException, IOException {
		JpetStore_SearchPage spage=new JpetStore_SearchPage(driver);
		spage.searchpets("Golden");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		screenshot("D:\\Selenium example\\JpetStoreNarendra\\src\\test\\resources\\screenshots\\Golden.png");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
}

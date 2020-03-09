package baseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver Driver;

	protected WebDriver driver;

	public void launchApllication(String browser,String Url) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium example\\Redbus_framework\\src\\test\\resources\\Driver\\chromedriver.exe");
	     driver=new ChromeDriver();


	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(Url);
	}
	// To Take Screenshot
				public void screenshot(String path) throws IOException
				{
					TakesScreenshot ts=((TakesScreenshot)driver);
					File Source=ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(Source,new File(path));  
				}
	
	
	

}

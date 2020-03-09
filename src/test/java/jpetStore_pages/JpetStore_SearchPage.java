package jpetStore_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JpetStore_SearchPage {
WebDriver driver;

By search=By.xpath("//input[@name='keywords']");

public JpetStore_SearchPage(WebDriver driver) 
{	
	this.driver=driver;	
}

public void searchpets(String values) throws InterruptedException
{
	driver.findElement(search).sendKeys(values);
	Actions e=new Actions(driver);
	e.sendKeys(Keys.ENTER).build().perform();
}



}

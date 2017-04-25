package objectsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEvents {
	
	public static void main(String[] args) {
		String url="http://www.ufthelp.com/";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement parentEle=driver.findElement(By.xpath("//a[contains(.,'Automation')]"));
		WebElement childEle=driver.findElement(By.xpath("//a[@title='Selenium']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(parentEle).moveToElement(childEle).click().build().perform();
	}

}

package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class Myntra {
	
	public static void main(String[] args) {
		String url="http://www.myntra.com";
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@data-reactid='11']")).click();
//		 driver.findElements(By.xpath("(//a[@class='desktop-main'])[1]")).click();
//	driver.switchTo().alert();
//		driver.findElement(By.className("(//a[@class='desktop-main'])[1]")).click();
		
		WebElement parentEle=driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		WebElement childele=driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[1]"));
//		driver.findElement(By.xpath("//input[@value='Roadster']")).click();
//		WebElement parentEle=driver.findElement(By.className("desktop-navLink"));
//		WebElement childelement=driver.findElement(By.className("desktop-main"));
		
		//Actions act=new Actions(driver); 
		
		Actions act=new Actions(driver);
		act.moveToElement(parentEle).moveToElement(childele).click().build().perform();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).click();
		
	}

}

package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Myntra {
	
	public static void main(String[] args) {
		String url="http://www.myntra.com";
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
//		 driver.findElements(By.xpath("(//a[@class='desktop-main'])[1]")).click();
//	driver.switchTo().alert();
		driver.findElement(By.className("(//a[@class='desktop-main'])[1]")).click();
		
	}

}

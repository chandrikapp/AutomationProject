package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers2 {
public static void main(String[] args) {
	String url="http://www.facebook.com";
	//System.setProperty("webdriver.gecko.driver", "D:/Automation project/Automation project/JavaConceptsProject/Drivers");
	
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("850083049");
	driver.findElement(By.id("email")).sendKeys("850083049");
}
}

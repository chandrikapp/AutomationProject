package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers2 {
public static void main(String[] args) {
	String url="http://www.paytm.com";
	System.setProperty("webdriver.gecko.driver", "D:/Automation project/Automation project/JavaConceptsProject/Drivers");
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
//	driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
}
}

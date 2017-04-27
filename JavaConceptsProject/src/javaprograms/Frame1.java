package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Frame1 {
	public static void main(String[] args) {
		String url="http://toolsqa.com/iframe-practice-page/";
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.switchTo().frame(0);
		driver.findElement(By.name("firstname")).sendKeys("hello");
		driver.findElement(By.name("lastname")).sendKeys("java");
		System.out.println("enterd data into fram1");
		driver.switchTo().defaultContent();
//		driver.findElement(By.linkText("HOME")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.id("ui-id-3")).click();
//		driver.findElement(By.xpath("(//a[@id='trigger-overlay'])[1]")).click();
		//driver.findElement(By.id("")).click();
//		System.out.println("clicked out side the frame");
		
		
	}

}

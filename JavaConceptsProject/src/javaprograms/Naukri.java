package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	public static void main(String[] args) {
		
		
		String url="http://www.naukri.com";
		
		WebDriver driver=new FirefoxDriver();
	
	driver.get(url);
	
	driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
	driver.findElement(By.xpath("//button[@class='action-btn fresh']")).click();
	
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("PAGIDYALA SHIVA");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("new.shivaworld@gmail.com");
	}

}

package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

import javafx.beans.property.SetProperty;
import javafx.beans.property.SetPropertyBase;

public class Paytmlogin {
	
	public static void main(String[] args) {
		String url="http://www.paytm.com";
		
	WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
		driver.findElement(By.xpath("(//img[@class='_3thc'])[1]")).getText();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8500083049");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("20");
//	    driver.findElements(By.xpath("//div[@class='gbIh']"))).click();
	}

		
	}



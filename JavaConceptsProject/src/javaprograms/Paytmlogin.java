package javaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.Click;

import javafx.beans.property.SetProperty;
import javafx.beans.property.SetPropertyBase;

public class Paytmlogin {
	
	public static void main(String[] args) throws InterruptedException {
		String url="https://www.paytm.com/";
		
	WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
    driver.switchTo().frame(0);
     
     WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='login-header-wrapper']/ul/li[2]"))).click();
	driver.findElement(By.xpath(".//*[@id='login-header-wrapper']/ul/li[2]")).click();
	}

		
	}



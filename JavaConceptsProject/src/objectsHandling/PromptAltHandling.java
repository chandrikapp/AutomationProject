package objectsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAltHandling {
	
	public static void main(String[] args) {


		String url="http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement promtBtnLoc=driver.findElement(By.xpath("//button[@onclick='promptConfirm()']"));
		promtBtnLoc.click();
		
		Alert alt=driver.switchTo().alert();
		String altMsg=alt.getText();
		System.out.println(altMsg);
		
		alt.sendKeys("yes");
		//alt.accept();//for ok  button
		//alt.dismiss();//for cancel button
		//System.out.println("clicked ok button");
		//System.out.println("clicked cancel button");
		//driver.close();
	
	
	}

}

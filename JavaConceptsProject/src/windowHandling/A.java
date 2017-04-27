package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	
	public static void main(String[] args) {
		String url="http://toolsqa.com/automation-practice-switch-windows/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String pw=driver.getWindowHandle();
		System.out.println("present window hash code is :"+pw);
		driver.findElement(By.cssSelector("#button1")).click();
		System.out.println();
		Set<String> windows=driver.getWindowHandles();
		for(String w:windows){
			System.out.println(w);
			//v v v imp logic
			if(!w.equals(pw)){
				driver.switchTo().window(w);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//div[@class='mini-search show-on-desktop near-logo-first-switch in-menu-second-switch first last']/form/a")).click();
				//driver.close();
				//driver.quit();
			}
		}
		//driver.close();
		//driver.quit();
	}

}

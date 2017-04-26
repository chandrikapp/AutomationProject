package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		String url = "http://toolsqa.com/iframe-practice-page/";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.switchTo().frame(0);
		driver.findElement(By.name("firstname")).sendKeys("Hello Java");
		System.out.println("entered data into frame1");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='mini-search show-on-desktop near-logo-first-switch in-menu-second-switch first last']/form[@class='searchform']/a")).click();
		System.out.println("clicked out side the frame");
	}

}

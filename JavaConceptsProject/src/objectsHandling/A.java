package objectsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		String url = "http://www.seleniumhq.org";

		WebDriver driver = new FirefoxDriver();

		driver.get(url);

		/*
		 * String title=driver.getTitle(); System.out.println(title);
		 * driver.findElement(By.linkText("edit this page")).click(); String
		 * currentUrl=driver.getCurrentUrl(); String
		 * currentTitle=driver.getTitle(); System.out.println(currentUrl);
		 * System.out.println(currentTitle);
		 */
		String expectedStr="search selenium:";
		WebElement searchSeleniumLblLoc = driver.findElement(By.xpath("//label[@for='q']"));
		String actualStr=searchSeleniumLblLoc.getText();
		System.out.println(actualStr);
		if(actualStr.contains(expectedStr)){
			
			WebElement searctTxtLoc=driver.findElement(By.id("q"));
			searctTxtLoc.sendKeys("Selenium");
			
			WebElement goBtnLoc=driver.findElement(By.id("submit"));
			goBtnLoc.click();
			
		}
		driver.close();

	}

}

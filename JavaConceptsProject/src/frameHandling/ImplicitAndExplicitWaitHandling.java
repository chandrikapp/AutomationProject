package frameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWaitHandling {
	
	public static void main(String[] args) {
		String url = "https://www.buycrash.com/";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//implicit wait code
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement selectStateDDLoc=driver.findElement(By.id("state_search"));
		Select selectState=new Select(selectStateDDLoc);
		selectState.selectByIndex(5);
		
		
		WebElement selectAgencyDDLoc=driver.findElement(By.id("agency_search"));
		//explicit wait code
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(selectAgencyDDLoc));
		
		Select selectAgency=new Select(selectAgencyDDLoc);
		selectAgency.selectByIndex(3);
		
		
	}

}

package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandling {

	public static void main(String[] args) {
		String url = "http://jqueryui.com/droppable/";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.switchTo().frame(0);
		
		WebElement sourcElement=driver.findElement(By.id("draggable"));
		WebElement destinationElement=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(sourcElement, destinationElement).build().perform();
	}
}

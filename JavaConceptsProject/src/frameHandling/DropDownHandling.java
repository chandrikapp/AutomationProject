package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		String url = "file:///C:/Users/admin/Desktop/xyz.html";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement selectNamesDD=driver.findElement(By.xpath("//select[@value='select names']"));
		Select sel=new Select(selectNamesDD);
		sel.selectByIndex(13);
		//sel.selectByVisibleText("lmn");
		//sel.selectByValue("z");
	}
}

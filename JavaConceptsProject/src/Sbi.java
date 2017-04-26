import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sbi {
public static void main(String[] args) {
	String url="https://www.onlinesbi.com/";
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
//	driver.findElement(By.linkText("LOGIN")).click();
//driver.findElement(By.xpath("(//a[@class='register'])[1]")).click();
//driver.findElement(By.xpath("//select[@id='target']")).click();
//driver.findElement(By.xpath("//a[@class='corp_login']")).click();

//driver.findElement(By.xpath("//a[@href='https://retail.onlinesbi.com/retail/login.htm']")).click();
driver.findElement(By.linkText("LOGIN")).click();
}
}

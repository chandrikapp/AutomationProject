package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo5 {
	
	public void selectBrowser(String browser) throws InterruptedException{
		
		switch(browser){
		
		case "firefox":
			for(int i=1;i<=2;i++){
			System.setProperty("webdriver.gecko.driver", "C:/Users/home/git_chandrika/JavaConceptsProject/Drivers/geckodriver.exe");
			WebDriver ffDriver=new FirefoxDriver();
			ffDriver.get("http://www.facebook.com");
			Thread.sleep(3000);
			ffDriver.quit();
			System.out.println(i+"  executed");
			System.out.println("script passed");
			}
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/home/git_chandrika/JavaConceptsProject/Drivers/chromedriver.exe");
			WebDriver chDriver=new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:/Users/home/git_chandrika/JavaConceptsProject/Drivers/IEDriverServer.exe");
			WebDriver ieDriver=new InternetExplorerDriver();
			break;
			default:
				System.out.println("selected invalid browser...");
				break;
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Demo5 d=new Demo5();
		d.selectBrowser("firefox");
	}

}

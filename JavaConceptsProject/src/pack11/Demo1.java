package pack11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	
	public void openBrowser(String browsername){
		if(browsername.equals("firefoxBrowser")){
			System.out.println("should open firefox browser...");
			
			System.setProperty("webdriver.gecko.driver", "C:/Users/home/git_chandrika/JavaConceptsProject/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		}
		
		else if(browsername.equals("chromeBrowser")){
			System.out.println("should open chrome browser...");
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/home/git_chandrika/JavaConceptsProject/Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		}
	}
	
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.openBrowser("chromeBrowser");
	}
}

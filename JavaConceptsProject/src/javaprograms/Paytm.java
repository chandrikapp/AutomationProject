package javaprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Paytm {
	public static void main(String[] args) {
		String url="http://www.paytm.com";
		System.setProperty("webdriver.gecho.driver", ".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div");
		WebDriver driver=new FirefoxDriver(); 
		driver.get(url);
	
	}

}

package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups {
	public static void main(String[] args) {
		String url="https://www.flipkart.com/samsung-galaxy-on7-black-8-gb/p/itmedhx3jgmu2gps?pid=MOBECCA5SMRSKCNY&srno=b_1_3&otracker=nmenu_sub_Electronics_0_Samsung&lid=LSTMOBECCA5SMRSKCNYWC8DYC";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("(//span[text()='?'])[2]")).click();
		String s=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div[6]/div[2]/div/ul/li/div[2]/div[1]")).getText();
		System.out.println(s);
	}

}

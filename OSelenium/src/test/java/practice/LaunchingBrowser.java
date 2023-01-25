package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser 
{
		public static void main(String[] args) 
		{
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				System.out.println("Current page Title" + driver.getTitle());
				System.out.println("Current page url" + driver.getCurrentUrl());
				
		}
}

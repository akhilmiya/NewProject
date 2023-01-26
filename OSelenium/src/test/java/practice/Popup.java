package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/");
		Thread.sleep(4000);
		driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).click();
	}

}

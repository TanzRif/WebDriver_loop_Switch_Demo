package cojm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PNC {

	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\tanzi\\Desktop\\New folder (2)\\chromedriver.exe";		
		
		System.setProperty(key, value);
		
		driver= new ChromeDriver();
		driver.manage();
		driver.get("http://www.pnc.com/");
		driver.findElement(By.id("userId")).sendKeys("jhfyf");
		driver.findElement(By.id("passwordInputField")).sendKeys("78587587");
		driver.findElement(By.id("olb-btn")).click();
		driver.close();
		
		System.out.println("test pass");
	}

}

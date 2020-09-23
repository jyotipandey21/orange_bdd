package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
static WebDriver driver ;
	
 
	public static WebDriver launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver; 
		
	}
}




package Core_March16.Core_March16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMultipleBrowsers {
	WebDriver driver;
	
	@Test
	@Parameters({"browser", "username" ,"password"})
	void lunchBrower(String browser, String username, String password)
	{	
		if(browser.equalsIgnoreCase("Chrome"))
	
	{System.out.println(Thread.activeCount());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		driver.close();
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{ 
		System.out.println(Thread.activeCount());
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}
		
	
		
		
	}
	
}

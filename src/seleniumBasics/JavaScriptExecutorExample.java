package seleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorExample {
	WebDriver driver;
	
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Open Browser
		js.executeScript("window.location='https://mail.rediff.com/cgi-bin/login.cgi'");
		
		
	}

}

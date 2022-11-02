package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSourceProgram {
	
	WebDriver driver;
	
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
		//Method 1
		//String pageSource=driver.getPageSource();
	    //System.out.println(pageSource);
		
		//Method 2
		WebElement element=driver.findElement(By.tagName("body"));
		String pageSource=element.getText();
		System.out.println(pageSource);
		
	}

}

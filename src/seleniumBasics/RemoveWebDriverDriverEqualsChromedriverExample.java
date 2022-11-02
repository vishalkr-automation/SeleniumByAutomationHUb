package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveWebDriverDriverEqualsChromedriverExample {
	
	
	@Test
	public void f() {
		WebDriver driver=WebDriverManager.chromedriver().create();  //Using this concept it will open and close the browser automatically
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		System.out.println("URL: "+driver.getCurrentUrl());
		System.out.println("Page Title: "+driver.getTitle());
	}

}

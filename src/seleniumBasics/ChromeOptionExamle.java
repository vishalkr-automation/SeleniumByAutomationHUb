package seleniumBasics;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionExamle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		
		//1.PageLoadStrategy (How fast we load the browser)
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);    //Normal
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);   //Fast
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);    //None
		
		//2.Infobars - We will try to remove info (Chrome is being controlled by automated software)
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//3.extensions - Disable all extension
		//options.setExperimentalOption("excludeSwitces", Collections.singletonList("load-extension"));
		
		//4.Incognito //Ctrl+Shift+N  after opening a browser
		options.addArguments("--incognito");
		
		//5.Maximized (use to maximize the browser)
		options.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
   
        driver.findElement(By.cssSelector("a[class=signin]")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input.signinbtn")).click();

	}

}

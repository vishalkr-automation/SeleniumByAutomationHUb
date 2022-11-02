package seleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInAndZoomOutExample {
	@Test
	public void f() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");	
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //Zoom In (higher magnification)
        js.executeScript("document.body.style.zoom='250%';");
        
        Thread.sleep(2000);
        
      //Zoom out (Lower magnification)
        js.executeScript("document.body.style.zoom='50%';");
        
        Thread.sleep(2000);
        
      //Normal (Normal magnification)
        js.executeScript("document.body.style.zoom='100%';");
        

	}

}

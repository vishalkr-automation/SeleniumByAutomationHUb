package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
   
        driver.findElement(By.cssSelector("a[class=signin]")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input.signinbtn")).click();
        
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        
        alert.accept();
        
       // alert.dismiss();
      

	}

}

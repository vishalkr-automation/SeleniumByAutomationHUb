package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableExample {
	
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://money.rediff.com/sectors");	
        
        String sector="&P BSE Consumer Durables";
        List<WebElement> list1=driver.findElements(By.xpath("//table[@id='dataTable']//tbody//tr/td[1]")); 
        List<WebElement> list2=driver.findElements(By.xpath("//table[@id='dataTable']//tbody//tr/td[2]")); 
        
        for(int i=0; i<list1.size(); i++) {
        	if(sector.equalsIgnoreCase(list1.get(i).getText())) {
        		System.out.println("Sector Name: "+list1.get(i).getText()+"--------"+list2.get(i).getText());
        		break;
        	}
        }
        
	}

}
